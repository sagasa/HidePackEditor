package editer.node;

import javafx.beans.value.ObservableObjectValue;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import types.editor.DataView;
import types.effect.Recoil;
import types.gun.ProjectileData;
import types.items.GunData;

public class RecoilGraphNode extends Pane {

	private static final double RecoilViewSize = 300;

	private GraphicsContext g;
	private ObservableObjectValue<GunData> value;

	public RecoilGraphNode(ObservableObjectValue<GunData> editValue) {
		value = editValue;
		setPrefSize(RecoilViewSize, RecoilViewSize + 30);
		Canvas recoilview = new Canvas(RecoilViewSize, RecoilViewSize);
		g = recoilview.getGraphicsContext2D();
		draw();
		Button button = new Button("Draw");
		button.setTranslateY(RecoilViewSize);
		button.setOnAction(e -> {
			draw();
		});
		this.getChildren().addAll(button, recoilview);
	}

	private void draw() {
		g.setFill(Color.GRAY);
		g.fillRect(0, 0, RecoilViewSize, RecoilViewSize);
		g.setStroke(Color.BLACK);
		g.strokeRect(0, 0, RecoilViewSize, RecoilViewSize);
		g.strokeLine(RecoilViewSize / 2, RecoilViewSize, RecoilViewSize / 2, 0);
		g.strokeLine(RecoilViewSize, RecoilViewSize / 2, 0, RecoilViewSize / 2);

		DataView<Recoil> a = new DataView<>(Recoil.class, 3);

		if (value.get() != null) {
			GunData data = value.get();
			ProjectileData projectileData = data.get(GunData.Data, null);

			a.setValue(0, data.getEntry(GunData.RecoilADS).ValueProp);

			float shootPower = getTickParShoot(projectileData.get(ProjectileData.RPM, null));
			for (int i = 0; i < 40; i++) {
				g.setStroke(Color.hsb(i * 3, 1, 1));
				g.strokeOval(100, i * 5, 10, 10);
			}
		}

	}

	private float getTickParShoot(int rpm) {
		return 1200f / rpm;
	}
}
