package dzien4.order;

public abstract class OrderBase {

  private long id;
  private double price;

  public void setId(long id) {
    this.id = id;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public abstract void saySomething();
}
