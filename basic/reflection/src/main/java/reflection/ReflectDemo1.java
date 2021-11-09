package reflection;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-09 20:13:00
 */
@Slf4j
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 获得Class对象
        Class<?> clazz = Class.forName("reflection.User");
        // 1、构造一个对象，本质是无参构造器
        User user1 = (User) clazz.getDeclaredConstructor().newInstance();
        log.info("user1: {}", user1);

        // 2、通过构造器创建对象
        User user2 = (User) clazz.getDeclaredConstructor(Integer.class, String.class).newInstance(1, "张三");
        log.info("user2: {}", user2);

        // 3、通过反射调用普通方法
        User user3 = (User) clazz.getDeclaredConstructor().newInstance();
        Method setName = clazz.getDeclaredMethod("setName", String.class);
        // invoke激活
        setName.invoke(user3, "李四");
        log.info("user3.name: {}", user3.getName());

        // 4、通过反射操作属性（即使私有也照样可以）
        User user4 = (User) clazz.getDeclaredConstructor().newInstance();
        Field name = clazz.getDeclaredField("name");
        // true: 取消Java语言的访问检查
        name.setAccessible(true);
        name.set(user4, "葫芦娃");
        log.info("user4.name: {}", user4.getName());
    }
}
