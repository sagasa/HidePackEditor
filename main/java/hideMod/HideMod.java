package hideMod;

import entity.EntityBullet;
import handler.MasterEventHandler;
import item.SumpleItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import newwork.PacketHandler;
import render.RenderBullet;
import types.BulletData;

@Mod(modid = HideMod.MOD_ID,
        name = HideMod.MOD_NAME,
        version = HideMod.MOD_VERSION,
        dependencies = HideMod.MOD_DEPENDENCIES,
        acceptedMinecraftVersions = HideMod.MOD_ACCEPTED_MC_VERSIONS,
        useMetadata = true)

public class HideMod {
    /** ModId文字列 */
    public static final String MOD_ID = "hidemod";
    /** MOD名称 */
    public static final String MOD_NAME = "HideMod";
    /** MODのバージョン */
    public static final String MOD_VERSION = "α";
    /** 早紀に読み込まれるべき前提MODをバージョン込みで指定 */
    public static final String MOD_DEPENDENCIES = "required-after:Forge@[1.8-11.14.0.1239,)";
    /** 起動出来るMinecraft本体のバージョン。記法はMavenのVersion Range Specificationを検索すること。 */
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.8,1.8.9]";

    public static Item testitem;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	testitem = new SumpleItem()
                .setCreativeTab(CreativeTabs.tabMaterials)/*クリエイティブのタブ*/
                .setUnlocalizedName("testitem")/*システム名の登録*/
                .setMaxStackSize(64);/*スタックできる量。デフォルト64*/
    	GameRegistry.registerItem(testitem, "testitem");

    	//イベントハンドラ登録
    	MinecraftForge.EVENT_BUS.register(new MasterEventHandler());
    	FMLCommonHandler.instance().bus().register(new MasterEventHandler());

    	//弾丸エンティティ
    	EntityRegistry.registerModEntity(EntityBullet.class, "entity_bullet", 1, this, 1024, 5, true);
    	//レンダー
    	if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {

    		//RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet(Minecraft.getMinecraft().getRenderManager()));
            }

    	SumpleItem.SumpleItem();
    	System.out.println("[SAGASA Mod] " + "load");

    	//パケットの初期設定
    	PacketHandler.init();

    	//とりあえずロード
    	//loadPack.load(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    /**ログ出力 試験用*/
    public static void log(String String){
    	System.out.println("[HideMod] " + String);

    }
}