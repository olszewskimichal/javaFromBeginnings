package dzien2;

public class Zad50 {

    /**
     * *
     * **
     * ***
     */
    static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

    }

    static void printTriangle2(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printTriangle2(3);
    }
}
