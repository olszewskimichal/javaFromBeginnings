package dzien8.lambda;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionInterfaceExamples {
    public static void main(String[] args) {
        ToIntFunction<String> function = (String string) -> string.length();
        Function<String, Integer> function1 = (String string) -> string.length();

        System.out.println(function.applyAsInt("ABCDE"));
        System.out.println(function1.apply("ABCDE"));

        Function<Integer, Boolean> integerFilter = (Integer value) -> value % 2 == 0;
        System.out.println(integerFilter.apply(67));

        Function<Integer, String> function2 = (Integer wiek) -> "Mam lat " + wiek;
        Function<String,Integer> function3 = (String s) -> s.length();
        Function<Integer, Integer> function4 = function2.andThen(function3);
        Integer apply = function4.apply(39);
        System.out.println(apply);
    }

    String ileMamLat(int wiek) {
        return "Mam lat " + wiek;
    }
}
