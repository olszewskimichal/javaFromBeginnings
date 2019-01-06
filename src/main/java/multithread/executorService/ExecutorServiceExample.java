package multithread.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ExecutorServiceExample {

  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(10);

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Inside runnable : " + Thread.currentThread().getName());
      }
    };

    executorService.submit(runnable);
    executorService.submit(new MyThread());
    executorService.shutdown();
    executorService.awaitTermination(60, TimeUnit.SECONDS);
  }

  static class MyThread extends Thread {

    @Override
    public void run() {
      System.out.println("Inside newThread : " + Thread.currentThread().getName());
    }
  }

}
