package dzien5;

import java.util.Random;

public class zad86 {
    static Random random = new Random();

    static int randomNumber(int p, int k) {
        return random.nextInt(k - p + 1) + p;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(randomNumber(30, 40));
        }
    }

}
