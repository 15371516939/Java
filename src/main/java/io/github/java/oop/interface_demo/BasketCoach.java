package interface_demo;

public class BasketCoach extends Coach{
public BasketCoach(String name,Integer age){
    super(name,age);
}
public BasketCoach(){

}
    @Override
    public void teach() {
        System.out.println("教运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("吃肉喝酒");

    }
}
