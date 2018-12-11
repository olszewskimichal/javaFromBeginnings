package dzien4.java8date;

import java.time.*;

public class ActualDate {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(ZoneId.systemDefault());
    }
}
