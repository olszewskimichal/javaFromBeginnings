package dzien5.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("/home/michal/Dokumenty/javastart2/src/main/java/plik.txt");
    Scanner sc = new Scanner(file);
    while (sc.hasNextLine()) {
      System.out.println(sc.nextLine());
    }
    sc.close();
  }
}
