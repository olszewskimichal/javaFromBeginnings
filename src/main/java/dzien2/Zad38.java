package dzien2;

public class Zad38 {

    static void countdownAsc(int n) {
        int i = 0;
        do {
            i++;
            System.out.println("i = " + i);
        } while (i < n);
    }

    public static void main(String[] args) {
        countdownAsc(10);
    }
}
