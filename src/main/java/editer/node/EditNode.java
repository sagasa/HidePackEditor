package editer.node;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.controlsfx.control.textfield.AutoCompletionBinding.ISuggestionRequest;
import org.controlsfx.control.textfield.TextFields;

import editer.DataEntityInterface;
import editer.node.EditPanels.EditType;
import helper.ArrayEditer;
import helper.EditHelper;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
import types.base.DataBase;

/** リスナを実装した編集用ノード */
public class EditNode extends AnchorPane implements ChangeListener<DataBase> {

	/** 変更対象 */
	protected final Class<? extends DataBase> Clazz;
	protected final String Path;
	protected final EditNodeType Type;

	/** 型にあったプロパティ */
	protected Property<?> editerProperty;

	// TODO ローカライズは検討中
	protected String Name = "???";

	protected float MaxValue = Float.MAX_VALUE;

	/** 数値編集フィールドの最大値 */
	public EditNode setMax(float max) {
		MaxValue = max;
		return this;
	}

	protected float MinValue = -Float.MAX_VALUE;

	/** 数値編集フィールドの最小値 */
	public EditNode setMin(float min) {
		MinValue = min;
		return this;
	}

	protected String Scale = "1";

	/** 数値編集フィールドの変更幅 */
	public EditNode setScale(float scale) {
		Scale = String.valueOf(scale);
		return this;
	}

	protected DoubleProperty textFieldWidth = new SimpleDoubleProperty(100);

	/** テキストフィールドの幅 テキストフィールドを使用しない場合は無効 */
	public EditNode setTextFieldWidth(double width) {
		textFieldWidth.set(width);
		return this;
	}

	protected ObservableList<? extends DataEntityInterface> motherList;

	/** autodillとlistEditで利用 */
	public EditNode setFromList(ObservableList<? extends DataEntityInterface> list) {
		motherList = list;
		return this;
	}

	/** 変更されたタイミングで呼ばれる */
	public EditNode setChangeListner(Consumer<?>... listener) {
		ChangeListener = listener;
		return this;
	}

	/** 変更通知リスナー */
	protected Consumer<?>[] ChangeListener = new Consumer<?>[0];

	/** 数値以外のパターン */
	private static final Pattern FloatPattern = Pattern.compile("[^0-9\\.-]+");
	private static final Pattern IntPattern = Pattern.compile("[^0-9-]+");

	// ========================= スクロール処理 =========================
	private BiConsumer<Boolean, Boolean> Scroll = new BiConsumer<Boolean, Boolean>() {
		@SuppressWarnings("unchecked")
		@Override
		public void accept(Boolean plus, Boolean shift) {
			BigDecimal oldValue = new BigDecimal(editerProperty.getValue().toString());
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
			Property<Number> property = (Property<Number>) editerProperty;
			if (Type == EditNodeType.Float)
				property.setValue(newValue.floatValue());
			else
				property.setValue(newValue.intValue());
		}
	};

