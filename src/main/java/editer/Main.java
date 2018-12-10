package editer;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import controller.editer.RootController;
import io.PackIO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import localize.LocalizeHandler;

public class Main extends Application {
	/** 開いているpath */
	public static String packPath;

	public static void main(String[] arg) {
		LocalizeHandler.init();
		LocalizeHandler.loadLang();
		LocalizeHandler.setLang("en");
		PackIO.makePack();
		// new MainWindow();
		launch(arg);
	}

	private static final Logger log = LogManager.getLogger();
	private static final Point2D STAGE_SIZE = new Point2D(1280, 720);

	public void start(Stage stage) throws Exception {
		String fxmlFile = "/fxml/editer.fxml";
		log.debug("Loading FXML for main view from: {}", fxmlFile);
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
		Parent rootNode = (Parent) loader.load();
		RootController.STAGE = stage;
		log.debug("Showing JFX scene");
		Scene scene = new Scene(rootNode, STAGE_SIZE.getX(), STAGE_SIZE.getY() - 40);
		stage.setTitle("HidePackEditer");
		stage.setScene(scene);
		stage.setMinHeight(STAGE_SIZE.getY());
		stage.setMinWidth(STAGE_SIZE.getX());
		stage.show();
	}
}
