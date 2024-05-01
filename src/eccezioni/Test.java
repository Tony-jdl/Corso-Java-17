package src.eccezioni;

public class Test {
    public static void main(String[] args) {
        int x = 5, y = 0, z = 0;

        try {
            z = x / y;
            System.out.println("Tutto ok, z vale: " + z);
        } catch (ArithmeticException e) {
            System.out.println("Divizione per zero!");
        }
        System.out.println("Uscito da try/catch");
    }
}
