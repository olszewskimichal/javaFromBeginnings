package dzien2.kursanci;

public class Rozw52 {

    static void wypisz(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println("array[" + i + "] = " + array[i]);
    }

    static void suma(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Suma elementów: " + sum);
    }

    static void srednia(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Srednia elementów: " + (float) sum / array.length);

    }

    static void minIMax(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        System.out.println("Największa liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);
    }

    static void howMany(int[] array, int a) {
        int howMany = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) howMany++;
        }
        System.out.println("Liczba " + a + " występuje " + howMany + " razy.");
    }

    static void inverseArr(int[] array) {
        for (int i = array.length - 1; i >= 0; i--)
            System.out.println("array[" + i + "] = " + array[i]);
    }


    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) array[i] = i;


        wypisz(array);
        suma(array);
        srednia(array);
        minIMax(array);

        array[5] = 9;

        howMany(array, 9);
        inverseArr(array);


    }
}
