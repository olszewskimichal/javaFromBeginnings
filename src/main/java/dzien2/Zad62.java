package dzien2;

public class Zad62 {
    static double avgArray(int tab[]) {

        double sum = 0.0;
        for (int val : tab) {
            sum += val;
        }
        return sum / tab.length;
    }

    public static void main(String[] args) {
        int tab[] = {1, 2, 3, 4};
        System.out.println(avgArray(tab));
    }
}
