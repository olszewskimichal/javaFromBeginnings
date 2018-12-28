package dodatkowe3;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

import java.time.LocalDate;
import java.time.LocalDateTime;

class Zad3 {

  private static int birthdayMonth = 12;
  private static int birthdayDay = 24;

  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime nearestBirthday = calculateNearestDate();

    System.out.println(DAYS.between(now, nearestBirthday));
    System.out.println(HOURS.between(now, nearestBirthday)%24);
    System.out.println(MINUTES.between(now, nearestBirthday)%60);
  }

  /**
   * Metoda do wyliczania kiedy śa najlblizsze urodziny. Zalozmy że jak robimy wyliczenie 1.12 a urodziny mamy 1.11 to chcemy by podało nam 1.11 w przyszłym roku jako date następnych urodzin.
   * Jeżeli ktoś chce na sztywno podać datę to nic nie stoi na przeszkodzie, po prostu to wyliczenie jest bardziej uniwersalne
   */
  private static LocalDateTime calculateNearestDate() {
    LocalDateTime now = LocalDateTime.now();
    if ((now.getMonth().getValue() > birthdayMonth) || (now.getMonth().getValue() == birthdayMonth && now.getDayOfMonth() > birthdayDay)) {
      return LocalDateTime.of(now.getYear() + 1, birthdayMonth, birthdayDay, 0, 0);
    }
    return LocalDateTime.of(now.getYear(), birthdayMonth, birthdayDay, 0, 0);
  }
}
