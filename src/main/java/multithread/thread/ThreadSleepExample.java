package multithread.thread;

import java.util.List;

class ThreadSleepExample {

  public static void main(String[] args) {
    System.out.println("Inside : " + Thread.currentThread().getName());

    String[] messages = {"If I can stop one heart from breaking,",
        "I shall not live in vain.",
        "If I can ease one life the aching,",
        "Or cool one pain,",
        "Or help one fainting robin",
        "Unto his nest again,",
        "I shall not live in vain"};
    Thread thread = new ThreadSleep(messages);

    thread.start();
  }

  static class ThreadSleep extends Thread {

    private final String[] messages;

    ThreadSleep(String[] messages) {
      this.messages = messages;
    }

    @Override
    public void run() {
      System.out.println("Inside : " + Thread.currentThread().getName());

      for (String message : messages) {
        System.out.println(message);
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          throw new IllegalStateException(e);
        }
      }
    }
  }

}
