package src.generics;

public class MyGeneric <T,V> {
    private T t;
    private V v;

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    MyGeneric(T t, V v) {
        this.t = t;
        this.v = v;
    }
}
