package dzien1;

public class Zad28 {

  public static void main(String[] args) {
    int a = 3;
    int b = 4;
    int c = 5;
    if (a + b > c && a + c > b && b + c > a) {
      double p = 0.5 * (a + b + c);
      double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
      System.out.println(result);
    } else {
      System.out.println("Trojk�t o podanych bokach nie moze istnie�");
    }
  }
}
