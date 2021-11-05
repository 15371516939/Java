package static_demo;

public class StudentTest {

    private  final String info = "info";

    public static void main(String[] args) {

        Student student1 = new Student("张三");
        Student student2 = new Student("李四");
       student2.show();
       student1.show();

    }
    public void test(){
     final   String info = "info";
        System.out.println(info);
    }


}
