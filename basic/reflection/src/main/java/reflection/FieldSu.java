package reflection;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-09 21:21:00
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)


 @interface FieldSu {
    String columnName();
    String type();
    int length();

}
