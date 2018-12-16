package collection;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Rozw108 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> mapa = getMapaZPliku(new File("ala.txt"));
        System.out.println(mapa);
    }

    private static Map<String, Integer> getMapaZPliku(File file) throws IOException {
        List<String> stringList = Files.readAllLines(Paths.get(file.getName()));
        Map<String, Integer> stringMap = new TreeMap<>();
        for (String s : stringList) {
            String[] split = s.split(" ");
            for (String tekst : split) {
                if (stringMap.containsKey(tekst))
                    stringMap.put(tekst, stringMap.get(tekst) + 1);
                else
                    stringMap.put(tekst, 1);
            }
        }
        return stringMap;
    }
}
