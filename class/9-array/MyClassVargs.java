class MyClassVargs {
  void vargs(int ... arg) {
    System.out.print("Parametri: ");
    for (int a : arg) {
      System.out.print(a + " ");
    }
    System.out.println();
  }

  void vargs(double ... arg) {
    System.out.print("Parametri: ");
    for (double a : arg) {
      System.out.print(a + " ");
    }
    System.out.println();
  }
}