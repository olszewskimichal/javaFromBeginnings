package dzien4.order;

public class OrderOnline extends OrderBase implements Discount {

  private long userId;

  @Override
  public double giveDiscount() {
    return 5;
  }

  public void sayHello() {
    System.out.println("Hello");
  }

  @Override
  public void saySomething() {
    System.out.println("online something");
  }
}
