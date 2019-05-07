package editer.node;

import java.lang.reflect.Field;
import java.util.EnumMap;

import editer.HidePack;
import editer.controller.RootController;
import editer.node.EditNode.EditNodeType;
import helper.EditHelper;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import resources.HideImage;
import types.base.DataBase;
import types.base.GunFireMode;
import types.items.GunData;
import types.items.ItemData;
import types.items.MagazineData;

/**編集パネルのルート*/
public class EditPanels extends AnchorPane {

	/**編集パネルの対象*/
	public enum EditType {
	Gun(GunData.class), Magazine(MagazineData.class);

		/**判別用の型*/
		public Class<? extends DataBase> Clazz;

		private EditType(Class<? extends DataBase> clazz) {
			Clazz = clazz;
		}

		/**型からエディタを選択*/
		public static EditType getType(DataBase data) {
			for (EditType type : values()) {
				if (type.Clazz.equals(data.getClass()))
					return type;
			}
			return null;
		}
	}

	/**編集対象	*/
	private ObjectProperty<DataBase> editValue = new SimpleObjectProperty<>();

	private EnumMap<EditType, BooleanProperty> editers = new EnumMap<>(EditType.class);

	public EditPanels() {
		writeGunEditer();
		//	writeMagazineEditer();
	}

	/**エディタの内容設定*/
	public void setEditValue(DataBase data) {
		editValue.set(data);
	}

	/** 色とマージンを設定 */
	private static <T extends Node> T setDefault(T region) {
		region.setStyle("-fx-background-color: lightGray;");
		return region;
	}

	private Pane setUpFlow(EditType type) {
		FlowPane editer = new FlowPane();
		editer.setVgap(5);
		editer.setHgap(5);
		editer.setOrientation(Orientation.VERTICAL);
		editer.prefWrapLengthProperty().bind(this.heightProperty().subtract(3));
		editer.maxHeightProperty().bind(this.heightProperty());
		editer.setStyle("-fx-background-color: gray;");
		editer.setVisible(false);
		editer.setVisible(true);
		this.widthProperty().addListener((v, ov, nv) -> System.out
				.println(this.widthProperty().get() + " " + this.heightProperty() + " | " + editer));
		editValue.addListener((v, ov, nv) -> {
			if (nv != null && nv.getClass() == type.Clazz) {
				editer.setVisible(true);
				System.out.println(ov + " " + nv + " " + (nv.getClass() == type.Clazz));
				System.out.println("みえる！！");
			} else {
				editer.setVisible(false);
				System.out.println(ov + " " + nv + " " + (nv.getClass() == type.Clazz));
				System.out.println("ないです！！！");
			}
		});
		this.getChildren().add(editer);
		return editer;
	}

	/** GunEditer */
	public Pane writeGunEditer() {
		final EditType type = EditType.Gun;
		Pane editer = setUpFlow(type);
		//*
		// ItemName
		editer.getChildren().add(makeItemInfoNode(EditType.Gun));
		// icon
		editer.getChildren().add(makeImageNode(EditType.Gun, "ITEM_ICONNAME", HidePack.IconList));
		// Cate0
		editer.getChildren().add(makeCateEditPanel(EditType.Gun, 0));
		// Cate1
		editer.getChildren().add(makeCateEditPanel(EditType.Gun, 1));
		// useBullet
		editer.getChildren().add(
				setDefault(new ListEditNode(editValue, type, "MAGAZINE_USE", HidePack.MagazineList)));
		// fireMode
		editer.getChildren()
				.add(setDefault(new ListEditNode(editValue, type, "FIREMODE", GunFireMode.getList())));

		// scope
		Pane scope = makeImageNode(type, "SCOPE_NAME", HidePack.ScopeList);
		scope.getChildren().add(makeCateEditPanel(EditType.Gun, 2));
		editer.getChildren().add(scope);
		// shootSound
		editer.getChildren().add(
				setDefault(makeSoundEditer(type, "SOUND_SHOOT")));
		// reloadSound
		editer.getChildren().add(
				setDefault(makeSoundEditer(type, "SOUND_SHOOT")));
		// recoil
		editer.getChildren().add(setDefault(makeRecoilEditer(type)));
		//*/
		return editer;
	}

	/** MagazineData */
	public Pane writeMagazineEditer() {
		final EditType type = EditType.Magazine;
		Pane editer = setUpFlow(type);
		// ItemName
		editer.getChildren().add(makeItemInfoNode(type));
		// icon
		editer.getChildren().add(makeImageNode(type, "ITEM_ICONNAME", HidePack.IconList));
		// Cate0
		editer.getChildren().add(makeCateEditPanel(type, 0));

		addBulletEditer(editer);
		return editer;
	}

	private void addBulletEditer(Pane editer) {
		final EditType type = EditType.Magazine;
		final String top = "BULLETDATA";
		// Cate0
		editer.getChildren().add(makeCateEditPanel(type, 0, top));
		// Cate1
		editer.getChildren().add(makeCateEditPanel(type, 1, top));
		// Cate2
		editer.getChildren().add(makeCateEditPanel(type, 2, top));
		// Cate3
		editer.getChildren().add(makeCateEditPanel(type, 3, top));
		// sound
		editer.getChildren().add(setDefault(
				makeSoundEditer(type, top + ".SOUND_HIT_ENTITY")));
		// sound
		editer.getChildren().add(setDefault(
				makeSoundEditer(type, top + ".SOUND_HIT_GROUND")));
		// sound
		editer.getChildren().add(setDefault(
				makeSoundEditer(type, top + ".SOUND_PASSING")));
	}

