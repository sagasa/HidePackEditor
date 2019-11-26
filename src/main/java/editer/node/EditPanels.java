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
import helper.DataPath;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import resources.HideImage;
import types.PackInfo;
import types.base.DataBase;
import types.base.GunFireMode;
import types.base.IEditData;
import types.items.GunData;
import types.items.ItemData;
import types.items.MagazineData;
import types.model.HideModel;
import types.model.ModelSelector;

/** 編集パネルのルート */
public class EditPanels extends Pane {

	/** 編集パネルの対象 */
	public enum EditType {
	Item(ItemData.class), Gun(GunData.class), Magazine(MagazineData.class), PakcInfo(PackInfo.class),
	Model(HideModel.class), ModelSelector(ModelSelector.class);

		/** 判別用の型 */
		public Class<? extends DataBase> Clazz;

		private EditType(Class<? extends DataBase> clazz) {
			Clazz = clazz;
		}

		public boolean isType(IEditData data) {
			return Clazz.isAssignableFrom(data.getType());
		}

		/** 型からエディタを選択 */
		public static Collection<EditType> getType(IEditData data) {
			List<EditType> set = new ArrayList<>();
			if (data != null)
				for (EditType type : values()) {
					if (type.Clazz.isAssignableFrom(data.getType()))
						set.add(type);
				}
			return set;
		}
	}

	private FlowPane rootPane;

