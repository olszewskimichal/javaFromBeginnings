package dzien8.multithread.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class AtomicIntegerExample {

  static class AtomicCounter {

    private AtomicInteger count = new AtomicInteger(0);

    int incrementAndGet() {
      return count.incrementAndGet();
    }

    public int getCount() {
      return count.get();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(2);

    AtomicCounter atomicCounter = new AtomicCounter();

    for (int i = 0; i < 1000; i++) {
      executorService.submit(() -> atomicCounter.incrementAndGet());
    }

    executorService.shutdown();
    executorService.awaitTermination(10, TimeUnit.SECONDS);

    System.out.println("Final Count is : " + atomicCounter.getCount());
  }

}
