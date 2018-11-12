package controller.editer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import helper.EditHelper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import localize.LocalizeHandler;
import types.base.DataBase;
import types.base.ItemData;
import types.guns.GunData;

public class EditerComponent {
	private static final Logger log = LoggerFactory.getLogger(EditerComponent.class);

	// GunEditer
	public static void writeGunEditer(Pane editer, GunData data) {
		// Cate1
		Region itemInfo = makeItemInfoNode(data);
		itemInfo.setStyle("-fx-background-color: lightGray;");
		itemInfo.setLayoutX(5);
		itemInfo.setLayoutY(5);
		itemInfo.setPrefSize(160, 100);
		editer.getChildren().add(itemInfo);
	}

	// ItemData用名称+アイコン編集ノード
	private static Region makeItemInfoNode(ItemData data) {
		VBox root = new VBox();
		//表示名
		root.getChildren()
				.add(EditNodeBuilder.makeTextSetNode(data, "ITEM_DISPLAYNAME").setChangeListner(new Runnable() {
					@Override
					public void run() {
						RootController.INSTANCE.gunList.setItems(RootController.INSTANCE.gunList.getItems().sorted());
					}
				}).build());
		//短縮名の使用可否
		root.getChildren().add(EditNodeBuilder.makeBooleanSetNode(data, "USE_SHORTNAME").setChangeListner(new Runnable() {
			@Override
			public void run() {
				RootController.INSTANCE.gunList.setItems(RootController.INSTANCE.gunList.getItems().sorted());
			}
		}).build());
		//短縮名
		root.getChildren().add(EditNodeBuilder.makeTextSetNode(data, "ITEM_SHORTNAME").setChangeListner(new Runnable() {
			@Override
			public void run() {
				RootController.INSTANCE.gunList.setItems(RootController.INSTANCE.gunList.getItems().sorted());
			}
		}).build());
		return root;
	}

	// ベースサイズは200x24

	public static class EditNodeBuilder {
		private enum EditNodeType {
			Text, Number,Boolean
		}

		/** 作成するノードの種類 */
		private EditNodeType Type;

		private EditNodeBuilder(EditNodeType type) {
			Type = type;
		}

		/** 変更の保存対象 */
		private DataBase Data;
		/** 保存するフィールド名 */
		private String Field;

		/**DataBaseのテキストフィールドを編集するノード*/
		public static EditNodeBuilder makeTextSetNode(DataBase data, String field) {
			EditNodeBuilder builder = new EditNodeBuilder(EditNodeType.Text);
			builder.Data = data;
			builder.Field = field;
			// Typeチェック
			if (!String.class.isAssignableFrom(EditHelper.getType(data, field))) {
				log.warn(field + "is not Text field");
			}
			return builder;
		}

		/**DataBaseのテキストフィールドを編集するノード*/
		public static EditNodeBuilder makeBooleanSetNode(DataBase data, String field) {
			EditNodeBuilder builder = new EditNodeBuilder(EditNodeType.Boolean);
			builder.Data = data;
			builder.Field = field;
			// Typeチェック
			if (!(boolean.class.isAssignableFrom(EditHelper.getType(data, field))||Boolean.class.isAssignableFrom(EditHelper.getType(data, field)))) {
				log.warn(field + "is not Boolean field");
			}
			return builder;
		}

		/** 変更通知リスナー */
		private Runnable[] ChangeListener;

		/** 変更されたタイミングで呼ばれる */
		public EditNodeBuilder setChangeListner(Runnable... listener) {
			ChangeListener = listener;
			return this;
		}

		private double sizeX = 200;
		private double sizeY = 24;

		/** サイズを設定 */
		public EditNodeBuilder setSize(double x, double y) {
			sizeX = x;
			sizeY = y;
			return this;
		}

		/** ノード作成処理 */
		public Node build() {
			if (Type == EditNodeType.Number || Type == EditNodeType.Text) {
				// テキストセット
				AnchorPane root = new AnchorPane();
				TextField text = new TextField();
				Label label = new Label(LocalizeHandler.getLocalizedName(Data, Field) + ":");
				double textFieldX = 100;

				if (Type == EditNodeType.Text) {
					// テキスト保存
					text.textProperty().addListener(new ChangeListener<String>() {
						@Override
						public void changed(ObservableValue<? extends String> observable, String oldValue,
								String newValue) {
							RootController.INSTANCE.gunList.refresh();
							EditHelper.setData(Data, Field, text.getText());
							for (Runnable listener : ChangeListener) {
								listener.run();
							}
							System.out.println("TextField txt Changed (newValue: " + newValue + ")");
						}
					});
				} else {
					// 数値保存
				}
				root.resize(sizeX, sizeY);

				text.setText(EditHelper.getData(Data, Field).toString());
				text.setFont(Font.font(10));
				text.setLayoutX(sizeX - textFieldX);
				text.setPrefSize(textFieldX, sizeY);

				label.setPrefSize(sizeX - textFieldX - 2, sizeY);
				label.setAlignment(Pos.CENTER_RIGHT);

				root.getChildren().add(text);
				root.getChildren().add(label);
				return root;
			}else if(Type==EditNodeType.Boolean) {
				AnchorPane root = new AnchorPane();
				return root;
			}
			return null;
		}

	}
}