package dzien5;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ArithmeticExceptionExample {

  public static void main(String[] args) {
    BigDecimal bigDecimal = BigDecimal.valueOf(1);
    BigDecimal bigDecimal1 = BigDecimal.valueOf(3);
    try {
      System.out.println(bigDecimal.divide(bigDecimal1));
    } catch (ArithmeticException e) {
      System.out.println(bigDecimal.divide(bigDecimal1, 10, RoundingMode.HALF_EVEN));
      System.out.println(bigDecimal.divide(bigDecimal1, MathContext.DECIMAL128));
    }
  }
}
