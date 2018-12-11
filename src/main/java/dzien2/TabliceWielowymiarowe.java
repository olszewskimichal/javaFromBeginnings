package dzien2;

public class TabliceWielowymiarowe {

    public static void main(String[] args) {

        int[][] tab = new int[5][4]; // pierwsza liczba to wiersze, druga kolumny
        int[][] tab2 = {{1, 2}, {2, 3, 4}, {2, 3, 2}, {1, 2, 3, 4}};

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = i + j;
            }
        }

        tab[2][1] = (int) (Math.random() * 10);
        int zmienna = tab[2][1];
        System.out.println(zmienna);

        for (int i = 0; i < 100; i++) {
            System.out.println((int) (Math.random() * 10));
        }


        System.out.println(tab2.length);
        System.out.println(tab2[1][2]);

    }

}
