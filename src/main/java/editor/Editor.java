package editor;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import editor.controller.RootController;
import io.EditorConfig;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import localize.LocalizeHandler;
import sagasa.gltf.GltfLoader;
import sagasa.gltf.GltfLoader.GLBInfo;
import sagasa.gltf.GltfLoader.GltfException;
import types.value.Curve;
import types.value.Curve.CurveKey;

public class Editor extends Application {

	public static EditorConfig config;

	static class HideModelPart {

	}

	public static void main(String[] arg) throws IOException, GltfException {
		LocalizeHandler.init();
		LocalizeHandler.loadLang();
		LocalizeHandler.setLang("ja");

		config = EditorConfig.load();
		// PackIO.makePack();
//		GunData gundata = new GunData();
//		Recoil r = new Recoil();
//		r.put(Recoil.HorizontalBase);
//		r.put(Recoil.HorizontalReturn);
//		gundata.put(GunData.RecoilADS, Operator.SET, r);
//		ClipManager cm = new ClipManager();
//		cm.add(gundata, DataPath.of(GunData.RecoilADS));
//		// cm.add(gundata, DataPath.of(GunData.RecoilADS, Recoil.HorizontalReturn));
//		GunData to = new GunData();
//		cm.paste(to, DataPath.of(GunData.Recoil));
//
//		System.out.println(gundata.toJson());
//		System.out.println(to.toJson());

//
//		System.exit(0);

		GLBInfo info = GltfLoader.LoadGlbFile(new File("./addempty.glb"));
		System.out.println(info.animations);
		System.out.println(info.emptynodes);

		Curve curve = new Curve();
		curve.Keys = new CurveKey[2];
		curve.Keys[0] = new CurveKey(0, 0);
		curve.Keys[1] = new CurveKey(1, 1);

		// System.out.println(curve.get(1.5f));

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
//
//		Recoil recoil = new Recoil();
//		Recoil recoil2 = new Recoil();
//
//		List<GunData> holder = new ArrayList<>();
//		GunData data = new GunData();
//		ObservableObjectValue<ValueEntry<?>> prop = data.getEntryProp(DataPath.of(GunData.Recoil, Recoil.PowerShoot));
//		prop.addListener((v, ov, nv) -> {
//			System.out.println("Change " + ov + nv);
//		});
//
//		System.out.println(prop);
//		data.put(GunData.RPM, Operator.SET, 1200);
//		data.getEntry(GunData.RPM).setValue(1100);
//		data.put(GunData.FireMode, Operator.ARRAY_ADD, new GunFireMode[] { GunFireMode.FULLAUTO });
//		data.put(GunData.ShortName, Operator.SET, "test");
//		data.put(GunData.Recoil, Operator.SET, recoil);
//
//		GunData data2 = new GunData();
//		data2.put(GunData.RPM, Operator.ADD, 3);
//		data2.put(GunData.ParentName, Operator.SET, "test");
//		data2.put(GunData.Recoil, Operator.SET, recoil2);
//
//		holder.add(data);
//		holder.add(data2);
//		NamedData.resolvParent(holder);
//
//		System.out.println("set recoil value");
//		recoil.put(Recoil.PowerShoot, Operator.SET, 0.5f);
//		recoil2.put(Recoil.PowerShoot, Operator.ADD, 0.5f);
//
//		System.out.println(data2.get(GunData.RPM, null) + " " + ArrayUtils.toString(data2.get(GunData.FireMode, null))
//				+ " " + data2.get(GunData.Recoil, null).get(Recoil.PowerShoot, null));
//		System.out.println(data.get(GunData.ShortName, null));
//
//		String json = data.toJson();
//		System.out.println(json);
//		DataBase from = DataBase.fromJson(json);
//		System.out.println(DataBase.getGson().toJson(from));

		EditorConfig.save(config);

		System.exit(0);
	}

	private static final Logger log = LogManager.getLogger();
	private static final Point2D STAGE_SIZE = new Point2D(1640, 920);
	public static final String Title = "HidePackEditor";

	@Override
	public void start(Stage stage) throws Exception {
		String fxmlFile = "/fxml/editor.fxml";
		log.debug("Loading FXML for main view from: {}", fxmlFile);
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile), LocalizeHandler.getResourceBundle());
		Parent rootNode = (Parent) loader.load();
		RootController.STAGE = stage;
		log.debug("Showing JFX scene");
		Scene scene = new Scene(rootNode, STAGE_SIZE.getX(), STAGE_SIZE.getY() - 40);
		stage.setTitle(Title);
		stage.getIcons().add(new Image("icon/M14_scope.png"));
		stage.setScene(scene);
		stage.setMinHeight(STAGE_SIZE.getY());
		stage.setMinWidth(STAGE_SIZE.getX());
		stage.show();

		stage.setOnCloseRequest(e -> {
			if (!HidePack.isEmpty()) {
				Alert alert = new Alert(AlertType.CONFIRMATION, "Exit?", ButtonType.YES, ButtonType.NO);
				alert.setHeaderText(null);
				ButtonType button = alert.showAndWait().orElse(ButtonType.CANCEL);
				if (button != ButtonType.YES) {
					e.consume();
				}
			}
		});
	}
}
