package dzien7.rozw109_110;

import java.math.BigDecimal;

public class Pair<T extends Number, V extends Number> {
    public T first;
    public V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<Integer, BigDecimal> pair = new Pair<>(34, BigDecimal.valueOf(34.5));
        System.out.println(pair.first);
        System.out.println(pair.second);
    }
}
