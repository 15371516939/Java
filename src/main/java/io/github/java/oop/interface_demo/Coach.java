package interface_demo;

public abstract class Coach  extends Person{
    public  Coach(){

    }
    public  Coach(String name,Integer age){
        super(name,age);
    }
    public abstract void teach();

}

