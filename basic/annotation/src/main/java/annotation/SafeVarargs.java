package annotation;

import java.lang.annotation.*;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-10 20:55:00
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,ElementType.METHOD})
public @interface SafeVarargs {
}
