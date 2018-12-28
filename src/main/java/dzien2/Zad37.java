package dzien2;

public class Zad37 {

  static void printEvenNumbers(int n) {
    int i = 0;
    while (i < n) {
      i++;
      if (i % 2 == 0) {
        System.out.println(i);
      }

      //alternatywnie mozna i+=2;
    }
  }

  public static void main(String[] args) {
    printEvenNumbers(10);
  }
}
