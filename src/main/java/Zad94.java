import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Zad94 {
    public static void main(String[] args) {
        try {
            Files.readAllBytes(Paths.get("asdasdsa.txt"));
        } catch (IOException e) {
            System.out.println("Podany plik nie istnieje");
        }
    }
}
