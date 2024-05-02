package src.generics;

public class Test {
    public static void main(String[] args) {
        new AClass(10);
        new AClass("Java");
        new AClass(true);
        new AClass(new BClass());
    }
}
