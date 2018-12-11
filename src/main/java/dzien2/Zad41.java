package dzien2;

public class Zad41 {

    static void countdownAsc(int n) {

        for (int i = 0; i <= n; ++i) {
            System.out.println("i = " + i);
        }
    }

    public static void main(String[] args) {
        countdownAsc(10);
    }
}
