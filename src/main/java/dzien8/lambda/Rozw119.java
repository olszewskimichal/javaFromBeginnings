package dzien8.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Rozw119 {

    public static void main(String[] args) {
        Product product1 = new Product(BigDecimal.TEN, "aproduct1");
        Product product2 = new Product(BigDecimal.ONE, "product2");
        Product product3 = new Product(new BigDecimal(50), "product3");
        Product product4 = new Product(BigDecimal.valueOf(-1), "product4");
        List<Product> products = Arrays.asList(product1, product2, product3, product4);
        System.out.println(najnizszaCena(products));
        System.out.println(sumaProduktow(products));
        System.out.println(filterByName(products));
    }

    static Product najnizszaCena(List<Product> products) {
        return products.stream()
                .min((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()))
                .orElseThrow(() -> new IllegalArgumentException("Lista nie moze byc pusta"));
    }

    static Double sumaProduktow(List<Product> products) {
        /*BigDecimal sum = BigDecimal.ZERO;
        for (Product product : products) {
            sum = sum.add(product.getPrice());
        }
        return sum;*/
        BigDecimal reduce = products
                .stream()
                .map(v -> v.getPrice())
                .reduce(BigDecimal.ZERO, (bigDecimal, augend) -> bigDecimal.add(augend));
        System.out.println(reduce);

        return products.stream()
                .map(v -> v.getPrice())
                .mapToDouble(v -> v.doubleValue())
                .sum();
    }

    static List<Product> filterByName(List<Product> products) {
        return products.stream()
                .filter(v -> v.getName().startsWith("a"))
                .collect(Collectors.toList());
    }

    static class Product {
        private BigDecimal price;
        private String name;

        public Product(BigDecimal price, String name) {
            this.price = price;
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public String getName() {
            return name;
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