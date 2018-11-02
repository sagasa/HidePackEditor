package editer;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import editer.mainWindow.MainWindow;
import io.PackIO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import localize.LocalizeHandler;
import types.PackInfo;
import types.guns.BulletData;
import types.guns.GunData;

public class Main extends Application{
	/**開いているpath*/
	public static String packPath;

	public static HidePack CurrentPack;

	public static void main(String[] arg){
		LocalizeHandler.init();
		LocalizeHandler.loadLang();
		PackIO.makePack();
	//	new MainWindow();
		launch(arg);
	}

	private static final Logger log = LoggerFactory.getLogger(Main.class);
	public void start(Stage stage) throws Exception {
        String fxmlFile = "/fxml/editer.fxml";
        log.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        Pane rootNode = (Pane) loader.load(getClass().getResourceAsStream(fxmlFile));
        log.debug("Showing JFX scene");
        Scene scene = new Scene(rootNode, 1280, 720);
        scene.getStylesheets().add("/styles/styles.css");
        stage.setTitle("HidePackEditer");
        stage.setScene(scene);
        stage.show();
    }

	/** パック初期化 */
	public static void clear() {
		packPath = null;

	}
}
