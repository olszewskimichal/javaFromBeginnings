package dzien8.multithread.synchronizedThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class RaceConditionExample {

    static class Counter {

        private int count = 0;

        synchronized void increment() {
            {
                count = count + 1;
            }
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 100; j++) {

            ExecutorService executorService = Executors.newFixedThreadPool(10);

            Counter counter = new Counter();

            for (int i = 0; i < 1000; i++) {
                executorService.submit(() -> counter.increment());
            }

            executorService.shutdown();
            executorService.awaitTermination(60, TimeUnit.SECONDS);

            System.out.println("Final count is : " + counter.getCount());
        }
    }

}
