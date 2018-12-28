package dodatkowe3;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

class Zad17 {

  public static void main(String[] args) {
    Pizza pizza1 = new PizzaDeluxe(10.0, "DSJ", BigDecimal.TEN);
    Pizza pizza2 = new PizzaSpecial(20.0, "Special Force", BigDecimal.ONE);
    Pizza pizza3 = new PizzaWege(15.0, "Wege - ananas", BigDecimal.valueOf(5));

    List<Pizza> pizzas = Arrays.asList(pizza1, pizza2, pizza3);
    System.out.println("przed posortowaniem");
    System.out.println(pizzas);

    Collections.sort(pizzas);
    System.out.println("Po posortowaniu");
    System.out.println(pizzas);
  }


  static class PizzaDeluxe extends Pizza {

    PizzaDeluxe(Double calories, String name, BigDecimal price) {
      super(calories, name, price);
    }
  }

  static class PizzaSpecial extends Pizza {

    PizzaSpecial(Double calories, String name, BigDecimal price) {
      super(calories, name, price);
    }
  }

  static class PizzaWege extends Pizza {

    PizzaWege(Double calories, String name, BigDecimal price) {
      super(calories, name, price);
    }
  }

  static abstract class Pizza implements Comparable<Pizza> {

    private final Double calories;
    private final String name;
    private final BigDecimal price;

    Pizza(Double calories, String name, BigDecimal price) {
      this.calories = calories;
      this.name = name;
      this.price = price;
    }

    public Double getCalories() {
      return calories;
    }

    public String getName() {
      return name;
    }

    public BigDecimal getPrice() {
      return price;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Pizza pizza = (Pizza) o;
      return Objects.equals(calories, pizza.calories) &&
          Objects.equals(name, pizza.name) &&
          Objects.equals(price, pizza.price);
    }

    @Override
    public int hashCode() {
      return Objects.hash(calories, name, price);
    }

    @Override
    public String toString() {
      return "Pizza{" +
          "calories=" + calories +
          ", name='" + name + '\'' +
          ", price=" + price +
          '}';
    }

    @Override
    public int compareTo(@NotNull Pizza o) {
      return getPrice().compareTo(o.getPrice());
    }
  }


}
