package dzien6.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("cde");

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String string = iterator.next();
            System.out.println(string);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }

}
