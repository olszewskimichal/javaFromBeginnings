package dzien4.order;

public class OrderShop extends OrderBase implements Discount {
    public long shopId;

    @Override
    public double giveDiscount() {
        return Math.PI;
    }

    @Override
    public void saySomething() {
        System.out.println("Shop something");
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public void setPrice(double price) {
        super.setPrice(price);
    }
}
