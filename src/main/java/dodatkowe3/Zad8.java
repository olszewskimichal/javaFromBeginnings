package dodatkowe3;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Napisz program który pobierze email od użytkownika a następnie sprawdzi czy podany email jest poprawny.
 */
class Zad8 {
  private static Pattern pattern = Pattern.compile(".+@.+\\..+");

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String email = scanner.next();
    if (pattern.matcher(email).matches()) {
      System.out.println("Prawidlowy email");
    } else {
      System.err.println("To nie jest prawidłowy email");
    }
  }

}
