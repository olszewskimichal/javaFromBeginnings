package dzien2.kursanci;

public class Rozw34 {

  static int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  static double max(double a, double b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public static void main(String[] args) {
    double max = max(1, 2.0);
    System.out.println(max);
  }
}
