package dzien4.zad82;

public class SinCosCalculator {

  private static double sinFromRadians(double radians) {
    return Math.sin(radians);
  }

  private static double sinFromDeegres(double deegres) {
    return Math.sin(Math.toRadians(deegres));
  }

  private static double cosFromRadians(double radians) {
    return Math.cos(radians);
  }

  private static double cosFromDeegres(double deegres) {
    return Math.cos(Math.toRadians(deegres));
  }

  public static void main(String[] args) {
    System.out.println(sinFromDeegres(0));
    System.out.println(cosFromDeegres(0));

  }
}
