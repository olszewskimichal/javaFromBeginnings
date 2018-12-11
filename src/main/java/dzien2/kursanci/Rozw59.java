package dzien2.kursanci;

public class Rozw59 {
    public static void main(String[] args) {

        System.out.println("ta metoda policzy nam średnią argumentów");
        int a = 14;
        int b = 10;
        double wynik = avg(9, 23, 3, a,b);
        System.out.println("wynik = " + wynik);


    }

    private static double avg(int... liczby) {
        int suma = 0;
        for (int count = 0; count < liczby.length; count++)
            suma += liczby[count];
        return (double) suma / liczby.length;

    }
}