	/** Recoil */
	private Region makeRecoilEditer(EditType type) {
		TabPane root = new TabPane();
		root.setMaxWidth(200);
		Tab Default = new Tab("Default", makeRecoilEditer(type, "RECOIL_DEFAULT"));
		Default.setClosable(false);
		Tab ADS = new Tab("ADS", makeRecoilEditer(type, "RECOIL_ADS"));
		ADS.setClosable(false);
		Tab Sneak = new Tab("Sneak", makeRecoilEditer(type, "RECOIL_SNEAK"));
		Sneak.setClosable(false);
		Tab SneakADS = new Tab("Sneak+ADS", makeRecoilEditer(type, "RECOIL_SNEAK_ADS"));
		SneakADS.setClosable(false);
		root.getTabs().addAll(Default, Sneak, ADS, SneakADS);
		return root;
	}

	/** Soundの詳細 */
	private Region makeSoundEditer(EditType type, String path) {
		VBox root = new VBox();
		Label label = new Label(path);
		label.setPrefWidth(200);
		label.setAlignment(Pos.CENTER);
		root.getChildren().add(label);
		// 数値系
		root.getChildren()
				.add(new EditNode(editValue, type, path + ".NAME", EditNodeType.StringFromList)
						.setFromList(HidePack.SoundList));
		root.getChildren().add(makeCateEditPanel(type, -1, path));
		return root;
	}

	private Region makeRecoilEditer(EditType type, String fieldName) {
		VBox root = new VBox();
		// 数値系
		Pane pane = makeCateEditPanel(type, -1, fieldName);

		// バインドチェック
		/*boolean value = recoil.USE;
		EditHelper.getProperty(recoil, "USE", boolean.class).setValue(!value);
		EditHelper.getProperty(recoil, "USE", boolean.class).setValue(value);
		//*/
		// 使用可否
		Node use = new EditNode(editValue, type, fieldName + ".USE", EditNodeType.Boolean).setChangeListner(() -> {
			pane.setDisable(!(boolean) EditHelper.getData(editValue.get(), fieldName + "." + "USE"));
		});
		root.getChildren().addAll(use, pane);
		return root;
	}

	/** ItemData用名称+アイコン編集ノード */
	private Pane makeItemInfoNode(EditType type) {
		VBox root = new VBox();
		setDefault(root);

		// 短縮名
		Node shortname = new EditNode(editValue, type, "ITEM_SHORTNAME", EditNodeType.String);
		// 表示名
		Node dizplayname = new EditNode(editValue, type, "ITEM_DISPLAYNAME", EditNodeType.String)
				.setChangeListner(() -> RootController.refreshList());
		// 短縮名の使用可否
		Runnable run = () -> {
			boolean use = (boolean) EditHelper.getData((ItemData) editValue.get(), "USE_SHORTNAME");
			shortname.setDisable(!use);
			if (!use) {
				EditHelper.getProperty(editValue.get(), "ITEM_SHORTNAME", String.class)
						.bindBidirectional(EditHelper.getProperty(editValue.get(), "ITEM_DISPLAYNAME", String.class));
			} else {
				EditHelper.getProperty(editValue.get(), "ITEM_SHORTNAME", String.class)
						.unbindBidirectional(EditHelper.getProperty(editValue.get(), "ITEM_DISPLAYNAME", String.class));
			}
		};
		Node useshortname = new EditNode(editValue, type, "USE_SHORTNAME", EditNodeType.Boolean).setChangeListner(run);
		root.getChildren().addAll(dizplayname, useshortname, shortname);
		root.setPrefSize(200, 72);
		return root;
	}

	/** StringでListからImageを選択し表示するパネル設定パネル */
	private Pane makeImageNode(EditType type, String fieldName, ObservableList<HideImage> list) {
		VBox root = new VBox();
		setDefault(root);
		ImageView iconview = new HideImageView(type, fieldName, list);
		iconview.setFitWidth(64);
		iconview.setFitHeight(64);
		VBox.setMargin(iconview, new Insets(5, 0, 0, 5));
		iconview.setPreserveRatio(true);
		Node name = new EditNode(editValue, type, fieldName, EditNodeType.StringFromList);
		root.getChildren().addAll(iconview, name);
		return root;
	}

	/** カテゴリが付いた値を編集するノード */
	private Pane makeCateEditPanel(EditType type, int cate) {
		return makeCateEditPanel(type, cate, null);
	}

	/** カテゴリが付いた値を編集するノード */
	@SuppressWarnings("unchecked")
	private Pane makeCateEditPanel(EditType type, int cate, String path) {
		VBox root = new VBox();
		Class<? extends DataBase> clazz;
		String top = "";
		if (path != null) {
			clazz = (Class<? extends DataBase>) EditHelper.getType(type.Clazz, path);
			top = path + ".";
		} else {
			clazz = type.Clazz;
		}
		setDefault(root);
		for (Field field : clazz.getFields()) {
			int c = EditHelper.getCate(clazz, field.getName());
			if (c == cate) {
				if (EditHelper.isString(clazz, field.getName())) {
					root.getChildren()
							.add(new EditNode(editValue, type, top + field.getName(), EditNodeType.String));
				} else if (EditHelper.isBoolean(clazz, field.getName())) {
					root.getChildren()
							.add(new EditNode(editValue, type, top + field.getName(), EditNodeType.Boolean));
				} else if (EditHelper.isNumber(clazz, field.getName())) {
					root.getChildren()
							.add(new EditNode(editValue, type, top + field.getName(), EditNodeType.Number));
				}
			}
		}
		return root;
	}

	// ベースサイズは200x24
}
