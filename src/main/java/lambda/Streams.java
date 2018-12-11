package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "plum", "pear", "pinapple");
        fruits.stream().filter(s -> s.startsWith("p")).map(s -> s.toUpperCase()).sorted()
                .forEach(v -> System.out.println(v));


        Stream.of("abc", "cde", "efg").forEach(System.out::println);
    }

}
