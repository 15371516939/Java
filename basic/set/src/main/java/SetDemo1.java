import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-09 18:56:00
 */
public class SetDemo1 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(001,"梁吴俊"),
                new Student(004,"孙周"),
                new Student(003,"杨倩倩"),
                new Student(002,"孙周"),


        };
        Set<Student> set1 = new TreeSet<>(Arrays.asList(students));
        set1.forEach(System.out::println);
    }
}
