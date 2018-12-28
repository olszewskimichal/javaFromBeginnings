import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zad109 {

  public static void main(String[] args) {
    Pair<Integer, String> para = new Pair<Integer, String>(1, "a");
    Pair<List, Set> para2 = new Pair<List, Set>(new ArrayList<>(), new HashSet<>());
    System.out.println(para);
    System.out.println(para2);
  }
}

class Pair<T, S> {

  private T first;
  private S second;

  public Pair(T first, S second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst() {
    return first;
  }

  public S getSecond() {
    return second;
  }

  @Override
  public String toString() {
    return "Pair [first=" + first + ", second=" + second + "]";
  }

}