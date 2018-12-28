package dodatkowe3;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

class Zad6 {

  public static void main(String[] args) {
    Product product1 = new Product(BigDecimal.TEN, "Drogi");
    Product product2 = new Product(BigDecimal.ZERO, "Tani");
    Product product3 = new Product(BigDecimal.ONE, "Sredni");

    ShoppingCart shoppingCart = new ShoppingCart(Arrays.asList(product1, product2, product3));
    System.out.println(shoppingCart.cartCost());
    System.out.println(shoppingCart.theCheapestProduct());
    System.out.println(shoppingCart.theMostExpensiveProduct());
  }


  static class Product implements Comparable<Product> {

    private final BigDecimal price;
    private final String name;

    Product(BigDecimal price, String name) {
      this.price = price;
      this.name = name;
    }

    @Override
    public String toString() {
      return "Product{" +
          "price=" + price +
          ", name='" + name + '\'' +
          '}';
    }

    @Override
    public int compareTo(@NotNull Product o) {
      return this.price.compareTo(o.price);
    }
  }

  static class ShoppingCart {

    private final List<Product> productList;

    ShoppingCart(List<Product> productList) {
      this.productList = productList;
    }

    /**
     * Metoda wylicza pełen koszt koszyka produktów
     */
    BigDecimal cartCost() {
      BigDecimal result = BigDecimal.ZERO;
      for (Product product : productList) {
        result = result.add(product.price);
      }
      return result;
    }

    /**
     * Metoda wyznacza najdrozszy produkt z koszyka
     */
    Product theMostExpensiveProduct() {
      BigDecimal tmp = BigDecimal.ZERO;
      Product result = null;
      for (Product product : productList) {
        if (product.price.compareTo(tmp) > 0) {
          tmp = product.price;
          result = product;
        }
      }
      return result;
    }

    /**
     * Metoda wyznacza najtanszy produkt z koszyka
     */
    Product theCheapestProduct() {
      BigDecimal tmp = BigDecimal.valueOf(Long.MAX_VALUE);
      Product result = null;
      for (Product product : productList) {
        if (product.price.compareTo(tmp) < 0) {
          tmp = product.price;
          result = product;
        }
      }
      return result;
    }

    /**
     * Metoda wyznacza najdrozszy produkt z koszyka poprzez posortowanie listy od najtanszych do najdrozszych z uzyciem comparable i zwrocenie ostatniego produktu jako wynik
     */
    Product theMostExpensiveProductUsingSort() {
      Collections.sort(productList);
      return productList.get(productList.size() - 1);
    }

    /**
     * Metoda wyznacza najtanszy produkt z koszyka poprzez posortowanie listy od najtanszych do najdrozszych z uzyciem comparable i zwrocenie pierwszego produktu jako wynik
     */
    Product theCheapestProductUsingSort() {
      Collections.sort(productList);
      return productList.get(0);
    }
  }
}
