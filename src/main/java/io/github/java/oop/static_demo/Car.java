package static_demo;



public class Car {

    private String name;

    public  static  void test(){
        Englne englne = new Car().new Englne();
        englne.x = "world";

        //new Car().new Englne();
    }
    public class Englne{
        private String x = "hello";


        public void show(){
            System.out.println(name);
        }

    }

}
