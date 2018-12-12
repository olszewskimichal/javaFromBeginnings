import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;

public class Zad88 {

  private static Random random = new Random();

  static BigDecimal sumRandomNumbers(BigDecimal tab[]) {
    BigDecimal sum = BigDecimal.ZERO;
    for (BigDecimal bigDecimal : tab) {
      sum = sum.add(bigDecimal);
    }
    System.out.println("Suma wynosi " + sum);
    return sum;
  }

  static BigDecimal avgRandomNumbers(BigDecimal[] tab) {
    BigDecimal sumRandomNumbers = sumRandomNumbers(tab);
    BigDecimal divider = BigDecimal.valueOf(tab.length);
    return sumRandomNumbers.divide(divider, 2, RoundingMode.HALF_EVEN);
  }

  static BigDecimal min(BigDecimal[] tab) {
    BigDecimal min = BigDecimal.valueOf(Double.MAX_VALUE);
    for (BigDecimal bigDecimal : tab) {
      if (bigDecimal.compareTo(min) < 0) {
        min = bigDecimal;
      }
    }
    return min;
  }

  static BigDecimal max(BigDecimal[] tab) {
    BigDecimal max = BigDecimal.valueOf(Double.MIN_VALUE);
    for (BigDecimal bigDecimal : tab) {
      if (bigDecimal.compareTo(max) > 0) {
        max = bigDecimal;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    BigDecimal[] tab = new BigDecimal[6];
    for (int i = 0; i < tab.length; i++) {
      tab[i] = BigDecimal.valueOf(random.nextInt(10));
    }
    System.out.println("tab = " + Arrays.toString(tab));
    System.out.println(sumRandomNumbers(tab));
    System.out.println(avgRandomNumbers(tab));
    System.out.println(min(tab));
    System.out.println(max(tab));
  }
}
