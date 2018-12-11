package dzien3.interfejsy;

public interface Pojazd {

    void jazda(int predkosc);

    void stop();

    default String getName() {
        return "Pojazd";        //Wg. twórców ma to zapobiec sytuacjom gdy interfejs ma wiele implementacji i zostanie dodana metoda która dla wielu z nich będzie taka sama. Nie trzeba wtedy refaktorować wielu klas i wystarczy dodać metodę domyślną.
    }
}