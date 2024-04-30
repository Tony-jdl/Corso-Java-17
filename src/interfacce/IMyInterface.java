package src.interfacce;

public interface IMyInterface {
    // metodo visibile solo dentro la interface, usabile solo dal default e deve necesssariamente contenere codice al suo interno
    private void privMethod() {
        System.out.println("IMyInterface, privMethod");
    }

    static void myStaticMethod() {
        System.out.println("IMyInterface, myStaticMethod");
    }

    default void myMethod() {
        privMethod();
        System.out.println("IMyInterface, myMethod2");
    }
}
