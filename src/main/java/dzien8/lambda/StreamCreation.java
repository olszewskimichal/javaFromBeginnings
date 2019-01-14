package dzien8.lambda;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        String a = "cccccccc";
        String b = "bbb";
        String c = "aaaa";

        Stream.of(a, b, c)
                .sorted()
                .forEach(v -> System.out.println(v));

        long count = Stream.of(1, 2, 3, 4).count();
        System.out.println(count);

        IntStream.range(1, 10).forEach(v -> System.out.println(v));
        IntStream.rangeClosed(1, 10).forEach(v -> System.out.println(v));
    }
}
