package io.github.java.generics;

public class GenericsInterfaceDemo01 implements Content<Integer> {
    private final int text;

    public GenericsInterfaceDemo01(int text) {
        this.text = text;
    }

    public static void main(String[] args) {
        GenericsInterfaceDemo01 demo = new GenericsInterfaceDemo01(10);
        System.out.print(demo.text());
    }

    @Override
    public Integer text() {
        return text;
    }
}
