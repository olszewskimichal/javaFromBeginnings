package debugging;

import java.util.Random;

public class ExceptionHandling {

  public static void main(String[] args) {
    Random random = new Random(); //ctrl + shift+f8
    for (int i = 0; i < 10; i++) {
      int value = random.nextInt(5) - 1;
      System.out.println(i / value);
    }
  }

}
