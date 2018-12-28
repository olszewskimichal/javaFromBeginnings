package dzien6.debug;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class DebugExample {

  public static void main(String[] args) {
    List<Product> products = Arrays.asList(
        new Product("produkt1", BigDecimal.TEN),
        new Product("produkt2", BigDecimal.ONE),
        new Product("produkt3", null));

    for (Product product : products) {
      System.out.println(product);
    }

    ShoppingCart shoppingCart = new ShoppingCart(products);
    System.out.println(CartPriceCalculator.calculatePrice(shoppingCart));
  }
}
