package dzien4.date;

import java.util.Calendar;

public class DateOperation {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR,-1);
        System.out.println(calendar.getTime());

        //Odjęcie 1 dnia od dzisiejszej
        calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(calendar.getTime());

        //   Różnica miedzy 2 datami
        Calendar c2 = Calendar.getInstance();
        Calendar c1 = Calendar.getInstance();
        c1.add(Calendar.DAY_OF_MONTH, -1);
        long differenceInMillis = c2.getTimeInMillis() - c1.getTimeInMillis(); //gdzie c1 i c2 to zmienne typu Calendar
        System.out.println(differenceInMillis);
    }
}
