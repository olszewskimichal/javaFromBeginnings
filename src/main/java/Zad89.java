import java.math.BigInteger;

public class Zad89 {

  private static BigInteger silnia(long val) {
    BigInteger bigInteger = BigInteger.ONE;
    for (int i = 1; i <= val; i++) {
      bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
    }
    return bigInteger;
  }

  public static void main(String[] args) {
    System.out.println(silnia(5));
    System.out.println(silnia(10));
  }
}
