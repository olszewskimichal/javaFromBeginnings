package dzien8.lambda;

import java.util.function.BiConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

@FunctionalInterface
interface Multiply {

  void calculate(Integer x, Long y);
}

interface GreetingModule {

  void sayHello();
}

public class LambdaExpressionExample {

  public static void main(String[] args) {
    GreetingModule greetingModule = new GreetingModule() {
      @Override
      public void sayHello() {
        System.out.println("Hello");

      }
    };
    greetingModule.sayHello();

    Runnable hello_world = () -> System.out.println("Hello world");
    hello_world.run();
    DoubleSupplier doubleSupplier = () -> 3.14;
    System.out.println(doubleSupplier.getAsDouble());

    Multiply m = (Integer x, Long y) -> System.out.println(x * y);
    m.calculate(3, 4L);

    UnaryOperator<Integer> square = x -> x * x;
    Supplier<String> someString = () -> "some return value";
    BiConsumer<Integer, Long> multiplier = (Integer x, Long y) -> System.out.println(x * y);

    Integer apply = square.apply(3);
    String string = someString.get();
  }
}