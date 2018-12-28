package dzien4.java8date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AnotherDate {

  public static void main(String[] args) {
    System.out.println(Instant.ofEpochSecond(1543484808));

    LocalTime localTime = LocalTime.of(12, 53);
    System.out.println(localTime);

    LocalDate localDate = LocalDate.of(1993, 12, 13);

    System.out.println(localDate);

    LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
    System.out.println(localDateTime);

    ZoneId zone = ZoneId.of("GMT");
    System.out.println(zone);

    ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zone);
    System.out.println(zonedDateTime);
  }
}
