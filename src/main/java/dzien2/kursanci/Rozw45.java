package dzien2.kursanci;

public class Rozw45 {

  public static int sumOfDividers(int a) {
    int sum = 0;
    for (int i = a; i > 0; i--) {
      if (a % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sumOfDividers(10));
  }
}
