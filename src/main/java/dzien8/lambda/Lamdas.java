package dzien8.lambda;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;

import static java.lang.Integer.*;

public class Lamdas {
    public static void main(String[] args) {
        Runnable hello_world1 = () -> System.out.println("Hello world");
        Runnable hello_world = () -> System.out.println("Hello world");
        IntSupplier supplier = () -> {
            return 88;
        };
        IntBinaryOperator intBinaryOperator = (int a, int b) -> a + b;
        Consumer<String> stringConsumer = (String c) -> c.toUpperCase();
        hello_world.run();
        hello_world.run();
        int asInt = supplier.getAsInt();
        System.out.println(asInt);
        int applyAsInt = intBinaryOperator.applyAsInt(1, 3);
        System.out.println(applyAsInt);


        Comparator<String> comparator = (o1, o2) -> {
            return compare(o1.length(), o2.length());
        };
        int compare = comparator.compare("abc", "abcd");
        System.out.println(compare);
    }
}
