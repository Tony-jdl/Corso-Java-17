package src.method_reference;

public class MyClass {

    boolean contiene(String s, String sub){
        return (s.indexOf(sub) == -1) ? false : true;
    }

    boolean uguali(String prima, String seconda){
        return prima.equals(seconda);
    }
}
