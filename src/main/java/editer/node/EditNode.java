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
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableObjectValue;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.DepthTest;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
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
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.StringConverter;
import javafx.util.converter.FloatStringConverter;
import javafx.util.converter.IntegerStringConverter;
import localize.LocalizeHandler;
import types.base.DataBase;
import types.base.DataBase.ValueEntry;
import types.base.DataPath;
import types.value.Operator;

/** リスナを実装した編集用ノード */
public class EditNode extends Pane implements ChangeListener<DataBase> {

	/** 変更対象 */
	protected final Class<? extends DataBase> Clazz;
	protected final DataPath Path;

	/** 型にあったプロパティ */
	protected Property<?> editerProperty;
	protected Property<Operator> operatorProperty = new SimpleObjectProperty<>();

	protected ObservableValue<?> currentValue;

	/** 表示名 */
	protected String Name;
	protected String Lore;

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
	/** ラベルの幅 */
	protected DoubleBinding labelWidth;

	/** listEditで利用 */
	private ObservableList<? extends IDataEntity> motherList;

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

	Label propertyEdit;
	Region clipEdit;

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

	/** 編集ボタンだけ */
	public static EditNode editCurve(ObservableObjectValue<? extends DataBase> editValue, EditType edit, DataPath path,
			CurveEditPane curveEditPane) {
		EditNode res = new EditNode(editValue, edit, path);
		res.Type = NodeType.Curve;

		Label label = new Label(res.Name + ":");
		label.setAlignment(Pos.CENTER_RIGHT);
		Button button = new Button("Edit");
		res.editerProperty = new SimpleObjectProperty<>();
		res.textFieldWidth.bind(res.heightProperty());
		button.prefHeightProperty().bind(res.heightProperty());
		label.prefHeightProperty().bind(res.heightProperty());
		label.prefWidthProperty().bind(res.labelWidth);
		button.setOnAction((e) -> {
			curveEditPane.setEdit(editValue.get(), path);
		});

		ChoiceBox<Operator> operator = new ChoiceBox<>();
		operator.getItems().addAll(Operator.getAllow(EditHelper.getDataEntry(res.Clazz, res.Path).Default.getClass()));
		operator.getSelectionModel().selectedItemProperty()
				.addListener((v, ov, nv) -> res.operatorProperty.setValue(nv));
		res.operatorProperty.addListener((v, ov, nv) -> operator.getSelectionModel().select(nv));

		operator.getSelectionModel().select(0);
		operator.prefHeightProperty().bind(res.heightProperty());
		operator.setPrefWidth(65);
		operator.setBackground(WhiteBack);
		operator.setStyle("-fx-font: 7pt 'Courier New'");

		leftJustified(res.propertyEdit, 0, res.clipEdit);
		leftJustified(res.clipEdit, 0, label);
		center(label, 2, button);
		rightJustified(button, 0, operator);
		right(res, 0, operator);
		res.getChildren().addAll(label, button, operator);

		// 有効化切り替え
		label.disableProperty().bind(res.disable);
		button.disableProperty().bind(res.disable);
		operator.disableProperty().bind(res.disable);

		res.build();
		return res;
	}

