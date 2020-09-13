package editer.node;

import java.util.EnumMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import editer.HidePack;
import editer.controller.RootController;
import editer.node.EditNode.EditNodeType;
import helper.EditHelper;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
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
import types.base.DataBase.DataEntry;
import types.base.DataPath;
import types.effect.Sound;
import types.items.GunData;
import types.items.ItemData;
import types.items.MagazineData;

/** 編集パネルのルート */
public class EditPanels extends Pane {

	/** 編集パネルの対象 */
	public enum EditType {
	Gun(GunData.class), Magazine(MagazineData.class, (cons, data) -> cons.accept(data));

		/** 判別用の型 */
		public Class<? extends DataBase> Clazz;
		public BiConsumer<Consumer<DataBase>, DataBase> AddFunc;

		private EditType(Class<? extends DataBase> clazz) {
			this(clazz, null);
		}

		@SuppressWarnings("unchecked")
		private <T extends DataBase> EditType(Class<T> clazz, BiConsumer<Consumer<DataBase>, T> addFunc) {
			Clazz = clazz;
			AddFunc = addFunc != null ? (BiConsumer<Consumer<DataBase>, DataBase>) addFunc
					: (cons, data) -> cons.accept(data);
		}

		public boolean isType(DataBase data) {
			return Clazz.isAssignableFrom(data.getClass());
		}

		/** 型からエディタを選択 */
		public static EditType getType(DataBase data) {
			if (data != null)
				for (EditType type : values()) {
					if (type.Clazz.isAssignableFrom(data.getClass()))
						return type;
				}
			return null;
		}
	}

	private FlowPane rootPane;

	/** 編集対象 */
	private ObjectProperty<DataBase> editValue = new SimpleObjectProperty<>();

	/** 各編集パネルの表示状態管理用プロパティ */
	private EnumMap<EditType, ObjectProperty<DataBase>> editModes = new EnumMap<>(EditType.class);

	public EditPanels() {
		rootPane = new FlowPane();
		rootPane.setVgap(5);
		rootPane.setHgap(5);
		rootPane.setOrientation(Orientation.VERTICAL);
		rootPane.prefWrapLengthProperty().bind(this.heightProperty());
		rootPane.maxHeightProperty().bind(this.heightProperty());
		this.getChildren().add(rootPane);

		for (EditType type : EditType.values()) {
			editModes.put(type, new SimpleObjectProperty<>());
		}

		editValue.addListener((v, ov, nv) -> {
			// Modeの切り替え
			if (ov != null)
				;
			if (nv != null)
				EditType.getType(nv).AddFunc.accept(this::addEditValue, nv);
			System.out.println(" change ");
		});
		// ItemName
		// addEditPane(makeItemInfoNode(EditType.Item), EditType.Item);
		writeGunEditer();
		writeMagazineEditer();
		// writePackEditer();
		// writeModelEditer();
	}

	/** エディタの内容設定 */
	private void addEditValue(DataBase data) {
		System.out.println(" edit ");
		editModes.get(EditType.getType(data)).set(data);
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
		node.managedProperty().bind(editModes.get(type).isNotNull());
		node.visibleProperty().bind(editModes.get(type).isNotNull());
		rootPane.getChildren().add(node);
	}

	/*
	 * private void writePackEditer() { final EditType type = EditType.PakcInfo;
	 * addEditPane(makeCateEditPanel(type, -1), type); addEditPane(new VBox(new
	 * ColorEditNode(editValue, type, new DataPath("PackColor"), null)), type); } //
	 */

