package dzien2.kursanci;

public class Rozw37 {
    static void od1Do10Parzyste() {
        int n = 1;
        while (n <= 10) {
            if (n % 2 == 0)
                System.out.println(n);
            n++;
        }
    }

    static void od1Do10Parzyste2() {
        int n = 2;
        while (n <= 10) {
            System.out.println(n);
            n = n + 2;
        }
    }

    public static void main(String[] args) {
       // od1Do10Parzyste();
        od1Do10Parzyste2();
    }
}
