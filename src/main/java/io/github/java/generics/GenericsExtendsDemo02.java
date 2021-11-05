package io.github.java.generics;

public class GenericsExtendsDemo02 {
    static class A { /* ... */ }
    interface B { /* ... */ }
    interface C { /* ... */ }
    static class D1 <T extends A & B & C> { /* ... */ }
    static class E extends A implements B, C { /* ... */ }
    public static void main(String[] args) {
        D1<E> demo1 = new D1<>();
        System.out.println(demo1.getClass().toString());
        //D1<String> demo2 = new D1<>();//编译报错
    }
}
