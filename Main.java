class Main {
  public static void main(String[] args) {
    
    ContoCorrente c1 = new ContoCorrente();

    c1.deposito(500);
    System.out.println(c1.saldo());

    c1.prelievo(200);
    System.out.println(c1.saldo());

    MyStaticClass staticClass = new MyStaticClass();
    MyStaticClass staticClass2 = new MyStaticClass();
    System.out.println(MyStaticClass.x + " " + MyStaticClass.y);

/**************************************************************************/
    
    /* 
    definizione di array -> int myArray[] = new int[5]

    int x = myArray[2] -> accedo al valore di indice 2 del mio myArray

    Array Multidimensionali, array che contiene altri array
    int myArray[][] = new Array[2][5]

    Array irregolare
    int myArray[][] = new int[3][] -> si specifica il numero di righe ma non di colonne

    Loop fatto apposta per ciclare gli array. Scorre direttamente               l'elemento senza usare l'indice. Permette la sola LETTURA del valore

      int[] myArray = {0,2,4,6,8}

      for(int wl : myArray) {
        System.out.println(el);
      }

    */

    System.out.println("Inizio Sezione 9: Gli Array e le Stringhe");

    int[][] myArray = {
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12}
    };

    for(int x[] : myArray) {
      for(int y : x) {
        System.out.println(y);
      }
    }



    /*
    Metodi a lunghezza variabile
    Questa classe accetta con input nel suo metodo un numero di parametri a lunghezza variabile.

    Si possono usare anche altri paramentri oltre al vargs a patto che questo sia l'ultimo dei paramentri dichiarati nella firma del metodo, esempio:
    void vargs(char c, boolean b, int ... arg) { }
    */
    System.out.println("Inizio metodi a lunghezza variabile");
    MyClassVargs mcv = new MyClassVargs();
    mcv.vargs(1,2,3,4,5);
    mcv.vargs(6,7,8);
    mcv.vargs(9,10);
    mcv.vargs(9.0,10.2);
    mcv.vargs();
    System.out.println("Fine metodi a lunghezza variabile");

    /* Il metodo main è un metodo speciale che rende la classe eseguibile e quindi genera un bytecode eseguibile dalla java virtual machine.
    Deve essere public per la visibilità fuori, poi deve essere static per essere visibile solo all'interno della classe principale*/
  
    System.out.println("Fine Sezione 9: Gli Array e le Stringhe");
    /**************************************************************************/
    System.out.println("Inizio Sezione 10: Ereditarietà");
    /*
    All'inteerno della sottoclasse posso usare i membri della super classe
    */

    //BClass bc = new BClass();
    //bc.viewAttr();
    //BClass bc2 = new BClass("Script", false);
    //bc2.viewAttr();

    //CClass cc = new CClass("Primo", "Secondo", "Terzo");
    //System.out.println(cc.ast + " " + cc.bst + " " + cc.cst);

    AClass a = new AClass();
    BClass b = new BClass();
    b = a;
    a.aMethod();
    b.bMethod();

    /* 
    classe Object è la classe base di ogni classe Java esistente o che creiamo noi.
    */
    
    System.out.println("Fine Sezione 10: Ereditarietà");
    /**************************************************************************/

    /* 
    I Record

    tipo speciale introdotta con Java 16.
    è una forma speciale di classe, una volta creata l'istanza di un record essa è immutabile, può essere solo letta.

    record nomeRecord(lista-componenti) {
      //body del record (opzionale)
    }

    ES:
    record Persona(String nome, int annoNascita) {}

    Persona p1 = new Persona("Susanna Verdi", 1982);
    */
    System.out.println("Inizio Sezione 11: I Record (JDK16)");
  
    System.out.println("Fine Sezione 11: I Record (JDK16)");
    /**************************************************************************/
    
  }
}