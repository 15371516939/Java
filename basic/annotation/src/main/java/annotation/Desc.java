package annotation;

import java.lang.annotation.*;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-10 20:42:00
 */
@Retention(RetentionPolicy.RUNTIME)//注解可以保留到程序运⾏时，加载到JVM中
@Target(ElementType.TYPE)//给⼀个类型进⾏注解，⽐如类、接⼝、枚举
@Inherited //⼦类继承⽗类时，注解会起作⽤
public @interface Desc {
    enum Color {
        White, Grayish, Yellow
    }

    // 默认颜⾊是⽩⾊的
    Color c() default Color.White;
}