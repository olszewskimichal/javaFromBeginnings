package pliki;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileNIO {

  public static void main(String[] args) throws IOException {
    List<String> readAllLines = Files.readAllLines(Paths.get("plik.txt"), Charset.forName("UTF-8"));
    System.out.println(readAllLines);

  }
}
