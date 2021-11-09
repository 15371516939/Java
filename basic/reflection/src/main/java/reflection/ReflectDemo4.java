package reflection;

import lombok.extern.slf4j.Slf4j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-09 21:38:00
 */
@Slf4j
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazz = Class.forName("reflection.Student");

        // 通过反射获取注解
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annotation : annotations) {
            log.info("注解: {}", annotation);
        }

        // 获得注解value的值
        TableSu tableSu = clazz.getAnnotation(TableSu.class);
        log.info("注解的值: {}", tableSu);

        // 获得类指定的注解
        Field field = clazz.getDeclaredField("name");
        FieldSu annotation = field.getAnnotation(FieldSu.class);
        log.info("name: {}", annotation.columnName());
        log.info("type: {}", annotation.type());
        log.info("length: {}", annotation.length());
    }
}
