package editer.node;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.function.Consumer;

import editer.HidePack;
import editer.controller.RootController;
import editer.node.EditNode.EditNodeType;
import helper.EditHelper;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
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

/** 編集パネルのルート */
public class EditPanels extends Pane {

	/** 編集パネルの対象 */
	public enum EditType {
	Item(ItemData.class), Gun(GunData.class), Magazine(MagazineData.class);

		/** 判別用の型 */
		public Class<? extends DataBase> Clazz;

		private EditType(Class<? extends DataBase> clazz) {
			Clazz = clazz;
		}

		public boolean isType(DataBase data) {
			return Clazz.isAssignableFrom(data.getClass());
		}

		/** 型からエディタを選択 */
		public static Collection<EditType> getType(DataBase data) {
			List<EditType> set = new ArrayList<>();
			if (data != null)
				for (EditType type : values()) {
					if (type.Clazz.isAssignableFrom(data.getClass()))
						set.add(type);
				}
			return set;
		}
	}

	private FlowPane rootPane;

	/** 編集対象 */
	private ObjectProperty<DataBase> editValue = new SimpleObjectProperty<>();

	/** 各編集パネルの表示状態管理用プロパティ */
	private EnumMap<EditType, BooleanProperty> editModes = new EnumMap<>(EditType.class);

	public EditPanels() {
		rootPane = new FlowPane();
		rootPane.setVgap(5);
		rootPane.setHgap(5);
		rootPane.setOrientation(Orientation.VERTICAL);
		rootPane.prefWrapLengthProperty().bind(this.heightProperty());
		rootPane.maxHeightProperty().bind(this.heightProperty());
		this.getChildren().add(rootPane);

		for (EditType type : EditType.values()) {
			editModes.put(type, new SimpleBooleanProperty(false));
		}

		editValue.addListener((v, ov, nv) -> {
			// Modeの切り替え
			if (ov != null)
				EditType.getType(ov).forEach(type -> editModes.get(type).set(false));
			if (nv != null)
				EditType.getType(nv).forEach(type -> editModes.get(type).set(true));
		});
		// ItemName
		addEditPane(makeItemInfoNode(EditType.Item), EditType.Item);
		writeGunEditer();
		writeMagazineEditer();
	}

	/** エディタの内容設定 */
	public void setEditValue(DataBase data) {
		editValue.set(data);
	}

	public DataBase getEditValue() {
		return editValue.get();
	}

	private void addEditPane(Node node, EditType type) {
		node.setStyle("-fx-background-color: lightGray;");
		node.managedProperty().bind(editModes.get(type));
		node.visibleProperty().bind(editModes.get(type));
		rootPane.getChildren().add(node);
	}

	/** GunEditer */
	private void writeGunEditer() {
		final EditType type = EditType.Gun;
		// *
		// icon
		addEditPane(makeImageNode(EditType.Gun, "ITEM_ICONNAME", HidePack.IconList), type);
		// Cate0
		addEditPane(makeCateEditPanel(EditType.Gun, 0), type);
		// Cate1
		addEditPane(makeCateEditPanel(EditType.Gun, 1), type);
		// useBullet
		addEditPane(new ListEditNode(editValue, type, "MAGAZINE_USE", HidePack.MagazineList), type);
		// fireMode
		addEditPane(new ListEditNode(editValue, type, "FIREMODE", GunFireMode.getList()), type);

		// scope
		Pane scope = makeImageNode(type, "SCOPE_NAME", HidePack.ScopeList);
		scope.getChildren().add(makeCateEditPanel(EditType.Gun, 2));
		addEditPane(scope, type);
		// shootSound
		addEditPane(makeSoundEditer(type, "SOUND_SHOOT"), type);
		// reloadSound
		addEditPane(makeSoundEditer(type, "SOUND_RELOAD"), type);
		// recoil
		addEditPane(makeRecoilEditer(type), type);
		// */
	}

