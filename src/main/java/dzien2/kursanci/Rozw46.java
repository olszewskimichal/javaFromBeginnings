package dzien2.kursanci;

public class Rozw46 {
    static int sd(int a) { //45
        int c = 0;
        for (int b = a; b > 0; b--) {
            if (a % b == 0) {
                c += b;
            }
        }
        return c;
    }

    static int liczbaZNajwiekszSumaDzielnikow(int n) { //46
        int sumadzielnikow = sd(n);
        int wynik = n;
        for (int i = 1; i < n; i++) {
            if (sd(i) > sumadzielnikow) {
                wynik = i;
                sumadzielnikow = sd(i);
            }
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println(liczbaZNajwiekszSumaDzielnikow(10));
    }
}
