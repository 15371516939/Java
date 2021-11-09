import java.util.Objects;

/**
 * @author :duyunjian
 * @description :set 学习
 * @create :2021-11-09 18:52:00
 */




public class Student  implements Comparable<Student>{
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return id.equals(student.id) && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Student o) {
        //if (this.id > o.getId()) {
        //    return 1;
        //}else if (this.id < o.getId()){
        //    return  -1;
        //
        //}else {
        //    return 0;
        //}
        return this.getId().compareTo(o.getId());
}
