package dzien1;

import java.util.Scanner;

public class Zad19 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj 1 liczb�");
    int a = scanner.nextInt();
    System.out.println("Podaj 2 liczb�");
    int b = scanner.nextInt();

    System.out.println(a > b);
    System.out.println(a == b);
    System.out.println(b >= a);
    System.out.println(a % b == 0);
    scanner.close();
  }
}
