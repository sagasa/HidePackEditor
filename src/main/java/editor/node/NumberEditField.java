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

public class NumberEditField extends TextField {

	protected boolean isInteger;
	protected boolean isNonNegative = false;

	private static final Pattern NumberPattern = Pattern.compile("[^0-9\\.-]+");
	private static final Pattern IntPattern = Pattern.compile("[\\.]+");
	private static final Pattern NonNegativePattern = Pattern.compile("[-]+");

	private static final Background WhiteBack = new Background(
			new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(2), new Insets(2)));

	@SuppressWarnings("rawtypes")
	private StringConverter converter;
	@SuppressWarnings("rawtypes")
	private Property property;

	public <T extends Number> void bind(Property<T> prop, StringConverter<T> conv) {
		property = prop;
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

			System.out.println(c);
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

			System.out.println(c.getControlNewText() + " " + c.getText() + " " + old + " " + c.getAnchor() + " "
					+ c.getCaretPosition());
			System.out.println("replaceText " + input + " " + str + " == " + c.getCaretPosition() + " " + newCaret);

			c.setText(str);
			c.selectRange(newCaret, newCaret);
			// c.selectRange();
			return c;
		}));

		focusedProperty().addListener((v, ov, nv) -> {
			if (converter != null)
				setText(converter.toString(property.getValue()));
		});
	}

}
