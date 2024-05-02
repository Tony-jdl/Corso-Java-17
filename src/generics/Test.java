package src.generics;

public class Test {
    public static void main(String[] args) {
        IMyInterface<String> mi = new MyClass<String>();
        mi.myMethod("Java");
    }
}
