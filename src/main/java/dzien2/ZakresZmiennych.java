package dzien2;

public class ZakresZmiennych {

  static int n = 4;

  public static void main(String[] args) {
    System.out.println("Mog� uzywa� zmienna z dzien3.klasy " + n);
    int zmiennaLokalna = 0;
    System.out.println("To jest zmienna lokalna" + zmiennaLokalna);
  }

  static void metoda1() {
    System.out.println("Mog� uzywa� zmienna z dzien3.klasy " + n);
    int zmiennaLokalna = 3;
    System.out.println("To tez jest zmienna lokalna" + zmiennaLokalna);
    {
      int zmiennaLokalna2 = 5; //kolejna zmienna lokalna - dost�pna tylko w tych nawiasach klamrowych
      System.out.println(zmiennaLokalna + " " + zmiennaLokalna2 + " " + n);  //Tu mog� korzysta� z obu zmiennych z tej metody oraz zmienej dzien3.klasy n
    }
    //System.out.println(zmiennaLokalna2);  //ale tu nie mog� uzywa� zmiennej zadeklarowanej w poprzednich nawiasach
  }

}
