package src.eccezioni;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        int x = 5, y = 0, z = 0;

//        if(y == 0)
//            throw new ArithmeticException();
//        else {
//            z = x / y;
//            System.out.println("Tutto ok, z vale " + z);
//        }

        try {
            z = x / y;
            System.out.println("Tutto ok, z vale " + z);
        } catch (ArithmeticException e) {
            System.out.println("Divisione per zero!");
            throw e;
        }
    }
}
