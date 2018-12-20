package editer.node;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.controlsfx.control.textfield.AutoCompletionBinding.ISuggestionRequest;
import org.controlsfx.control.textfield.TextFields;

import editer.DataEntityInterface;
import helper.ArrayEditer;
import helper.EditHelper;
import javafx.beans.property.ListProperty;
import javafx.beans.property.Property;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Callback;
import javafx.util.StringConverter;
import javafx.util.converter.FloatStringConverter;
import javafx.util.converter.IntegerStringConverter;
import localize.LocalizeHandler;
import types.base.DataBase;

/**
 * プロパティを編集するノードを作成する
 */
public class EditNodeBuilder {

	private static final Logger log = LogManager.getLogger();

	private enum EditNodeType {
		Text, TextFromList, Integer, Float, Boolean, StringList
	}

	/** 作成するノードの種類 */
	private final EditNodeType Type;
	/** 変更の保存対象 */
	private final Property<?> Property;
	/** 表示名 */
	private final String Name;

	// ========================= コンストラクタ ================================
	/** プライベートコンストラクタ */
	private EditNodeBuilder(EditNodeType type, DataBase data, String field) {
		Type = type;
		Property = EditHelper.getProperty(data, field);
		Name = LocalizeHandler.getLocalizedName(data, field);
	}

	/** DataBaseのテキストフィールドを編集するノード */
	public static EditNodeBuilder makeStringSetNode(DataBase data, String field) {
		if (!EditHelper.isString(data, field)) {
			log.error(data.getClass() + "." + field + " is not String");
			return null;
		}
		EditNodeBuilder builder = new EditNodeBuilder(EditNodeType.Text, data, field);
		return builder;
	}

	/** DataBaseのテキストフィールドを編集するノード */
	public static EditNodeBuilder makeBooleanSetNode(DataBase data, String field) {
		if (!EditHelper.isBoolean(data, field)) {
			log.error(data.getClass() + "." + field + " is not Boolean");
			return null;
		}
		EditNodeBuilder builder = new EditNodeBuilder(EditNodeType.Boolean, data, field);
		builder.layoutX = 30;
		return builder;
	}

	/** DataBaseの数値(float,int,double,long)フィールドを編集するノード */
	public static EditNodeBuilder makeNumberSetNode(DataBase data, String field) {
		EditNodeType type;
		if (EditHelper.isFloat(data, field))
			type = EditNodeType.Float;
		else if (EditHelper.isInteger(data, field))
			type = EditNodeType.Integer;
		else {
			log.error(data.getClass() + "." + field + " is not Number");
			return null;
		}
		EditNodeBuilder builder = new EditNodeBuilder(type, data, field);
		builder.textFieldWidth = 40;
		return builder;
	}

	/** DataBaseのストリングコンボ型 */
	public static EditNodeBuilder makeStringAutoFillNode(DataBase data, String field,
			ObservableList<? extends DataEntityInterface> list) {
		if (!EditHelper.isString(data, field)) {
			log.error(data.getClass() + "." + field + " is not String");
			return null;
		}
		EditNodeBuilder builder = new EditNodeBuilder(EditNodeType.TextFromList, data, field);
		builder.fromList = list;
		return builder;
	}

	/** DataBaseのストリングリスト型 */
	public static EditNodeBuilder makeStringListNode(DataBase data, String field,
			ObservableList<? extends DataEntityInterface> list) {
		if (!EditHelper.isStringList(data, field)) {
			log.error(data.getClass() + "." + field + " is not StringList");
			return null;
		}
		EditNodeBuilder builder = new EditNodeBuilder(EditNodeType.StringList, data, field);
		builder.sizeY = 200;
		builder.fromList = list;
		return builder;
	}

	// ========================= 各種設定項目 ==========================

	/** 変更通知リスナー */
	private Runnable[] ChangeListener = new Runnable[0];

	/** 変更されたタイミングで呼ばれる */
	public EditNodeBuilder setChangeListner(Runnable... listener) {
		ChangeListener = listener;
		return this;
	}

	private double sizeX = 200;
	private double sizeY = 24;

	/** サイズを設定 */
	public EditNodeBuilder setSize(double x, double y) {
		sizeX = x;
		sizeY = y;
		return this;
	}

	private double layoutX = 0;
	private double layoutY = 0;

	/** サイズを設定 */
	public EditNodeBuilder setLayout(double x, double y) {
		layoutX = x;
		layoutY = y;
		return this;
	}

