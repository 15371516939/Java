package final_demo;

public class FinalDemo1 {
    private static  final int MAX_COUNT = 100;
    public static void main(String[] args) {
        final User u = new User();
        u.setName("aaa");
        System.out.println(u.getName());
        //u = new User();
        u.setName("bbb");
        System.out.println(u.getName());



        //a = 20;

    }
}
