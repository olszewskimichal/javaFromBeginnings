package dzien5.wielkieLiczby;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperacjeBigDecimal {

  public static void main(String[] args) {
    BigDecimal result1 = BigDecimal.ONE.add(BigDecimal.TEN);
    System.out.println(result1);
    BigDecimal result2 = BigDecimal.ONE.subtract(BigDecimal.TEN);
    System.out.println(result2);
    BigDecimal result3 = BigDecimal.ONE.multiply(BigDecimal.TEN);
    System.out.println(result3);
    BigDecimal result4 = BigDecimal.ONE.divide(BigDecimal.TEN, 2, RoundingMode.HALF_EVEN);
    System.out.println(result4);
    BigDecimal one = BigDecimal.ONE;
    BigDecimal zero = BigDecimal.ZERO;
    System.out.println(one.compareTo(zero));
  }
}
