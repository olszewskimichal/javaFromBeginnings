package dzien8.multithread.executorService;

public class Rozw120 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(1l);
        MyThread thread2 = new MyThread(2l);
        MyThread thread3 = new MyThread(3l);
        MyThread thread4 = new MyThread(4l);
        MyThread thread5 = new MyThread(5l);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

    static class MyThread extends Thread {
        private Long threadNumber;

        public MyThread(Long threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread() + " " + i * 10 + threadNumber);

            }
        }
    }
}
