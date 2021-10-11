package editor.node;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.apache.commons.lang.ArrayUtils;

import editor.node.NumberEditField.FloatEditField;
import helper.ArrayEditor;
import helper.EditHelper;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.util.StringConverter;
import javafx.util.converter.FloatStringConverter;
import localize.LocalizeHandler;
import localize.LocalizeHandler.Lang;
import types.base.DataBase;
import types.base.DataBase.ValueEntry;
import types.base.DataPath;
import types.base.Info;
import types.value.Curve;
import types.value.Curve.CurveKey;

/** Curve編集 */
public class CurveEditPane extends Pane {

	private SimpleObjectProperty<Curve> editorProperty = new SimpleObjectProperty<>(null);

	private CurveKey[] getArray() {
		Curve curve = editorProperty.getValue();
		return curve == null ? null : curve.Keys;
	}

	private void setArray(CurveKey[] value) {
		Curve curve = editorProperty.getValue().clone();
		curve.Keys = value;
		editorProperty.set(curve);
	}

	private ObjectProperty<Curve> currentProp;
	private Info editInfo;

	@SuppressWarnings({ "unchecked" })
	public void setEdit(DataBase data, DataPath path) {
		ValueEntry<?> entry = data == null ? null : EditHelper.getValueEntry(data, path);
		if (currentProp != null) {
			editorProperty.unbindBidirectional(currentProp);
			currentProp = null;
			editorProperty.setValue(null);
		}
		if (entry != null) {
			label.setText(LocalizeHandler.getLocalizedName(data.getClass(), path));
			currentProp = (ObjectProperty<Curve>) entry.ValueProp;
			editInfo = EditHelper.getDataEntry(data.getClass(), path).Info;
			editorProperty.bindBidirectional(currentProp);
		} else {
			label.setText(LocalizeHandler.getLocalizedLore(Lang.NotSet));
		}
	}

	private static final double Top = 20;
	private static final double Height = 140;

	private static final double Width = 200;

	/** 当たったIndexを返す */
	private int getIndex(double x, double y) {
		for (int i = 0; i < posX.length; i++)
			if (isContact(posX[i], x) && isContact(posY[i], y))
				return i;
		return -1;
	}

	private boolean isOnLine(double x, double y) {
		if (posX.length <= 0)
			return false;
		return isContact(y, getYpos(x));
	}

	/** 補完してyの位置を出す */
	private double getYpos(double inX) {
		if (posX.length <= 0)
			return 0;
		int prev = -1, next = -1;
		// 左から順次
		for (int i = 0; i < posX.length; i++) {
			// 超えたら
			if (inX < posX[i]) {
				next = i;
				break;
			} else
				prev = i;
		}
		// 1番左なら
		if (next == -1)
			return posY[prev];
		// 1番右なら
		if (prev == -1)
			return posY[next];
		// xのprev-next間の位置を正規化して
		double y = (inX - posX[prev]) / (posX[next] - posX[prev]);
		// yを算出
		y = posY[prev] + (posY[next] - posY[prev]) * y;
		return y;
	}

	GraphicsContext g;

	private SimpleIntegerProperty selectIndex = new SimpleIntegerProperty(-1);
	private double[] posX = ArrayUtils.EMPTY_DOUBLE_ARRAY;
	private double[] posY = ArrayUtils.EMPTY_DOUBLE_ARRAY;

	float minX, maxX, minY, maxY;

	/** 表示の範囲を決定 */
	private void updateState(Curve curve) {
		CurveKey[] keys = curve.Keys;
		minX = keys[0].Key;
		maxX = keys[keys.length - 1].Key;
		minY = Float.MAX_VALUE;
		maxY = -Float.MAX_VALUE;
		for (CurveKey key : keys) {
			minY = Math.min(minY, key.Value);
			maxY = Math.max(maxY, key.Value);
		}
		if (maxX - minX < 0.5f) {
			minX -= 0.25;
			maxX += 0.25;
		}
		if (maxY - minY < 0.5f) {
			minY -= 0.25;
			maxY += 0.25;
		}

		minX -= (maxX - minX) / 10f;
		maxX += (maxX - minX) / 10f;
		minY -= (maxY - minY) / 10f;
		maxY += (maxY - minY) / 10f;

		posX = new double[keys.length];
		posY = new double[keys.length];

		draw(curve);
	}

	/** 表示座標から値へ */
	private float getValueX(double x) {
		return (float) (x * (maxX - minX) / Width + minX);
	}

	/** 表示座標から値へ */
	private float getValueY(double y) {
		return (float) -(((y - Top) / Height - 1) * (maxY - minY) + minY) + minY * 2;
	}

	/** 表示座標から値へ */
	private float getMoveX(double x) {
		return (float) (x * (maxX - minX) / Width);
	}

	/** 表示座標から値へ */
	private float getMoveY(double y) {
		return (float) -(y * (maxY - minY) / (Height));
	}

