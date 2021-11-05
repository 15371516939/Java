import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * Instanceof操作符示例
 * @author:duyunjian
 * @date:2021/09/28
 */

public class InstanceofOperatorDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        boolean result = animal instanceof Cat;
        log.info(String.valueOf(true));
    }

    static class Animal {

    }

    static class Cat extends Animal {

    }

}
