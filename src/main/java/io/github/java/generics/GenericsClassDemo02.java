package io.github.java.generics;

public class GenericsClassDemo02 {
    public static void main(String[] args) {
        MyMap<Integer, String> map = new MyMap<>(1, "one");
        System.out.println(map);
    }
}
