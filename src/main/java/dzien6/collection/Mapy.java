package dzien6.collection;

import java.util.HashMap;
import java.util.Map;

public class Mapy {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "bbb");
        System.out.println(map);

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(3, "zzz");
        map2.put(4, "xxx");
        System.out.println(map2);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));
        map.replace(2,"yyy");
        System.out.println(map);

        System.out.println(map.containsValue("aaa"));
        System.out.println(map.containsValue("xxx"));

        map.putAll(map2);
        System.out.println(map);

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        map.remove(4);
        System.out.println(map.size());

        System.out.println(map.get(3));

    }

}
