package model;

import org.lwjgl.opengl.GL11;

import javafx.scene.shape.Polygon;
import javafx.scene.layout.Pane;

public class DisplayPart extends ModelPart{
	public DisplayPart(HidePolygon[] array) {
		super(array);
	}

	public void render(Pane editer) {
		Polygon poly = new Polygon();

		//editer.getChildren().add();
	}
}