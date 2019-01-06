package dodatkowe3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Zad16 {

  public static void main(String[] args) throws IOException {
    List<Integer> liczby = Files.readAllLines(Paths.get("cyfry.txt"))
        .stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    System.out.println(countOddNumbers(liczby));
    System.out.println(maxSumOfDigits(liczby));
    System.out.println(minSumOfDigits(liczby));

    System.out.println();
    System.out.println(countRisingNumbers(liczby));
  }

  static Long countRisingNumbers(List<Integer> liczby) {
    return liczby.stream()
        .filter(Zad16::isRising)
        .peek(System.out::println)
        .count();
  }

  static Boolean isRising(Integer liczba) {
    int last = 0;
    for (char c : liczba.toString().toCharArray()) {
      if (c <= last) {
        return false;
      }
      last = c;
    }
    return true;
  }

  static Integer minSumOfDigits(List<Integer> liczby) {
    return liczby.stream().min(
        Comparator.comparing(Zad11::sumOfDigits)
    ).orElse(0);
  }

  static Integer maxSumOfDigits(List<Integer> liczby) {
    return liczby.stream()
        .max(Comparator.comparing(Zad11::sumOfDigits))
        .orElse(0);
  }

  static Long countOddNumbers(List<Integer> liczby) {
    return liczby.stream()
        .filter(it -> it % 2 == 0)
        .count();
  }

}
