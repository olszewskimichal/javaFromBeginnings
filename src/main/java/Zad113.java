public class Zad113 {

    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max("cdd", "abb"));
    }

    static <V extends Comparable<V>> V max(V val1, V val2) {
        if (val1.compareTo(val2) > 0)
            return val1;
        return val2;
    }

}
