package dodatkowe3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Zad10 {

  public static void main(String[] args) throws IOException {
    List<String> strings = Files.readAllLines(Paths.get("slowa.txt"));
    List<String> palindroms = filterLinesForPalindroms(strings);
    Files.write(Paths.get("palindrom.txt"), palindroms);
  }

  static List<String> filterLinesForPalindroms(List<String> lines) {
    List<String> palindromes = new ArrayList<>();
    for (String line : lines) {
      if (isPalindrom(line)) {
        palindromes.add(line);
      }
    }
    return palindromes;
  }

  static boolean isPalindrom(String line) {
    return new StringBuilder(line).reverse().toString().equals(line);
  }

}
