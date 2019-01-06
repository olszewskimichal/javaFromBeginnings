import java.util.ArrayList;
import java.util.List;

class Zad121 {

  public static void main(String[] args) throws InterruptedException {
    for (int j = 0; j < 20; j++) {

      Counter counter = new Counter();
      List<MyThread> threadList = new ArrayList<>();
      for (int i = 0; i < 1000; i++) {
        threadList.add(new MyThread(counter));
      }

      for (MyThread myThread : threadList) {
        myThread.start();
      }

      for (MyThread thread : threadList) {
        thread.join();
      }

      System.out.println(counter.getCount());
    }
  }

  static class MyThread extends Thread {

    private final Counter counter;

    MyThread(Counter counter) {
      this.counter = counter;
    }

    @Override
    public void run() {
      counter.increment();
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

}
