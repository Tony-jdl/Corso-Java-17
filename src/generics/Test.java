package src.generics;

public class Test {
    public static void main(String[] args) {
//        MyClass mc = new MyClass();
//        mc.setObject("Java Language");
//        String s = (String) mc.getObject();
//        System.out.println(s);
//
//        mc.setObject(150);
//        int i = (int) mc.getObject();
//        System.out.println(i);

        MyGeneric<String> genStr = new MyGeneric<>(); // il tio fra le agolate deve essere sempre reference type e non primitivo
        genStr.setObject("Java Language");
        String s = genStr.getObject();
        System.out.println(s);

        MyGeneric<Integer> genInt = new MyGeneric<>();
        genInt.setObject(150);
        int i = genInt.getObject();
        System.out.println(i);
    }
}
