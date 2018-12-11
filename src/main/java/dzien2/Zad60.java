package dzien2;

public class Zad60 {
    static int minValue(int... values) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            if (val < min) {
                min = val;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minValue(4, 2, 1, 4));
    }

}
