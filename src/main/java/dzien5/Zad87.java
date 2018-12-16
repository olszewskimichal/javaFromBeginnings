package dzien5;

import java.util.Random;

public class Zad87 {
    public static void main(String[] args) {
        Random random = new Random();
        int k = 49;
        int p = 1;
        for (int i = 0; i < 6; i++) {
            int val = random.nextInt(k - p + 1) + p;
            System.out.println(val);
        }
    }
}
