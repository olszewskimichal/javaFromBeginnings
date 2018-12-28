package zad115;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {

  private final String name;
  private final BigDecimal price;

  public Product(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  @Override
  public int compareTo(Product o) {
    return getPrice().compareTo(o.getPrice());
  }

  @Override
  public String toString() {
    return "Product [name=" + name + ", price=" + price + "]";
  }


}
