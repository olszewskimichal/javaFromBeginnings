package dodatkowe3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

class Zad15 {

  public static void main(String[] args) throws IOException {
    List<String> lines = Files.readAllLines(Paths.get("dane.txt"));
    System.out.println(countLinesWIthTheSameFirstLetterAndLastLetter(lines));
    System.out.println(countLinesWIthTheSameFirstLetterAndLastLetterInDecimal(lines));
    System.out.println();
    System.out.println(countRisingNumbers2(lines));
    lines.stream()
        .filter(Zad15::isRising2)
        .map(Integer::parseInt)
        .max(Comparator.naturalOrder())
        .ifPresent(System.out::println);
    lines.stream()
        .filter(Zad15::isRising2)
        .map(Integer::parseInt)
        .min(Comparator.naturalOrder())
        .ifPresent(System.out::println);
  }

  static Long countLinesWIthTheSameFirstLetterAndLastLetterInDecimal(List<String> lines) {
    long count = 0L;
    for (String it : lines) {
      if (firstLetterEqualsLastLetter(convertToDecFromOct(it))) {
        count++;
      }
    }
    return count;
  }

  static Long countLinesWIthTheSameFirstLetterAndLastLetter(List<String> lines) {
    long count = 0L;
    for (String line : lines) {
      if (firstLetterEqualsLastLetter(line)) {
        count++;
      }
    }
    return count;
  }

  static Boolean firstLetterEqualsLastLetter(String line) {
    return line.charAt(0) == line.charAt(line.length() - 1);
  }

  static String convertToDecFromOct(String line) {
    return Integer.parseInt(line, 8) + "";
  }

  static Long countRisingNumbers2(List<String> lines) {
    long count = 0L;
    for (String line : lines) {
      if (isRising2(line)) {
        count++;
      }
    }
    return count;
  }

  static Boolean isRising2(String liczba) {
    int last = 0;
    for (char c : liczba.toCharArray()) {
      if (c < last) {
        return false;
      }
      last = c;
    }
    return true;
  }
}
