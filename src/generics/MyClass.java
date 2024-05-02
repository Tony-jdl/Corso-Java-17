package src.generics;

public class MyClass<T> implements IMyInterface{

    @Override
    public void myMethod(Object o) {
        System.out.println(o);
    }
}
