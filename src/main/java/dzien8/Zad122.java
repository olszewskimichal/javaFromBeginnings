package dzien8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class Zad122 {

  public static void main(String[] args) throws InterruptedException {
    for (int j = 0; j < 20; j++) {

      Counter counter = new Counter();
      List<MyThread2> threadList = new ArrayList<>();
      for (int i = 0; i < 1000; i++) {
        threadList.add(new MyThread2(counter));
      }

      for (MyThread2 myThread : threadList) {
        myThread.start();
      }

      for (MyThread2 thread : threadList) {
        thread.join();
      }

      System.out.println(counter.getCount());
    }
  }

  static class MyThread2 extends Thread {

    private final Counter counter;

    MyThread2(Counter counter) {
      this.counter = counter;
    }

    @Override
    public void run() {
      counter.increment();
    }
  }

  static class Counter {

    private AtomicInteger count = new AtomicInteger();

    int increment() {
      return count.incrementAndGet();
    }

    public int getCount() {
      return count.get();
    }
  }

}
