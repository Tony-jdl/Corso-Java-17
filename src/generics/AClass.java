package src.generics;

public class AClass {
    static <T extends Number> double half(T t) {
        return t.doubleValue() / 2.0;
    }
}
