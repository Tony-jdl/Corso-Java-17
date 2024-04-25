package src.interfacce;

public class AClass implements IMyInterface, IMyInterface2 {

    @Override
    public void myMethod1() {
        System.out.println("AClass, myMethod1");
    }

    @Override
    public void myMethod2() {
        System.out.println("AClass, myMethod2");
    }
}
