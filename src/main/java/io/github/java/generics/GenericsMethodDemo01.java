package io.github.java.generics;

public class GenericsMethodDemo01 {
    public static <T> void printhClass(T obj){
        System.out.println(obj.getClass().toString());
    }

    public static void main(String[] args) {
        printhClass("abc");
        printhClass(10);
    }
}
