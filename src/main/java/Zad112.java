public class Zad112 {

    public static <V> void wydrukujListe(V... lista) {
        for (V v : lista) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        Integer[] tab = {1, 2, 3};
        wydrukujListe(tab);

        String[] tab2 = {"a", "b", "c"};
        wydrukujListe(tab2);
    }

}
