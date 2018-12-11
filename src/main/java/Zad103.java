import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zad103 {

    static void reverseList(List<String> list) {
        Collections.reverse(list);
    }

    static void shuffleList(List<String> list) {
        Collections.shuffle(list);
    }

    static List<String> shallowCopyList(List<String> list) {
        List<String> copy = new ArrayList<>(list);
        return copy;
    }

    static List<String> deepCopyList(List<String> list) {
        List<String> copy = new ArrayList<>();
        for (String string : list) {
            copy.add(new String(string));
        }
        return copy;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("5");
        list.add("4");
        list.add("3");
        list.add("1");
        list.add("2");
        List<String> copyList = shallowCopyList(list);
        List<String> deepCopyList = deepCopyList(list);
        System.out.println(list);
        reverseList(list);
        System.out.println(list);
        shuffleList(list);
        System.out.println(list);
        System.out.println(copyList);
        System.out.println(deepCopyList);

        list.set(0, "abc");

        System.out.println(list);
        System.out.println(copyList);
        System.out.println(deepCopyList);
    }
}