	public static EditNode editNumber(ObservableObjectValue<? extends DataBase> editValue, EditType edit,
			DataPath path) {
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

	public static EditNode editString(ObservableObjectValue<? extends DataBase> value, EditType edit, DataPath path) {
		return editString(value, edit, path, null);
	}

	public static EditNode editString(ObservableObjectValue<? extends DataBase> value, EditType edit, DataPath path,
			ObservableList<? extends IDataEntity> list) {
		EditNode res = new EditNode(value, edit, path);
		if (list != null) {
			res.motherList = list;
			res.Type = NodeType.StringFromList;
		} else
			res.Type = NodeType.String;
		res.build();
		return res;
	}

	public static Node editBoolean(ObservableObjectValue<? extends DataBase> editValue, EditType edit, DataPath path) {
		EditNode res = new EditNode(editValue, edit, path);
		res.Type = NodeType.Boolean;
		res.build();
		return res;
	}

	/**
	 * 左詰めで配置 右側のtranslateXにバインド
	 */
	private static void leftJustified(Region left, int gap, Region right) {
		right.translateXProperty().bind(left.widthProperty().add(left.translateXProperty()).add(gap));
	}

	/** 右詰めで配置 左側のtranslateXにバインド */
	private static void rightJustified(Region left, int gap, Region right) {
		left.translateXProperty().bind(right.translateXProperty().subtract(left.widthProperty()).subtract(gap));
	}

	/** 右端に配置 右側のtranslateXにバインド */
	private static void right(Region parent, int gap, Region right) {
		right.translateXProperty().bind(parent.widthProperty().subtract(right.widthProperty()).subtract(gap));
	}

	/** 中央に配置 長さを決定 */
	private static void center(Region center, int gap, Region right) {
		center.prefWidthProperty().bind(right.translateXProperty().subtract(center.translateXProperty()).subtract(gap));
	}

	/**
	 * 末端編集ノード
	 *
	 * @param value リスナー追加先
	 */
	protected EditNode(ObservableObjectValue<? extends DataBase> value, EditType edit, DataPath path) {
		Path = path;
		Clazz = edit.Clazz;
		Name = LocalizeHandler.getLocalizedName(Clazz, Path);
		Lore = LocalizeHandler.getLocalizedLore(Clazz, Path);

		setDepthTest(DepthTest.ENABLE);
		value.addListener(this);

		// サイズのプロパティの定義
		this.setPrefSize(300, 24);
		labelWidth = widthProperty().subtract(textFieldWidth).subtract(20);

		// プロパティ編集
		ImageView addImage = new ImageView("/icon/add.png");
		ImageView removeImage = new ImageView("/icon/remove.png");
		propertyEdit = new Label();
		propertyEdit.setPrefSize(24, 24);
		propertyEdit.setOnMouseClicked(e -> {
			if (hasProperty(value.getValue())) {
				// editValue.getValue().removeProperty(Path);
				EditHelper.removeValueEntry(value.get(), Path);
				propertyEdit.setGraphic(addImage);
			} else {
				// editValue.getValue().put(key, Operator.SET, );
				EditHelper.putValueEntry(value.get(), Path);
				propertyEdit.setGraphic(removeImage);
			}

		});
		propertyEdit.setAlignment(Pos.CENTER);
		propertyEdit.setGraphic(addImage);
		// propertyEdit.translateXProperty().bind(labelWidth.add(textFieldWidth));
		propertyEdit.prefWidthProperty().set(20);

		value.addListener((v, ov, nv) -> {
			if (nv != null) {
				// 初期の表示を選択
				propertyEdit.setVisible(true);
				propertyEdit.setGraphic(hasProperty(nv) ? removeImage : addImage);

			}
		});
		clipEdit = EditPanels.makeClipUI(edit, Path);
		getChildren().addAll(propertyEdit,clipEdit);
	}

	/** このエントリで編集する型 */
	private NodeType Type;
	private static final Background WhiteBack = new Background(
			new BackgroundFill(Color.WHITE, new CornerRadii(2), new Insets(2)));

	private static final Background GrayBack = new Background(
			new BackgroundFill(Color.GRAY, new CornerRadii(2), Insets.EMPTY));

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void build() {
		if (Type == NodeType.Float || Type == NodeType.Integer || Type == NodeType.String
				|| Type == NodeType.StringFromList) {
			// テキストセット
			TextField text = new TextField();
			text.setAlignment(Pos.CENTER);
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
			text.setBackground(WhiteBack);
			text.setFont(Font.font(10));

			text.prefWidthProperty().bind(textFieldWidth);
			text.prefHeightProperty().bind(this.heightProperty());

			Label label = new Label(Name + ":");
			label.prefHeightProperty().bind(this.heightProperty());
			label.setAlignment(Pos.CENTER_RIGHT);

			ChoiceBox<Operator> operator = new ChoiceBox<>();
			operator.getItems().addAll(Operator.getAllow(EditHelper.getDataEntry(Clazz, Path).Default.getClass()));
			operator.getSelectionModel().selectedItemProperty()
					.addListener((v, ov, nv) -> operatorProperty.setValue(nv));
			operatorProperty.addListener((v, ov, nv) -> operator.getSelectionModel().select(nv));

			operator.getSelectionModel().select(0);
			operator.prefHeightProperty().bind(this.heightProperty());
			operator.setPrefWidth(65);
			operator.setBackground(WhiteBack);
			operator.setStyle("-fx-font: 7pt 'Courier New'");

			leftJustified(propertyEdit, 0, clipEdit);
			leftJustified(clipEdit, 0, label);
			center(label, 2, text);
			rightJustified(text, 0, operator);
			right(this, 0, operator);

			// 有効化切り替え
			operator.disableProperty().bind(disable);
			text.disableProperty().bind(disable);
			label.disableProperty().bind(disable);

			// loreHolder.setClip(lore);

			this.getChildren().addAll(text, label, operator);
			if (Lore != null) {
				Label lore = new Label(Lore);
				lore.setTranslateZ(10);
				lore.visibleProperty().bind(label.hoverProperty());
				lore.setMouseTransparent(true);
				lore.translateXProperty().bind(label.translateXProperty().add(40));
				lore.translateYProperty().bind(heightProperty().multiply(-1).add(10));
				lore.setTextFill(Color.BLACK);
				lore.setBackground(GrayBack);
				getChildren().add(lore);
			}
		} else if (Type == NodeType.Boolean) {
			Label label = new Label(Name + ":");
			label.setAlignment(Pos.CENTER_RIGHT);
			CheckBox check = new CheckBox();
			editerProperty = check.selectedProperty();
			textFieldWidth.bind(check.widthProperty());
			check.prefWidthProperty().bind(this.heightProperty());
			check.prefHeightProperty().bind(this.heightProperty());
			label.prefHeightProperty().bind(this.heightProperty());
			label.prefWidthProperty().bind(labelWidth);
			leftJustified(propertyEdit, 0, clipEdit);
			leftJustified(clipEdit, 0, label);
			center(label, 2, check);
			right(this, 0, check);
			this.getChildren().addAll(label, check);

			// 有効化切り替え
			label.disableProperty().bind(disable);
			check.disableProperty().bind(disable);
		}
		editerProperty.addListener((ChangeListener) listener);
		setDefault();
	}

	/** プロパティが設定されているかの判断 */
	protected boolean hasProperty(DataBase data) {
		return EditHelper.getProperty(data, Path) != null && EditHelper.getProperty(data, Path).getValue() != null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void bind(ValueEntry<?> data) {
		editerProperty.bindBidirectional((ObjectProperty) data.ValueProp);
		operatorProperty.bindBidirectional(data.OperatorProp);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void unbind(ValueEntry<?> data) {
		editerProperty.unbindBidirectional((Property) data.ValueProp);
		operatorProperty.unbindBidirectional(data.OperatorProp);
		setDefault();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void setDefault() {
		((Property) editerProperty).setValue(EditHelper.getDataEntry(Clazz, Path).Default);
		operatorProperty.setValue(Operator.SET);
	}

	private ChangeListener<ValueEntry<?>> entryListener = (v, ov, nv) -> {
		if (ov != null) {
			unbind(ov);
		}
		if (nv != null) {
			bind(nv);
		}
		disable.set(nv == null);
	};

	@Override
	public void changed(ObservableValue<? extends DataBase> observable, DataBase oldValue, DataBase newValue) {
		if (oldValue != null && Clazz.isAssignableFrom(oldValue.getClass())) {
			ObservableObjectValue<ValueEntry<Object>> prop = EditHelper.getProperty(oldValue, Path);
			prop.removeListener(entryListener);
			if (prop.get() != null)
				unbind(prop.get());
		}
		if (newValue != null && Clazz.isAssignableFrom(newValue.getClass())) {
			ObservableObjectValue<ValueEntry<Object>> prop = EditHelper.getProperty(newValue, Path);
			prop.addListener(entryListener);
			if (prop.get() != null)
				bind(prop.get());
			disable.set(!hasProperty(newValue));
		}
	}

	private enum NodeType {
		String, StringFromList, Integer, Float, Boolean, Curve
	}

}