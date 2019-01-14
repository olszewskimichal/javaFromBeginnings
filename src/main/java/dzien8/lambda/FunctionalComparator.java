package dzien8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bb", "CCCC", "adasdasdsa", "");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        Comparator<String> comparator2 = (o1, o2) -> Integer.compare(o1.length(), o2.length());
        Collections.sort(list, comparator2);
        System.out.println(list);

    }

    /*static class LenghtComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    }*/
}
