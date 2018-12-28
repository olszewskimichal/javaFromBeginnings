package dzien2;

public class Zad49 {

  static void printTriangle(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    printTriangle(3);
  }
}
