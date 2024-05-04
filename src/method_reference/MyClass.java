package src.method_reference;

public class MyClass {
    private String s;
    private boolean b;

    public MyClass(String s, boolean b){
        this.s = s;
        this.b = b;
    }

    @Override
    public String toString(){
        return s + " " + b;
    }
}
