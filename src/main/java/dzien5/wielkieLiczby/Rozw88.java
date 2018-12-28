package dzien5.wielkieLiczby;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Random;

public class Rozw88 {

  public static void main(String[] args) {
    int n = 5;
    BigDecimal tab[] = new BigDecimal[5];
    Random random = new Random();
    for (int i = 0; i < 5; i++) {
      tab[i] = new BigDecimal(random.nextInt(5));
    }
    System.out.println(Arrays.toString(tab));
    System.out.println(sum(tab));
    System.out.println(avg(tab));
    System.out.println(min(tab));
    System.out.println(min2(tab));
  }

  private static BigDecimal sum(BigDecimal tab[]) {
    //BigDecimal sum=new BigDecimal(0);
    BigDecimal sum = BigDecimal.ZERO;
    for (int i = 0; i < tab.length; i++) {
      sum = sum.add(tab[i]);
    }
    return sum;
  }

  private static BigDecimal avg(BigDecimal tab[]) {
    return sum(tab).divide(BigDecimal.valueOf(tab.length), MathContext.DECIMAL128);
  }

  private static BigDecimal min(BigDecimal tab[]) {
    Arrays.sort(tab);
    return tab[0];
  }

  private static BigDecimal min2(BigDecimal tab[]) {
    BigDecimal min = tab[0];
    for (BigDecimal decimal : tab) {
      if (decimal.compareTo(min) < 0) {
        min = decimal;
      }
    }
    return min;
  }

  private static BigDecimal min3(BigDecimal tab[]) {
    BigDecimal min = tab[0];
    for (BigDecimal decimal : tab) {
      min = min.min(decimal);
    }
    return min;
  }
}
