package dzien7.generyki;

import java.util.List;

public class GenericMethod {

    public static <V extends Number> V getFirstElement(List<V> list) {
        return list.get(0);
    }

    public static <V> void print(List<V> list) {
        for (V obj : list) {
            System.out.println(obj);
        }
    }

    public static <V> void print(V[] array) {
        for (V obj : array) {
            System.out.println(obj);
        }
    }

    public static <V> void print2(V... values) {
        for (V obj : values) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Integer tab[] = {1, 2, 3};
        String tab2[] = {"1", "2", "3"};
        print(tab);
        print(tab2);

        print2(1,2,3,4);
    }
}
