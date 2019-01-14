package dzien8.lambda;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerInterfaceExamples {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = (String s) -> System.out.println(s.toUpperCase());
        Consumer<String> stringConsumer2 = (String s) -> System.out.println(s.toLowerCase());
        Consumer<String> stringConsumer1 = (String s) -> System.out.println(Arrays.toString(s.toCharArray()));
        stringConsumer1.accept("abcde");
        stringConsumer.accept("aBcdE");
        stringConsumer2.accept("aBcdE");
    }
}
