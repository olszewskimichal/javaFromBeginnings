package dzien7.compare;

import java.math.BigDecimal;

/**
 * To jest nasza super klasa - jest dobrze tutaj, lecimy z tym kodem
 *
 * @author SDA
 * @version alpha
 */
public class Product implements Comparable<Product> {

  private String name;
  private BigDecimal price;

  /**
   * To jest super konstruktor, lecimy dalej, jest dobrze, jeszcze
   *
   * @param name super nazwa produktu, ciągle jest stabilnie
   * @param price dobra cena, extra promo . Niemiec plakał jak sprzedawał
   */
  public Product(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }

  /**
   * Co ja tutaj robie {@link BigDecimal#compareTo(BigDecimal)}
   *
   * @param product - super produkt
   * @return jakiegoś inta którego nikt nie rozumie
   */
  @Override
  public int compareTo(Product product) {
    return name.compareTo(product.name);
  }
}
