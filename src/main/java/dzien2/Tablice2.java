package dzien2;

public class Tablice2 {

  public static void main(String[] args) {
    String[] daysOfWeek = new String[7];
    daysOfWeek[0] = "poniedzia�ek";
    daysOfWeek[1] = "wtorek";
    daysOfWeek[2] = "�roda";
    daysOfWeek[3] = "czwartek";
    daysOfWeek[4] = "pi�tek";
    daysOfWeek[5] = "sobota";
    daysOfWeek[6] = "niedziela";

    // warto�ci mo�na nadpisywa�
    daysOfWeek[0] = "monday";

    // d�ugo�� tablicy
    System.out.println(daysOfWeek.length);

  }
}
