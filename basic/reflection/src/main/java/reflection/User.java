package reflection;

import lombok.Data;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-09 20:40:00
 */
@Data
public class User {
    private Integer age;
    private String name;

    public User() {
    }

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}

