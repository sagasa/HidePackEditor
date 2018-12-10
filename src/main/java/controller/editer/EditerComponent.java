package controller.editer;

import java.lang.reflect.Field;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import editer.DataEntityInterface;
import editer.HidePack;
import helper.EditHelper;
import javafx.beans.property.Property;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import resources.HideImage;
import types.base.ItemData;
import types.guns.GunData;

public class EditerComponent {
	private static final Logger log = LoggerFactory.getLogger(EditerComponent.class);

	/** 未設定時のイメージ */
	private static final Image NullImage = new Image("./icon/notSet.png");

	/** GunEditer */
	public static void writeGunEditer(Pane editer, GunData data) {
		// Cate1
		Region itemInfo = makeItemInfoNode(data);
		itemInfo.setLayoutX(5);
		itemInfo.setLayoutY(5);
		Region cate0 = makeCateEditPanel(data, 0);
		cate0.setLayoutX(300);
		cate0.setLayoutY(5);
		editer.getChildren().add(cate0);
		editer.getChildren().add(itemInfo);

		//icon
		Region icon = makeIconNode((StringProperty) EditHelper.getProperty(data, "ITEM_ICONNAME"));
		icon.setLayoutX(5);
		icon.setLayoutY(160);
		editer.getChildren().add(icon);
		//scope
		VBox scope = new VBox();
		scope.setStyle("-fx-background-color: lightGray;");
		//TODO 監視を付けなきゃ
		ObservableList<DataEntityInterface> list = FXCollections.observableArrayList(HidePack.GunList.stream().map(name->(DataEntityInterface)name).collect(Collectors.toList()));
		scope.getChildren().add(EditNodeBuilder.makeStringAutoFillNode(data, "SCOPE_NAME",list).build());
		scope.setLayoutX(5);
		scope.setLayoutY(300);
		editer.getChildren().add(scope);
	}

	/** ItemData用名称+アイコン編集ノード */
	private static Region makeItemInfoNode(ItemData data) {
		VBox root = new VBox();
		root.setStyle("-fx-background-color: lightGray;");
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

	/** Stringにアイコン設定パネル */
	private static Region makeIconNode(StringProperty icon) {
		AnchorPane root = new AnchorPane();
		root.setStyle("-fx-background-color: lightGray;");
		HideImage image = HidePack.getIcon(icon.get());
		ImageView iconview = new ImageView();
		iconview.setFitWidth(64);
		iconview.setFitHeight(64);
		iconview.setPreserveRatio(true);
		iconview.setImage(image == null ? NullImage : SwingFXUtils.toFXImage(image.Image, null));

		root.getChildren().add(iconview);
		root.setPrefSize(200, 100);
		return root;
	}

	/** カテゴリが付いた値を編集するノード */
	private static Region makeCateEditPanel(ItemData data, int cate) {
		VBox root = new VBox();
		root.setStyle("-fx-background-color: lightGray;");
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