import java.util.Arrays;
import java.util.List;

class Zad120 {

  public static void main(String[] args) {

    List<MyThread> threads = Arrays.asList(
        new MyThread(1),
        new MyThread(2),
        new MyThread(3),
        new MyThread(4),
        new MyThread(5),
        new MyThread(6),
        new MyThread(7),
        new MyThread(8),
        new MyThread(9),
        new MyThread(10)
    );

    for (MyThread thread : threads) {
      thread.start();
    }
  }

  static class MyThread extends Thread {

    private final int threadNumber;

    MyThread(int threadNumber) {
      this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName() + " " + threadNumber + " START");
      for (int i = 0; i < 10; i++) {
        int value = i * 10 + threadNumber;
        System.out.println(Thread.currentThread().getName() + " " + threadNumber + " " + value);
      }

      System.out.println(Thread.currentThread().getName() + " " + threadNumber + " KONIEC");
    }
  }
}
