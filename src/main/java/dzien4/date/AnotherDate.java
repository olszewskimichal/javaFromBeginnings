package dzien4.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AnotherDate {

  public static void main(String[] args) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    String dateString = "04.08.2015 07:42:00";
    Date date = dateFormat.parse(dateString);
    Calendar calendar = new GregorianCalendar(2015, 8, 4, 10, 44, 0);
    System.out.println(date);
    System.out.println(calendar.getTime());
    calendar.get(Calendar.MONTH);
  }
}
