package src.interfacce;

public class AClass implements IMyInterface {

    @Override
    public void myMethod1() {
        System.out.println("AClass, myMethod1");
    }

    @Override // override metodo default della interface
    public void myMethod2() {
        IMyInterface.super.myMethod2(); // richiamo metodo default della interface
        System.out.println("AClass, myMethod2");
    }
}
