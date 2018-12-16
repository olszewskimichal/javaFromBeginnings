package dzien6.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        list.add("value1");
        list.add("value1");    //mozna duplikowa�
        list2.add("value2");
        System.out.println(list);
        System.out.println(list2);
        list.addAll(list2);
        System.out.println(list);

        System.out.println(list.contains("value22"));
        System.out.println(list2.contains("value21"));

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        System.out.println(list.indexOf("value2"));
        System.out.println(list.indexOf("value2"));

        list.add(0, "value3");
        System.out.println(list);
        String s = list.get(0);
        System.out.println(s);
        list.remove("value2");
        System.out.println(list);
        System.out.println(list.indexOf("value22"));
        System.out.println(list2.indexOf("value22"));
    }
}
