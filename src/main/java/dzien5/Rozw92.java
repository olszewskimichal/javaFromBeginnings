package dzien5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Rozw92 {

    public static void main(String[] args) throws IOException {
        Path pathParzyste = Paths.get("parzyste.txt");
        List<String> strings = Files.readAllLines(Paths.get("liczby.txt"));
        Files.createFile(pathParzyste);
        Files.createFile(Paths.get("nieparzyste.txt"));
        for (String s : strings) {
            Long liczba = Long.valueOf(s);
            if (liczba % 2 == 0) {
                Files.write(
                        pathParzyste,
                        (s+"\n").getBytes(),
                        StandardOpenOption.APPEND);
            } else {
                Files.write(Paths.get("nieparzyste.txt"), (s+"\n").getBytes(), StandardOpenOption.APPEND);
            }
        }
    }
}
