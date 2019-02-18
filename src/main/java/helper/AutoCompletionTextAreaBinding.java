package helper;

import java.util.Collection;

import org.controlsfx.control.textfield.AutoCompletionBinding;

import impl.org.controlsfx.autocompletion.SuggestionProvider;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Callback;
import javafx.util.StringConverter;

/**
 * テキストフィールドの自動補完をテキストエリアにラップする
 *
 * @param <T>
 */
public class AutoCompletionTextAreaBinding<T> extends AutoCompletionBinding<T> {

	public static <T> AutoCompletionBinding<T> bindAutoCompletion(TextArea textField,
			Collection<T> possibleSuggestions) {
		return new AutoCompletionTextAreaBinding<>(textField, SuggestionProvider.create(possibleSuggestions));
	}

	/***************************************************************************
	 * * Static properties and methods * *
	 **************************************************************************/

	private static <T> StringConverter<T> defaultStringConverter() {
		return new StringConverter<T>() {
			@Override
			public String toString(T t) {
				return t == null ? null : t.toString();
			}

			@SuppressWarnings("unchecked")
			@Override
			public T fromString(String string) {
				return (T) string;
			}
		};
	}

	/***************************************************************************
	 * * Private fields * *
	 **************************************************************************/

	private String input;
	/**
	 * String converter to be used to convert suggestions to strings.
	 */
	private StringConverter<T> converter;

	/***************************************************************************
	 * * Constructors * *
	 **************************************************************************/

	/**
	 * Creates a new auto-completion binding between the given textField and the
	 * given suggestion provider.
	 *
	 * @param textField
	 * @param suggestionProvider
	 */
	public AutoCompletionTextAreaBinding(final TextArea textField,
			Callback<ISuggestionRequest, Collection<T>> suggestionProvider) {

		this(textField, suggestionProvider, AutoCompletionTextAreaBinding.<T>defaultStringConverter());
	}

	/**
	 * Creates a new auto-completion binding between the given textField and the
	 * given suggestion provider.
	 *
	 * @param textField
	 * @param suggestionProvider
	 */
	public AutoCompletionTextAreaBinding(final TextArea textField,
			Callback<ISuggestionRequest, Collection<T>> suggestionProvider, final StringConverter<T> converter) {

		super(textField, suggestionProvider, converter);
		this.converter = converter;

		getCompletionTarget().addEventFilter(KeyEvent.KEY_PRESSED, autofillreq);
		getCompletionTarget().focusedProperty().addListener(focusChangedListener);
	}

	/***************************************************************************
	 * * Public API * *
	 **************************************************************************/

	/** {@inheritDoc} */
	@Override
	public TextArea getCompletionTarget() {
		return (TextArea) super.getCompletionTarget();
	}

	/** {@inheritDoc} */
	@Override
	public void dispose() {
		getCompletionTarget().removeEventFilter(KeyEvent.KEY_PRESSED, autofillreq);
		getCompletionTarget().focusedProperty().removeListener(focusChangedListener);
	}

	/** {@inheritDoc} */
	@Override
	protected void completeUserInput(T completion) {
		String newText = converter.toString(completion);
		getCompletionTarget().deleteText(getCompletionTarget().getCaretPosition() - input.length(),
				getCompletionTarget().getCaretPosition());
		getCompletionTarget().insertText(getCompletionTarget().getCaretPosition(), newText);
		;
		getCompletionTarget().positionCaret(getCompletionTarget().getCaretPosition() + newText.length());
	}

	/***************************************************************************
	 * * Event Listeners * *
	 **************************************************************************/

	private final EventHandler<KeyEvent> autofillreq = new EventHandler<KeyEvent>() {
		@Override
		public void handle(KeyEvent e) {
			if (e.getCode() == KeyCode.TAB && getCompletionTarget().isFocused()) {
				e.consume();
				String newText = getCompletionTarget().getText();
				String[] split = newText.split("[\n|[\\s+]]");
				int p = 0;
				int caret = getCompletionTarget().getCaretPosition();
				for (String line : split) {
					if (p <= caret && caret <= p + line.length() && line.length() > 0) {
						input = newText.substring(p, p + line.length());
						setUserInput(input);
						break;
					}
					p += line.length() + 1;
				}
			}
		}
	};

	private final ChangeListener<Boolean> focusChangedListener = new ChangeListener<Boolean>() {
		@Override
		public void changed(ObservableValue<? extends Boolean> obs, Boolean oldFocused, Boolean newFocused) {
			if (newFocused == false)
				hidePopup();
		}
	};
}
