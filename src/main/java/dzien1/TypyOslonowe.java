package dzien1;

public class TypyOslonowe {

  public static void main(String[] args) {
    boolean b = false;
    char c = 'm';
    int i = 3;
    double d = 4.0;

    Boolean bb = b;
    Character cc = Character.valueOf(c);
    Integer ii = Integer.valueOf(i);
    Double dd = d;

    double doubleValue = dd.doubleValue();

    String s = "1";
    int parseInt = Integer.parseInt(s);
    System.out.println(parseInt);
    Integer valueOf = Integer.valueOf("3");
    System.out.println(valueOf);
  }
}
