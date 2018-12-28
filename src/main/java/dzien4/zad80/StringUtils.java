package dzien4.zad80;

public class StringUtils {

  public static String toUpper(String val) {
    return val.toUpperCase();
  }

  public static String toLower(String val) {
    return val.toLowerCase();
  }

  public static String replace(String val, String oldChars, String newChars) {
    return val.replace(oldChars, newChars);
  }

  public static String reverseString(String val) {
    char[] chars = val.toCharArray();
    StringBuilder result = new StringBuilder();
    for (int i = chars.length - 1; i >= 0; i--) {
      result.append(chars[i]);
    }
    return result.toString();
  }

  public static String reverseString2(String val) {
    StringBuilder result = new StringBuilder();
    for (int i = val.length() - 1; i >= 0; i--) {
      result.append(val.charAt(i));
    }
    return result.toString();
  }

  static public void print(String val) {
    char[] charArray = val.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      if (i % 2 == 0) {
        System.out.print(Character.toUpperCase(charArray[i]));
      } else {
        System.out.print(charArray[i]);
      }
    }
    System.out.println();
  }

  static public int sumDigits(int a) {
    char[] chars = String.valueOf(a).toCharArray();
    int sum = 0;
    for (char aChar : chars) {
      sum += (int) aChar - 48;  //48 w ASCII to 0, 49 to 1 itd
    }
    return sum;
  }
}