	private void draw(Curve curve) {
		g.clearRect(0, 0, Width, 200);
		// 枠描画
		g.setStroke(Color.GRAY);
		g.strokeRect(0, Top, Width, Height);
		// 線描画
		CurveKey[] keys = curve.Keys;
		for (int i = 0; i < keys.length; i++) {
			CurveKey key = keys[i];
			posX[i] = (key.Key - minX) / (maxX - minX) * Width;
			posY[i] = (1 - (key.Value - minY) / (maxY - minY)) * Height + Top;
		}
		g.setStroke(Color.RED);
		if (keys.length == 1) {
			g.strokeLine(0, Top + Height / 2, Width, Top + Height / 2);
		} else {
			g.strokePolyline(posX, posY, posX.length);
		}

		// 点描画
		for (int i = 0; i < posX.length; i++) {
			if (selectIndex.get() == i) {
				g.setFill(Color.BLUE);
				if (posX[i] < Width / 2)
					g.setTextAlign(TextAlignment.LEFT);
				else
					g.setTextAlign(TextAlignment.RIGHT);
				if (posY[i] < Top + Height / 2)
					g.setTextBaseline(VPos.TOP);
				else
					g.setTextBaseline(VPos.BOTTOM);
				g.fillText(String.format("(%.2f,%.2f)", keys[i].Key, keys[i].Value), posX[i], posY[i]);
				g.setFill(Color.LIGHTBLUE);
			} else
				g.setFill(Color.BLUE);
			g.fillOval(posX[i] - 2.5f, posY[i] - 2.5f, 5f, 5f);
		}
		g.setFill(Color.BLACK);
		// Min
		g.setTextAlign(TextAlignment.LEFT);
		g.setTextBaseline(VPos.TOP);
		g.fillText(String.format("(%.2f,%.2f)", minX, minY), 0, Height + Top);
		// Max
		g.setTextAlign(TextAlignment.RIGHT);
		g.setTextBaseline(VPos.BOTTOM);
		g.fillText(String.format("(%.2f,%.2f)", maxX, maxY), Width, Top);
	}

	private Curve getCurve() {
		if (editorProperty.get() == null)
			return null;
		return editorProperty.get();
	}

	/** 移動されたらTrue */
	private boolean isDrag = false;
	FloatEditField keyField;
	FloatEditField valueField;

	StringConverter<Float> converter = new FloatStringConverter();
	Label label;
	Button add;
	Button remove;

	double lastX, lastY;

	public CurveEditPane() {
		Canvas canvas = new Canvas(Width, 200);
		g = canvas.getGraphicsContext2D();

		editorProperty.addListener((v, ov, nv) -> {
			if (nv != null) {
				updateState(nv);
				System.out.println("Change ditect");
			}
		});

		canvas.setOnMousePressed(e -> {
			selectIndex.set(getIndex(e.getX(), e.getY()));
			if (selectIndex.get() == -1 && isOnLine(e.getX(), e.getY())) {
				CurveKey[] array = getArray();
				if (array != null) {
					array = ArrayEditor.addToArray(array, new CurveKey(getValueX(e.getX()), getValueY(e.getY())));
					Arrays.sort(array, (a, b) -> Float.compare(a.Key, b.Key));
					setArray(array);
					selectIndex.set(getIndex(e.getX(), e.getY()));
				}
			}
			lastX = e.getX();
			lastY = e.getY();
			draw(getCurve());
			System.out.println(selectIndex);
		});
		canvas.setOnMouseDragged(e -> {
			final int index = selectIndex.get();
			if (index != -1) {
				double x = e.getX();
				double y = e.getY();

				CurveKey[] array = getArray();
				CurveKey old = array[index];
				float resX = Math.min(Math.max(old.Key + getMoveX(x - lastX), editInfo.KeyMin), editInfo.KeyMax);
				float resY = Math.min(Math.max(old.Value + getMoveY(y - lastY), editInfo.Min), editInfo.Max);

				if (0 < index && resX < array[index - 1].Key)
					resX = array[index - 1].Key;
				if (index < array.length - 1 && array[index + 1].Key < resX)
					resX = array[index + 1].Key;

				keyField.setText(String.format("%.3f", resX));
				valueField.setText(String.format("%.3f", resY));

				array[index] = new CurveKey(resX, resY);
				isDrag = true;
				lastX = x;
				lastY = y;
				draw(getCurve());
			}
		});
		canvas.setOnMouseReleased(e -> {
			if (isDrag) {
				final int index = selectIndex.get();
				// 近すぎたら消す
				// 上側
				if (index != posX.length - 1 && isContact(posX[index], posX[index + 1])
						&& isContact(posY[index], posY[index + 1])) {
					CurveKey[] array = getArray();
					array = (CurveKey[]) ArrayUtils.remove(array, index);
					setArray(array);
				}
				if (index != 0 && isContact(posX[index], posX[index - 1]) && isContact(posY[index], posY[index - 1])) {
					CurveKey[] array = getArray();
					array = (CurveKey[]) ArrayUtils.remove(array, index);
					setArray(array);
				}
				updateState(getCurve());
				isDrag = false;
			}
		});

		this.setPrefHeight(200);
		this.setPrefWidth(200);

		// 入力を数値のみに
		// FloatかIntegerか判別

		Label labelX = initLabel("Key=");
		Label labelY = initLabel("Value=");
		keyField = initTextField();
		valueField = initTextField();

		add = initButton(LocalizeHandler.getLocalizedName(Lang.Add));
		add.setVisible(false);
		remove = initButton(LocalizeHandler.getLocalizedName(Lang.Remove));
		remove.visibleProperty().bind(selectIndex.isNotEqualTo(-1));
		remove.setOnAction(e -> {
			CurveKey[] array = getArray();
			if (array.length < 1)
				return;
			array = (CurveKey[]) ArrayUtils.remove(array, selectIndex.get());
			setArray(array);
			selectIndex.set(-1);
			updateState(getCurve());
		});

		leftJustified(labelX, 0, keyField);
		leftJustified(keyField, 0, labelY);
		leftJustified(labelY, 0, valueField);
		leftJustified(valueField, 0, add);
		leftJustified(valueField, 0, remove);

		keyField.textProperty().addListener((v, ov, nv) -> {
			final int index = selectIndex.get();
			if (index != -1 && !nv.equals(ov)) {
				CurveKey[] array = getArray();
				float value = converter.fromString(nv) == null ? 0 : converter.fromString(nv);
				float x = Math.max(value, index == 0 ? -Float.MAX_VALUE : array[index - 1].Key);
				x = Math.min(x, index == posX.length - 1 ? Float.MAX_VALUE : array[index + 1].Key);
				array[index] = new CurveKey(x, array[index].Value);
				updateState(getCurve());
			}
		});
		valueField.textProperty().addListener((v, ov, nv) -> {
			final int index = selectIndex.get();
			if (index != -1 && !nv.equals(ov)) {
				CurveKey[] array = getArray();
				array[index] = new CurveKey(array[index].Key, converter.fromString(nv));
				updateState(getCurve());
			}
		});

		label = new Label(LocalizeHandler.getLocalizedLore(Lang.NotSet));
		label.setAlignment(Pos.CENTER);
		label.translateXProperty().set(20);
		label.setLayoutY(2);
		label.setPrefHeight(20);
		// label.prefWidthProperty().bind(this.widthProperty().subtract(editBottonWidth.multiply(2)));
		this.getChildren().addAll(label, canvas, labelX, keyField, labelY, valueField, add, remove);
	}

