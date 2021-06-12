package editor.node;

import javafx.beans.value.ObservableObjectValue;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import types.base.DataBase.ValueEntry;
import types.base.DataPath;
import types.editor.DataView;
import types.effect.Recoil;
import types.gun.ProjectileData;
import types.items.GunData;
import types.value.Curve;

public class RecoilGraphNode extends Pane {

	private static final double RecoilViewSize = 300;
	private static final double MaxEditAngle = 90;
	private static final double ToViewSize = (RecoilViewSize / 2) / MaxEditAngle;

	private GraphicsContext g;
	private ObservableObjectValue<GunData> value;

	public RecoilGraphNode(ObservableObjectValue<GunData> editValue) {
		value = editValue;
		setPrefSize(RecoilViewSize, RecoilViewSize + 30);
		Canvas recoilview = new Canvas(RecoilViewSize, RecoilViewSize);
		g = recoilview.getGraphicsContext2D();
		draw(false, false);
		Button button = new Button("Draw");
		Button ads = new Button("ADS");
		Button sneak = new Button("Sneak");
		Button adssneak = new Button("ADS+Sneak");
		EditNode.leftJustified(button, 2, ads);
		EditNode.leftJustified(ads, 2, sneak);
		EditNode.leftJustified(sneak, 2, adssneak);

		button.setTranslateY(RecoilViewSize);
		ads.setTranslateY(RecoilViewSize);
		sneak.setTranslateY(RecoilViewSize);
		adssneak.setTranslateY(RecoilViewSize);
		button.setOnAction(e -> draw(false, false));
		ads.setOnAction(e -> draw(true, false));
		sneak.setOnAction(e -> draw(false, true));
		adssneak.setOnAction(e -> draw(true, true));
		this.getChildren().addAll(button, ads, sneak, adssneak, recoilview);
	}

	private void draw(boolean ads, boolean sneak) {
		g.setFill(Color.GRAY);
		g.fillRect(0, 0, RecoilViewSize, RecoilViewSize);
		g.setStroke(Color.BLACK);
		g.strokeRect(0, 0, RecoilViewSize, RecoilViewSize);
		g.strokeLine(RecoilViewSize / 2, RecoilViewSize, RecoilViewSize / 2, 0);
		g.strokeLine(RecoilViewSize, RecoilViewSize / 2, 0, RecoilViewSize / 2);

		DataView<Recoil> view = new DataView<>(Recoil.class, 3);

		if (value.get() != null) {
			ProjectileData projectileData = value.get().get(GunData.Data, null);
			ValueEntry<Recoil> recoil = projectileData.getEntry(ProjectileData.Recoil);
			if (recoil != null)
				view.setValue(0, recoil.ValueProp);
			recoil = projectileData.getEntry(ProjectileData.RecoilADS);
			if (recoil != null && ads)
				view.setValue(1, recoil.ValueProp);
			recoil = projectileData.getEntry(ProjectileData.RecoilSneak);
			if (recoil != null && sneak)
				view.setValue(2, recoil.ValueProp);

			final float pps = (float) view.get(DataPath.of(Recoil.PowerShoot)).get();
			final float ppt = (float) view.get(DataPath.of(Recoil.PowerTick)).get();
			final float tps = getTickParShoot(projectileData.get(ProjectileData.RPM, null));

			System.out.println(String.format("pps[%.2f],ppt[%.2f],tps[%.2f]", pps, ppt, tps));

			final Curve hb = (Curve) view.get(DataPath.of(Recoil.HorizontalBase)).get();
			final Curve vb = (Curve) view.get(DataPath.of(Recoil.VerticalBase)).get();
			final Curve hs = (Curve) view.get(DataPath.of(Recoil.HorizontalSpread)).get();
			final Curve vs = (Curve) view.get(DataPath.of(Recoil.VerticalSpread)).get();

			float totalpps = pps - tps * ppt;
			float power = 0;
			float x = 0, y = 0, sx = 4, sy = 4;
			g.setLineWidth(0.5);
			for (int i = 0; i < 30; i++) {
				x += hb.get(power);
				y -= vb.get(power);

				sx += hs.get(power);
				sy += vs.get(power);
				g.setStroke(Color.hsb(i * 3, 1, 1));
				g.strokeRect((x - sx / 2) * ToViewSize + RecoilViewSize / 2,
						(y - sy / 2) * ToViewSize + RecoilViewSize / 2, sx * ToViewSize, sy * ToViewSize);

				power += totalpps;
				power = Math.max(power, 0);
			}
		}

	}

	private float getTickParShoot(int rpm) {
		return 1200f / rpm;
	}
}
