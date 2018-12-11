package dzien2;

public class Zad48 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(i * j + "\t");
            System.out.println();
        }
    }
}
