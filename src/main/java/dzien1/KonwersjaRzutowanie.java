package dzien1;

public class KonwersjaRzutowanie {
    public static void main(String[] args) {
        System.out.println("Konwersja");
        int i = 2134;
        double d = i;
        System.out.println(d);

        System.out.println("Rzutowanie");
        double b = 13.5;
        int c = (int) b;
        System.out.println(c);

        int e = 77;
        char f = (char) e;
        System.out.println(f);
    }
}
