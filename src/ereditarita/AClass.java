package src.ereditarita;

public class AClass {
  void aMethod() {
    System.out.println("Eseguito aMethod()");
  }

  /* 
  si usa per creare dei modelli di classi o metodi che permettono la creazione di sottoclassi con la stessa struttura ma con la logica al loro interno personalizzata
  abstract src AClass {
    abstract myMethod();  
  }
  */

  /* 
  final permette di creare costanti, impedire override dei metodi e specalizzazione delle classi

  src AClass {
  final void aMethod() {
    System.out.println("Eseguito aMethod()");
  }
  */
}