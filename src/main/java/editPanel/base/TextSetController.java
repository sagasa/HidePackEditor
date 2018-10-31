package editPanel.base;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextSetController
{
    private static final Logger log = LoggerFactory.getLogger(TextSetController.class);

    @FXML private TextField textField;
    @FXML private Label label;

    public void textChange() {

    }

    public void sayHello() {

        String firstName = textField.getText();

        log.debug(firstName);
    }

}
