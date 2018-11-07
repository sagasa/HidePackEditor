package controller.editer;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import types.base.DataBase;
import types.guns.GunData;

public class EditerComponent {
	public static void writeGunEditer(Pane editer, GunData data) {
		editer.getChildren().add(makeTextSet(data));

	}

	//ベースサイズは200x24

	/**テキストセット用ノード*/
	private static Node makeTextSet(DataBase data,String label,EventHandler<MouseEvent> e) {
		AnchorPane root = new AnchorPane();
		root.resize(200, 24);
		TextField text = new TextField();
		text.setFont(Font.font(10));
		text.setLayoutX(100);
		text.setPrefSize(100, 24);
		root.getChildren().add(text);
		Label label = new Label("AAA:");
		label.setPrefSize(100, 24);
		label.setAlignment(Pos.CENTER_RIGHT);

		root.getChildren().add(label);
		root.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("You clicked me!");
            }
        });
		return root;
	}
}