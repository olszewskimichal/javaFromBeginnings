package dzien2;

import java.util.Arrays;

public class Zad58 {
    public static void main(String[] args) {
        int tab[] = {3, 2, 1, 4, 5};
        int tab2[] = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.equals(tab, tab2));

        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.binarySearch(tab, 3)); // wyszukuje element w tablicy i podaje na jakim miejscu si�

        int tab2d[][] = {{3, 2, 1}, {5, 6, 4}};
        System.out.println(Arrays.deepToString(tab2d));
    }
}
