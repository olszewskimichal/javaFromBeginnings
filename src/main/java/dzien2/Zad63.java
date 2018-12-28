package dzien2;

public class Zad63 {

  static int max(int tab[]) {
    int max = 0;
    for (int val : tab) {
      if (val > max) {
        max = val;
      }
    }
    return max;
  }

  static int mostCommonValue(int tab[]) {
    int countTab[] = new int[max(tab) + 1];
    for (int i : tab) {
      countTab[i]++;
    }

    int maxValue = 0;
    int maxCount = 0;
    for (int j = 0; j < countTab.length; j++) {
      int val = countTab[j];
      if (val > maxCount) {
        maxCount = val;
        maxValue = j;
      }
    }
    return maxValue;
  }

  public static void main(String[] args) {
    int tab[] = {1, 1, 2, 3, 4, 5, 6, 5, 5, 4};
    System.out.println(mostCommonValue(tab));
  }
}
