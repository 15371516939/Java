package reflection;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-09 21:41:00
 */
import lombok.Data;

@Data
public class Person {
    private Integer id;
    private String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void getPerson() {
        System.out.println("I am a person");
    }
}