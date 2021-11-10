package annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-10 20:53:00
 */
public class Hero {
    @Deprecated
    public void say() {
        System.out.println("nothing has to say!");
    }
    public void speak() {
        System.out.println("i have a dream!");
    }
    public void addItems(String item) {
        List<String> items = new ArrayList<>();
        items.add(item);
        System.out.println("i am " + items);
    }
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.addItems("Javac初学者");
        hero.say();
        hero.speak();
    }
}