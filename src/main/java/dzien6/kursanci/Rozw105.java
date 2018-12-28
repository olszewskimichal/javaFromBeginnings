package dzien6.kursanci;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Rozw105 {

  public static void main(String[] args) {
    Set<String> zbior = new HashSet<>();
    zbior.add("ABC");
    zbior.add("CDE");
    zbior.add("abc");
    printWithLowerCase(zbior);
  }

  private static void printWithLowerCase(Set<String> zbior) {
    for (Iterator<String> iterator = zbior.iterator(); iterator.hasNext(); ) {
      String s = iterator.next();
      System.out.println(s.toLowerCase());
    }
  }
}
