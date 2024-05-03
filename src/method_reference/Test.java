package src.method_reference;

public class Test {
    public static void main(String[] args) {
        boolean b;
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();

        IMyInterface mi = mc1::contiene;
        b = mi.controlla("Java Language", "Java");
        System.out.println(b);

        mi = mc2::uguali;
        b = mi.controlla("Java", "Pythone");
        System.out.println(b);
    }
}
