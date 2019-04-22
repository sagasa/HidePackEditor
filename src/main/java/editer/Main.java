package editer;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;

import editer.controller.RootController;
import io.ModelIO;
import io.PackIO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import localize.LocalizeHandler;
import model.Bone;
import types.attachments.GunCustomizePart;
import types.attachments.ValueChange;
import types.attachments.ValueChange.ChangeType;
import types.items.GunData;

public class Main extends Application {
	/** 開いているpath */
	public static String packPath;


	public static void main(String[] arg) throws ScriptException {
		LocalizeHandler.init();
		LocalizeHandler.loadLang();
		LocalizeHandler.setLang("en");
		PackIO.makePack();
		// new MainWindow();
		launch(arg);

		/*
		GunData data = new GunData();
		Class<Number> clazz = Number.class;
		Gson gson = new Gson();
		GunCustomizePart item = new GunCustomizePart();
		item.CHANGE_LIST.add(new ValueChange("BULLET_POWER", ChangeType.ADD_FLOAT, 1.5));
		System.out.println(item.CHANGE_LIST);
		GunCustomizePart item2 = gson.fromJson(gson.toJson(item), GunCustomizePart.class);
			System.out.println(item2.CHANGE_LIST+" ");

		System.out.println(data.BULLET_POWER);
		for(ValueChange c:item2.CHANGE_LIST) {
			c.apply(data);
		}
		System.out.println(data.BULLET_POWER);
		System.exit(0);
		//*/
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
		stage.getIcons().add(new Image("icon/M14_scope.png"));
		stage.setScene(scene);
		stage.setMinHeight(STAGE_SIZE.getY());
		stage.setMinWidth(STAGE_SIZE.getX());
		stage.show();
	}
}
