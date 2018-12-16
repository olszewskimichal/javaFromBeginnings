package dzien4.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ActualDate {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Date currentDate2 = calendar.getTime();


        GregorianCalendar gregorianCalendar = new GregorianCalendar(2018, 1, 1);
        System.out.println(gregorianCalendar.getTime());


        System.out.println(currentDate);
        System.out.println(currentDate2);

    }
}
