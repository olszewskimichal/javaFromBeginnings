package dzien2;

public class Zad46 {

    static int findNumberWithTheBiggestSumOfDividers(int n) {
        int max = 0;
        int maxSuma = 0;
        for (int i = 1; i <= n; i++) {
            int sumaDzielnikow = Zad45.sumaDzielnikow(i);
            if (sumaDzielnikow > maxSuma) {
                max = i;
                maxSuma = sumaDzielnikow;
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
