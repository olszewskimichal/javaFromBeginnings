package dzien2;

public class Zad61 {

  static void printArray(int tab[]) {
    for (int val : tab) {
      System.out.print(val + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int tab[] = {1, 2, 3, 4};
    printArray(tab);
  }
}
