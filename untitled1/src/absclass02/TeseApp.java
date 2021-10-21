package absclass02;

public class TeseApp {
    public static void main(String[] args) {
        //多态
        TestAbstact ta = new Test01();
        ta.run();
        ta=new Test02();
        ta.run();
    }
}
