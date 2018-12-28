package dzien2;

public class Zad42 {

  static void countdownDesc(int n) {
    for (int j = n; j > 0; j--) {
      System.out.println("j = " + j);
    }
  }

  public static void main(String[] args) {
    countdownDesc(10);
  }
}
