package editer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import editer.controller.RootController;
import helper.ModelLoader;
import io.EditorConfig;
import javafx.application.Application;
import javafx.beans.value.ObservableObjectValue;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import localize.LocalizeHandler;
import types.base.DataBase;
import types.base.DataBase.ValueEntry;
import types.base.DataPath;
import types.base.NamedData;
import types.effect.Recoil;
import types.gun.GunFireMode;
import types.items.GunData;
import types.value.Operator;

public class Editer extends Application {

	public static EditorConfig config;

	static class HideModelPart {

	}

	public static void main(String[] arg) throws IOException {
		LocalizeHandler.init();
		LocalizeHandler.loadLang();
		LocalizeHandler.setLang("ja");

		config = EditorConfig.load();
		// PackIO.makePack();

//		new ValueChange();
//
//		Gson gson = DataBase.getGson();
//		ValueChange change = new ValueChange();
//		change.VALUE = "1.0";
//		change.PATH = "BULLET_SPEED";
//		change = gson.fromJson(gson.toJson(change), ValueChange.class);
//		change.makeCash(GunData.class);
//		System.out.println(change.VALUE_CASH+" "+(change.VALUE_CASH.getClass()));
//		System.out.println();
//
//		System.exit(0);

		System.out.println(DataBase.getSample(GunData.class, false));

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

		Recoil recoil = new Recoil();
		Recoil recoil2 = new Recoil();

		List<GunData> holder = new ArrayList<>();
		GunData data = new GunData();
		ObservableObjectValue<ValueEntry<?>> prop = data.getEntryProp(DataPath.of(GunData.Recoil, Recoil.PowerShoot));
		prop.addListener((v, ov, nv) -> {
			System.out.println("Change " + ov + nv);
		});

		System.out.println(prop);
		data.put(GunData.RPM, Operator.SET, 1200);
		data.getEntry(GunData.RPM).setValue(1100);
		data.put(GunData.FireMode, Operator.ARRAY_ADD, new GunFireMode[] { GunFireMode.FULLAUTO });
		data.put(GunData.ShortName, Operator.SET, "test");
		data.put(GunData.Recoil, Operator.SET, recoil);

		GunData data2 = new GunData();
		data2.put(GunData.RPM, Operator.ADD, 3);
		data2.put(GunData.ParentName, Operator.SET, "test");
		data2.put(GunData.Recoil, Operator.SET, recoil2);

		holder.add(data);
		holder.add(data2);
		NamedData.resolvParent(holder);

		System.out.println("set recoil value");
		recoil.put(Recoil.PowerShoot, Operator.SET, 0.5f);
		recoil2.put(Recoil.PowerShoot, Operator.ADD, 0.5f);

		System.out.println(data2.get(GunData.RPM, null) + " " + ArrayUtils.toString(data2.get(GunData.FireMode, null))
				+ " " + data2.get(GunData.Recoil, null).get(Recoil.PowerShoot, null));
		System.out.println(data.get(GunData.ShortName, null));

		String json = data.toJson();
		System.out.println(json);
		DataBase from = DataBase.fromJson(json);
		System.out.println(DataBase.getGson().toJson(from));

		System.out.println(from.getClass());

		new ModelLoader().run();

		EditorConfig.save(config);

		System.exit(0);
	}

	private static final Logger log = LogManager.getLogger();
	private static final Point2D STAGE_SIZE = new Point2D(1400, 800);

	@Override
	public void start(Stage stage) throws Exception {
		String fxmlFile = "/fxml/editer.fxml";
		log.debug("Loading FXML for main view from: {}", fxmlFile);
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile), LocalizeHandler.getResourceBundle());
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
