package static_demo;

public class Person {
     private String name;

     static {
         System.out.println("静态代码块");

     }

    public Person(String name) {
         System.out.println("执行代码方法");
        this.name = name;
    }

    public Person() {
    }

    public static void main(String[] args) {
        Person aaa = new Person("aaa");
    }
}
