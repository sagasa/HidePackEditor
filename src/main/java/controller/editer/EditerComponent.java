package controller.editer;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.regex.Pattern;

import org.controlsfx.control.textfield.TextFields;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import editer.HidePack;
import helper.EditHelper;
import javafx.beans.property.Property;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.StringConverter;
import javafx.util.converter.FloatStringConverter;
import javafx.util.converter.IntegerStringConverter;
import localize.LocalizeHandler;
import resources.HideImage;
import types.base.DataBase;
import types.base.ItemData;
import types.guns.GunData;

//TODO プロパティを利用してさらに効率化をする
public class EditerComponent {
	private static final Logger log = LoggerFactory.getLogger(EditerComponent.class);

	/** 未設定時のイメージ */
	private static final Image NullImage = new Image("./icon/notSet.png");

	// GunEditer
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

		Region icon = makeIconNode(EditHelper.getPropertyString(data, "ITEM_ICONNAME"));
		icon.setLayoutX(5);
		icon.setLayoutY(160);
		editer.getChildren().add(icon);
	}

	/** ItemData用名称+アイコン編集ノード */
	private static Region makeItemInfoNode(ItemData data) {
		VBox root = new VBox();
		root.setStyle("-fx-background-color: lightGray;");
		// 短縮名
		Node shortname = EditNodeBuilder.makeTextSetNode(data, "ITEM_SHORTNAME").build();
		// 表示名
		Node dizplayname = EditNodeBuilder.makeTextSetNode(data, "ITEM_DISPLAYNAME").setChangeListner(new Runnable() {
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
					EditHelper.getPropertyString(data, "ITEM_SHORTNAME")
							.bindBidirectional(EditHelper.getPropertyString(data, "ITEM_DISPLAYNAME"));
				} else {
					EditHelper.getPropertyString(data, "ITEM_SHORTNAME")
							.unbindBidirectional(EditHelper.getPropertyString(data, "ITEM_DISPLAYNAME"));
				}
			}
		}).build();
		root.getChildren().addAll(dizplayname, useshortname, shortname);
		root.setPrefSize(160, 72);
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
		root.setPrefSize(160, 100);
		return root;
	}

	/** ItemData用名称+アイコン編集ノード */
	private static Region makeCateEditPanel(ItemData data, int cate) {
		VBox root = new VBox();
		root.setStyle("-fx-background-color: lightGray;");
		for (Field field : data.getClass().getFields()) {
			int c = EditHelper.getCate(data.getClass(), field.getName());
			if (c == cate) {
				if (EditHelper.getPropertyString(data, field.getName()) != null) {
					root.getChildren().add(EditNodeBuilder.makeTextSetNode(data, field.getName()).build());
				} else if (EditHelper.getPropertyBoolean(data, field.getName()) != null) {
					root.getChildren().add(EditNodeBuilder.makeBooleanSetNode(data, field.getName()).build());
				} else if (EditHelper.getPropertyNumber(data, field.getName()) != null) {
					root.getChildren().add(EditNodeBuilder.makeNumberSetNode(data, field.getName()).build());
				}
			}

		}
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
			EditNodeBuilder builder = new EditNodeBuilder(EditNodeType.StringCombo);
			builder.Data = data;
			builder.Field = field;

			return builder;
		}

		/** 変更通知リスナー */
		private Runnable[] ChangeListener = new Runnable[0];

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

		/** 数値以外のパターン */
		private static final Pattern FloatPattern = Pattern.compile("[^0-9\\.-]+");
		private static final Pattern IntPattern = Pattern.compile("[^0-9-]+");

		/** ノード作成処理 */
		public Node build() {
			if (Type == EditNodeType.Number || Type == EditNodeType.Text) {
				// テキストセット
				AnchorPane root = new AnchorPane();
				TextField text = new TextField();
				Label label = new Label(LocalizeHandler.getLocalizedName(Data, Field) + ":");
				double textFieldX = 100;
				// エンターを押したらフォーカスを外す
				text.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
					@Override
					public void handle(KeyEvent e) {
						if (e.getCode() == KeyCode.ENTER) {
							root.requestFocus();
						}
					}
				});
				text.textProperty().addListener((change, old, newv) -> {
					for (Runnable run : ChangeListener)
						run.run();
				});
				if (Type == EditNodeType.Text) {
					text.textProperty().bindBidirectional(EditHelper.getPropertyString(Data, Field));
				} else if (Type == EditNodeType.Number) {
					// 入力を数値のみに
					TextFormatter<Number> formatter;
					// FloatかIntegerか判別
					StringConverter<?> converter;
					if (EditHelper.getPropertyFloat(Data, Field) != null) {
						// Floatなら
						formatter = new TextFormatter<>(change -> {
							String newStr = FloatPattern.matcher(change.getText()).replaceAll("");
							int diffcount = change.getText().length() - newStr.length();
							change.setAnchor(change.getAnchor() - diffcount);
							change.setCaretPosition(change.getCaretPosition() - diffcount);
							change.setText(newStr);
							return change;
						});
						converter = new FloatStringConverter() {
							@Override
							public Float fromString(String str) {
								Float res = (Float) EditHelper.getData(Data, Field);
								try {
									res = super.fromString(str);
								} catch (Exception e) {
									res = (Float) EditHelper.getData(Data, Field);
									text.setText(super.toString(res));
								}
								// 範囲チェック
								Float resold = res;
								res = Math.min(res, EditHelper.getMax(Data.getClass(), Field));
								res = Math.max(res, EditHelper.getMin(Data.getClass(), Field));
								if (resold != res) {
									text.setText(super.toString(res));
								}
								return res;
							}
						};
					} else {
						converter = new IntegerStringConverter() {
							@Override
							public Integer fromString(String str) {
								Integer res = (Integer) EditHelper.getData(Data, Field);
								try {
									res = super.fromString(str);
								} catch (Exception e) {
									res = (Integer) EditHelper.getData(Data, Field);
									text.setText(super.toString(res));
								}
								// 範囲チェック
								if (res != null) {
									Integer resold = res;
									res = Math.min(res, Math.round(EditHelper.getMax(Data.getClass(), Field)));
									res = Math.max(res, Math.round(EditHelper.getMin(Data.getClass(), Field)));
									if (resold != res) {
										text.setText(super.toString(res));
									}
								}
								return res;
							}
						};
						formatter = new TextFormatter<>(change -> {
							String newStr = IntPattern.matcher(change.getText()).replaceAll("");
							int diffcount = change.getText().length() - newStr.length();
							change.setAnchor(change.getAnchor() - diffcount);
							change.setCaretPosition(change.getCaretPosition() - diffcount);
							change.setText(newStr);
							return change;
						});
					}
					text.setTextFormatter(formatter);
					text.textProperty().bindBidirectional((Property) EditHelper.getPropertyNumber(Data, Field),
							converter);
					text.focusedProperty().addListener(new ChangeListener<Boolean>() {
						@Override
						public void changed(ObservableValue<? extends Boolean> value, Boolean oldvalue,
								Boolean newvalue) {
							if (!newvalue) {
								text.setText(EditHelper.getData(Data, Field).toString());
							}
						}
					});
					// スクロールの追加
					text.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
						@Override
						public void handle(KeyEvent e) {
							if (e.getCode() == KeyCode.UP || e.getCode() == KeyCode.DOWN) {
								BigDecimal oldValue = new BigDecimal(EditHelper.getData(Data, Field).toString());
								BigDecimal change = new BigDecimal(EditHelper.getScale(Data.getClass(), Field));
								if (e.isShiftDown()) {
									change = change.multiply(new BigDecimal("10"));
								}
								if (e.getCode() == KeyCode.DOWN) {
									change = change.multiply(new BigDecimal("-1"));
								}
								BigDecimal newValue = change.add(oldValue);
								// 最大、最小チェック
								newValue = newValue.max(new BigDecimal(EditHelper.getMin(Data.getClass(), Field)));
								newValue = newValue.min(new BigDecimal(EditHelper.getMax(Data.getClass(), Field)));
								Property<Number> property = EditHelper.getPropertyNumber(Data, Field);
								if (EditHelper.getPropertyFloat(Data, Field) != null)
									property.setValue(newValue.floatValue());
								else
									property.setValue(newValue.intValue());
							}
						}
					});
					text.addEventHandler(ScrollEvent.SCROLL, new EventHandler<ScrollEvent>() {
						@Override
						public void handle(ScrollEvent e) {
							BigDecimal oldValue = new BigDecimal(EditHelper.getData(Data, Field).toString());
							BigDecimal change = new BigDecimal(EditHelper.getScale(Data.getClass(), Field));
							if (e.isShiftDown()) {
								change = change.multiply(new BigDecimal("10"));
							}
							if (e.getDeltaY() + e.getDeltaX() < 0) {
								change = change.multiply(new BigDecimal("-1"));
							}

							BigDecimal newValue = change.add(oldValue);
							// 最大、最小チェック
							newValue = newValue.max(new BigDecimal(EditHelper.getMin(Data.getClass(), Field)));
							newValue = newValue.min(new BigDecimal(EditHelper.getMax(Data.getClass(), Field)));
							Property<Number> property = EditHelper.getPropertyNumber(Data, Field);
							if (EditHelper.getPropertyFloat(Data, Field) != null)
								property.setValue(newValue.floatValue());
							else
								property.setValue(newValue.intValue());
						}
					});
				}
				root.resize(sizeX, sizeY);
				root.setLayoutX(layoutX);
				root.setLayoutY(layoutY);

				text.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(2), new Insets(2))));
				// text.setText(EditHelper.getData(Data, Field).toString());
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
				// 1回変更イベントを呼んでおく
				for (Runnable listener : ChangeListener) {
					listener.run();
				}
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