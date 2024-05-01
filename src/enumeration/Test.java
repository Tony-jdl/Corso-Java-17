package src.enumeration;

public class Test {
    public static void main(String[] args) {
        Taglia m = Taglia.MEDIUM;
        Taglia s = Taglia.SMALL;

        if(m == s)
            System.out.println("m e s sono uguali");
        else
            System.out.println("m e s sono diversi");

        Taglia t = Taglia.MEDIUM;
        System.out.println(Taglia.MEDIUM.getValore());
    }
}
