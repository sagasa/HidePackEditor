package editer.node;

import java.math.BigDecimal;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.controlsfx.control.textfield.TextFields;

import editer.IDataEntity;
import editer.node.EditPanels.EditType;
import helper.ArrayEditor;
import helper.EditHelper;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.StringConverter;
import javafx.util.converter.FloatStringConverter;
import javafx.util.converter.IntegerStringConverter;
import types.base.DataBase;
import types.base.DataBase.ValueEntry;
import types.base.DataPath;

/** リスナを実装した編集用ノード */
public class EditNode extends Pane implements ChangeListener<DataBase> {

	/** 変更対象 */
	protected final Class<? extends DataBase> Clazz;
	protected final DataPath Path;

	/** 型にあったプロパティ */
	protected Property<?> editerProperty;

	protected ObservableValue<?> currentValue;

	/** 表示名 */
	protected String Name;

	protected Float getMax() {
		return EditHelper.getMax(Clazz, Path);
	}

	protected Float getMin() {
		return EditHelper.getMin(Clazz, Path);
	}

	public String getScale() {
		return EditHelper.getScale(Clazz, Path);
	}

	/** 値編集フィールドの幅 */
	protected DoubleProperty textFieldWidth = new SimpleDoubleProperty(100);
	/** プロパティの追加ボタンの有無 */
	protected DoubleProperty editBottonWidth = new SimpleDoubleProperty(0);
	/** ラベルの幅 */
	protected DoubleBinding labelWidth;

	/** listEditで利用 */
	protected ObservableList<? extends IDataEntity> motherList;

	/** 変更されたタイミングで呼ばれる */
	public EditNode setChangeListner(Consumer<?>... listener) {
		ChangeListener = listener;
		return this;
	}

	/** 変更通知リスナー */
	protected Consumer<?>[] ChangeListener = new Consumer<?>[0];

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private ChangeListener<?> listener = (v, ov, nv) -> {
		for (Consumer<?> run : ChangeListener)
			((Consumer) run).accept(nv);
	};

	/** 有効化切り替え */
	protected BooleanProperty disable = new SimpleBooleanProperty();

	/** 数値以外のパターン */
	private static final Pattern FloatPattern = Pattern.compile("[^0-9\\.-]+");
	private static final Pattern IntPattern = Pattern.compile("[^0-9-]+");

	// ========================= スクロール処理 =========================
	private BiConsumer<Boolean, Boolean> Scroll = new BiConsumer<Boolean, Boolean>() {
		@SuppressWarnings("unchecked")
		@Override
		public void accept(Boolean plus, Boolean shift) {
			BigDecimal oldValue = new BigDecimal(editerProperty.getValue().toString());
			BigDecimal change = new BigDecimal(getScale());
			if (shift) {
				change = change.multiply(new BigDecimal("10"));
			}
			if (!plus) {
				change = change.multiply(new BigDecimal("-1"));
			}
			BigDecimal newValue = change.add(oldValue);
			// 最大、最小チェック
			newValue = newValue.max(new BigDecimal(getMin()));
			newValue = newValue.min(new BigDecimal(getMax()));
			Property<Number> property = (Property<Number>) editerProperty;
			if (Type == NodeType.Float)
				property.setValue(newValue.floatValue());
			else
				property.setValue(newValue.intValue());
		}
	};

	public static EditNode editNumber(Property<? extends DataBase> editValue, EditType edit, DataPath path) {
		EditNode res = new EditNode(editValue, edit, path);
		if (EditHelper.isFloat(res.Clazz, res.Path))
			res.Type = NodeType.Float;
		else if (EditHelper.isInteger(res.Clazz, res.Path))
			res.Type = NodeType.Integer;
		else
			throw (new ClassCastException("EditNode can use float or int"));
		res.build();
		return res;
	}

	public static EditNode editString(Property<? extends DataBase> editValue, EditType edit, DataPath path) {
		return editString(editValue, edit, path, null);
	}

	public static EditNode editString(Property<? extends DataBase> editValue, EditType edit, DataPath path,
			ObservableList<? extends IDataEntity> list) {
		EditNode res = new EditNode(editValue, edit, path);
		if (list != null) {
			res.motherList = list;
			res.Type = NodeType.StringFromList;
		} else
			res.Type = NodeType.String;
		res.build();
		return res;
	}

	public static Node editBoolean(Property<? extends DataBase> editValue, EditType edit, DataPath path) {
		EditNode res = new EditNode(editValue, edit, path);
		res.Type = NodeType.Boolean;
		res.build();
		return res;
	}

