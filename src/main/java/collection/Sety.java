package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sety {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> set2 = new TreeSet<>();

        set.add("value1");
        set.add("value1");    //nie mozna duplikowa�
        set.add("value1");
        set2.add("value2");
        System.out.println(set);
        System.out.println(set2);
        set.addAll(set2);
        System.out.println(set);

        System.out.println(set.contains("value2"));
        System.out.println(set2.contains("value1"));

        System.out.println(set.isEmpty());
        System.out.println(set.size());

    }
}
