package editer.node;

import java.lang.reflect.Field;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import editer.HidePack;
import editer.controller.RootController;
import helper.EditHelper;
import javafx.beans.property.Property;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import resources.HideImage;
import types.base.ItemData;
import types.guns.GunData;

public class EditerComponent {
	private static final Logger log = LogManager.getLogger();

	/** 色とマージンを設定 */
	private static <T extends Node> T setDefault(T region) {
		FlowPane.setMargin(region, new Insets(5, 0, 0, 5));
		region.setStyle("-fx-background-color: lightGray;");
		return region;
	}

	/** GunEditer */
	public static void writeGunEditer(Pane editer, GunData data) {
		// ItemName
		editer.getChildren().add(makeItemInfoNode(data));
		// icon
		editer.getChildren().add(makeImageNode(data, "ITEM_ICONNAME", HidePack.IconList));
		// Cate0
		editer.getChildren().add(makeCateEditPanel(data, 0));
		// Cate1
		editer.getChildren().add(makeCateEditPanel(data, 1));
		// useBullet
		editer.getChildren()
				.add(setDefault(EditNodeBuilder.makeStringListNode(data, "BULLET_USE", HidePack.GunList).build()));
		// scope
		Pane scope = makeImageNode(data, "SCOPE_NAME", HidePack.ScopeList);
		scope.getChildren().add(EditNodeBuilder.makeNumberSetNode(data, "SCOPE_DIA").build());
		editer.getChildren().add(scope);
	}

	/** ItemData用名称+アイコン編集ノード */
	private static Pane makeItemInfoNode(ItemData data) {
		VBox root = new VBox();
		setDefault(root);

		// 短縮名
		Node shortname = EditNodeBuilder.makeStringSetNode(data, "ITEM_SHORTNAME").build();
		// 表示名
		Node dizplayname = EditNodeBuilder.makeStringSetNode(data, "ITEM_DISPLAYNAME").setChangeListner(new Runnable() {
			@Override
			public void run() {
				RootController.writeList();
			}
		}).build();
		// 短縮名の使用可否
		Node useshortname = EditNodeBuilder.makeBooleanSetNode(data, "USE_SHORTNAME").setChangeListner(new Runnable() {
			@Override
			public void run() {
				shortname.setDisable(!data.USE_SHORTNAME);
				if (!data.USE_SHORTNAME) {
					EditHelper.getProperty(data, "ITEM_SHORTNAME")
							.bindBidirectional((Property) EditHelper.getProperty(data, "ITEM_DISPLAYNAME"));
				} else {
					EditHelper.getProperty(data, "ITEM_SHORTNAME")
							.unbindBidirectional((Property) EditHelper.getProperty(data, "ITEM_DISPLAYNAME"));
				}
			}
		}).build();
		root.getChildren().addAll(dizplayname, useshortname, shortname);
		root.setPrefSize(200, 72);
		return root;
	}

	/** StringでListからImageを選択し表示するパネル設定パネル */
	private static Pane makeImageNode(ItemData data, String fieldName, ObservableList<HideImage> list) {
		VBox root = new VBox();
		setDefault(root);
		ImageView iconview = new HideImageView(list, (StringProperty) EditHelper.getProperty(data, fieldName));
		iconview.setFitWidth(64);
		iconview.setFitHeight(64);
		VBox.setMargin(iconview, new Insets(5, 0, 0, 5));
		iconview.setPreserveRatio(true);
		Node name = EditNodeBuilder.makeStringAutoFillNode(data, fieldName, list).build();
		root.getChildren().addAll(iconview, name);
		return root;
	}

	/** カテゴリが付いた値を編集するノード */
	private static Pane makeCateEditPanel(ItemData data, int cate) {
		VBox root = new VBox();
		setDefault(root);
		for (Field field : data.getClass().getFields()) {
			int c = EditHelper.getCate(data.getClass(), field.getName());
			if (c == cate) {
				if (EditHelper.isString(data, field.getName())) {
					root.getChildren().add(EditNodeBuilder.makeStringSetNode(data, field.getName()).build());
				} else if (EditHelper.isBoolean(data, field.getName())) {
					root.getChildren().add(EditNodeBuilder.makeBooleanSetNode(data, field.getName()).build());
				} else if (EditHelper.isNumber(data, field.getName())) {
					root.getChildren().add(EditNodeBuilder.makeNumberSetNode(data, field.getName()).build());
				}
			}

		}
		return root;
	}

	// ベースサイズは200x24
}