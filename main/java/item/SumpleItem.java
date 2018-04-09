package item;

import java.util.List;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import entity.EntityBullet;
import hideMod.HideMod;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;


import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import newwork.PacketGuns;
import newwork.PacketHandler;
import types.BulletData;


public class SumpleItem extends Item
{
	private static boolean rightMouseHeld;
	private static boolean lastRightMouseHeld;
	private static boolean leftMouseHeld;
	private static boolean lastLeftMouseHeld;


     /** 追加したいアイテムのインスタンスを格納する変数。レシピ等で利用。 */

	EntityPlayer owner;

    @Override
    public ItemStack onItemRightClick(ItemStack item,World world, EntityPlayer player )
    {
    	if (!world.isRemote){
    	//player.addChatMessage(new ChatComponentText());




     //   EntityBullet bullet = new EntityBullet(world, player);

        //試験的に弾を発射
      //  world.spawnEntityInWorld(bullet);

     //   List llist = player.worldObj.getEntitiesWithinAABBExcludingEntity(player,player.getBoundingBox().addCoord(player.posX - 10, player.posY - 10, player.posZ - 10).expand(player.posX + 10, player.posY + 10, player.posZ + 10));

    /*    for (int var13 = 0; var13 < llist.size(); ++var13) {
			Entity lentity = (Entity)llist.get(var13);
			 player.addChatMessage(new ChatComponentText((String) llist.get(var13)));
		}
		*/

    	}

    	//発射時に
    	if (world.isRemote){
    		owner = player;

    		int yawRecoil = 0;
    		int pitchRecoil = 8;

    	//	player.rotationPitch -= pitchRecoil;
    	//	player.rotationYaw += yawRecoil;

    	}


        //試験的に弾を発射


        return item;
    }

    //発射判定とかいろいろ
    @Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag){
    	//マウスを取得
    	System.out.println(entity.getInventory());

    	if (entity instanceof EntityPlayer){

    	}

    	if (world.isRemote){
    		lastRightMouseHeld = rightMouseHeld;
			lastLeftMouseHeld = leftMouseHeld;
			rightMouseHeld = Mouse.isButtonDown(1);
			leftMouseHeld = Mouse.isButtonDown(0);
			if(lastLeftMouseHeld!=leftMouseHeld&&leftMouseHeld){

	    		String str = rightMouseHeld+""+leftMouseHeld;
	    		PacketHandler.INSTANCE.sendToServer(new PacketGuns(owner.rotationYaw,owner.rotationPitch));
				((EntityPlayer)entity).addChatMessage(new ChatComponentText(str));
			}

    	}else{
    		//更新があってかつ押されたなら

    	}

	//	EntityPlayer player = (EntityPlayer)entity;
	//	player.addChatMessage(new ChatComponentText("アップデート"));

	}
    //rightMouseHeld = Mouse.isButtonDown(1);
	//leftMouseHeld = Mouse.isButtonDown(0);

    public static void SumpleItem() {
        /*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
        /*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
        /*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
        /*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
        /*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
        /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/

        //アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
    	ModelLoader.setCustomModelResourceLocation(HideMod.testitem, 0, new ModelResourceLocation(HideMod.MOD_ID + ":" + "testitem", "inventory"));
        System.out.println("[SAGASA Mod] " + "load");
    }



}