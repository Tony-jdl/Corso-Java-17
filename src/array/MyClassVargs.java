package src.array;

public class MyClassVargs {
  public void vargs(int... arg) {
    System.out.print("Parametri: ");
    for (int a : arg) {
      System.out.print(a + " ");
    }
    System.out.println();
  }

  public void vargs(double... arg) {
    System.out.print("Parametri: ");
    for (double a : arg) {
      System.out.print(a + " ");
    }
    System.out.println();
  }
}