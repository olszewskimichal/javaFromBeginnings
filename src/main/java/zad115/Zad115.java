package zad115;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zad115 {

  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();
    products.add(new Product("name1", BigDecimal.TEN));
    products.add(new Product("abc", BigDecimal.ZERO));
    products.add(new Product("name3", BigDecimal.ONE));

    Collections.sort(products);
    System.out.println(products);

  }

}
