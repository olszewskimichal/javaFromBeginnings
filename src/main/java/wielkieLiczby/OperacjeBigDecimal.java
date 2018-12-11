package wielkieLiczby;

import java.math.BigDecimal;

public class OperacjeBigDecimal {
    public static void main(String[] args) {
        BigDecimal result1 = BigDecimal.ONE.add(BigDecimal.TEN);
        System.out.println(result1);
        BigDecimal result2 = BigDecimal.ONE.subtract(BigDecimal.TEN);
        System.out.println(result2);
        BigDecimal result3 = BigDecimal.ONE.multiply(BigDecimal.TEN);
        System.out.println(result3);
        BigDecimal result4 = BigDecimal.ONE.divide(BigDecimal.TEN);
        System.out.println(result4);
    }
}
