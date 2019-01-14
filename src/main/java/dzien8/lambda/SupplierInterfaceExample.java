package dzien8.lambda;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierInterfaceExample {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = () ->
                LocalDateTime.of(2019, 1, 13, 11, 47);
        System.out.println(supplier.get());
    }
}