	public EditNode(ObservableValue<DataBase> observable, EditType edit, String path, EditNodeType type) {
		Path = path;
		Clazz = edit.Clazz;
		if (path.equals("SOUND_SHOOT")) {
			throw new NullPointerException();
		}

		observable.addListener(this);

		if (type == EditNodeType.Number) {
			if (EditHelper.isFloat(Clazz, Path))
				Type = EditNodeType.Float;
			else if (EditHelper.isInteger(Clazz, Path))
				Type = EditNodeType.Integer;
			else
				throw (new ClassCastException("EditNode can use float or int"));
		} else
			Type = type;

		MaxValue = EditHelper.getMax(Clazz, Path);
		MinValue = EditHelper.getMin(Clazz, Path);
		Scale = EditHelper.getScale(Clazz, Path);
		this.setPrefSize(200, 24);
		build();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void build() {
		if (Type == EditNodeType.Float || Type == EditNodeType.Integer || Type == EditNodeType.String
				|| Type == EditNodeType.StringFromList) {
			// テキストセット
			TextField text = new TextField();
			text.setAlignment(Pos.CENTER);

			Label label = new Label(Name + ":");
			// エンターを押したらフォーカスを外す
			text.addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.ENTER)
					this.requestFocus();
			});
			text.textProperty().addListener((change, old, newv) -> {
				for (Consumer<?> run : ChangeListener)
					((Consumer<String>) run).accept(newv);
			});
			if (Type == EditNodeType.String || Type == EditNodeType.StringFromList) {
				editerProperty = text.textProperty();
				if (Type == EditNodeType.StringFromList) {
					// test
					TextFields.bindAutoCompletion(text, new Callback<ISuggestionRequest, Collection<String>>() {
						@Override
						public Collection<String> call(ISuggestionRequest key) {
							return ArrayEditer.Search(motherList, key.getUserText()).stream()
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
					editerProperty = new SimpleFloatProperty();
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
								res = (Float) editerProperty.getValue();
								text.setText(String.valueOf(res));
							}
							// 範囲チェック
							res = Math.min(res, MaxValue);
							res = Math.max(res, MinValue);

							return res;
						}
					};
				} else {
					// int なら
					editerProperty = new SimpleIntegerProperty();
					converter = new IntegerStringConverter() {
						@Override
						public Integer fromString(String str) {
							Integer res;
							try {
								res = super.fromString(str);
							} catch (Exception e) {
								res = (Integer) editerProperty.getValue();
							}
							// 範囲チェック
							res = Math.min(res, Math.round(MaxValue));
							res = Math.max(res, Math.round(MinValue));
							String.valueOf(res);
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
				text.textProperty().bindBidirectional((Property) editerProperty, converter);
				text.focusedProperty().addListener((observable, newvalue, oldvalue) -> {
					if (!newvalue) {
						text.setText(editerProperty.getValue().toString());
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
			text.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(2), new Insets(2))));
			text.setFont(Font.font(10));
			text.translateXProperty().bind(this.widthProperty().subtract(textFieldWidth));
			text.prefWidthProperty().bind(textFieldWidth);
			text.prefHeightProperty().bind(this.heightProperty());

			label.prefWidthProperty().bind(this.widthProperty().subtract(textFieldWidth.subtract(2)));
			label.prefHeightProperty().bind(this.heightProperty());
			label.setAlignment(Pos.CENTER_RIGHT);

			this.getChildren().addAll(text, label);

		} else if (Type == EditNodeType.Boolean) {
			Label label = new Label(Name + ":");
			label.setAlignment(Pos.CENTER_RIGHT);
			CheckBox check = new CheckBox();
			editerProperty = check.selectedProperty();
			check.selectedProperty().addListener((value, oldvalue, newvalue) -> {
				for (Consumer<?> run : ChangeListener)
					((Consumer<Boolean>) run).accept(newvalue);
			});
			check.prefWidthProperty().bind(this.heightProperty());
			check.prefHeightProperty().bind(this.heightProperty());
			check.translateXProperty().bind(this.widthProperty().subtract(this.heightProperty()));
			label.prefHeightProperty().bind(this.heightProperty());
			label.prefWidthProperty().bind(this.widthProperty().subtract(this.heightProperty()));
			this.getChildren().addAll(check, label);
		} else if (Type == EditNodeType.StringList) {

		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void changed(ObservableValue<? extends DataBase> observable, DataBase oldValue, DataBase newValue) {
		if (oldValue != null && oldValue.getClass() == Clazz) {
			// System.out.println("old match");
			editerProperty.unbindBidirectional((Property) EditHelper.getProperty(oldValue, Path));
		}
		if (newValue != null && newValue.getClass() == Clazz) {
			// System.out.println("new match " + Path +" "+ EditHelper.getProperty(newValue,
			// Path) + " " + editerProperty);
			editerProperty.bindBidirectional((Property) EditHelper.getProperty(newValue, Path));
		}

	}

	public enum EditNodeType {
		String, StringFromList, Integer, Float, Boolean, StringList, Number
	}
}