package dzien2.kursanci;

import java.util.Scanner;

public class Rozw47 {

  static boolean primeNr(int a) {
    if (a < 2) {
      return false;
    }
    for (int i = 2; i < a; i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj liczbę: ");
    int n = sc.nextInt();

    System.out.println("Czy liczba jest pierwsza: " + primeNr(n));
  }
}
