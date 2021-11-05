package io.github.java.generics;

public class GenericsInterfaceDemo02 implements Content<String> {
    private final String text;

    public GenericsInterfaceDemo02(String text){
        this.text = text;

    }
    @Override
    public String text() {
        return text;
    }

    public static void main(String[] args) {
        GenericsInterfaceDemo02 gen = new GenericsInterfaceDemo02("ABC");
        System.out.println(gen.text());

    }

    }

