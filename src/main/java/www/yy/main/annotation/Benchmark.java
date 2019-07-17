package www.yy.main.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author : YangY
 * @Description :  该注解用来标记需要测试的方法
 * @Time : Created in 20:34 2019/7/12
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})    //只针对方法
public @interface Benchmark {
}
