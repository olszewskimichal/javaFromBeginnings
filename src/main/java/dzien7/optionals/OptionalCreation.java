package dzien7.optionals;

import java.util.List;
import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {
        Optional<List> stringOptional = Optional.ofNullable(null);
        System.out.println(stringOptional);
    }
}
