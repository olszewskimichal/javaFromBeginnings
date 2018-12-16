package dzien5.pliki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFileNIO {
    public static void main(String[] args) throws IOException {
        Path path = Files.createTempFile("test-file", ".txt");
        Files.write(path, "adasdas".getBytes());
        Files.readAllLines(Paths.get("ala.txt"));
    }
}
