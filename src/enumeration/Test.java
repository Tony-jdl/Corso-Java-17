package src.enumeration;

public class Test {
    public static void main(String[] args) {
        Taglia m = Taglia.MEDIUM;
        int ord = m.ordinal();
        System.out.println(ord);
        int pos = m.compareTo(Taglia.LARGE);
        System.out.println(pos);
    }
}
