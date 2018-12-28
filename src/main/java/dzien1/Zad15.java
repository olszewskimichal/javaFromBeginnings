package dzien1;

import java.util.Scanner;

public class Zad15 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj ile masz lat");
    int wiek = Integer.valueOf(scanner.nextLine());
    System.out.println("Podaj Imie");
    String imie = scanner.nextLine();
    System.out.println("Podaj nazwisko");
    String nazwisko = scanner.nextLine();

    System.out.println(String.format("Witaj %s %s lat %s", imie, nazwisko, wiek));
    scanner.close();
  }
}
