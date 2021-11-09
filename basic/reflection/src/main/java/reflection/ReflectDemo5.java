package reflection;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-09 21:42:00
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws IllegalAccessException, IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Properties properties = new Properties();
        properties.load(new FileReader("Class.txt"));

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class<?> clazz = Class.forName(className);
        Method method = clazz.getMethod(methodName);
        method.invoke(clazz.getDeclaredConstructor().newInstance());
    }
}