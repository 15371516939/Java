package interface_demo;

public  abstract class Player extends Person{


    public  Player(){

}
    public  Player(String name,Integer age){
        super(name,age);
    }
    public abstract void sport();

}
