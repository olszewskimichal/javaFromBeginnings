package dodatkowe3;

import java.util.Scanner;
import java.util.regex.Pattern;

class Zad9 {

  /**
   * (			                #   Start of group
   * (?=.*\d)		          #   must contains one digit from 0-9
   * (?=.*[!@#$%^&*()])		#   must contains one special symbols in the list "!@#$%^&*()"
   * (?=\S+$)             #   no whitespace allowed in the entire string
   * .		                #   match anything with previous condition checking
   * {8,}	              #   length at least 8 characters
   * )			                #   End of group
   */
  private static Pattern pattern = Pattern.compile("((?=.*\\d)(?=.*[!@#$%^&*()])(?=\\S+$).{8,})");

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String password = scanner.next();
    if (pattern.matcher(password).matches()) {
      System.out.println("Prawidlowy haslo");
    } else {
      System.err.println("Twoje hasło jest zbyt proste");
    }
  }

}
