import java.math.BigDecimal;

public class Zad110 {
    public static void main(String[] args) {
        Pair2<Integer, BigDecimal> para = new Pair2<Integer, BigDecimal>(1, BigDecimal.valueOf(1));
        System.out.println(para);
    }
}

class Pair2<T extends Number, S extends Number> {
    private T first;
    private S second;

    public Pair2(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair [first=" + first + ", second=" + second + "]";
    }

}