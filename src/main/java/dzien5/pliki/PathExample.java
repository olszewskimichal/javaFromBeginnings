package dzien5.pliki;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("ala.txt");
        System.out.println(path);
    }
}
