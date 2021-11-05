package interface_demo;

public class PingPangCoach  extends Coach implements SpeakEnglish{
    public PingPangCoach(String name,Integer age){
        super(name,age);

    }

    public PingPangCoach() {
    }

    @Override
    public void teach() {
        System.out.println("教练发球");
    }
    @Override
    public void eat(){
        System.out.println("吃龙虾");
    }
    @Override
    public void speakEnglish(){
        System.out.println("hello");
    }

}
