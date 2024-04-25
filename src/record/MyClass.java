package src.record;

public class MyClass {
    public static void main(String args[]){
        MyRandom mr1 = new MyRandom();
        //Persona p1 = new Persona("Susanna Verdi", 1982, mr1);
        //mr1.getValore();
        Persona p1 = new Persona(1982);
        System.out.println(p1);
    }
}
