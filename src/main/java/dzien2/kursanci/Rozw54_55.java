package dzien2.kursanci;

import java.util.Random;

public class Rozw54_55 {

  static int[][] fill2d(int a, int b) {
    Random rand = new Random();
    int[][] arr2d = new int[a][b];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        arr2d[i][j] = rand.nextInt();
      }
    }
    return arr2d;
  }

  static void show2d(int array2d[][]) {
    for (int i = 0; i < array2d.length; i++) {
      for (int j = 0; j < array2d[0].length; j++) {
        System.out.print(array2d[i][j] + "   ");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    show2d(fill2d(3, 4));
  }
}
