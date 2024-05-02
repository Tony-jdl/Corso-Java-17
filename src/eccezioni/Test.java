package src.eccezioni;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //myMethid();

        int x = 5, y = 0, z = 0;

        try {
            z = x / y;
            System.out.println("Tutto ok, z vale: " + z);
        } catch (ArithmeticException e) {
            System.out.println("Divizione per zero!");
        } finally {
            System.out.println("Sono nel blocco finally");
        }
    }

    public static void myMethid() throws IOException {
        int x = 5, y = 0, z = 0;
        z = x / y;
        System.out.println("Tutto ok, z vale: " + z);
    }
}
