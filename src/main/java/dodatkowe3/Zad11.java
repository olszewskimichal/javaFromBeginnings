package dodatkowe3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Zad11 {

  public static void main(String[] args) throws IOException {
    List<Integer> liczby = new ArrayList<>();
    for (String s : Files.readAllLines(Paths.get("liczby.txt"))) {
      Integer parseInt = Integer.parseInt(s);
      liczby.add(parseInt);
    }
    theBiggestOddNumber(liczby);
    System.out.println(findPalindromeNumbers(liczby));

    System.out.println(findNumbersWithSumOfDigitsBiggerThen30(liczby));
    System.out.println(sumOfDigitsFromNumberList(liczby));
  }


  static boolean isPalindromNumber(Integer number) {
    return number.toString().equals(new StringBuilder(number.toString()).reverse().toString());
  }


  static Integer sumOfDigitsFromNumberList(List<Integer> numbers) {
    int sum = 0;
    for (Integer number : numbers) {
      Integer v = sumOfDigits(number);
      int i = v;
      sum += i;
    }
    return sum;
  }

  static List<Integer> findNumbersWithSumOfDigitsBiggerThen30(List<Integer> numbers) {
    List<Integer> list = new ArrayList<>();
    for (Integer it : numbers) {
      if (sumOfDigits(it) > 30) {
        list.add(it);
      }
    }
    return list;
  }

  static void theBiggestOddNumber(List<Integer> numbers) {
    boolean seen = false;
    Integer best = null;
    for (Integer it : numbers) {
      if (it % 2 == 0) {
        if (!seen || it.compareTo(best) > 0) {
          seen = true;
          best = it;
        }
      }
    }
    Integer result = seen ? best : -1;
    System.out.println(result);
  }

  static Integer sumOfDigits(Integer number) {
    char[] chars = number.toString().toCharArray();
    int sum = 0;
    for (char c : chars) {
      sum += c - 48;
    }
    return sum;
  }

  static List<Integer> findPalindromeNumbers(List<Integer> numbers) {
    List<Integer> list = new ArrayList<>();
    for (Integer number : numbers) {
      if (isPalindromNumber(number)) {
        list.add(number);
      }
    }
    return list;
  }
}
