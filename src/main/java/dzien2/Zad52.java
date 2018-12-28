package dzien2;

public class Zad52 {

  static void printArray(int tab[]) {
    for (int i = 0; i < tab.length; i++) {
      System.out.print(tab[i] + "\t");
    }
    System.out.println();
  }

  static void printReverseArray(int tab[]) {
    for (int i = tab.length - 1; i >= 0; i--) {
      System.out.print(tab[i] + "\t");
    }
    System.out.println();
  }

  static int sumArray(int tab[]) {
    int suma = 0;
    for (int i = 0; i < tab.length; i++) {
      suma += tab[i];
    }
    return suma;
  }

  static double avgArray(int tab[]) {
    return (double) sumArray(tab) / tab.length;
  }

  static int minArray(int tab[]) {
    int min = 999999999;
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] < min) {
        min = tab[i];
      }
    }
    return min;
  }

  static int maxArray(int tab[]) {
    int max = 0;
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] > max) {
        max = tab[i];
      }
    }
    return max;
  }

  static int countElementInArray(int tab[], int element) {
    int count = 0;
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] == element) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int tab[] = {1, 2, 3, 4, 5, 6, 6};
    printArray(tab);
    printReverseArray(tab);
    System.out.println(sumArray(tab));
    System.out.println(avgArray(tab));
    System.out.println(minArray(tab));
    System.out.println(maxArray(tab));
    System.out.println(countElementInArray(tab, 6));
  }

}
