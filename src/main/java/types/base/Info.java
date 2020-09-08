package types.base;

public class Info {
	public static final Info Default = new Info();

	/** エディタ側での編集範囲 */
	public float Min = -Float.MAX_VALUE;

	public Info Min(float min) {
		this.Min = min;
		return this;
	}

	/** エディタ側での編集範囲 */
	public float Max = Float.MAX_VALUE;

	public Info Max(float max) {
		this.Max = max;
		return this;
	}

	/** エディタ側での編集倍率 */
	public String Scale = "1";

	public Info Scale(String scale) {
		this.Scale = scale;
		return this;
	}

	/** エディタ側での表示用 */
	public int Cate = -1;

	public Info Cate(int value) {
		this.Cate = value;
		return this;
	}

	/** Mod側でのドメイン適応処理用 */
	public boolean IsResourceName = false;

	public Info IsResourceName(boolean value) {
		this.IsResourceName = value;
		return this;
	}

	/** Mod側でのドメイン適応処理用 */
	public String ResourceHeader = "";

	public Info ResourceHeader(String header) {
		this.ResourceHeader = header;
		return this;
	}

	/** Mod側でのドメイン適応処理用 */
	public boolean IsName = false;

	public Info IsName(boolean value) {
		this.IsName = value;
		return this;
	}

	/** ArrayまたはListに対して長さが1以上かチェックする */
	public boolean NoEmpty = false;

	public Info NoEmpty(boolean value) {
		this.NoEmpty = value;
		return this;
	}
}
