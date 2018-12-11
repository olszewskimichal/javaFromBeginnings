import java.math.BigDecimal;
import java.util.Random;

public class Zad88 {

    static Random random = new Random();

    static BigDecimal sumRandomNumbers(int n) {
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < n; i++) {
            sum = sum.add(BigDecimal.valueOf(random.nextDouble()));
        }
        System.out.println("Suma wynosi " + sum);
        return sum;
    }

    static BigDecimal avgRandomNumbers(int n) {
        return sumRandomNumbers(n).divide(BigDecimal.valueOf(n));
    }

    static BigDecimal min(int n) {
        BigDecimal min = BigDecimal.valueOf(Double.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            BigDecimal valueOf = BigDecimal.valueOf(random.nextDouble());
            if (valueOf.compareTo(min) < 0)
                min = valueOf;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(sumRandomNumbers(5));
        System.out.println(avgRandomNumbers(5));
        System.out.println(min(5));

    }
}
