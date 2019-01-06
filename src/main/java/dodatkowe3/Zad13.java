package dodatkowe3;

import static java.nio.file.Paths.get;

import java.io.IOException;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Zad13 {

  public static void main(String[] args) throws IOException {
    List<String> lines = Files.readAllLines(get("NAPIS.TXT"));
    System.out.println(countPrimeLines(lines));
    System.out.println(countRisingNumbers3(lines));
    System.out.println(findDuplicates(lines));
  }

  static Set<String> findDuplicates(List<String> lines) {
    final Set<String> setToReturn = new HashSet<>();
    final Set<String> set1 = new HashSet<>();

    for (String yourInt : lines) {
      if (!set1.add(yourInt)) {
        setToReturn.add(yourInt);
      }
    }
    return setToReturn;
  }

  static Long countPrimeLines(List<String> lines) {
    long count = 0L;
    for (String it : lines) {
      if (isPrimeNumber(sumOfAsciiDigit(it))) {
        count++;
      }
    }
    return count;
  }

  static Integer sumOfAsciiDigit(String line) {
    int sum = 0;
    for (char c : line.toCharArray()) {
      sum += c;
    }
    return sum;
  }

  static Boolean isPrimeNumber(Integer n) {
    if (n < 2) {
      return false;
    }
    if (n == 2) {
      return true;
    }
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  static Long countRisingNumbers3(List<String> liczby) {
    long count = 0L;
    for (String s : liczby) {
      if (isRising3(s)) {
        System.out.println(s);
        count++;
      }
    }
    return count;
  }

  static Boolean isRising3(String liczba) {
    int last = 0;
    for (char c : liczba.toCharArray()) {
      if (c <= last) {
        return false;
      }
      last = c;
    }
    return true;
  }
}
