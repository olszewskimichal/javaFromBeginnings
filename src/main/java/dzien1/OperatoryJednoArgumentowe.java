package dzien1;

public class OperatoryJednoArgumentowe {

  public static void main(String[] args) {

    int v = 1;
    int v1 = -v;

    System.out.println(v + " a liczba przeciwna to " + v1);

    int v2 = 0;
    v2++;
    System.out.println("v2 po post-inkrementacji wynosi = " + v2);

    int v3 = v2++;
    System.out.println("v2 = " + v2 + " a v3 =" + v3);

    v3--;
    System.out.println("po dekrementacji v3 = " + v3);
  }

}
