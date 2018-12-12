package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list.add("value21");
        list.add("value21");    //mozna duplikowa�
        list2.add("value22");
        System.out.println(list);
        System.out.println(list2);
        list.addAll(list2);
        System.out.println(list);

        System.out.println(list.contains("value22"));
        System.out.println(list2.contains("value21"));

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        System.out.println(list.indexOf("value22"));
        System.out.println(list2.indexOf("value22"));
    }
}
