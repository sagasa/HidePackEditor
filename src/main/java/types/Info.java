package types;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
public @interface Info {
	/**エディタ側での編集範囲*/
	float Min() default -Float.MAX_VALUE;
	/**エディタ側での編集範囲*/
	float Max() default Float.MAX_VALUE;
	/**エディタ側での編集倍率*/
	String Scale() default "1";
	/**エディタ側での表示用*/
	int Cate() default -1;
	/**Mod側でのドメイン適応処理用*/
	boolean isResourceName() default false;
	/**Mod側でのドメイン適応処理用*/
	boolean isName() default false;
	/**ArrayまたはListに対して長さが1以上かチェックする*/
	boolean noEmpty() default false;
}
