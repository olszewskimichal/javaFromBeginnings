package dzien1;

import java.util.Scanner;

public class Zad23 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj znak");
    int result = scanner.nextLine().charAt(0);
    System.out.println(result);
    scanner.close();
  }
}
