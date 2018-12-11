package dzien4.java8date;

import java.time.Instant;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateOperation {
    public static void main(String[] args) {
        Instant plus = Instant.now().plus(1, ChronoUnit.DAYS);
        System.out.println(plus);

        Period period = Period.ofDays(1);
        Instant.now().plus(period);
        Instant instant = Instant.now().plus(Period.ofDays(1));
        Instant instant2 = Instant.now().plus(1, ChronoUnit.DAYS);

        System.out.println(instant + " " + instant2);
    }
}
