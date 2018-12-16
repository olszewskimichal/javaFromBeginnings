package dzien6.kursanci;

import java.util.ArrayList;
import java.util.List;

public class Rozw102 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abb");
        list.add("abbe");
        list.add("abbc");
        list.add("abbd");
        List<String> strings = listToUpperCase(list);
        System.out.println(strings);
    }

    static List<String> listToUpperCase(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(s.toUpperCase());
        }
        return result;
    }
}
