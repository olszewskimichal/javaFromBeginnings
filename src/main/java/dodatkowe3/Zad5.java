package dodatkowe3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Napisz losowanie 6 różnych liczb z zakresu od 5 do 15 ( możesz wykorzystać kolekcje typu Set)
 */
class Zad5 {

  /**
   * Metoda losuje n roznych liczb z podanego przez uzytkownika przedziału
   *
   * @param p początek przedziału z którego ma losować liczby
   * @param k koniec przedziału sposród którego ma losować liczby
   * @param n ile roznych liczb ma wylosować
   * @return Zbiór roznych wylosowanych liczb z przedziału [p,k]
   */
  static Set<Integer> randomDifferentNumbers(int p, int k, int n) {
    Random random = new Random();
    Set<Integer> result = new HashSet<>();
    do {
      result.add(random.nextInt(k - p + 1) + p);
    } while (result.size() != n);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(randomDifferentNumbers(5, 15, 5));
  }

}
