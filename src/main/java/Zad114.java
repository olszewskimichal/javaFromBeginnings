import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Zad114 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("bbbbbbbbbb");
    list.add("d");
    list.add("aaaaaaa");
    list.add("cc");

    Collections.sort(list, new Comparator<String>() {

      @Override
      public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
      }
    });

    System.out.println(list);
  }

}
