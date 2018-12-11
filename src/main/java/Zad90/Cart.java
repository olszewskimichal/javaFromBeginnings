package Zad90;

import java.math.BigDecimal;

public class Cart {
    private final Product product;
    private final Long count;

    public Cart(Product product, Long count) {
        this.product = product;
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public Product getProduct() {
        return product;
    }

    public BigDecimal sum() {
        return product.getPrice().multiply(BigDecimal.valueOf(count));
    }

}
