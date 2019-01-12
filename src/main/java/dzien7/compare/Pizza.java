package dzien7.compare;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.*;

public class Pizza implements Comparable<Pizza> {
    private String name;
    private Double calories;
    private BigDecimal price;

    public Pizza(String name, Double calories, BigDecimal price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public int compareTo(@NotNull Pizza o) {
        return o.price.compareTo(price);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("wege", 10.0, BigDecimal.TEN);
        Pizza pizza2 = new Pizza("hawajska", 15.0, BigDecimal.valueOf(15));
        Pizza pizza3 = new Pizza("miesna", 5.0, BigDecimal.valueOf(5));

        List<Pizza> pizzas = Arrays.asList(pizza1, pizza2, pizza3);
        Collections.sort(pizzas);
        System.out.println(pizzas);

        Collections.sort(pizzas,new CaloriesComparator());
        System.out.println(pizzas);

        Collections.sort(pizzas,new NameComparator());
        System.out.println(pizzas);

        Collections.sort(pizzas,new ReverseNameComparator());
        System.out.println(pizzas);
    }

    static class CaloriesComparator implements Comparator<Pizza> {

        @Override
        public int compare(Pizza o1, Pizza o2) {
            return o1.calories.compareTo(o2.calories);
        }
    }
    static class NameComparator implements Comparator<Pizza> {

        @Override
        public int compare(Pizza o1, Pizza o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    static class ReverseNameComparator implements Comparator<Pizza>{

        @Override
        public int compare(Pizza o1, Pizza o2) {
            return o2.name.compareTo(o1.name);

        }
    }
}
