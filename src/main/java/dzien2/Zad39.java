package dzien2;

public class Zad39 {

  static void countdownDesc(int n) {
    int i = 10;
    do {
      System.out.println("i = " + i);
      i--;
    } while (i > n);
  }

  public static void main(String[] args) {
    countdownDesc(0);
  }
}
