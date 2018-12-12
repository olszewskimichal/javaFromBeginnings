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

  static List<String> copyList(List<String> list) {
    return new ArrayList<>(list);
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("5");
    list.add("4");
    list.add("3");
    list.add("1");
    list.add("2");
    List<String> copyList = copyList(list);
    System.out.println(list);

    reverseList(list);
    System.out.println(list);

    shuffleList(list);
    System.out.println(list);
    System.out.println(copyList);

    list.set(0, "abc");

    System.out.println(list);
    System.out.println(copyList);
  }
}
