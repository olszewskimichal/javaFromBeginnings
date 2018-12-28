package dzien2;

public class Varargs {

  static int sum(int... numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }

  static int sum2(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    ;
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3, 4));
  }

}
