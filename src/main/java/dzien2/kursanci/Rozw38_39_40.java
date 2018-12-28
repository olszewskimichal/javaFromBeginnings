package dzien2.kursanci;

import java.util.Scanner;

public class Rozw38_39_40 {

  static void od1do10(int a) {
    do {
      a++;
      System.out.println("a = " + a);
    } while (a < 10);
  }

  static void od10do0(int b) {
    do {
      System.out.println("b = " + b);
      b--;
    } while (b >= 1);
  }

  static void od1do10parzyste(int c) {
    do {
      if (c % 2 == 0) {
        System.out.println("c = " + c);
      }
      c++;
    } while (c <= 10);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj a");
    int a = in.nextInt();
    od1do10(a);
    System.out.println("Podaj b");
    int b = in.nextInt();
    od10do0(b);
    System.out.println("Podaj c");
    int c = in.nextInt();
    od1do10parzyste(c);

  }
}
