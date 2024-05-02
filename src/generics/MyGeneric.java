package src.generics;

public class MyGeneric <T> {
    private T t;

    public T getObject() {
        return t;
    }

    public void setObject(T t) {
        this.t = t;
    }
}
