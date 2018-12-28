package dzien6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Zad108 {

  public static void main(String[] args) throws IOException {
    List<String> strings = Files.readAllLines(Paths.get("liczby.txt"));
    Map<Integer, Integer> wordCounts = new TreeMap<>();
    for (String s : strings) {
      Integer count = wordCounts.getOrDefault(Integer.valueOf(s), 0);
      wordCounts.put(Integer.valueOf(s), count + 1);
    }
    System.out.println(wordCounts);
  }
}
