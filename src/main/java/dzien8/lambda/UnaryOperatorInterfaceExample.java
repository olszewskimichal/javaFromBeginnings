package dzien8.lambda;

import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceExample {
    public static void main(String[] args) {
        DoubleUnaryOperator operator = (double x) -> x * x;
        System.out.println(operator.applyAsDouble(4.0));
        UnaryOperator<Double> function = (Double x) -> x * x;
        System.out.println(function.apply(5.0));

        UnaryOperator<String> operator2 = (String s) -> s.toUpperCase();
        System.out.println(operator2.apply("abc"));
    }
}
