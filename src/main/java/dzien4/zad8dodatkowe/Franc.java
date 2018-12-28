package dzien4.zad8dodatkowe;

public class Franc extends Money {

  public Franc(double amount) {
    super(amount);
  }

  void add(Franc franc) {
    this.amount = amount + franc.getAmount();
  }
}
