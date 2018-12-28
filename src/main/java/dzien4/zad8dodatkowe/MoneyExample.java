package dzien4.zad8dodatkowe;

public class MoneyExample {

  public static void main(String[] args) {
    System.out.println(new Money(5).equals(new Money(5)));
    System.out.println(new Money(5).equals(new Money(6)));
    System.out.println(new Dollar(5).equals(new Franc(5)));

    Dollar dollar = new Dollar(5);
    System.out.println(dollar.getAmount());
    dollar.add(new Dollar(6));
    System.out.println(dollar.getAmount());

    Exchange exchange = new Exchange(0.5, 2);
    System.out.println(exchange.dollarToFrancRatio());
    System.out.println(exchange.francToDollarRatio());

    Dollar dollar1 = new Dollar(3);
    Franc franc = exchange.dollarToFranc(dollar1);
    System.out.println(franc.getAmount());
    Dollar dollar2 = exchange.francToDollar(franc);
    System.out.println(dollar2.getAmount());

    Dollar dollar3 = new Dollar(3);
    Franc franc3 = new Franc(2);
    dollar3.add(franc3, exchange);
    System.out.println(dollar3.getAmount());
  }
}
