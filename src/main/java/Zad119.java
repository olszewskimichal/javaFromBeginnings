import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

class Zad119 {

  public static void main(String[] args) {
    Product product = new Product(BigDecimal.valueOf(1), "name1");
    Product product1 = new Product(BigDecimal.valueOf(2), "name2");
    Product product2 = new Product(BigDecimal.valueOf(3), "aname3");
    Product product3 = new Product(BigDecimal.valueOf(14), "name4");
    Product product4 = new Product(BigDecimal.valueOf(25), "name5");
    List<Product> productList = Arrays.asList(product, product1, product2, product3, product4);

    Product productWithMinPrice = productList.stream()
        .min(Product::compareTo)
        .orElseThrow(() -> new IllegalArgumentException("Nieprawidlowa lista produktów"));
    System.out.println(productWithMinPrice);

    BigDecimal sum = productList.stream()
        .map(v -> v.price)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
    System.out.println("Suma produktów to " + sum);

    productList.stream()
        .filter(v -> v.name.startsWith("a"))
        .forEach(System.out::println);

    productList.stream()
        .filter(v -> (v.price.compareTo(BigDecimal.TEN) > 0) && (v.price.compareTo(BigDecimal.valueOf(20)) < 0))
        .forEach(System.out::println);

    Map<BigDecimal, List<Product>> collect = productList.stream().collect(Collectors.groupingBy(v -> v.price));
    System.out.println(collect);
  }

  static class Product implements Comparable<Product> {

    private final BigDecimal price;
    private final String name;

    Product(BigDecimal price, String name) {
      this.price = price;
      this.name = name;
    }

    @Override
    public int compareTo(@NotNull Product o) {
      return price.compareTo(o.price);
    }

    @Override
    public String toString() {
      return "Product{" +
          "price=" + price +
          ", name='" + name + '\'' +
          '}';
    }
  }
}

