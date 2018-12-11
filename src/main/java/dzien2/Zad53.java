package dzien2;

public class Zad53 {

    static int findElementInArray(int tab[], int element) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == element)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int tab[] = {1, 2, 3, 4, 5, 6, 6};
        System.out.println(findElementInArray(tab, 7));
        System.out.println(findElementInArray(tab, 3));
    }
}
