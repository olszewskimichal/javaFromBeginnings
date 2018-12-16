package dzien6.exceptions;

public class TryCatchException {

    public static int getNumberOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Nie mozna poda� ujemnej godziny");
        }
        return hour * 3600;
    }

    public static void main(String[] args) {
        int hours = -3;
        int numberOfSeconds = 0;
        try {
            numberOfSeconds = getNumberOfSeconds(hours);
        } catch (IllegalArgumentException exception) {
            System.err.println("Nieprawidłowa wartosc");
            numberOfSeconds = getNumberOfSeconds(hours * -1);
        }
        System.out.println(numberOfSeconds);

    }
}
