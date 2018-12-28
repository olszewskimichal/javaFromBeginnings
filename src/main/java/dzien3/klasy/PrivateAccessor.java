package dzien3.klasy;

public class PrivateAccessor {

  private int a;

  private void printA() {
    System.out.println(a);
  }

  public class InClass {

    int b;

    public void printB() {
      System.out.println(b);
    }

    public void printA() {
      System.out.println(a);
    }
  }
}
