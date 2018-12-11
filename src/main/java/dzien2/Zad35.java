package dzien2;

public class Zad35 {

    static void countdownAsc(int n) {
        int i = 0;
        while (i < n) {
            i++;
            System.out.println("i = " + i);
        }
    }

    public static void main(String[] args) {
        countdownAsc(10);
    }
}
