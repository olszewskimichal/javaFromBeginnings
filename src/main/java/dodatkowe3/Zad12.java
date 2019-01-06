package dodatkowe3;

import static dodatkowe3.Zad11.sumOfDigits;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Zad12 {

  public static void main(String[] args) throws IOException {
    List<Pair> pary = new ArrayList<>();
    for (String s : Files.readAllLines(Paths.get("PARY_LICZB.TXT"))) {
      Pair pair = mapLineToPairOfInts(s);
      pary.add(pair);
    }
    System.out.println(countWielokrotnosci(pary));
    System.out.println(countNWD(pary));
    System.out.println(countPairsWithTheSameSumOfDigits(pary));
  }

  static Long countPairsWithTheSameSumOfDigits(List<Pair> pairs) {
    return pairs.stream().filter(Zad12::theSameSumOfDigits).count();
  }

  static Boolean theSameSumOfDigits(Pair pair) {
    return sumOfDigits(pair.first).equals(sumOfDigits(pair.second));
  }

  static Long countNWD(List<Pair> pairs) {
    long count = 0L;
    for (Pair it : pairs) {
      if (NWD(it) == 1) {
        count++;
      }
    }
    return count;
  }

  static Integer NWD(Pair pair) {
    Integer a = pair.first;
    Integer b = pair.second;

    while (!a.equals(b)) {
      if (a > b) {
        a -= b;
      } else {
        b -= a;
      }
    }
    return a;
  }

  static Long countWielokrotnosci(List<Pair> pairs) {
    long count = 0L;
    for (Pair pair : pairs) {
      if (isWielokrotnosc(pair)) {
        count++;
      }
    }
    return count;
  }

  static Pair mapLineToPairOfInts(String line) {
    String[] split = line.split(" ");
    return new Pair(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
  }

  static Boolean isWielokrotnosc(Pair pair) {
    return ((double) pair.first / pair.second) % 1 == 0.0 || ((double) pair.second / pair.first) % 1 == 0.0;
  }

  static class Pair {

    private final Integer first;
    private final Integer second;

    Pair(Integer first, Integer second) {
      this.first = first;
      this.second = second;
    }
  }
}
