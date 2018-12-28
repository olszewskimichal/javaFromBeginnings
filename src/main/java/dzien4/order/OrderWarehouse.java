package dzien4.order;

public class OrderWarehouse extends OrderBase {

  private long werehouseId;

  @Override
  public void saySomething() {
    System.out.println("warehouse something");
  }
}
