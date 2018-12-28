package dzien5.pliki;

import java.io.File;

public class FileOperation {

  public static void main(String[] args) {
    File file = new File("Directory1");
    file.mkdir();
    System.out.println(file.length());
    System.out.println(file.isAbsolute());
  }
}
