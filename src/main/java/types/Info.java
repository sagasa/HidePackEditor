package types;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
public @interface Info {
	float Min() default Float.MIN_VALUE;
	float Max() default Float.MAX_VALUE;
	String Scale() default "1";
	int Cate() default -1;

}
