import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Zad92 {

  public static void main(String[] args) throws IOException {
    List<String> readAllLines = Files.readAllLines(Paths.get("liczby.txt"), Charset.forName("UTF-8"));

    Path nieparzyste = Paths.get("nieparzyste.txt");
    if (Files.exists(nieparzyste)) {
      Files.delete(nieparzyste);
    }
    Files.createFile(nieparzyste);

    Path parzyste = Paths.get("parzyste.txt");
    if (Files.exists(parzyste)) {
      Files.delete(parzyste);
    }
    Files.createFile(parzyste);

    for (String line : readAllLines) {
      Integer value = Integer.valueOf(line);
      if (value % 2 == 0) {
        Files.write(parzyste, (line + "\n").getBytes(), StandardOpenOption.APPEND);
      } else {
        Files.write(nieparzyste, (line + "\n").getBytes(), StandardOpenOption.APPEND);
      }
    }
  }

}
