package dzien7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CiekaweNapisy {
    private static int zamienNaLiczbe(String napis) {
        int sum = 0;
        for (char c : napis.toCharArray()) {
            sum += (int) c;
        }
        return sum;
    }

    private static boolean czyPierwsza(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }

    private static int sumaNapisowPierwszych(List<String> list) {
        int sum = 0;
        for (String s : list) {
            if (czyPierwsza(zamienNaLiczbe(s))) sum++;
        }
        return sum;
    }

    private static boolean czyRosnacy(String napis) {
        int tmp = 0;
        for (char c : napis.toCharArray()) {
            int value = c;
            if (value <= tmp) return false;
            tmp = value;
        }
        return true;
    }

    private static void wypiszNapisyRosnace(List<String> strings) {
        for (String string : strings) {
            if (czyRosnacy(string))
                System.out.println(string);
        }
    }


    private static void wypiszDuplikaty(List<String> strings) {
        Set<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (String string : strings) {
            boolean add = set.add(string);
            if (add == false) result.add(string);
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        /*System.out.println(zamienNaLiczbe("ABB"));
        System.out.println(czyPierwsza(zamienNaLiczbe("ABB")));*/
         /*System.out.println(czyRosnacy("ABB"));
        System.out.println(czyRosnacy("ABC"));
        System.out.println(czyRosnacy("BAC"));
        System.out.println(czyRosnacy("AGW"));*/
        List<String> strings = Files.readAllLines(Paths.get("NAPIS.TXT"));
        //System.out.println(sumaNapisowPierwszych(strings));
        //wypiszNapisyRosnace(strings);
        wypiszDuplikaty(strings);

    }
}
