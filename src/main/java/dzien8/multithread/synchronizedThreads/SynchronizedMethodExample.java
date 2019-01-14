package dzien8.multithread.synchronizedThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SynchronizedMethodExample {

  static class SynchronizedCounter {

    private int count = 0;

    // Synchronized Method
    synchronized void increment() {
      System.out.println(Thread.currentThread().getName());
      count = count + 1;

      /**
       * Mozna tez zrobic synchronized block zamiast calej metody
       * // Synchronized Block
       *         synchronized {
       *             count = count + 1;
       *         }
       */
    }



    public int getCount() {
      return count;
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(10);

    SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

    for (int i = 0; i < 1000; i++) {
      executorService.submit(() -> synchronizedCounter.increment());
    }

    executorService.shutdown();
    executorService.awaitTermination(5, TimeUnit.SECONDS);

    System.out.println("Final count is : " + synchronizedCounter.getCount());
  }
}
