package wielkieLiczby;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimal_Integer {

  public static void main(String[] args) {
    BigDecimal val1 = BigDecimal.ONE;
    BigDecimal val2 = BigDecimal.TEN;
    BigDecimal val3 = BigDecimal.valueOf(34.3);
    System.out.println(val1 + " " + val2 + " " + val3);

    BigInteger val4 = BigInteger.ONE;
    BigInteger val5 = BigInteger.TEN;
    BigInteger val6 = BigInteger.valueOf(34);
    System.out.println(val4 + " " + val5 + " " + val6);
  }

}
