package dodatkowe3;

/**
 * Napisz program który wyliczy dowolny pierwiastek z liczby np. pierwiastek sześcienny
 */
class Zad1 {

  static double sqrt(double number, double exp) {
    return Math.pow(number, 1 / exp);
  }

  public static void main(String[] args) {
    System.out.println(sqrt(125, 3));
    System.out.println(sqrt(64, 3));
    System.out.println(sqrt(4, 0.5));
  }
}
