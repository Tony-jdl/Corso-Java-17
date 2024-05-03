package src.method_reference;

public class MyClass {

    static boolean contiene(String s, String sub){
        return (s.indexOf(sub) == -1) ? false : true;
    }

    static boolean uguali(String prima, String seconda){
        return prima.equals(seconda);
    }
}
