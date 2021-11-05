package io.github.java.generics;

public class Info<T> {
    private boolean getValue;
    private T value;
    public Info() { }
    public Info(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Info{" + "value=" + value + '}';
    }

    public boolean isGetValue() {
        return getValue;
    }

    public void setGetValue(boolean getValue) {
        this.getValue = getValue;
    }
}