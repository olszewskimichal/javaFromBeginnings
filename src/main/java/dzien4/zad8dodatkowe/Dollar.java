package dzien4.zad8dodatkowe;

public class Dollar extends Money {

  public Dollar(double amount) {
    super(amount);
  }

  void add(Dollar dollar) {
    this.amount = amount + dollar.getAmount();
  }

  public void add(Franc franc3, Exchange exchange) {
    this.amount += exchange.francToDollar(franc3).getAmount();
  }
}
