package src.generics;

public class MyGeneric <T extends Number> {
    private T t;

    MyGeneric(T t) {
        this.t = t;
    }

    int quadrato(){
        return t.intValue() * t.intValue();
    }
}
