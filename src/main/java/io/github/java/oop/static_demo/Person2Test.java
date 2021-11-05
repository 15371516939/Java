package static_demo;

public class Person2Test {
    public static void main(String[] args) {
       Person2 person2 = new Person2();
       person2.setLive(true);
       Person2.Herat herat = person2.new Herat();
       herat.jump();

       person2.setLive(false);
       herat.jump();
    }
}
