package editer.node;

import java.lang.reflect.Field;
import java.util.EnumMap;

import org.apache.logging.log4j.core.config.Property;

import editer.HidePack;
import editer.controller.RootController;
import editer.node.EditNode.EditNodeType;
import helper.EditHelper;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import localize.LocalizeHandler;
import resources.HideImage;
import types.base.DataBase;
import types.base.GunFireMode;
import types.effect.Recoil;
import types.effect.Sound;
import types.items.GunData;
import types.items.MagazineData;
import types.projectile.BulletData;

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
		editValue.addListener(new EditNode(EditType.Gun, "RECOIL_DEFAULT.MAX_YAW_SPREAD", EditNodeType.Number));
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

	/** GunEditer */
	public void writeGunEditer() {
		final EditType type = EditType.Gun;
		// ItemName
		this.getChildren().add(makeItemInfoNode(EditType.Gun));
		// icon
		this.getChildren().add(makeImageNode(EditType.Gun, "ITEM_ICONNAME", HidePack.IconList));
		// Cate0
		this.getChildren().add(makeCateEditPanel(EditType.Gun, 0));
		// Cate1
		this.getChildren().add(makeCateEditPanel(EditType.Gun, 1));
		// useBullet
		this.getChildren().add(
				setDefault(new ListEditNode(type, "MAGAZINE_USE", HidePack.MagazineList)));
		// fireMode
		this.getChildren()
				.add(setDefault(new ListEditNode(type, "FIREMODE", GunFireMode.getList())));

		// scope
		Pane scope = makeImageNode(type, "SCOPE_NAME", HidePack.ScopeList);
		scope.getChildren().add(makeCateEditPanel(data, 2));
		this.getChildren().add(scope);
		// shootSound
		this.getChildren().add(
				setDefault(makeSoundEditer(data.SOUND_SHOOT, LocalizeHandler.getLocalizedName(data, "SOUND_SHOOT"))));
		// reloadSound
		this.getChildren().add(
				setDefault(makeSoundEditer(data.SOUND_RELOAD, LocalizeHandler.getLocalizedName(data, "SOUND_SHOOT"))));
		// recoil
		this.getChildren().add(setDefault(makeRecoilEditer(data)));
	}

	/** MagazineData */
	public static void writeMagazineEditer(Pane editer, MagazineData data) {
		// ItemName
		editer.getChildren().add(makeItemInfoNode(data));
		// icon
		editer.getChildren().add(makeImageNode(data, "ITEM_ICONNAME", HidePack.IconList));
		// Cate0
		editer.getChildren().add(makeCateEditPanel(data, 0));

		writeBulletEditer(editer, data.BULLETDATA);// TODO
	}

	/** BulletData */
	public static void writeBulletEditer(Pane editer, BulletData data) {
		// Cate0
		editer.getChildren().add(makeCateEditPanel(data, 0));
		// Cate1
		editer.getChildren().add(makeCateEditPanel(data, 1));
		// Cate2
		editer.getChildren().add(makeCateEditPanel(data, 2));
		// Cate3
		editer.getChildren().add(makeCateEditPanel(data, 3));
		// sound
		editer.getChildren().add(setDefault(
				makeSoundEditer(data.SOUND_HIT_ENTITY, LocalizeHandler.getLocalizedName(data, "SOUND_HIT_ENTITY"))));
		// sound
		editer.getChildren().add(setDefault(
				makeSoundEditer(data.SOUND_HIT_GROUND, LocalizeHandler.getLocalizedName(data, "SOUND_HIT_GROUND"))));
		// sound
		editer.getChildren().add(setDefault(
				makeSoundEditer(data.SOUND_PASSING, LocalizeHandler.getLocalizedName(data, "SOUND_PASSING"))));

	}

	/** Recoil */
	private static Region makeRecoilEditer(GunData data) {
		TabPane root = new TabPane();
		root.setMaxWidth(200);
		Tab Default = new Tab("Default", makeRecoilEditer(data.RECOIL_DEFAULT));
		Default.setClosable(false);
		Tab ADS = new Tab("ADS", makeRecoilEditer(data.RECOIL_ADS));
		ADS.setClosable(false);
		Tab Sneak = new Tab("Sneak", makeRecoilEditer(data.RECOIL_SNEAK));
		Sneak.setClosable(false);
		Tab SneakADS = new Tab("Sneak+ADS", makeRecoilEditer(data.RECOIL_SNEAK_ADS));
		SneakADS.setClosable(false);
		root.getTabs().addAll(Default, Sneak, ADS, SneakADS);
		return root;
	}

	/** Soundの詳細 */
	private static Region makeSoundEditer(Sound sound, String name) {
		VBox root = new VBox();
		Label label = new Label(name);
		label.setPrefWidth(200);
		label.setAlignment(Pos.CENTER);
		root.getChildren().add(label);
		// 数値系
		root.getChildren().add(EditNodeBuilder.makeStringAutoFillNode(sound, "NAME", HidePack.SoundList).build());
		root.getChildren().add(makeCateEditPanel(sound, -1));
		return root;
	}

	private static Region makeRecoilEditer(Recoil recoil) {
		VBox root = new VBox();
		// 数値系
		Pane pane = makeCateEditPanel(recoil, -1);

		// バインドチェック
		boolean value = recoil.USE;
		EditHelper.getProperty(recoil, "USE", boolean.class).setValue(!value);
		EditHelper.getProperty(recoil, "USE", boolean.class).setValue(value);
		// 使用可否
		Node use = EditNodeBuilder.makeBooleanSetNode(recoil, "USE").setChangeListner(() -> {
			pane.setDisable(!recoil.USE);
		}).build();
		root.getChildren().addAll(use, pane);
		return root;
	}

	/** ItemData用名称+アイコン編集ノード */
	private static Pane makeItemInfoNode(EditType gun) {
		VBox root = new VBox();
		setDefault(root);

		// 短縮名
		Node shortname = EditNodeBuilder.makeStringSetNode(gun, "ITEM_SHORTNAME").build();
		// 表示名
		Node dizplayname = EditNodeBuilder.makeStringSetNode(gun, "ITEM_DISPLAYNAME")
				.setChangeListner(() -> RootController.refreshList()).build();
		// 短縮名の使用可否
		Node useshortname = EditNodeBuilder.makeBooleanSetNode(gun, "USE_SHORTNAME").setChangeListner(() -> {
			shortname.setDisable(!gun.USE_SHORTNAME);
			if (!gun.USE_SHORTNAME) {
				EditHelper.getProperty(gun, "ITEM_SHORTNAME")
						.bindBidirectional((Property) EditHelper.getProperty(gun, "ITEM_DISPLAYNAME"));
			} else {
				EditHelper.getProperty(gun, "ITEM_SHORTNAME")
						.unbindBidirectional((Property) EditHelper.getProperty(gun, "ITEM_DISPLAYNAME"));
			}
		}).build();
		root.getChildren().addAll(dizplayname, useshortname, shortname);
		root.setPrefSize(200, 72);
		return root;
	}

	/** StringでListからImageを選択し表示するパネル設定パネル */
	private static Pane makeImageNode(EditType type, String fieldName, ObservableList<HideImage> list) {
		VBox root = new VBox();
		setDefault(root);
		ImageView iconview = new HideImageView(list, (ObservableValue<String>) EditHelper.getProperty(data, fieldName));
		iconview.setFitWidth(64);
		iconview.setFitHeight(64);
		VBox.setMargin(iconview, new Insets(5, 0, 0, 5));
		iconview.setPreserveRatio(true);
		Node name = new EditNode(type, fieldName, EditNodeType.StringFromList);
		root.getChildren().addAll(iconview, name);
		return root;
	}

	/** カテゴリが付いた値を編集するノード */
	private static Pane makeCateEditPanel(EditType gun, int cate) {
		VBox root = new VBox();
		setDefault(root);
		for (Field field : gun.getClass().getFields()) {
			int c = EditHelper.getCate(gun.getClass(), field.getName());
			if (c == cate) {
				if (EditHelper.isString(gun.getClass(), field.getName())) {
					root.getChildren().add(EditNodeBuilder.makeStringSetNode(gun, field.getName()).build());
				} else if (EditHelper.isBoolean(gun.getClass(), field.getName())) {
					root.getChildren().add(EditNodeBuilder.makeBooleanSetNode(gun, field.getName()).build());
				} else if (EditHelper.isNumber(gun.getClass(), field.getName())) {
					root.getChildren().add(EditNodeBuilder.makeNumberSetNode(gun, field.getName()).build());
				}
			}
		}
		return root;
	}

	// ベースサイズは200x24
}
