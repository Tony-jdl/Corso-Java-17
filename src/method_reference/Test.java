package src.method_reference;

public class Test {
    public static void main(String[] args) {
        IMyInterface mi = MyClass::new;
        MyClass mc = mi.refmet("Java", true);
        System.out.println(mc);
    }
}
