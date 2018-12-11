package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrinter {

    static void printForEach(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    static void printIterator(List<String> list) {
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String string = iterator.next();
            System.out.println(string);
        }
    }

    static void printFor(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {
            {
                add("A");
                add("B");
                add("C");
            }
        };
        printForEach(list);
        printIterator(list);
        printFor(list);
    }

}
