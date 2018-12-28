package dzien3.matematyka.geometria;

public class Zad69 {

  public static void main(String[] args) {
    LiczbaZespolona liczbaZespolona = new LiczbaZespolona(1, 1);
    LiczbaZespolona liczbaZespolona2 = new LiczbaZespolona(2, 2);

    liczbaZespolona.add(liczbaZespolona2);
    System.out.println(liczbaZespolona);

    LiczbaZespolona result = LiczbaZespolona.add(liczbaZespolona, liczbaZespolona2);
    System.out.println(result);
  }
}
