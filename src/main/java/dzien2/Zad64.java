package dzien2;

import java.util.Scanner;

public class Zad64 {

  static double calculate(double a, double b, Computation operation) {
    return operation.calculate(a, b);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();

    String operation = scanner.next();
    Computation computation = Computation.valueOf(operation);

    System.out.println(calculate(a, b, computation));

  }

  enum Computation {
    MULTIPLY {
      @Override
      public Double calculate(Double a, Double b) {
        return a * b;
      }
    },
    ADD {
      @Override
      public Double calculate(Double a, Double b) {
        return a + b;
      }
    };

    public abstract Double calculate(Double a, Double b);
  }
}
