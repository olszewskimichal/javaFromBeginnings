package dzien5.money;

public class Dollar extends Money {

  public Dollar(double value) {
    super(value);
  }

  public void add(double value) {
    this.value += value;
  }

  public void add(Dollar dollar) {
    add(dollar.getAmount());
  }

  public void add(Franc franc3, Exchange exchange) {
    this.value += exchange.francToDollar(franc3).getAmount();
  }
}
