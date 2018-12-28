package dzien3.equals;

public class Equals {

  public static void main(String[] args) {
    Integer one = new Integer(1234);
    Integer two = new Integer(1234);

    System.out.println(one == two);
    System.out.println(one.equals(two));

    System.out.println(one.hashCode());
    System.out.println(two.hashCode());

    String first = "abc";
    String second = new String("abc");

    System.out.println(first == second);
    System.out.println(first.equals(second));
  }
}