	/**
	 * 末端編集ノード
	 *
	 * @param editValue リスナー追加先
	 */
	protected EditNode(Property<? extends DataBase> editValue, EditType edit, DataPath path) {
		Path = path;
		Clazz = edit.Clazz;
		Name = EditHelper.getLocalizedName(Clazz, Path);

		editValue.addListener(this);

		// サイズのプロパティの定義
		this.setPrefSize(200, 24);
		labelWidth = widthProperty().subtract(textFieldWidth).subtract(editBottonWidth);

		// プロパティ編集
		ImageView addImage = new ImageView("/icon/add.png");
		ImageView removeImage = new ImageView("/icon/remove.png");
		Label propertyEdit = new Label();
		propertyEdit.setPrefSize(24, 24);
		propertyEdit.setOnMouseClicked(e -> {
			if (hasProperty(editValue.getValue())) {
				// unbind(editValue.getValue());
				// editValue.getValue().removeProperty(Path);
				propertyEdit.setGraphic(addImage);
				disable.set(true);
			} else {
				// editValue.getValue().put(key, Operator.SET, );
				// bind(editValue.getValue());
				propertyEdit.setGraphic(removeImage);
				disable.set(false);
			}

		});
		propertyEdit.setAlignment(Pos.CENTER);
		propertyEdit.setGraphic(addImage);
		propertyEdit.translateXProperty().bind(labelWidth.add(textFieldWidth));
		propertyEdit.prefWidthProperty().bind(editBottonWidth);

		editValue.addListener((v, ov, nv) -> {
			if (nv != null) {
				// 初期の表示を選択
				propertyEdit.setVisible(true);
				propertyEdit.setGraphic(hasProperty(nv) ? removeImage : addImage);
				editBottonWidth.set(20);

			}
		});
		getChildren().add(propertyEdit);
	}

	/** このエントリで編集する型 */
	private NodeType Type;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void build() {
		if (Type == NodeType.Float || Type == NodeType.Integer || Type == NodeType.String
				|| Type == NodeType.StringFromList) {
			// テキストセット
			TextField text = new TextField();
			text.setAlignment(Pos.CENTER);

			Label label = new Label(Name + ":");
			// エンターを押したらフォーカスを外す
			text.addEventHandler(KeyEvent.KEY_PRESSED, e -> {
				if (e.getCode() == KeyCode.ENTER)
					this.requestFocus();
			});
			if (Type == NodeType.String || Type == NodeType.StringFromList) {
				editerProperty = text.textProperty();
				if (Type == NodeType.StringFromList) {
					// test
					TextFields.bindAutoCompletion(text, key -> ArrayEditor.Search(motherList, key.getUserText())
							.stream().map(data -> data.getDisplayName()).sorted().collect(Collectors.toList()));
				}
			} else if (Type == NodeType.Float || Type == NodeType.Integer) {
				textFieldWidth.set(50);
				// 入力を数値のみに
				TextFormatter<Number> formatter;
				// FloatかIntegerか判別
				StringConverter<?> converter;
				if (Type == NodeType.Float) {
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
					converter = new FloatStringConverter();
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
							res = Math.min(res, Math.round(getMax()));
							res = Math.max(res, Math.round(getMin()));
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
				text.focusedProperty().addListener((observable, newvalue, oldvalue) ->

				{
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
			text.translateXProperty().bind(labelWidth);
			text.prefWidthProperty().bind(textFieldWidth);
			text.prefHeightProperty().bind(this.heightProperty());

			label.prefWidthProperty().bind(labelWidth.add(2));
			label.prefHeightProperty().bind(this.heightProperty());
			label.setAlignment(Pos.CENTER_RIGHT);

			// 有効化切り替え
			label.disableProperty().bind(disable);
			text.disableProperty().bind(disable);

			this.getChildren().addAll(text, label);
		} else if (Type == NodeType.Boolean) {
			Label label = new Label(Name + ":");
			label.setAlignment(Pos.CENTER_RIGHT);
			CheckBox check = new CheckBox();
			editerProperty = check.selectedProperty();
			textFieldWidth.bind(heightProperty());
			check.prefWidthProperty().bind(this.heightProperty());
			check.prefHeightProperty().bind(this.heightProperty());
			check.translateXProperty().bind(labelWidth.add(2));
			label.prefHeightProperty().bind(this.heightProperty());
			label.prefWidthProperty().bind(labelWidth);
			this.getChildren().addAll(label, check);

			// 有効化切り替え
			label.disableProperty().bind(disable);
			check.disableProperty().bind(disable);
		}
		editerProperty.addListener((ChangeListener) listener);
	}

	/** プロパティが設定されているかの判断 */
	protected boolean hasProperty(DataBase data) {
		return EditHelper.getProperty(data, Path) != null && EditHelper.getProperty(data, Path).getValue() != null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void bind(ValueEntry<?> data) {
		editerProperty.bindBidirectional((ObjectProperty) data.ValueProp);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void unbind(ValueEntry<?> data) {
		editerProperty.unbindBidirectional((Property) data.ValueProp);
	}

	private ChangeListener<ValueEntry<?>> entryListener = (v, ov, nv) -> {
		if (ov != null) {
			unbind(ov);
		}
		if (nv != null) {
			bind(nv);
		}
	};

	@Override
	public void changed(ObservableValue<? extends DataBase> observable, DataBase oldValue, DataBase newValue) {
		if (oldValue != null && Clazz.isAssignableFrom(oldValue.getClass())) {
			// System.out.println("old match");
			EditHelper.getProperty(oldValue, Path).removeListener(entryListener);
		}
		if (newValue != null && Clazz.isAssignableFrom(newValue.getClass())) {
			// System.out.println("new match " + Path + " "
			// +EditHelper.getProperty(newValue, Path) + " " + editerProperty);
			EditHelper.getProperty(newValue, Path).addListener(entryListener);
			disable.set(!hasProperty(newValue));

		}
	}

	private enum NodeType {
		String, StringFromList, Integer, Float, Boolean
	}

	public enum EditNodeType {
		String, StringFromList, Integer, Float, Boolean, StringList, Number, RootPack, Other
	}

}