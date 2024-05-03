package src.lambda;

public class Test {
    public static void main(String[] args) {
        IMyInterface mi1 = (n) -> n > 0;
        IMyInterface mi2 = (n) -> (n%2) == 0;
        IMyInterface mi3 = (n) -> ((n%2) == 0 && n > 0);

        System.out.println(mi1.controlla(11));
        System.out.println(mi2.controlla(11));
        System.out.println(mi3.controlla(10));

        System.out.println("**********\n**********");

        System.out.println("Lambda Expression con Blocco di Codice");
        IMyInterface2 mi_1 = (n) -> {
            int i = 0;
            for (int value : n)
                i += value;
            return i;
        };
        int[] a = {10,5,20};
        System.out.println(mi_1.elabora(a));
    }
}
