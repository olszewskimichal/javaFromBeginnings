package dzien6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Zad105 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("EfG");
        set.add("BAc");
        Set<String> upper = toUpper(set);
        System.out.println(upper);
        Set<String> upper2 = toUpper2(set);
        System.out.println(upper2);

    }

    private static Set<String> toUpper2(Set<String> set) {
        Set<String> values = new HashSet<>();
        for (String string : set) {
            values.add(string.toUpperCase());
        }
        return values;
    }

    private static Set<String> toUpper(Set<String> set) {
        Set<String> values = new HashSet<>();
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String string = iterator.next();
            string = string.toUpperCase();
            values.add(string);
        }
        return values;
    }

}
