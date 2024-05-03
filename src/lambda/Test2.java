package src.lambda;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(" Lambda Expression come argomento di un metodo");
        int[] a = {10,5,20};
        int res;
        res = myMethod(a,(n) -> {
           int i = 0;
           for (int value : n)
               i += value;
           return i;
        });
    }
    static int myMethod(int[] a, IMyInterface2 mi){
        return mi.elabora(a);
    }
}
