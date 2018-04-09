package render;

import org.lwjgl.opengl.GL11;

import entity.EntityBullet;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import render.ModelBullet;

public class RenderBullet extends Render {

	public static final ResourceLocation texture = new ResourceLocation("hidemod", "defaultBullet.png");

	public RenderBullet(RenderManager renderManager) {
		super(renderManager);
		//shadowSize = 0.5F;
	}

	@Override
	public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) {

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return null;
	}
}
