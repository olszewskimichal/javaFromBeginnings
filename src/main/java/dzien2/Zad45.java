package dzien2;

public class Zad45 {

    public static int sumaDzielnikow(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) suma += i;
        }
        return suma;
    }
}
