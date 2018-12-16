package dzien6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad96 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("plik.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
    }
}
