package dzien4.zad83;

public class RoundUtils {

  static double round(double value) {
    return Math.round(value);
  }

  static double floor(double value) {
    return Math.floor(value);
  }

  static double ceil(double value) {
    return Math.ceil(value);
  }

  public static void main(String[] args) {
    System.out.println(round(8.49));
    System.out.println(round(8.5));
    System.out.println(ceil(8.2));
    System.out.println(floor(8.8));

  }
}
