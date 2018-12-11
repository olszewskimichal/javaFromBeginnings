package dzien4.order;

public abstract class OrderBase {
    private long id;
    private double price;

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract void saySomething();
}
