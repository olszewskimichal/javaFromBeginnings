import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zad87 {

  public static void main(String[] args) {
    Random random = new Random();
    int k = 49;
    int p = 1;

    Set<Integer> set = new HashSet<>();
    do {
      int val = random.nextInt(k - p + 1) + p;
      set.add(val);
      System.out.println(val);
    } while (set.size() != 6);
    System.out.println("set = " + set);
  }
}
