package dzien6.exceptions;

import java.io.IOException;

public class Throw {

  public static int getNumberOfSeconds(int hour) {
    if (hour < 0) {
      throw new IllegalArgumentException("Nie mozna poda� ujemnej godziny");
    }
    return hour * 3600;
  }

  public static void test() throws IOException {
    throw new IOException("Nie mozna poda� ujemnej godziny");
  }

  public static void test2() {
    throw new NullPointerException("aa");
  }

  public static void main(String[] args) {
    test2();
    System.out.println("adasdas");
  }
}
