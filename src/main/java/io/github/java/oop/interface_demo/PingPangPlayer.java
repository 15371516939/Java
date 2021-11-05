package interface_demo;

public class PingPangPlayer extends Player implements SpeakEnglish{


    @Override
    public void eat() {
        System.out.println("吃青菜");
    }

    @Override
    public void sport() {
        System.out.println("打奥 运会");

    }

    @Override
    public void speakEnglish() {
        System.out.println("hello world");

    }
}