	/** GunEditer */
	private void writeGunEditer() {
		final EditType type = EditType.Gun;
		// *
		// Cate0
		addEditPane(makeCateEditPanel(type, 0), type);
		// Cate1
		addEditPane(makeCateEditPanel(type, 1), type);
		// useBullet
		// addEditPane(new ListEditNode(editValue, type, new DataPath("MAGAZINE_USE"),
		// HidePack.MagazineList), type);
		// fireMode
		// addEditPane(new ListEditNode(editValue, type, new DataPath("FIREMODE"),
		// GunFireMode.getList()), type);

		// scope
		Pane scope = makeImageNode(type, DataPath.of(GunData.ScopeName), HidePack.ScopeList);
		scope.getChildren().add(makeCateEditPanel(EditType.Gun, 2));
		addEditPane(scope, type);
		// shootSound
		addEditPane(makeSoundEditer(type, DataPath.of(GunData.SoundShoot)), type);
		// reloadSound
		addEditPane(makeSoundEditer(type, DataPath.of(GunData.SoundReload)), type);

		// sound
		addEditPane(makeSoundEditer(type, DataPath.of(GunData.SoundHitEntity)), type);
		// sound
		addEditPane(makeSoundEditer(type, DataPath.of(GunData.SoundHit)), type);
		// sound
		addEditPane(makeSoundEditer(type, DataPath.of(GunData.SoundPassing)), type);
		// recoil
		addEditPane(makeRecoilEditer(type), type);
		// */
	}

	/** MagazineData */
	private void writeMagazineEditer() {
		final EditType type = EditType.Magazine;
		// icon
		// addEditPane(makeImageNode(type, DataPath.of(ItemData.IconName),
		// HidePack.IconList), type);
		// Cate0
		addEditPane(makeCateEditPanel(type, 0), type);

	}

	/** HideModel */
//	private void writeModelEditer() {
//		final EditType type = EditType.Model;
//		addEditPane(makePos3Editer(type, new DataPath("offsetFirstPerson")), type);
//		// 右側にモデル確認ビューを置く
//		ModelView modelView = new ModelView(editValue);
//		modelView.translateXProperty().bind(rootPane.widthProperty().add(5));
//		modelView.prefWidthProperty().bind(widthProperty().subtract(rootPane.widthProperty()).add(-5));
//		modelView.prefHeightProperty().bind(heightProperty());
//
//		modelView.managedProperty().bind(editModes.get(type));
//		modelView.visibleProperty().bind(editModes.get(type));
//
//		ModelTreeView treeView = new ModelTreeView(editValue, modelView);
//		addEditPane(treeView, type);
//		// MSEditer
//		VBox msEditer = new VBox();
//		Label label = new Label("ModelSelecter");
//		label.setPrefWidth(200);
//		label.setAlignment(Pos.CENTER);
//
//		EditNode defaultModel = new EditNode(treeView.currentItem, EditType.ModelSelector, new DataPath("defaultModel"),
//				EditNodeType.StringFromList);
//
//		msEditer.getChildren().addAll(label, defaultModel);
//
//		msEditer.setStyle("-fx-background-color: lightGray;");
//		msEditer.managedProperty().bind(editModes.get(type).and(treeView.currentItemIsBone.not()));
//		msEditer.visibleProperty().bind(editModes.get(type).and(treeView.currentItemIsBone.not()));
//
//		// BoneEditer
//		VBox boneEditer = new VBox();
//		label = new Label("Bone");
//		label.setPrefWidth(200);
//		label.setAlignment(Pos.CENTER);
//
//		AnimationListNode animationEditer = new AnimationListNode(treeView.currentItem, new DataPath("animation"));
//
//		animationEditer.setPrefSize(160, 300);
//
//		boneEditer.getChildren().addAll(label, animationEditer);
//
//		boneEditer.setStyle("-fx-background-color: lightGray;");
//		boneEditer.managedProperty().bind(editModes.get(type).and(treeView.currentItemIsBone));
//		boneEditer.visibleProperty().bind(editModes.get(type).and(treeView.currentItemIsBone));
//
//		rootPane.getChildren().addAll(msEditer, boneEditer);
//
//		this.getChildren().addAll(modelView);
//	}

//	private void addBulletEditer(Pane editer) {
//		final EditType type = EditType.Magazine;
//		final DataPath top = new DataPath("BULLETDATA");
//		// Cate0
//		addEditPane(makeCateEditPanel(type, 0, top), type);
//		// Cate1
//		addEditPane(makeCateEditPanel(type, 1, top), type);
//		// Cate2
//		addEditPane(makeCateEditPanel(type, 2, top), type);
//		// Cate3
//		addEditPane(makeCateEditPanel(type, 3, top), type);
//
//	}

//	private Region makePos3Editer(EditType type, DataPath path) {
//		return makePos3Editer(editValue, type, path);
//	}
//
//	/** Pos3f */
//	public static Region makePos3Editer(ObjectProperty<DataBase<?>> value, EditType type, DataPath path) {
//		VBox root = new VBox();
//		root.setPrefWidth(200);
//		Label label = new Label(EditHelper.getLocalizedName(type.Clazz, path));
//		label.prefWidthProperty().bind(root.widthProperty().subtract(4));
//		label.setAlignment(Pos.CENTER);
//		root.getChildren().add(label);
//		// 数値系
//		HBox hbox = new HBox();
//		ObservableValue<Number> width = root.widthProperty().subtract(6).divide(3);
//		hbox.getChildren().add(setSize(new EditNode(value, type, path.append("X"), EditNodeType.Number), width, 24));
//		hbox.getChildren().add(setSize(new EditNode(value, type, path.append("Y"), EditNodeType.Number), width, 24));
//		hbox.getChildren().add(setSize(new EditNode(value, type, path.append("Z"), EditNodeType.Number), width, 24));
//		root.getChildren().add(hbox);
//		return root;
//	}

