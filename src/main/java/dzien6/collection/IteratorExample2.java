package dzien6.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorExample2 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "bbb");
        map.put(3, "zzz");
        map.put(4, "xxx");

        for (String value : map.values()) {
            System.out.println(value);
        }

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        for (Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }

}
