package editer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import editer.controller.RootController;
import io.PackIO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
		/*
		System.exit(0);
		// */

		launch(arg);

		/*
		 * GunData data = new GunData(); Class<Number> clazz = Number.class; Gson gson =
		 * new Gson(); GunCustomizePart item = new GunCustomizePart();
		 * item.CHANGE_LIST.add(new ValueChange("RECOIL_DEFAULT.MAX_YAW_BASE",
		 * ChangeType.ADD_NUMBER, 2.5)); System.out.println(item.CHANGE_LIST);
		 * GunCustomizePart item2 = gson.fromJson(gson.toJson(item),
		 * GunCustomizePart.class); System.out.println(item2.CHANGE_LIST+" ");
		 *
		 * System.out.println(data.RECOIL_DEFAULT.MAX_YAW_BASE); for(ValueChange
		 * c:item2.CHANGE_LIST) { c.apply(data); }
		 * System.out.println(data.RECOIL_DEFAULT.MAX_YAW_BASE); System.exit(0); //
		 */
	}

	private static final Logger log = LogManager.getLogger();
	private static final Point2D STAGE_SIZE = new Point2D(1280, 720);

	@Override
	public void start(Stage stage) throws Exception {
		String fxmlFile = "/fxml/editer.fxml";
		log.debug("Loading FXML for main view from: {}", fxmlFile);
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
		Parent rootNode = (Parent) loader.load();
		RootController.STAGE = stage;
		log.debug("Showing JFX scene");
		Scene scene = new Scene(rootNode, STAGE_SIZE.getX(), STAGE_SIZE.getY() - 40);
		stage.setTitle("HidePackEditer");
		stage.getIcons().add(new Image("icon/M14_scope.png"));
		stage.setScene(scene);
		stage.setMinHeight(STAGE_SIZE.getY());
		stage.setMinWidth(STAGE_SIZE.getX());
		stage.show();
	}
}
