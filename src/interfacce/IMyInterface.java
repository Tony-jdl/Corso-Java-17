package src.interfacce;

public interface IMyInterface {
    void myMethod1();

    default void myMethod2() {
        System.out.println("IMyInterface, myMethod2");
    }
}
