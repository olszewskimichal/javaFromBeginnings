package dzien6.debug;

import java.math.BigDecimal;

class CartPriceCalculator {
    static BigDecimal calculatePrice(ShoppingCart shoppingCart) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Product product : shoppingCart.getProducts()) {
                   sum = sum.add(product.getPrice());
        }
        return sum;
    }
}
