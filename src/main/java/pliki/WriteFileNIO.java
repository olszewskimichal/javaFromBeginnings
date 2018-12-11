package pliki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFileNIO {
    public static void main(String[] args) throws IOException {
        Path path = Files.createTempFile("test-file", ".txt");
        Files.write(path, "some test content...".getBytes());

        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }
}
