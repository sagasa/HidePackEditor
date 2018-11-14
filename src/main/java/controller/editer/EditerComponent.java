package controller.editer;

import org.apache.commons.lang.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import helper.EditHelper;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.property.StringPropertyBase;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.converter.NumberStringConverter;
import localize.LocalizeHandler;
import types.base.DataBase;
import types.base.ItemData;
import types.guns.GunData;

//TODO プロパティを利用してさらに効率化をする
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

	/** ItemData用名称+アイコン編集ノード */
	private static Region makeItemInfoNode(ItemData data) {
		VBox root = new VBox();
		// 短縮名
		Node shortname = EditNodeBuilder.makeTextSetNode(data, "ITEM_SHORTNAME").setChangeListner(new Runnable() {
			@Override
			public void run() {

			}
		}).build();
		// 表示名
		Node dizplayname = EditNodeBuilder.makeTextSetNode(data, "ITEM_DISPLAYNAME").setChangeListner(new Runnable() {
			@Override
			public void run() {
				RootController.INSTANCE.gunList.setItems(RootController.INSTANCE.gunList.getItems().sorted());
				if (!data.USE_SHORTNAME) {
					((Property<String>)data.Property.get("ITEM_SHORTNAME")).setValue(data.ITEM_DISPLAYNAME);
				}
			}
		}).build();
		// 短縮名の使用可否
		Node useshortname = EditNodeBuilder.makeBooleanSetNode(data, "USE_SHORTNAME").setChangeListner(new Runnable() {
			@Override
			public void run() {
				shortname.disableProperty().bindBidirectional(((BooleanProperty)data.Property.get("USE_SHORTNAME")));
			}
		}).build();
		root.getChildren().addAll(dizplayname, useshortname, shortname);
		return root;
	}

	// ベースサイズは200x24

	public static class EditNodeBuilder {
		private enum EditNodeType {
			Text, Number, Boolean, StringCombo, StringList
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

		/** DataBaseのテキストフィールドを編集するノード */
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

		/** DataBaseのテキストフィールドを編集するノード */
		public static EditNodeBuilder makeBooleanSetNode(DataBase data, String field) {
			EditNodeBuilder builder = new EditNodeBuilder(EditNodeType.Boolean);
			builder.Data = data;
			builder.Field = field;
			builder.layoutX = 30;
			// Typeチェック
			if (!(boolean.class.isAssignableFrom(EditHelper.getType(data, field))
					|| Boolean.class.isAssignableFrom(EditHelper.getType(data, field)))) {
				log.warn(field + "is not Boolean field");
			}
			return builder;
		}

		/** DataBaseの数値(float,int,double,long)フィールドを編集するノード */
		public static EditNodeBuilder makeNumberSetNode(DataBase data, String field) {
			EditNodeBuilder builder = new EditNodeBuilder(EditNodeType.Number);
			builder.Data = data;
			builder.Field = field;
			return builder;
		}

		/** DataBaseのストリングコンボ型 */
		public static EditNodeBuilder makeStringComboNode(DataBase data, String field) {
			EditNodeBuilder builder = new EditNodeBuilder(EditNodeType.Number);
			builder.Data = data;
			builder.Field = field;

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

		private double layoutX = 0;
		private double layoutY = 0;

		/** サイズを設定 */
		public EditNodeBuilder setLayout(double x, double y) {
			layoutX = x;
			layoutY = y;
			return this;
		}

		/** ノード作成処理 */
		public Node build() {
			if (Type == EditNodeType.Number || Type == EditNodeType.Text) {
				// テキストセット
				AnchorPane root = new AnchorPane();
				TextField text = new TextField();

				text.textProperty().bindBidirectional((Property<String>) Data.Property.get(Field));

				Label label = new Label(LocalizeHandler.getLocalizedName(Data, Field) + ":");
				double textFieldX = 100;

				if (Type == EditNodeType.Text) {
					// テキスト保存
					text.textProperty().addListener(new ChangeListener<String>() {
						@Override
						public void changed(ObservableValue<? extends String> observable, String oldValue,
								String newValue) {
							RootController.INSTANCE.gunList.refresh();
						//	EditHelper.setData(Data, Field, text.getText());
							for (Runnable listener : ChangeListener) {
								listener.run();
							}
						}
					});
				} else {
					// 数値保存
					text.textProperty().addListener(new ChangeListener<String>() {
						@Override
						public void changed(ObservableValue<? extends String> observable, String oldValue,
								String newValue) {
							// 数値でなければ戻す
							if (!NumberUtils.isNumber(newValue)) {
								text.setText(oldValue);
							}
							new NumberStringConverter().fromString("10");
							// EditHelper.setData(Data, Field, text.getText());
							for (Runnable listener : ChangeListener) {
								listener.run();
							}
						}
					});
				}
				root.resize(sizeX, sizeY);
				root.setLayoutX(layoutX);
				root.setLayoutY(layoutY);

				text.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(2), new Insets(2))));
				text.setText(EditHelper.getData(Data, Field).toString());
				text.setFont(Font.font(10));
				text.setLayoutX(sizeX - textFieldX);
				text.setPrefSize(textFieldX, sizeY);

				label.setPrefSize(sizeX - textFieldX - 2, sizeY);
				label.setAlignment(Pos.CENTER_RIGHT);

				root.getChildren().add(text);
				root.getChildren().add(label);
				return root;
			} else if (Type == EditNodeType.Boolean) {
				AnchorPane root = new AnchorPane();
				CheckBox check = new CheckBox(LocalizeHandler.getLocalizedName(Data, Field));
				root.setPrefSize(sizeX, sizeY);
				check.addEventFilter(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent e) {
						EditHelper.setData(Data, Field, check.isSelected());
						for (Runnable listener : ChangeListener) {
							listener.run();
						}
					}
				});
				check.setSelected((boolean) EditHelper.getData(Data, Field));
				check.setPrefSize(sizeX - layoutX, sizeY - layoutY);
				check.setLayoutX(layoutX);// TODO なぜか位置調整ができない
				check.setLayoutX(layoutY);
				root.getChildren().add(check);
				return root;
			} else if (Type == EditNodeType.StringCombo) {
				AnchorPane root = new AnchorPane();

				ComboBox<String> combo = new ComboBox<>();
				combo.getSelectionModel().getSelectedItem();
				return root;
			}
			return null;
		}

	}
}