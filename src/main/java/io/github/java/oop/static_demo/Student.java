package static_demo;

public class Student {
    private  String name;

    public static String schoolName = "NJUIT";

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public void show(){
        System.out.println(name + "," + schoolName);

    }
    public  void print(){
        System.out.println(this.name);
    }


}
