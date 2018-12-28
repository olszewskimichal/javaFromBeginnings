package dzien2;

import java.util.Arrays;

public class TabliceOperacje {

  public static void main(String[] args) {
    int tab[] = {1, 2, 3, 4, 5};
    int tab2[] = {1, 2, 3, 4, 5};

    System.out.println(Arrays.equals(tab, tab2));
    int tab3[] = new int[5];
    Arrays.fill(tab3, 3);
    System.out.println(Arrays.toString(tab3));

    Arrays.sort(tab);
    System.out.println(Arrays.toString(tab));
    System.out.println(Arrays.binarySearch(tab, 3)); // wyszukuje element w tablicy i podaje na jakim miejscu si�
    // znajduje

    int tab4[][] = new int[4][4];
    for (int i = 0; i < tab4.length; i++) {
      Arrays.fill(tab4[i], 3);
    }
    System.out.println(Arrays.deepToString(tab4));
  }
}
