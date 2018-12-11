package pliki;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path createFile = Files.createFile(Paths.get("plikNowy.txt"));
        Path path = Files.createDirectory(Paths.get("nowyFolder"));

        Files.copy(Paths.get("plik.txt"), Paths.get("plikNowy.txt"), StandardCopyOption.REPLACE_EXISTING);
        List<String> readAllLines = Files.readAllLines(Paths.get("plikNowy.txt"), Charset.forName("UTF-8"));
        System.out.println(readAllLines);

        Files.delete(createFile);
        Files.deleteIfExists(path);

    }
}
