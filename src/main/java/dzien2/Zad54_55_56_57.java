package dzien2;

public class Zad54_55_56_57 {

    static int[][] random2DArray(int wiersz, int kolumna) {
        int tab[][] = new int[wiersz][kolumna];
        for (int i = 0; i < wiersz; i++) {
            for (int j = 0; j < kolumna; j++) {
                tab[i][j] = (int) (Math.random() * 10);
            }
        }
        return tab;
    }

    static void print2DArray(int tab[][]) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int findRowWithTheBiggestAvg(int tab[][]) {
        int row = -1;
        double max = 0;
        for (int i = 0; i < tab.length; i++) {
            int suma = 0;
            for (int j = 0; j < tab[i].length; j++) {
                suma += tab[i][j];
            }
            double avg = (double) suma / tab[i].length;
            if (avg > max) {
                max = avg;
                row = i;
            }
        }
        return row;
    }

    static int[][] replaceRowsWithColumns(int tab[][]) {
        int result[][] = new int[tab[0].length][tab.length];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                result[j][i] = tab[i][j];
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[][] random2dArray = random2DArray(10, 3);
        print2DArray(random2dArray);
        //System.out.println(findRowWithTheBiggestAvg(random2dArray));
        int[][] replaceRowsWithColumns = replaceRowsWithColumns(random2dArray);
        print2DArray(replaceRowsWithColumns);
    }

}
