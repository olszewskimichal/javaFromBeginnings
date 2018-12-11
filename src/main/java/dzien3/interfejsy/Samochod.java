package dzien3.interfejsy;

public class Samochod implements Pojazd {

    @Override
    public void jazda(int predkosc) {
        System.out.println("Brum brum " + predkosc + "km/h");
    }

    @Override
    public void stop() {
        System.out.println("ABS");
    }
}
