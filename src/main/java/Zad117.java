import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zad117 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("bbb");
    list.add("cc");
    list.add("dddd");

    Collections.sort(list, (v1, v2) -> Integer.compare(v2.length(), v1.length()));
    System.out.println(list);
  }

}
