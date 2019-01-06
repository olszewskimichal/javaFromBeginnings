package dodatkowe3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Zad14 {

  public static void main(String[] args) throws IOException {
    List<String> lines = Files.readAllLines(Paths.get("napisy.txt"));
    System.out.println(countOddLines(lines));
    System.out.println(countWithTheSameCountOfElements(lines));
    System.out.println(countWithOnlyZero(lines));
    System.out.println(countWithOnlyOne(lines));
    System.out.println(countGroupByLineLength(lines));
  }

  static Map<Integer, Long> countGroupByLineLength(List<String> lines) {
    Map<Integer, Long> map = new HashMap<>();
    for (String line : lines) {
      Integer length = line.length();
      map.merge(length, 1L, Long::sum);
    }
    return map;
  }

  static long countOddLines(List<String> lines) {
    long count = 0L;
    for (String it : lines) {
      if (it.length() % 2 == 0) {
        count++;
      }
    }
    return count;
  }

  static Long countWithTheSameCountOfElements(List<String> lines) {
    long count = 0L;
    for (String it : lines) {
      if (countElements(it, '0').equals(countElements(it, '1'))) {
        count++;
      }
    }
    return count;
  }

  static Long countWithOnlyZero(List<String> lines) {
    long count = 0L;
    for (String it : lines) {
      if (countElements(it, '1') == 0L) {
        count++;
      }
    }
    return count;
  }

  static Long countWithOnlyOne(List<String> lines) {
    long count = 0L;
    for (String it : lines) {
      if (countElements(it, '0') == 0L) {
        count++;
      }
    }
    return count;
  }

  static Long countElements(String line, char sign) {
    long sum = 0L;
    for (char c : line.toCharArray()) {
      if (sign == c) {
        sum++;
      }
    }
    return sum;
  }
}
