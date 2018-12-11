package dzien1;

public class Zad5 {
    public static void main(String[] args) {

        /**
         * byte to 8 bitów, 2^8 = 256
         * czyli można zapisać w sumie 256 wartości
         * 00000000 - 11111111
         * wszystkie liczby z 1 na początku to liczby ujemne
         * 0 na początku - nieujemne
         *
         * więc jest 128 ujemnych i 128 nieujemnych (w tym 127 dodatnich i '0')
         */
        byte a = (byte) (Byte.MAX_VALUE + 1);
        short b = (short) (Short.MAX_VALUE + 1);
        int c = Integer.MAX_VALUE + 1;

        System.out.println(a + " " + b + " " + c);
    }
}
