package dzien2.kursanci;

public class Rozw44 {

  static int NWD(int a, int b) {

    while (a != 0 && b != 0) {
      if (a > b) {
        a -= b; //a=a-b
      } else if (b > a) {
        b -= a;
      } else {
        return a;
      }
    }
    return b;
  }

  static int nwd(int a, int b) {
    int c;
    while (b != 0) {
      c = a % b;
      a = b;
      b = c;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(nwd(45, 10));
  }
}
