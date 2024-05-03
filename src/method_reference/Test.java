package src.method_reference;

public class Test {
    public static void main(String[] args) {
        boolean b = prova(MyClass::contiene, "Java Language", "Language");
        System.out.println(b);

        b = prova(MyClass::uguali, "Java", "Pythone");
        System.out.println(b);
    }

    static boolean prova(IMyInterface mi, String sa, String sb){
        return mi.controlla(sa,sb);
    }
}
