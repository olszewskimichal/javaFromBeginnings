package dzien2.kursanci;

import java.util.Scanner;

public class Rozw49 {

  public static void main(String[] args) {
    Scanner wprowadzona = new Scanner(System.in);
    System.out.println("podaj mnie liczbe");
    int podana = wprowadzona.nextInt();

    for (int count = 1; count <= podana; count++) {
      for (int count0 = 0; count0 < count; count0++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
