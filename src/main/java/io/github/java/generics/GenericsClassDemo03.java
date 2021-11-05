package io.github.java.generics;

public class GenericsClassDemo03 {
    public static void main(String[] args) {
        Info<String> info = new Info("hello");
        MyMap<Integer,Info <String> >map = new MyMap<>(1, info);
        System.out.println(map);
    }
}
