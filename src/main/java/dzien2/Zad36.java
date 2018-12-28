package dzien2;

public class Zad36 {

  static void countdownDesc(int n) {
    int i = 10;
    while (i > n) {
      System.out.println("i = " + i);
      i--;
    }
  }

  public static void main(String[] args) {
    countdownDesc(0);
  }
}
