package dzien7.generyki;

public class GenerykiExample {

  public static void main(String[] args) {
    GenerycznaWalizka<String> walizka = new GenerycznaWalizka<>();
    walizka.setPrzedmiot("abc");

    GenerycznaWalizka<Integer> walizka2 = new GenerycznaWalizka<>();
    walizka2.setPrzedmiot(34);
  }

}
