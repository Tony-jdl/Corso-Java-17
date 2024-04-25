package src.classificazioni;

class MyClass {
  private int x, y;

  class InnerClass {
    void messaggio() {
      System.out.println("Inner: " + x + " " + y);
    }
  }

  public void myMethod() {
    InnerClass ic = new InnerClass();
    x = 10;
    y = 20;
    ic.messaggio();
  }

}