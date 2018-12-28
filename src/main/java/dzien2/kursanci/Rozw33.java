package dzien2.kursanci;

public class Rozw33 {

  static String whatDay(int number) {

    switch (number) {
      case 1:
        return "Poniedziałek";
      case 2:
        return "Wtorek";
      case 3:
        return "Sroda";
      case 4:
        return "Czwartek";
      case 5:
        return "Piątek";
      case 6:
        return "Sobota";
      case 7:
        return "Niedziela";
      default:
        return "Poza zakresem";
    }
  }

  static String dzienTygodnia(int tydzien) {
    switch (tydzien) {
      case 1:
        return "poniedziałek";
      case 2:
        return "wtorek";
      case 3:
        return "środa";
      case 4:
        return "czwartek";
      case 5:
        return "piątek";
      case 6:
        return "sobota";
      case 7:
        return "niedziela";
      default:
        return "";
    }
  }

  private static void dzienTygodnia2(int a) {
    if (a == 1) {
      System.out.println("Poniedziałek");
    } else if (a == 2) {
      System.out.println("Wtorek");
    } else if (a == 3) {
      System.out.println("Sroda");
    } else if (a == 4) {
      System.out.println("Czwartek");
    } else if (a == 5) {
      System.out.println("Piątek");
    } else if (a == 6) {
      System.out.println("Sobota");
    } else if (a == 7) {
      System.out.println("Niedziela");
    } else {
      System.out.println("Coś nie tak...");
    }
  }

  public static void main(String[] args) {

    int a = 5;
    System.out.println(whatDay(a));

  }
}