package compare;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductViewer {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("a", BigDecimal.ZERO));
        list.add(new Product("z", BigDecimal.ONE));
        list.add(new Product("c", BigDecimal.ZERO));
        list.add(new Product("b", BigDecimal.TEN));
        //System.out.println(list);
        for (Product product : list) {
            System.out.println(product);
        }

        System.out.println();
        Collections.sort(list);
        for (Product product : list) {
            System.out.println(product);
        }
        ;
    }
}
