import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Zad91 {
    public static void main(String[] args) throws IOException {
        Path createFile = Files.createFile(Paths.get("plikNowy.txt"));
        Path path = Files.createDirectory(Paths.get("nowyFolder"));
        Files.write(createFile, "some test content...".getBytes());
        List<String> readAllLines = Files.readAllLines(createFile, Charset.forName("UTF-8"));
        System.out.println(readAllLines);

        Files.delete(createFile);
        Files.deleteIfExists(path);
    }
}
