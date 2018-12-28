package dzien1;

import java.util.Scanner;

public class Zad16 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe ");
    int value = scanner.nextInt();

    System.out.println("Warto�� przeciwna to " + (-value));
    scanner.close();
  }
}
