package dzien2;

public class Zad50Trojkat {
    public static void main(String[] args) {
        int n = 3;
        fancyTriangle(n);
    }


    private static void fancyTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("_");
            }
            for (int k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
