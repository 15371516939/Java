package reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-09 21:18:00
 */


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableSu {

 String value();
}
