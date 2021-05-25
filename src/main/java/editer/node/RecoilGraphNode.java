package editer.node;

import javafx.beans.value.ObservableObjectValue;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import types.base.DataPath;
import types.editor.DataView;
import types.effect.Recoil;
import types.gun.ProjectileData;
import types.items.GunData;
import types.value.Curve;

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

			final float pps = (float) a.get(DataPath.of(Recoil.PowerShoot)).get();
			final float ppt = (float) a.get(DataPath.of(Recoil.PowerTick)).get();
			final float tps = getTickParShoot(projectileData.get(ProjectileData.RPM, null));

			System.out.println(String.format("pps[%.2f],ppt[%.2f],tps[%.2f]", pps, ppt, tps));
			float totalpps = pps - tps * ppt;
			float power = 0;
			float x = 0, y = 0, sx = 4, sy = 4;
			for (int i = 0; i < 40; i++) {
				System.out.println(((Curve) a.get(DataPath.of(Recoil.HorizontalBase)).get()).get(power));
				x += ((Curve) a.get(DataPath.of(Recoil.HorizontalBase)).get()).get(power);
				System.out.println(x + " " + y);
				g.setStroke(Color.hsb(i * 3, 1, 1));
				g.strokeRect(x - sx / 2 + RecoilViewSize / 2, y - sy / 2 + RecoilViewSize / 2, sx, sy);

				power += totalpps;
				power = Math.max(power, 0);
			}
		}

	}

	private float getTickParShoot(int rpm) {
		return 1200f / rpm;
	}
}