	private Label initLabel(String str) {
		Label text = new Label(str);
		text.translateYProperty().bind(heightProperty().subtract(20));
		text.setAlignment(Pos.CENTER);
		text.setFont(Font.font(10));
		text.disableProperty().bind(selectIndex.isEqualTo(-1));
		return text;
	}

	private Button initButton(String str) {
		Button text = new Button(str);
		text.translateYProperty().bind(heightProperty().subtract(text.heightProperty()));
		text.setAlignment(Pos.CENTER);
		text.setFont(Font.font(10));
		return text;
	}

	private FloatEditField initTextField() {
		FloatEditField text = new FloatEditField(false);
		text.translateYProperty().bind(heightProperty().subtract(text.heightProperty()));
		text.setPrefWidth(50);
		text.setFont(Font.font(10));
		text.disableProperty().bind(selectIndex.isEqualTo(-1));
		return text;
	}

	protected static void leftJustified(Region left, int gap, Region right) {
		right.translateXProperty().bind(left.widthProperty().add(left.translateXProperty()).add(gap));
	}

	private static TextFormatter<Number> getTextFormatter() {
		return new TextFormatter<>(change -> {
			String str = FloatPattern.matcher(change.getText()).replaceAll("");
			String newstr = change.getControlNewText();
			String oldstr = newstr.replaceFirst(Pattern.quote(str), "");
			// 小数点
			str = charLimit(str, ".", 1 - charCount(oldstr, "."));
			// -記号
			if (oldstr.contains("-") || newstr.contains("-") && !newstr.startsWith("-")) {
				str = str.replaceAll("-", "");
			}
			int diffcount = change.getText().length() - str.length();
			// System.out.println(diffcount);
			// change.setAnchor(change.getAnchor() - diffcount);
			// change.setCaretPosition(change.getCaretPosition() - diffcount);
			change.setText(str);
			return change;
		});
	}

	private static int charCount(String str, String key) {
		int i = 0;
		int count = 0;
		while ((i = str.indexOf(key, i)) != -1) {
			count++;
			i++;
		}
		return count;
	}

	private static String charLimit(String str, String key, int count) {
		StringBuilder sb = new StringBuilder();
		String regex = Pattern.quote(key);
		String[] array = str.split(regex);
		for (String s : array) {
			sb.append(s);
			if (0 < count && 1 < array.length) {
				sb.append(key);
				count--;
			}
		}
		return sb.toString();
	}

	private static final Pattern FloatPattern = Pattern.compile("[^0-9\\.-]+");

	private static boolean isContact(double d0, double d1) {
		return Math.abs(d0 - d1) < 4;
	}
}
