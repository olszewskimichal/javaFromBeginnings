import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Zad123 {

  public static void main(String[] args) throws InterruptedException {
    for (int j = 0; j < 20; j++) {

      Counter counter = new Counter();
      ExecutorService executorService = Executors.newFixedThreadPool(10);
      for (int i = 0; i < 1000; i++) {
        executorService.submit(new MyThread3(counter));
      }

      executorService.shutdown();
      executorService.awaitTermination(60, TimeUnit.SECONDS);

      System.out.println("Final count is : " + counter.getCount());
    }
  }

  static class Counter {

    private int count = 0;

    synchronized void increment() {
      count = count + 1;
    }

    public int getCount() {
      return count;
    }
  }

  static class MyThread3 extends Thread {

    private final Counter counter;

    MyThread3(Counter counter) {
      this.counter = counter;
    }

    @Override
    public void run() {
      counter.increment();
    }
  }

}
