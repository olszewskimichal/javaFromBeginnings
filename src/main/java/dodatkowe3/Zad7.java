package dodatkowe3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/**
 * Przerób zadanie 6 tak by Koszyk zamiast przechowywać listę produkty by przechowywał mapę produktów:
 * - mapa zawierała by produkt i jego ilość sztuk
 * - Przerób metodę sumująca by poradziła sobie z tą kolekcją i poprawnie zwracała wynik
 * - Dodaj metodę dodajProdukt do klasy Koszyk, która będzie przyjmować w swoich argumentach Produkt oraz ilość. Metoda ta niech dodaje tę parę do mapy.  Wyrzuć wyjątek jeśli ilość produktów będzie mniejsza niż 1.
 */
class Zad7 {

  public static void main(String[] args) {
    Product product1 = new Product(BigDecimal.TEN, "Drogi2");
    Product product2 = new Product(BigDecimal.ZERO, "Tani2");
    Product product3 = new Product(BigDecimal.ONE, "Sredni2");

    ShoppingCart shoppingCart = new ShoppingCart(new HashMap<>());
    shoppingCart.dodajProduct(product1, 3L);
    shoppingCart.dodajProduct(product1, 2L);
    shoppingCart.dodajProduct(product2, 1L);
    shoppingCart.dodajProduct(product3, 2L);

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

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Product product = (Product) o;
      return Objects.equals(price, product.price) &&
          Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(price, name);
    }
  }

  static class ShoppingCart {

    private final Map<Product, Long> productList;

    ShoppingCart(Map<Product, Long> productList) {
      this.productList = productList;
    }

    /**
     * Metoda wylicza pełen koszt koszyka produktów
     */
    BigDecimal cartCost() {
      BigDecimal result = BigDecimal.ZERO;
      for (Entry<Product, Long> entry : productList.entrySet()) {
        result = result.add(entry.getKey().price.multiply(BigDecimal.valueOf(entry.getValue())));
      }
      return result;
    }

    /**
     * Metoda wyznacza najdrozszy produkt z koszyka
     */
    Product theMostExpensiveProduct() {
      BigDecimal tmp = BigDecimal.ZERO;
      Product result = null;
      for (Product product : productList.keySet()) {
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
      for (Product product : productList.keySet()) {
        if (product.price.compareTo(tmp) < 0) {
          tmp = product.price;
          result = product;
        }
      }
      return result;
    }

    void dodajProduct(Product product, Long count) {
      if (count < 1) {
        throw new IllegalArgumentException("Nieprawidlowa ilość produktów, musi byc przynajmniej 1");
      }
      if (productList.containsKey(product)) {
        productList.put(product, productList.get(product) + count);
      } else {
        productList.put(product, count);
      }
    }

  }
}
