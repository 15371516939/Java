package io.github.java.generics;

public class GenericsClassDemo01 {
    public static void main(String[] args) {
        Info<Integer> info = new Info<>();
        info.setValue(10);
        System.out.println(info.getValue());
        
        Info<String> info2 = new Info<>();
        info2.setValue("abc");
        System.out.println(info2.getValue());
    }
}
