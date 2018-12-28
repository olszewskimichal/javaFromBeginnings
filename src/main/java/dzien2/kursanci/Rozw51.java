package dzien2.kursanci;

import java.util.Scanner;

public class Rozw51 {

  public static void main(String[] args) {
    Scanner wejscie = new Scanner(System.in);
    System.out.println("podaj mnie 5 imion");
    String tablica[] = new String[5];
    for (int count = 0; count < 5; count++) {
      tablica[count] = wejscie.nextLine();
    }
    System.out.println("wczytano!");
    for (int count = 0; count < 5; count++) {
      System.out.println("witaj " + tablica[count]);

    }
  }
}
