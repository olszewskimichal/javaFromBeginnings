package dzien6.kursanci;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Rozw94 {

  public static void main(String[] args) {
    try {
      Files.readAllLines(Paths.get("Nieistniejacypli.txt"));
    } catch (IOException e) {
      System.err.println("Podany plik nie istnieje");
    }

  }
}
