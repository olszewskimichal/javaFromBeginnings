package dzien1;

public class Zad26 {

  public static void main(String[] args) {
    int a = 5;
    int b = 4;
    int c = 2;

    if (a > b) {
      if (a > c) {
        System.out.println("Max = A");
      } else {
        System.out.println("Max = C");
      }
    } else if (b > c) {
      System.out.println("Max = B");
    } else {
      System.out.println("Max = C");
    }
  }
}
