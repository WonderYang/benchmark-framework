package www.yy.main.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author : YangY
 * @Description :
 * @Time : Created in 9:28 2019/7/13
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface WarmUp {
    //预热的次数
    int iterations() ;
}
