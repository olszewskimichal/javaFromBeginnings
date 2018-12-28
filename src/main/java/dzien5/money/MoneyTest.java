package dzien5.money;

public class MoneyTest {

  public static void main(String[] args) {
    System.out.println(new Money(5).equals(new Money(5)));
    System.out.println(new Money(5).equals(new Money(6)));

    System.out.println(new Dollar(5).equals(new Franc(5)));

    Dollar dollar = new Dollar(5);
    System.out.println(dollar.getAmount());
    dollar.add(new Dollar(6));
    System.out.println(dollar.getAmount());

    Franc franc = new Franc(10);
    franc.add(new Franc(15));

    Franc[] tab = new Franc[5];
    tab[0] = new Franc(5);

    System.out.println(franc.getAmount());

    Exchange exchange = new Exchange(0.5, 2);
    System.out.println(exchange.dollarToFrancRatio());
    System.out.println(exchange.francToDollarRatio());

    Dollar dollar1 = new Dollar(3);
    Exchange exchange2 = new Exchange(0.5, 2);
    Franc franc2 = exchange2.dollarToFranc(dollar1);
    System.out.println(franc2.getAmount());
    Dollar dollar2 = exchange2.francToDollar(franc2);
    System.out.println(dollar2.getAmount());

    Dollar dollar3 = new Dollar(3);
    Franc franc3 = new Franc(2);
    dollar3.add(franc3, exchange);
    System.out.println(dollar3.getAmount());
  }
}
