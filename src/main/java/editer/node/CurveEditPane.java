package editer.node;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.apache.commons.lang.ArrayUtils;

import helper.ArrayEditor;
import helper.EditHelper;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.util.StringConverter;
import javafx.util.converter.FloatStringConverter;
import types.base.DataBase;
import types.base.DataBase.ValueEntry;
import types.base.DataPath;
import types.value.Curve;
import types.value.Curve.CurveKey;

/** Curve編集 */
public class CurveEditPane extends Pane {

	private SimpleObjectProperty<Curve> editerProperty = new SimpleObjectProperty<>(null);

	private CurveKey[] getArray() {
		Curve curve = editerProperty.getValue();
		return curve == null ? null : curve.Keys;
	}

	private void setArray(CurveKey[] value) {
		Curve curve = editerProperty.getValue().clone();
		curve.Keys = value;
		editerProperty.set(curve);
	}

	private ObjectProperty<Curve> currentProp;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void setEdit(DataBase data, DataPath path) {
		ValueEntry<?> entry = data == null ? null : EditHelper.getValueEntry(data, path);
		if (currentProp != null) {
			editerProperty.unbindBidirectional(currentProp);
			currentProp = null;
			editerProperty.setValue(null);
		}
		if (entry != null) {
			currentProp = (ObjectProperty<Curve>) entry.ValueProp;
			editerProperty.bindBidirectional(currentProp);
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
		g.strokePolyline(posX, posY, posX.length);
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
		// 入力
		if (selectIndex.get() != -1) {
			keyField.setText(converter.toString(keys[selectIndex.get()].Key));
			valueField.setText(converter.toString(keys[selectIndex.get()].Value));
		}

	}

	private Curve getCurve() {
		if (editerProperty.get() == null)
			return null;
		return editerProperty.get();
	}

	/** 移動されたらTrue */
	private boolean isDrag = false;
	TextField keyField;
	TextField valueField;

	StringConverter<Float> converter = new FloatStringConverter();
	Label label;

	public CurveEditPane() {
		Canvas canvas = new Canvas(Width, 200);
		g = canvas.getGraphicsContext2D();

		editerProperty.addListener((v, ov, nv) -> {
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
			draw(getCurve());
			System.out.println(selectIndex);
		});
		canvas.setOnMouseDragged(e -> {
			final int index = selectIndex.get();
			if (index != -1) {
				// 下限
				double x = Math.max(e.getX(), index == 0 ? e.getX() : posX[index - 1]);
				// 上限
				x = Math.min(x, index == posX.length - 1 ? x : posX[index + 1]);
				getArray()[index] = new CurveKey(getValueX(x), getValueY(e.getY()));
				isDrag = true;
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

		keyField = initTextField();
		valueField = initTextField();
		keyField.translateXProperty().bind(widthProperty().divide(2).subtract(keyField.widthProperty()));
		valueField.translateXProperty().bind(widthProperty().subtract(valueField.widthProperty()));

		keyField.textProperty().addListener((v, ov, nv) -> {
			final int index = selectIndex.get();
			if (index != -1 && !nv.equals(ov)) {
				CurveKey[] array = getArray();
				float x = Math.max(converter.fromString(nv), index == 0 ? -Float.MAX_VALUE : array[index - 1].Key);
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

		label = new Label("NotSet");
		label.setAlignment(Pos.CENTER);
		label.translateXProperty().set(20);
		label.setLayoutY(2);
		label.setPrefHeight(20);
		// label.prefWidthProperty().bind(this.widthProperty().subtract(editBottonWidth.multiply(2)));
		this.getChildren().addAll(label, canvas, keyField, valueField);
	}

	private TextField initTextField() {
		TextField text = new TextField();
		text.setTextFormatter(getTextFormatter());
		text.translateYProperty().bind(heightProperty().subtract(text.heightProperty()));
		text.setPrefWidth(50);
		text.setAlignment(Pos.CENTER);
		text.setFont(Font.font(10));
		text.disableProperty().bind(selectIndex.isEqualTo(-1));
		return text;
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
			System.out.println(diffcount);
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
