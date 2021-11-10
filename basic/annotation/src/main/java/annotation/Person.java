package annotation;

import java.lang.annotation.Repeatable;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-10 20:43:00
 */
@Repeatable(Persons.class)
public @interface Person{
    String role() default "";
}