package com.flansmod.client.model;


import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGun extends net.minecraft.client.model.ModelBase
{
	//Shapebox template. For quick copy pasting
	//, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);

	//These first 6 models are static with no animation
	public ModelRendererTurbo[] gunModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] backpackModel = new ModelRendererTurbo[0]; //For flamethrowers and such like. Rendered on the player's back
	//These models appear when no attachment exists
	public ModelRendererTurbo[] defaultBarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultScopeModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultStockModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultGripModel = new ModelRendererTurbo[0];

	//Animated models follow.
	public ModelRendererTurbo[] ammoModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] revolverBarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] breakActionModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] slideModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] pumpModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] minigunBarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leverActionModel = new ModelRendererTurbo[0];
	/** The point about which the minigun barrel rotates. Rotation is along the line of the gun through this point */
	public Vector3f minigunBarrelOrigin = new Vector3f();

	//These designate the locations of 3D attachment models on the gun
	public Vector3f barrelAttachPoint = new Vector3f();
	public Vector3f scopeAttachPoint = new Vector3f();
	public Vector3f stockAttachPoint = new Vector3f();
	public Vector3f gripAttachPoint = new Vector3f();


	public float gunSlideDistance;
	public Vector3f thirdPersonOffset;

	public void translateAll(float x, float y, float z)
	{

	}
}