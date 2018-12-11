package dzien3.klasy;

public class Klasy {
    public static void main(String[] args) {
        PrzykladowaKlasa klasa = new PrzykladowaKlasa();
        klasa.pole2 = "345";

        System.out.println(klasa);
        klasa.setPole1("pole1");
        System.out.println(klasa);

        PrzykladowaKlasa przykladowaKlasa = new PrzykladowaKlasa("a", "b", "c", "d");
        System.out.println(przykladowaKlasa);
    }
}
