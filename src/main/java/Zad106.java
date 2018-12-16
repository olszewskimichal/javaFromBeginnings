import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zad106 {

  public static void main(String[] args) throws IOException {
    List<String> strings = Files.readAllLines(Paths.get("liczby.txt"));
    Set<String> result = new HashSet<>(strings);
    System.out.println(result);
  }

}
