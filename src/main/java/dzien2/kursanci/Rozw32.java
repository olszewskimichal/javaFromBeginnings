package dzien2.kursanci;

public class Rozw32 {

  public static void main(String[] args) {
    int a = 6;
    Rozw32.evenNumber(a);
  }

  private static void evenNumber(int a) {
    if (a % 2 == 0) {
      System.out.println("Podana liczba jest parzysta.");
    } else {
      System.out.println("Podana liczba nie jest parzysta.");
    }
  }
}