package src.generics;

public class Test {
    public static void main(String[] args) {
        double d;
        d = AClass.half(10.7);
        System.out.println("double " + d);
        d = AClass.half(10);
        System.out.println("int " + d);
        d = AClass.half((byte) 60.6);
        System.out.println("byte " + d);
    }
}