	private double textFieldWidth = 100;

	/** テキストフィールドの幅 テキストフィールドを使用しない場合は無効 */
	public EditNodeBuilder setTextFieldWidth(double width) {
		textFieldWidth = width;
		return this;
	}

	private float MaxValue = Float.MAX_VALUE;

	/** 数値編集フィールドの最大値 */
	public EditNodeBuilder setMax(float max) {
		MaxValue = max;
		return this;
	}

	private float MinValue = Float.MIN_VALUE;

	/** 数値編集フィールドの最大値 */
	public EditNodeBuilder setMin(float min) {
		MinValue = min;
		return this;
	}

	private String Scale = "1";

	/** 数値編集フィールドの最大値 */
	public EditNodeBuilder setScale(float scale) {
		Scale = String.valueOf(scale);
		return this;
	}

	private ObservableList<? extends DataEntityInterface> fromList;

	/** テキストフィールドの幅 テキストフィールドを使用しない場合は無効 */
	public EditNodeBuilder setAutoFillList(ObservableList<DataEntityInterface> list) {
		fromList = list;
		return this;
	}

	// ========================= スクロール処理 =========================
	BiConsumer<Boolean, Boolean> Scroll = new BiConsumer<Boolean, Boolean>() {
		@Override
		public void accept(Boolean plus, Boolean shift) {
			BigDecimal oldValue = new BigDecimal(Property.getValue().toString());
			BigDecimal change = new BigDecimal(Scale);
			if (shift) {
				change = change.multiply(new BigDecimal("10"));
			}
			if (!plus) {
				change = change.multiply(new BigDecimal("-1"));
			}
			BigDecimal newValue = change.add(oldValue);
			// 最大、最小チェック
			newValue = newValue.max(new BigDecimal(MinValue));
			newValue = newValue.min(new BigDecimal(MaxValue));
			Property<Number> property = (Property<Number>) Property;
			if (Type == EditNodeType.Float)
				property.setValue(newValue.floatValue());
			else
				property.setValue(newValue.intValue());
		}
	};

	// ======================== ビルド =========================
	/** 数値以外のパターン */
	private static final Pattern FloatPattern = Pattern.compile("[^0-9\\.-]+");
	private static final Pattern IntPattern = Pattern.compile("[^0-9-]+");

