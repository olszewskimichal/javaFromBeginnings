package multithread.thread;

class ThreadExample {

  public static void main(String[] args) {
    System.out.println("Inside : " + Thread.currentThread().getName());

    System.out.println("Creating thread...");
    Thread thread = new MyThread();

    System.out.println("Starting thread...");
    thread.start();
  }

  static class MyThread extends Thread {

    @Override
    public void run() {
      System.out.println("Inside : " + Thread.currentThread().getName());
    }
  }
}
