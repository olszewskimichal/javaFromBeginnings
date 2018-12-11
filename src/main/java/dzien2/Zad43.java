package dzien2;

public class Zad43 {

    static void printEvenNumbers(int n) {
        for (int i = 0; i <= n; i += 2) {
            System.out.println("i = " + i);
        }
    }

    public static void main(String[] args) {
        printEvenNumbers(10);
    }
}
