package dzien6;

import java.util.HashMap;
import java.util.Map;

public class Zad107 {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Stycze�");
    map.put(2, "Luty");
    map.put(3, "Marzec");
    map.put(4, "Kwiecie�");
    map.put(5, "Maj");
    map.put(6, "Czerwiec");
    map.put(7, "Lipiec");
    map.put(8, "Sierpie�");
    map.put(9, "Wrzesie�");
    map.put(10, "Pa�dziernik");
    map.put(11, "Listopad");
    map.put(12, "Grudzie�");

    System.out.println(map.get(3));
  }

}