	private static Region setSize(Region node, ObservableValue<? extends Number> x, double y) {
		node.prefWidthProperty().bind(x);
		node.setPrefHeight(y);
		return node;
	}

	/** Recoil */
	private Region makeRecoilEditer(EditType type) {
		TabPane root = new TabPane();
		root.setMaxWidth(200);
		Tab Default = new Tab("Default", makeRecoilEditer(type, DataPath.of(GunData.Recoil)));
		Default.setClosable(false);
		Tab ADS = new Tab("ADS", makeRecoilEditer(type, DataPath.of(GunData.RecoilADS)));
		ADS.setClosable(false);
		Tab Sneak = new Tab("Sneak", makeRecoilEditer(type, DataPath.of(GunData.RecoilSneak)));
		Sneak.setClosable(false);
		Tab SneakADS = new Tab("Sneak+ADS", makeRecoilEditer(type, DataPath.of(GunData.RecoilSneakADS)));
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
		root.getChildren().add(new EditNode(editValue, type, path.append(Sound.Name), EditNodeType.StringFromList)
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

		root.getChildren().addAll(pane);
		return root;
	}

	/** ItemData用名称+アイコン編集ノード */
	private Pane makeItemInfoNode(EditType type) {
		VBox root = new VBox();
		// 短縮名
		Node shortname = new EditNode(editValue, type, DataPath.of(ItemData.ShortName), EditNodeType.String);
		// 表示名
		Node dizplayname = new EditNode(editValue, type, DataPath.of(ItemData.DisplayName), EditNodeType.String)
				.setChangeListner((v) -> RootController.refreshList());
		Consumer<Boolean> run = (use) -> {
			shortname.setDisable(!use);
		};

		// icon
		Node icon = makeImageNode(type, DataPath.of(ItemData.IconName), HidePack.IconList);
		// model
		Node model = new EditNode(editValue, type, DataPath.of(ItemData.ModelName), EditNodeType.StringFromList)
				.setFromList(HidePack.IconList);

		root.getChildren().addAll(dizplayname, shortname, icon, model);
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
		for (DataEntry<?> data : EditHelper.getDataEntries(type.Clazz, path)) {
			// pathが無いなら作る
			DataPath fieldPath = path == null ? DataPath.of(data) : path.append(data);
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
