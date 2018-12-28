package dzien2.kursanci;

public class Rozw41_42_43 {

  private static void wypiszLiczby(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }

  //zad 42
  private static void wypiszLiczby2(int n) {
    for (int i = n; i > 0; i--) {
      System.out.println(i);
    }
  }

  //zad 43
  private static void wypiszLiczbyParzyste(int n) {
    for (int i = 2; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }

  static void wypisz() {
    int z = 1;
    for (int i = 10; i >= z; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      } else {
        System.out.println("nieparzysta");
      }

    }
  }

  public static void main(String[] args) {
    wypisz();
  }
}
