package dzien3.interfejsy;

public class InterfejsyPrzyklady {

  public static void main(String[] args) {
    Pojazd pojazd = new Rower();

    pojazd.jazda(30);
    pojazd.stop();
    System.out.println(pojazd.getName());
  }
}
