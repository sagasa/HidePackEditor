package helper;

import editPanel.base.EnumDataInfo;
import localize.LocalizeHandler;
import types.base.DataBase;

/**リフレクションを利用したTypes編集ヘルパー*/
public class EditHelper {

	/**
	 * データ取得 EnumDataInfo.toString()と同じフィールド名を持つpublicなフィールドを取得可能
	 */
	public static Object getData(DataBase data, EnumDataInfo type) {
		try {
			return data.getClass().getField(type.toString()).get(data);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			return null;
		}
	}

	/** データ上書き */
	public static boolean setData(DataBase data, EnumDataInfo type, Object value) {
		try {
			data.getClass().getField(type.toString()).set(data, value);
			return true;
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			return false;
		}
	}
	/** 型取得 */
	public static Class<?> getType(DataBase data, EnumDataInfo type) {
		try {
			return data.getClass().getField(type.toString()).getType();
		} catch (NoSuchFieldException | SecurityException e) {
			return null;
		}
	}

	/** ローカライズした名前を取得 */
	public static String getLocalizedName(EnumDataInfo info) {
		return LocalizeHandler.getLocalizedName(info.getUnlocalizedName());
	}

	/** bullet用type */
	public enum BulletDataList implements EnumDataInfo {
		,
		;

		/*
		 * エンティティの設定項目 エフェクト：着弾時・飛翔中(エンティティに当たった時に付与する効果)
		 * 飛翔中のエフェクトの効果(音などを追加してもいいかも 弾道落下：true/false・配列とその中の数式
		 * 威力減衰：true/false・配列とその中の数式 モデル 近接信管・反応するエンティティ
		 * 誘導：true/false・手動/ロックオン/継続ロックオン・反応するエンティティ
		 */

		private static final String Domain = "MAGAZINE.";

		public static final int BULLET_INFO = 1;
		public static final int BULLET_HIT = 2;
		// public static final int BULLET_HIT_KNOCKBACK = 3;
		public static final int BULLET_DECAY = 4;

		private BulletDataList() {
			this(null, null, -1,null);
		}

		private BulletDataList(int cate) {
			this(null, null, cate,null);
		}

		private BulletDataList(Float min, Float max,String scale) {
			this(min, max, -1,scale);
		}

		private BulletDataList(Float min, Float max, int cate,String scale) {
			Max = max;
			Min = min;
			UnlocalizedName = (Domain + this.toString()).replaceAll("_", ".").toLowerCase();
			LocalizeHandler.addName(UnlocalizedName);
			Cate = cate;
		}

		private Float Max;
		private Float Min;
		private int Cate;
		private String UnlocalizedName;
		private String Scale;

		@Override
		public Float getMin() {
			return Min;
		}

		@Override
		public Float getMax() {
			return Max;
		}

		@Override
		public String getUnlocalizedName() {
			return UnlocalizedName;
		}

		@Override
		public int getCate() {
			return Cate;
		}

		@Override
		public String getScale() {
			return Scale;
		}
	}

	/** EnumDataInfoをノックする */
	public static void makeLocalize() {
		BulletDataList.values();
	}
}
