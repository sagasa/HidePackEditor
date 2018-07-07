package helper;

import java.lang.reflect.Field;
import java.util.Arrays;

import editer.ValueInfo;
import editer.ValueInfo.BulletDataList;
import editer.ValueInfo.ExplosionDataList;
import types.BulletData;
import types.Explosion;
import types.Sound;
import types.base.EnumDataInfo;

public class ReflectHelper {

	/**
	 * e.getField(ExplosionDataList.DAMAGE_BASE_TANK).getType().isAssignableFrom
	 * (float.class)
	 */
	class test {
		public Float[] F = new Float[]{10f};
		public float[] f = new float[]{10f};
	}

	public static void get() {
		ReflectHelper helper = new ReflectHelper();
		test test = helper.new test();

		for (Field f : test.class.getDeclaredFields()) {
			 System.out.println(f.getName()+f.getType().isAssignableFrom(float.class));
		}

		LocalizeHandler.init();
		LocalizeHandler.loadLang();
		System.out.println(Arrays.asList(LocalizeHandler.getLangList()));
		System.out.println(LocalizeHandler.getLocalizedName("new"));
		LocalizeHandler.setLang("en");
		System.out.println(LocalizeHandler.getLocalizedName("new"));

		Explosion e = new Explosion();
		ValueInfo.setData(e, ExplosionDataList.DAMAGE_BASE_PLAYER, 2);
		Explosion e2 = new Explosion();
		ValueInfo.setData(e2, ExplosionDataList.DAMAGE_BASE_PLAYER, 3);
		System.out.println(e.DAMAGE_BASE_PLAYER);

		e.overcoe(e2);
		System.out.println(e.DAMAGE_BASE_PLAYER);
		// System.out.println(e.getData(ExplosionDataList.DAMAGE_BASE_AIR));
		for (Field f : Explosion.class.getDeclaredFields()) {
			// System.out.println(f.getName());
		}
	}
}
