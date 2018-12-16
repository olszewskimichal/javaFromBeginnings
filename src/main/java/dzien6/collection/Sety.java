package dzien6.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sety {
    public static void main(String[] args) {
        Set<String> zbior1 = new HashSet<>();
        Set<String> zbior2 = new TreeSet<>();

        zbior1.add("value1");
        zbior1.add("value1");    //nie mozna duplikowa�
        zbior1.add("value1");
        zbior1.add("value5");
        zbior2.add("a");
        zbior2.add("c");
        zbior2.add("b");
        System.out.println(zbior1);
        System.out.println(zbior2);
        zbior1.addAll(zbior2);
        System.out.println(zbior1);

        for (String s : zbior1) {
            System.out.println();
        }
        ;

        System.out.println(zbior1.contains("value2"));
        System.out.println(zbior2.contains("value1"));

        System.out.println(zbior1.isEmpty());
        System.out.println(zbior1.size());

    }
}
