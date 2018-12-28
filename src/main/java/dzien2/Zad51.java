package dzien2;

import java.util.Scanner;

public class Zad51 {

  static String[] fillArrayWithNames(int n) {
    String[] tab = new String[n];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
      System.out.println("Podaj imie");
      tab[i] = scanner.nextLine();
    }
    scanner.close();
    return tab;
  }

  static void printArray(String tab[]) {
    for (int i = 0; i < tab.length; i++) {
      System.out.println("Witaj " + tab[i]);
    }
  }

  public static void main(String[] args) {
    String[] arrayWithNames = fillArrayWithNames(3);
    printArray(arrayWithNames);
  }
}
