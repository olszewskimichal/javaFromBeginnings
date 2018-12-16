package dzien6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zad102 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("EfG");
        list.add("BAc");
        List<String> upper = toUpper(list);
        System.out.println(upper);
        List<String> upper2 = toUpper2(list);
        System.out.println(upper);
    }

    private static List<String> toUpper(List<String> list) {
        List<String> values = new ArrayList<>();
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            values.add(iterator.next().toUpperCase());
        }
        return values;
    }

    private static List<String> toUpper2(List<String> list) {
        List<String> values = new ArrayList<>();
        for (String string : list) {
            string = string.toUpperCase();
            values.add(string);
        }
        return values;
    }

}
