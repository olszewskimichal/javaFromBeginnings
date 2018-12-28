import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Zad118 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("bbb");
    list.add("cc");
    list.add("dddd");

    Set<String> result = list.stream().map(v -> v.toUpperCase()).collect(Collectors.toSet());
    System.out.println(result);
  }

}
