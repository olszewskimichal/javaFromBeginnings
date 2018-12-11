package dzien2;

public class Zad59 {

    static double avg(int... numbers) {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println(avg(1, 2, 3, 4));
    }

}
