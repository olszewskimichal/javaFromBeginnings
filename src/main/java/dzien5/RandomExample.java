package dzien5;

import java.util.Random;

public class RandomExample {

  public static void main(String[] args) {
    Random random = new Random();
    System.out.println(random.nextBoolean());
    System.out.println(random.nextDouble());
    System.out.println(random.nextInt());
    System.out.println(random.nextInt(10));

    for (int i = 0; i < 100; i++) {
      System.out.println(random.nextInt(1));
    }


  }

}