	/** 編集対象 */
	private ObjectProperty<IEditData> editValue = new SimpleObjectProperty<>();

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
		writePackEditer();
		writeModelEditer();
	}

	/** エディタの内容設定 */
	public void setEditValue(IEditData data) {
		editValue.set(data);
	}

	public IEditData getEditValue() {
		return editValue.get();
	}

	private void addEditPane(Node node, EditType type) {
		node.setStyle("-fx-background-color: lightGray;");
		node.managedProperty().bind(editModes.get(type));
		node.visibleProperty().bind(editModes.get(type));
		rootPane.getChildren().add(node);
	}

	private void writePackEditer() {
		final EditType type = EditType.PakcInfo;
		addEditPane(makeCateEditPanel(type, -1), type);
		addEditPane(new VBox(new ColorEditNode(editValue, type, new DataPath("PackColor"), null)), type);
	}

	/** GunEditer */
	private void writeGunEditer() {
		final EditType type = EditType.Gun;
		// *
		// Cate0
		addEditPane(makeCateEditPanel(type, 0), type);
		// Cate1
		addEditPane(makeCateEditPanel(type, 1), type);
		// useBullet
		addEditPane(new ListEditNode(editValue, type, new DataPath("MAGAZINE_USE"), HidePack.MagazineList), type);
		// fireMode
		addEditPane(new ListEditNode(editValue, type, new DataPath("FIREMODE"), GunFireMode.getList()), type);

		// scope
		Pane scope = makeImageNode(type, new DataPath("SCOPE_NAME"), HidePack.ScopeList);
		scope.getChildren().add(makeCateEditPanel(EditType.Gun, 2));
		addEditPane(scope, type);
		// shootSound
		addEditPane(makeSoundEditer(type, new DataPath("SOUND_SHOOT")), type);
		// reloadSound
		addEditPane(makeSoundEditer(type, new DataPath("SOUND_RELOAD")), type);
		// recoil
		addEditPane(makeRecoilEditer(type), type);
		// */
	}

	/** MagazineData */
	private void writeMagazineEditer() {
		final EditType type = EditType.Magazine;
		// icon
		addEditPane(makeImageNode(type, new DataPath("ITEM_ICONNAME"), HidePack.IconList), type);
		// Cate0
		addEditPane(makeCateEditPanel(type, 0), type);

		addBulletEditer(this);
	}

	/** HideModel */
	private void writeModelEditer() {
		final EditType type = EditType.Model;
		addEditPane(makePos3Editer(type, new DataPath("offsetFirstPerson")), type);

	}

	private void addBulletEditer(Pane editer) {
		final EditType type = EditType.Magazine;
		final DataPath top = new DataPath("BULLETDATA");
		// Cate0
		addEditPane(makeCateEditPanel(type, 0, top), type);
		// Cate1
		addEditPane(makeCateEditPanel(type, 1, top), type);
		// Cate2
		addEditPane(makeCateEditPanel(type, 2, top), type);
		// Cate3
		addEditPane(makeCateEditPanel(type, 3, top), type);
		// sound
		addEditPane(makeSoundEditer(type, top.append("SOUND_HIT_ENTITY")), type);
		// sound
		addEditPane(makeSoundEditer(type, top.append("SOUND_HIT_GROUND")), type);
		// sound
		addEditPane(makeSoundEditer(type, top.append("SOUND_PASSING")), type);
	}

	/** Recoil */
	private Region makePos3Editer(EditType type, DataPath path) {
		VBox root = new VBox();
		Label label = new Label(EditHelper.getLocalizedName(type.Clazz, path));
		label.setPrefWidth(200);
		label.setAlignment(Pos.CENTER);
		root.getChildren().add(label);
		// 数値系
		HBox hbox = new HBox();
		hbox.getChildren().add(setSize(new EditNode(editValue, type, path.append("X"), EditNodeType.Number), 65, 24));
		hbox.getChildren().add(setSize(new EditNode(editValue, type, path.append("Y"), EditNodeType.Number), 65, 24));
		hbox.getChildren().add(setSize(new EditNode(editValue, type, path.append("Z"), EditNodeType.Number), 65, 24));
		root.getChildren().add(hbox);
		return root;
	}

	private Region setSize(Region node,double x,double y) {
		node.setPrefSize(x, y);
		return node;
	}

	/** Recoil */
	private Region makeRecoilEditer(EditType type) {
		TabPane root = new TabPane();
		root.setMaxWidth(200);
		Tab Default = new Tab("Default", makeRecoilEditer(type, new DataPath("RECOIL_DEFAULT")));
		Default.setClosable(false);
		Tab ADS = new Tab("ADS", makeRecoilEditer(type, new DataPath("RECOIL_ADS")));
		ADS.setClosable(false);
		Tab Sneak = new Tab("Sneak", makeRecoilEditer(type, new DataPath("RECOIL_SNEAK")));
		Sneak.setClosable(false);
		Tab SneakADS = new Tab("Sneak+ADS", makeRecoilEditer(type, new DataPath("RECOIL_SNEAK_ADS")));
		SneakADS.setClosable(false);
		root.getTabs().addAll(Default, Sneak, ADS, SneakADS);
		return root;
	}

	/** Soundの詳細 */
	private Region makeSoundEditer(EditType type, DataPath path) {
		VBox root = new VBox();
		Label label = new Label(EditHelper.getLocalizedName(type.Clazz, path));
		label.setPrefWidth(200);
		label.setAlignment(Pos.CENTER);
		root.getChildren().add(label);
		// 数値系
		root.getChildren().add(new EditNode(editValue, type, path.append("NAME"), EditNodeType.StringFromList)
				.setFromList(HidePack.SoundList));
		root.getChildren().add(makeCateEditPanel(type, -1, path));
		return root;
	}

	private Region makeRecoilEditer(EditType type, DataPath path) {
		VBox root = new VBox();
		// 数値系
		Pane pane = makeCateEditPanel(type, -1, path);

		// バインドチェック
		/*
		 * boolean value = recoil.USE; EditHelper.getProperty(recoil, "USE",
		 * boolean.class).setValue(!value); EditHelper.getProperty(recoil, "USE",
		 * boolean.class).setValue(value); //
		 */
		// 使用可否
		EditNode use = new EditNode(editValue, type, path.append("USE"), EditNodeType.Boolean)
				.setChangeListner((Consumer<Boolean>) (v) -> {
					pane.setDisable(!v);
				});
		root.getChildren().addAll(use, pane);
		return root;
	}

	/** ItemData用名称+アイコン編集ノード */
	private Pane makeItemInfoNode(EditType type) {
		VBox root = new VBox();
		// 短縮名
		Node shortname = new EditNode(editValue, type, new DataPath("ITEM_SHORTNAME"), EditNodeType.String);
		// 表示名
		Node dizplayname = new EditNode(editValue, type, new DataPath("ITEM_DISPLAYNAME"), EditNodeType.String)
				.setChangeListner((v) -> RootController.refreshList());
		Consumer<Boolean> run = (use) -> {
			shortname.setDisable(!use);
		};
		Node useshortname = new EditNode(editValue, type, new DataPath("USE_SHORTNAME"), EditNodeType.Boolean)
				.setChangeListner(run);

		// icon
		Node icon = makeImageNode(type, new DataPath("ITEM_ICONNAME"), HidePack.IconList);
		// model
		Node model = new EditNode(editValue, type, new DataPath("ITEM_MODELNAME"), EditNodeType.StringFromList)
				.setFromList(HidePack.IconList);

		root.getChildren().addAll(dizplayname, useshortname, shortname, icon, model);
		// root.setPrefSize(200, 72);
		return root;
	}

	/** StringでListからImageを選択し表示するパネル設定パネル */
	private Pane makeImageNode(EditType type, DataPath dataPath, ObservableList<HideImage> list) {
		VBox root = new VBox();
		HideImageView iconview = new HideImageView(type, dataPath, list);
		iconview.setFitWidth(64);
		iconview.setFitHeight(64);
		VBox.setMargin(iconview, new Insets(5, 0, 0, 5));
		iconview.setPreserveRatio(true);
		this.editValue.addListener(iconview);
		Node name = new EditNode(editValue, type, dataPath, EditNodeType.StringFromList).setFromList(list);
		root.getChildren().addAll(iconview, name);
		return root;
	}

	/** カテゴリが付いた値を編集するノード */
	private Pane makeCateEditPanel(EditType type, int cate) {
		return makeCateEditPanel(type, cate, null);
	}

	/** カテゴリが付いた値を編集するノード */
	private Pane makeCateEditPanel(EditType type, int cate, DataPath path) {
		VBox root = new VBox();
		Class<? extends DataBase> clazz = type.Clazz;
		// pathがあるなら指定されたクラスで実行
		for (Field field : (path == null ? clazz.getFields() : EditHelper.getType(type.Clazz, path).getFields())) {
			// pathが無いなら作る
			DataPath fieldPath = path == null ? new DataPath(field.getName()) : path.append(field.getName());
			int c = EditHelper.getCate(clazz, fieldPath);
			if (c == cate) {
				if (EditHelper.isString(clazz, fieldPath)) {
					root.getChildren().add(new EditNode(editValue, type, fieldPath, EditNodeType.String));
				} else if (EditHelper.isBoolean(clazz, fieldPath)) {
					root.getChildren().add(new EditNode(editValue, type, fieldPath, EditNodeType.Boolean));
				} else if (EditHelper.isNumber(clazz, fieldPath)) {
					root.getChildren().add(new EditNode(editValue, type, fieldPath, EditNodeType.Number));
				}
			}
		}
		return root;
	}
	// ベースサイズは200x24
}
