package editer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import editer.controller.RootController;
import helper.ModelLoader;
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
import types.base.DataHolder;
import types.base.DataPath;
import types.base.IHideData;
import types.base.Info;
import types.base.Operator;
import types.effect.Recoil;
import types.effect.Recoil.RecoilData;
import types.gun.GunFireMode;
import types.items.GunData;
import types.items.GunData.GunDataEnum;

public class Editer extends Application {
	/** 開いているpath */
	public static String packPath;

	static class HideModelPart {

	}

	public static void main(String[] arg) {
		LocalizeHandler.init();
		LocalizeHandler.loadLang();
		LocalizeHandler.setLang("ja");

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
		recoil.put(RecoilData.PowerShoot, Operator.SET, 0.5f);

		Recoil recoil2 = new Recoil();
		recoil2.put(RecoilData.PowerShoot, Operator.ADD, 0.5f);

		DataHolder<GunDataEnum> holder = new DataHolder<>();
		GunData data = new GunData();
		ObservableObjectValue<ValueEntry> prop = data.getProperty(DataPath.of(GunDataEnum.Recoil));
		prop.addListener((ov, nv, v) -> {
			System.out.println(v.getValue());
		});

		System.out.println(prop);
		data.put(GunDataEnum.RPM, Operator.SET, 1200);
		data.getEntry(GunDataEnum.RPM).setValue(1100);
		data.put(GunDataEnum.FireMode, Operator.ARRAY_ADD, new GunFireMode[] { GunFireMode.FULLAUTO });
		data.put(GunDataEnum.ShortName, Operator.SET, "test");
		data.put(GunDataEnum.Recoil, Operator.SET, recoil);

		GunData data2 = new GunData();
		data2.put(GunDataEnum.RPM, Operator.ADD, 3);
		data2.put(GunDataEnum.ParentName, Operator.SET, "test");
		data2.put(GunDataEnum.Recoil, Operator.SET, recoil2);

		holder.put(data);
		holder.put(data2);
		holder.reload();

		System.out.println(
				data2.get(GunDataEnum.RPM, null) + " " + ArrayUtils.toString(data2.get(GunDataEnum.FireMode, null))
						+ " " + ((Recoil) data2.get(GunDataEnum.Recoil, null)).get(RecoilData.PowerShoot, null));

		String json = data.toJson();
		System.out.println(json);
		DataBase<GunDataEnum> from = DataBase.fromJson(json);
		System.out.println(DataBase.getGson().toJson(from));

		System.out.println(from.getClass());

		DataBase<DATA> test = new DataBase<>(DATA.class);
		System.out.println(test.toJson());
		test = DataBase.fromJson(test.toJson());

		Map<String, Integer> map = new HashMap<>();
		Collection<Integer> col = map.values();
		map.put("A", 2);
		System.out.println(col);
		new ModelLoader().run();

		// System.exit(0);

	}

	public enum DATA implements IHideData {
		/** 使用可否 Boolean */
		Use(true, new Info().Cate(0)),

		/** 射撃毎のパワーの増加値 最大1 Float */
		PowerShoot(0.0, new Info().Min(0).Max(1).Scale("0.05")),
		/** Tick毎のパワーの減少値 最大1 Float */
		PowerTick(0.0, new Info().Min(0).Max(1).Scale("0.05")),;

		private Object def;
		private Info info;

		private DATA(Object defValue) {
			this(defValue, null);
		}

		private DATA(Object defValue, Info info) {
			def = defValue;
			this.info = info;
		}

		@Override
		public Object getDefault() {
			return def;
		}

		@Override
		public Info getInfo() {
			return info;
		}

		@Override
		public Class<? extends DataBase> getContainer() {
			return DataBase.class;
		}
	}

	private static final Logger log = LogManager.getLogger();
	private static final Point2D STAGE_SIZE = new Point2D(1280, 720);

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
