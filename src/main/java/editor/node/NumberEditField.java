package editor.node;

import java.util.regex.Pattern;

import javafx.beans.property.Property;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.StringConverter;
import javafx.util.converter.FloatStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class NumberEditField<T extends Number> extends TextField {

	public static class FloatEditField extends NumberEditField<Float> {

		public FloatEditField(boolean isNonNegative) {
			super(false, isNonNegative);
			converter = new FloatStringConverter();
		}

		@SuppressWarnings("unchecked")
		public void bind(Property<Float> prop) {
			bind(prop, converter);
		}
	}

	public static class IntEditField extends NumberEditField<Integer> {

		public IntEditField(boolean isNonNegative) {
			super(false, isNonNegative);
			converter = new IntegerStringConverter();
		}

		@SuppressWarnings("unchecked")
		public void bind(Property<Integer> prop) {
			bind(prop, converter);
		}
	}

	protected boolean isInteger;
	protected boolean isNonNegative = false;

	protected float max = Float.MAX_VALUE;
	protected float min = -Float.MAX_VALUE;

	private static final Pattern NumberPattern = Pattern.compile("[^0-9\\.-]+");
	private static final Pattern IntPattern = Pattern.compile("[\\.]+");
	private static final Pattern NonNegativePattern = Pattern.compile("[-]+");

	private static final Background WhiteBack = new Background(
			new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(2), new Insets(2)));

	@SuppressWarnings("rawtypes")
	protected StringConverter converter;

	public void bind(Property<T> prop, StringConverter<T> conv) {
		converter = conv;
		textProperty().bindBidirectional(prop, conv);
	}

	@SuppressWarnings("unchecked")
	public NumberEditField(boolean isInteger, boolean isNonNegative) {
		this.isInteger = isInteger;
		this.isNonNegative = isNonNegative;

		setFont(Font.font(10));

		setPrefWidth(60);
		setPrefHeight(16);
		setPadding(Insets.EMPTY);
		setBackground(WhiteBack);
		setAlignment(Pos.CENTER);

		setTextFormatter(new TextFormatter<>(c -> {
			if (!c.isAdded()) {
				return c;
			}

			// System.out.println(c);
			final String input = c.getText();
			final int caret = c.getControlCaretPosition();
			final String old = c.getControlNewText().replaceFirst(Pattern.quote(c.getText()), "");

			int newCaret = c.getCaretPosition();

			String str = NumberPattern.matcher(input).replaceAll("");
			// === -の処理 ===
			if (str.indexOf('-') != -1) {
				str = NonNegativePattern.matcher(str).replaceAll("");
				if (!isNonNegative && caret == 0 && old.indexOf('-') == -1)
					str = "-" + str;
			}
			// === .の処理 ===
			if (str.indexOf('.') != -1) {
				if (!isInteger && old.indexOf('.') == -1) {
					if (1 < str.length()) {
						StringBuilder sb = new StringBuilder();
						boolean f = true;
						for (String s : str.split("\\.")) {
							sb.append(s);
							if (f) {
								sb.append('.');
								f = false;
							}
						}
						str = sb.toString();
					}
					if ((caret == 0 || caret == 1 && 0 < old.length() && old.charAt(0) == '-') && str.indexOf('.') == 0)
						str = "0" + str;
				} else
					str = IntPattern.matcher(str).replaceAll("");
			}

			newCaret = newCaret - input.length() + str.length();

//			System.out.println(c.getControlNewText() + " " + c.getText() + " " + old + " " + c.getAnchor() + " "
//					+ c.getCaretPosition());
//			System.out.println("replaceText " + input + " " + str + " == " + c.getCaretPosition() + " " + newCaret);

			c.setText(str);
			c.selectRange(newCaret, newCaret);
			// c.selectRange();
			return c;
		}));

		focusedProperty().addListener((v, ov, nv) -> {
			if (converter != null) {
				Object raw = converter.fromString(getText());
				if (isInteger) {
					int value = raw == null ? 0 : (int) raw;
					value = Math.max((int) min, value);
					value = Math.min((int) max, value);
					setText(converter.toString(value));
				} else {
					float value = raw == null ? 0 : (float) raw;
					value = Math.max(min, value);
					value = Math.min(max, value);
					setText(converter.toString(value));
				}

			}
		});
	}
}
