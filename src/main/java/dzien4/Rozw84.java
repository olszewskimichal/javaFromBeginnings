package dzien4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Rozw84 {

  public static void main(String[] args) {
    LocalDate narodziny = LocalDate.of(1985, 1, 1);
    System.out.println(narodziny);
    System.out.println(narodziny.getDayOfWeek());

    GregorianCalendar gregorianCalendar = new GregorianCalendar(1985, 0, 1);
    System.out.println(gregorianCalendar.get(Calendar.DAY_OF_WEEK));

    LocalDateTime now = LocalDateTime.now();
    LocalDateTime newYear = LocalDateTime.of(2019, 1, 1, 0, 0);
    System.out.println(Duration.between(now, newYear).toDays());
    System.out.println(Duration.between(now, newYear).toHours() % 24);
    System.out.println(Duration.between(now, newYear).toMinutes() % 60);

    GregorianCalendar newYearCalendar = new GregorianCalendar(2019, 0, 1);
    Calendar nowCalendar = Calendar.getInstance();
    long remainingDays = TimeUnit.MILLISECONDS.toDays(newYearCalendar.getTimeInMillis() - nowCalendar.getTimeInMillis());
    long remainingHours = TimeUnit.MILLISECONDS.toHours(newYearCalendar.getTimeInMillis() - nowCalendar.getTimeInMillis());
    long remainingMinutes = TimeUnit.MILLISECONDS.toMinutes(newYearCalendar.getTimeInMillis() - nowCalendar.getTimeInMillis());

    System.out.println(remainingDays + " " + remainingHours % 24 + " " + remainingMinutes % 60);

    System.out.println("czy aktualny rok jest przestępny " + LocalDate.now().isLeapYear());
    System.out.println("czy rok 2012 jest przestępny " + newYearCalendar.isLeapYear(2012));
  }
}
