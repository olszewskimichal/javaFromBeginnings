package dzien2;

public class Zad40 {

  static void printOddNumbers(int n) {
    int i = 0;
    do {
      i++;
      if (i % 2 != 0) {
        System.out.println(i);
      }

      //alternatywnie mozna i+=2;
    } while (i < n);
  }

  public static void main(String[] args) {
    printOddNumbers(10);
  }
}
