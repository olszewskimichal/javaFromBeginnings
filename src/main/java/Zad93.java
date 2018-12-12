import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Zad93 {

  static void listFilesInPath() throws IOException {
    Files.list(Paths.get("")).forEach(System.out::println);
  }

  static void listFilesInPathRecursive() throws IOException {
    Files.walk(Paths.get("")).forEach(System.out::println);
  }

  public static void main(String[] args) throws IOException {
    listFilesInPath();
    System.out.println();
    listFilesInPathRecursive();
  }
}
