package dodatkowe3;


class Zad4 {

  public static void main(String[] args) {
    System.out.println(cutFirst5LettersFromString("abcdefgh"));
    System.out.println(cutFirst5LettersFromString("abcd"));
  }

  static String cutFirst5LettersFromString(String argument) {
    if (argument.length() < 5) {
      throw new IllegalArgumentException("Podany ciąg znaków jest za krótki");
    }
    return argument.substring(0, 5);
  }

}
