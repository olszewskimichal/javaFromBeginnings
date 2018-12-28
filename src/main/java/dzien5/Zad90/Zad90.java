package dzien5.Zad90;

import java.math.BigDecimal;

public class Zad90 {

  public static void main(String[] args) {
    Product product = new Product("produkt", BigDecimal.TEN);
    Cart cart = new Cart(product, 10L);
    System.out.println(cart.sum());
  }
}