	/** MagazineData */
	public void writeMagazineEditer() {
		final EditType type = EditType.Magazine;
		// icon
		addEditPane(makeImageNode(type, "ITEM_ICONNAME", HidePack.IconList), type);
		// Cate0
		addEditPane(makeCateEditPanel(type, 0), type);

		addBulletEditer(this);
	}

	private void addBulletEditer(Pane editer) {
		final EditType type = EditType.Magazine;
		final String top = "BULLETDATA";
		// Cate0
		addEditPane(makeCateEditPanel(type, 0, top), type);
		// Cate1
		addEditPane(makeCateEditPanel(type, 1, top), type);
		// Cate2
		addEditPane(makeCateEditPanel(type, 2, top), type);
		// Cate3
		addEditPane(makeCateEditPanel(type, 3, top), type);
		// sound
		addEditPane(makeSoundEditer(type, top + ".SOUND_HIT_ENTITY"), type);
		// sound
		addEditPane(makeSoundEditer(type, top + ".SOUND_HIT_GROUND"), type);
		// sound
		addEditPane(makeSoundEditer(type, top + ".SOUND_PASSING"), type);
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
		root.getChildren().add(new EditNode(editValue, type, path + ".NAME", EditNodeType.StringFromList)
				.setFromList(HidePack.SoundList));
		root.getChildren().add(makeCateEditPanel(type, -1, path));
		return root;
	}

	private Region makeRecoilEditer(EditType type, String fieldName) {
		VBox root = new VBox();
		// 数値系
		Pane pane = makeCateEditPanel(type, -1, fieldName);

		// バインドチェック
		/*
		 * boolean value = recoil.USE; EditHelper.getProperty(recoil, "USE",
		 * boolean.class).setValue(!value); EditHelper.getProperty(recoil, "USE",
		 * boolean.class).setValue(value); //
		 */
		// 使用可否
		Node use = new EditNode(editValue, type, fieldName + ".USE", EditNodeType.Boolean)
				.setChangeListner((Consumer<Boolean>) (v) -> {
					pane.setDisable(!v);
				});
		editValue.addListener((v, ov, nv) -> {
			if (nv != null && EditType.getType(nv).contains(type)) {
				pane.setDisable(!(boolean) EditHelper.getData(editValue.get(), fieldName + ".USE"));
			}
		});
		root.getChildren().addAll(use, pane);
		return root;
	}

	/** ItemData用名称+アイコン編集ノード */
	private Pane makeItemInfoNode(EditType type) {
		VBox root = new VBox();
		// 短縮名
		Node shortname = new EditNode(editValue, type, "ITEM_SHORTNAME", EditNodeType.String);
		// 表示名
		Node dizplayname = new EditNode(editValue, type, "ITEM_DISPLAYNAME", EditNodeType.String)
				.setChangeListner((v) -> RootController.refreshList());
		// 短縮名の使用可否
		Consumer<Boolean> run = (use) -> {
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
		HideImageView iconview = new HideImageView(type, fieldName, list);
		iconview.setFitWidth(64);
		iconview.setFitHeight(64);
		VBox.setMargin(iconview, new Insets(5, 0, 0, 5));
		iconview.setPreserveRatio(true);
		this.editValue.addListener(iconview);
		Node name = new EditNode(editValue, type, fieldName, EditNodeType.StringFromList).setFromList(list);
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
		for (Field field : clazz.getFields()) {
			int c = EditHelper.getCate(clazz, field.getName());
			if (c == cate) {
				if (EditHelper.isString(clazz, field.getName())) {
					root.getChildren().add(new EditNode(editValue, type, top + field.getName(), EditNodeType.String));
				} else if (EditHelper.isBoolean(clazz, field.getName())) {
					root.getChildren().add(new EditNode(editValue, type, top + field.getName(), EditNodeType.Boolean));
				} else if (EditHelper.isNumber(clazz, field.getName())) {
					root.getChildren().add(new EditNode(editValue, type, top + field.getName(), EditNodeType.Number));
				}
			}
		}
		return root;
	}
	// ベースサイズは200x24
}
