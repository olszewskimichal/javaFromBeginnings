package dzien8.lambda;

import java.time.Duration;
import java.time.LocalDateTime;

public class EndWorldCountdown {
    public static void main(String[] args) throws InterruptedException {
        boolean isOver = true;
        LocalDateTime endTime = LocalDateTime.of(2019, 1, 13, 11, 47);
        while (isOver) {
            Duration between = Duration.between(LocalDateTime.now(), endTime);
            System.out.println(between.toHours()+"godzin "+between.toMinutes()%60+"minut "+between.getSeconds()%60+"sekund");
            System.out.println(Thread.currentThread());
            Thread.sleep(1000);
            isOver = between.getSeconds() >= 0;
        }
        System.err.println("Ale urwał");
    }
}