	/** テキストフィールドで編集する系統のビルド */
	private Node buildTextField() {
		// テキストセット
		AnchorPane root = new AnchorPane();
		TextField text = new TextField();
		text.setAlignment(Pos.CENTER);

		Label label = new Label(Name + ":");
		// エンターを押したらフォーカスを外す
		text.addEventHandler(KeyEvent.KEY_PRESSED, e -> {
			if (e.getCode() == KeyCode.ENTER)
				root.requestFocus();
		});
		text.textProperty().addListener((change, old, newv) -> {
			for (Runnable run : ChangeListener)
				run.run();
		});
		if (Type == EditNodeType.Text || Type == EditNodeType.TextFromList) {
			text.textProperty().bindBidirectional((Property<String>) Property);
			if (Type == EditNodeType.TextFromList) {
				// test
				TextFields.bindAutoCompletion(text, new Callback<ISuggestionRequest, Collection<String>>() {
					@Override
					public Collection<String> call(ISuggestionRequest key) {
						return ArrayEditer.Search(fromList, key.getUserText()).stream()
								.map(data -> data.getDisplayName()).sorted().collect(Collectors.toList());
					}
				});
			}
		} else if (Type == EditNodeType.Float || Type == EditNodeType.Integer) {
			// 入力を数値のみに
			TextFormatter<Number> formatter;
			// FloatかIntegerか判別
			StringConverter<?> converter;
			if (Type == EditNodeType.Float) {
				// Floatなら
				formatter = new TextFormatter<>(change -> {
					String newStr = FloatPattern.matcher(change.getText()).replaceAll("");
					int diffcount = change.getText().length() - newStr.length();
					change.setAnchor(change.getAnchor() - diffcount);
					change.setCaretPosition(change.getCaretPosition() - diffcount);
					change.setText(newStr);
					return change;
				});
				converter = new FloatStringConverter() {
					@Override
					public Float fromString(String str) {
						Float res;
						try {
							res = super.fromString(str);
						} catch (Exception e) {
							res = (Float) Property.getValue();
							text.setText(super.toString(res));
						}
						// 範囲チェック
						Float resold = res;
						res = Math.min(res, MaxValue);
						res = Math.max(res, MinValue);
						if (resold != res) {
							text.setText(super.toString(res));
						}
						return res;
					}
				};
			} else {
				converter = new IntegerStringConverter() {
					@Override
					public Integer fromString(String str) {
						Integer res;
						try {
							res = super.fromString(str);
						} catch (Exception e) {
							res = (Integer) Property.getValue();
							text.setText(super.toString(res));
						}
						// 範囲チェック
						if (res != null) {
							Integer resold = res;
							res = Math.min(res, Math.round(MaxValue));
							res = Math.max(res, Math.round(MinValue));
							if (resold != res) {
								text.setText(super.toString(res));
							}
						}
						return res;
					}
				};
				formatter = new TextFormatter<>(change -> {
					String newStr = IntPattern.matcher(change.getText()).replaceAll("");
					int diffcount = change.getText().length() - newStr.length();
					change.setAnchor(change.getAnchor() - diffcount);
					change.setCaretPosition(change.getCaretPosition() - diffcount);
					change.setText(newStr);
					return change;
				});
			}
			text.setTextFormatter(formatter);
			text.textProperty().bindBidirectional((Property) Property, converter);
			text.focusedProperty().addListener((observable, newvalue, oldvalue) -> {
				if (!newvalue) {
					text.setText(Property.getValue().toString());
				}
			});
			// スクロールの追加
			text.addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.UP || e.getCode() == KeyCode.DOWN) {
					Scroll.accept(e.getCode() == KeyCode.UP, e.isShiftDown());
				}
			});
			text.addEventHandler(ScrollEvent.SCROLL,
					e -> Scroll.accept(e.getDeltaY() + e.getDeltaX() > 0, e.isShiftDown()));
		}
		// サイズプロパティの関連
		root.setPrefSize(sizeX, sizeY);
		root.setLayoutX(layoutX);
		root.setLayoutY(layoutY);

		text.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(2), new Insets(2))));
		text.setFont(Font.font(10));
		text.translateXProperty().bind(root.widthProperty().subtract(textFieldWidth));
		text.setPrefWidth(textFieldWidth);
		text.prefHeightProperty().bind(root.heightProperty());

		label.prefWidthProperty().bind(root.widthProperty().subtract(textFieldWidth - 2));
		label.prefHeightProperty().bind(root.heightProperty());
		label.setAlignment(Pos.CENTER_RIGHT);

		root.getChildren().add(text);
		root.getChildren().add(label);
		return root;
	}

	/** ノード作成処理 */
	public Node build() {
		if (Type == EditNodeType.Float || Type == EditNodeType.Integer || Type == EditNodeType.Text
				|| Type == EditNodeType.TextFromList) {
			return buildTextField();
		} else if (Type == EditNodeType.Boolean) {
			AnchorPane root = new AnchorPane();
			Label label = new Label(Name + ":");
			label.setAlignment(Pos.CENTER_RIGHT);
			CheckBox check = new CheckBox();
			root.setPrefSize(sizeX, sizeY);
			check.selectedProperty().bindBidirectional((Property<Boolean>) Property);
			check.selectedProperty().addListener((value, newvalue, oldvalue) -> {
				for (Runnable run : ChangeListener)
					run.run();
			});
			check.setPrefSize(sizeY, sizeY);
			check.setTranslateX(sizeX-sizeY);
			label.setPrefSize(sizeX-sizeY, sizeY);
			root.getChildren().addAll(check,label);
			// 1回変更イベントを呼んでおく
			for (Runnable listener : ChangeListener) {
				listener.run();
			}
			return root;
		} else if (Type == EditNodeType.StringList) {
			AnchorPane root = new AnchorPane();
			SelectList listview = new SelectList(fromList, (ListProperty<String>) Property);

			Label label = new Label(Name);
			label.setAlignment(Pos.CENTER);

			TextField text = new TextField();
			text.textProperty().addListener((value, oldvalue, newvalue) -> listview.setSearch(newvalue));

			root.setPrefSize(sizeX, sizeY);
			label.setLayoutX(5);
			label.setLayoutY(2);
			label.setPrefSize(sizeX - 10, 20);
			listview.setLayoutX(5);
			listview.setLayoutY(24);
			listview.setPrefSize(sizeX - 10, sizeY - 56);
			text.setPrefSize(sizeX - 10, 24);
			text.setLayoutX(5);
			text.setLayoutY(sizeY - 29);

			root.getChildren().addAll(label, listview, text);
			return root;
		}
		return null;
	}
}