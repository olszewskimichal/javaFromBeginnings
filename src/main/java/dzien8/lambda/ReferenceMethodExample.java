package dzien8.lambda;

import java.util.Arrays;

public class ReferenceMethodExample {
    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4, 5, 6, 7)
                .forEach(System.out::println);
    }
}
