package dodatkowe3;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

class Zad2 {

  static LocalDateTime addOneYear_TwoMonth_ThreeDays_FourHours(LocalDateTime dateTime) {
    return dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
  }

  static Date addOneYear_TwoMonth_ThreeDays_FourHours(Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.YEAR, 1);
    calendar.add(Calendar.MONTH, 2);
    calendar.add(Calendar.DAY_OF_YEAR, 3);
    calendar.add(Calendar.HOUR, 4);

    return calendar.getTime();
  }

  public static void main(String[] args) {
    System.out.println(addOneYear_TwoMonth_ThreeDays_FourHours(LocalDateTime.now()));
    System.out.println(addOneYear_TwoMonth_ThreeDays_FourHours(new Date()));
  }
}
