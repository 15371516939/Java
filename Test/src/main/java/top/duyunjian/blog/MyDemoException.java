package top.duyunjian.blog;

public class MyDemoException extends RuntimeException{
    public MyDemoException() {
    }

    public MyDemoException(String message) {
        super(message);
    }

}