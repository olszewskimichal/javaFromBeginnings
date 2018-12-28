package dzien3.interfejsy;

public class Rower implements Pojazd {

  @Override
  public void jazda(int predkosc) {
    System.out.println("Ziuuuu rowerkiem " + predkosc);
  }

  @Override
  public void stop() {
    System.out.println("Hamowanie");
  }
}
