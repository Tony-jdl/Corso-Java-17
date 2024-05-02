package src.generics;

public class Test {
    public static void main(String[] args) {
        MyGeneric<String, Boolean> gen = new MyGeneric<>("Java", true);
        String s = gen.getT();
        boolean b = gen.getV();
        System.out.println(s + " " + b);
    }
}
