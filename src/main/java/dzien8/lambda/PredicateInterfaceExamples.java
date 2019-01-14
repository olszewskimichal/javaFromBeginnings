package dzien8.lambda;

import java.util.function.Predicate;

public class PredicateInterfaceExamples {
    public static void main(String[] args) {

        Predicate<Integer> filter = (Integer val) -> val % 2 == 0;
        System.out.println(filter.test(34));
        System.out.println(filter.test(35));

        oddNumbers();
        evenNumbers();
        evenNumbersBiggetThen4();

        printNumbers((Integer v) -> v % 2 == 0);
        printNumbers((Integer v) -> v % 2 != 0);
        printNumbers((Integer v) -> v > 4 && v % 2 == 0);
    }

    static void printNumbers(Predicate<Integer> predicate) {
        for (int i = 0; i < 10; i++) {
            if (predicate.test(i)) System.out.println(i);
        }
    }

    static void oddNumbers() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }

    static void evenNumbers() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    static void evenNumbersBiggetThen4() {
        for (int i = 0; i < 10; i++) {
            if (i > 4 && i % 2 == 0) System.out.println(i);
        }
    }
}
