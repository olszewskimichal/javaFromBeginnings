package dzien6.kursanci;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rozw106 {
    public static void main(String[] args) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get("ala.txt"));
        Set<String> set = new HashSet<>();

        for (String s : strings) {
            String[] split = s.split(" ");
            for (String s1 : split) {
                set.add(s1);
            }
        }
        System.out.println(set);
        System.out.println(set.size());

    }
}
