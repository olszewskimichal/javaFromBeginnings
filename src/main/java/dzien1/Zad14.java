package dzien1;

import java.util.Scanner;

public class Zad14 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj 1 liczbe: ");
    int a = scanner.nextInt();
    System.out.println("Podaj 2 liczbe: ");
    int b = scanner.nextInt();

    System.out.println(a + b);
    scanner.close();
  }
}
