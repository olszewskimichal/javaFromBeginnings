package dzien5;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Zad84 {

    public static DayOfWeek getDayOfBirthday(LocalDate date) {
        return date.getDayOfWeek();
    }

    /**
     * @param date
     */
    public static void newYearsEveCountDown2(LocalDateTime date) {
        LocalDateTime newYear = LocalDateTime.of(2019, 1, 1, 0, 0);
        Duration betweenDays = Duration.between(date, newYear);
        System.out.println(betweenDays.toDays());

        Duration betweenHours = Duration.between(newYear.toLocalTime(), date.toLocalTime());
        System.out.println(betweenHours.toHours());
        System.out.println(betweenHours.toMinutes() % 60);
    }

    public static void newYearsEveCountDown(LocalDateTime date) {
        LocalDateTime newYear = LocalDateTime.of(2019, 1, 1, 0, 0);
        Duration betweenDays = Duration.between(date, newYear);
        System.out.println(betweenDays.toDays());
        System.out.println(betweenDays.toHours());
        System.out.println(betweenDays.toMinutes());
    }

    public static boolean isLeapDate(LocalDate date) {
        return date.isLeapYear();
    }

    public static void main(String[] args) {
        System.out.println(getDayOfBirthday(LocalDate.of(1993, 11, 7)));
        newYearsEveCountDown(LocalDateTime.now());
        System.out.println(isLeapDate(LocalDate.now()));
        System.out.println(isLeapDate(LocalDate.of(2020, 1, 1)));
    }

}
