package dzien8.multithread.thread;

class ThreadExample {

  public static void main(String[] args) {
    System.out.println("Inside : " + Thread.currentThread());

    System.out.println("Creating thread...");
    Thread thread = new MyThread();
    Thread thread2 = new MyThread();

    System.out.println("Starting thread...");
    thread.start();
    thread2.start();
  }

  static class MyThread extends Thread {

    @Override
    public void run() {
      System.out.println("Inside : " + Thread.currentThread());
    }
  }
}
