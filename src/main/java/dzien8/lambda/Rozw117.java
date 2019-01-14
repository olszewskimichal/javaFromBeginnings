package dzien8.lambda;

import java.util.Arrays;
import java.util.List;

public class Rozw117 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("wyraz1", "koniec", "jest", "blisko","blisko");
        list.stream()
                .sorted((o1, o2) -> Integer.compare(o2.length(), o1.length()))
                .map(v -> v.toUpperCase())
                .forEach(v -> System.out.println(v));


        //lista stringow -> przefiltrujmy gdzie string.length>4
        //                  -> map malymi literami
        //                    -> sout
        list.stream()
                .filter(v -> v.length() > 4)
                .peek(v -> System.out.println(v))
                .map(v -> v.toLowerCase())
                .forEach(v -> System.out.println(v));


        long count = list.stream()
                .distinct()
                .count();
        System.out.println(count);

        String s = list.stream()
                .max((o1, o2) -> Integer.compare(o1.length(), o2.length()))
                .orElse("");
        System.out.println(s);

    }
}
