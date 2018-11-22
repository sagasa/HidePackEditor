package editer;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import controller.editer.ImportController;
import io.PackIO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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

	private static final Logger log = LoggerFactory.getLogger(Main.class);
	private static final Point2D STAGE_SIZE = new Point2D(1280, 720);

	public void start(Stage stage) throws Exception {
		String fxmlFile = "/fxml/editer.fxml";
		log.debug("Loading FXML for main view from: {}", fxmlFile);
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
		Parent rootNode = (Parent) loader.load();
		log.debug("Showing JFX scene");
		Scene scene = new Scene(rootNode, STAGE_SIZE.getX(), STAGE_SIZE.getY()-40);
		scene.getStylesheets().add("/styles/styles.css");
		stage.setTitle("HidePackEditer");
		stage.setScene(scene);
		stage.setMinHeight(STAGE_SIZE.getY());
		stage.setMinWidth(STAGE_SIZE.getX());
		stage.show();
		//PackIO.openPack();

		DirectoryChooser fxtest = new DirectoryChooser();
		fxtest.setInitialDirectory(new File("./"));

		System.out.println(fxtest.showDialog(stage));
	}
}
