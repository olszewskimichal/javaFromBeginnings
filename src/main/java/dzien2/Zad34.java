package dzien2;

public class Zad34 {

  static int max(int a, int b) {
    return a > b ? a : b;
  }

  static double max(double a, double b) {
    return a > b ? a : b;
  }

  public static void main(String[] args) {
    int max = max(3, 4);
    System.out.println("max = " + max);
    double max1 = max(3.2, 3.3);
    System.out.println("max1 = " + max1);
  }
}
