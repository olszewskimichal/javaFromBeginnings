package dzien6;

import java.util.regex.Pattern;

public class Zad98 {

  private static Pattern pattern = Pattern.compile("\\d\\d-\\d\\d\\d");

  static boolean isCorrectPostCode(String value) {
    return pattern.matcher(value).matches();
  }

  public static void main(String[] args) {
    System.out.println(isCorrectPostCode("85-891"));
    System.out.println(isCorrectPostCode("ab-981"));
    System.out.println(isCorrectPostCode("1-132"));
    System.out.println(isCorrectPostCode("10-123"));
    System.out.println(isCorrectPostCode("1b-134"));
  }
}
