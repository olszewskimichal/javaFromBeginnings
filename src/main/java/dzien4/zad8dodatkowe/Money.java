package dzien4.zad8dodatkowe;

public class Money implements IMoney {

  protected double amount;

  public Money(double amount) {
    this.amount = amount;
  }

  @Override
  public double getAmount() {
    return amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Money money = (Money) o;

    return Double.compare(money.amount, amount) == 0;
  }

  @Override
  public int hashCode() {
    long temp = Double.doubleToLongBits(amount);
    return (int) (temp ^ (temp >>> 32));
  }

  @Override
  public String toString() {
    return "Money{" +
        "amount=" + amount +
        '}';
  }
}
