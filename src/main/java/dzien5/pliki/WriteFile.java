package dzien5.pliki;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

  public static void main(String[] args) throws IOException {
    PrintWriter zapis = new PrintWriter(new FileWriter("ala.txt", true));
    zapis.println(123);
    zapis.close();
  }
}
