package dzien4.java8date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ActualDate {

  public static void main(String[] args) {
    System.out.println(LocalTime.now());
    System.out.println(LocalDate.now());
    System.out.println(LocalDateTime.now());
    System.out.println(Instant.now());
    System.out.println(ZonedDateTime.now());
    System.out.println(ZoneId.systemDefault());

    LocalDateTime localDateTime = LocalDateTime.now().plusDays(1);
  }
}
