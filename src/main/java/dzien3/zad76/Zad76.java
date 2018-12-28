package dzien3.zad76;

public class Zad76 {

  static double average(Measurable[] objects) {
    double sum = 0.0;
    for (Measurable measurable : objects) {
      sum += measurable.getMeasure();
    }
    return sum / objects.length;
  }

  public static void main(String[] args) {
    Measurable tab[] = {new Employee(123), new Employee(345)};
    System.out.println(average(tab));
  }
}
