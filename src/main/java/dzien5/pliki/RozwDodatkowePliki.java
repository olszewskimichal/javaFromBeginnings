package dzien5.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;

public class RozwDodatkowePliki {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("losowe.txt");
        PrintWriter printWriter = new PrintWriter(file);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            printWriter.println(random.nextInt(10));
        }
        printWriter.close();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
