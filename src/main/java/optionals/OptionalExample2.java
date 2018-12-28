package optionals;

import java.util.Optional;

public class OptionalExample2 {

  public static void main(String[] args) {
    Optional<String> optional = Optional.of("abc");
    Optional<String> optional2 = Optional.empty();

    System.out.println(optional.get());
    System.out.println(optional2);

    System.out.println(optional2.isPresent());

    optional2.orElseThrow(() -> new IllegalArgumentException("wyj�tek"));
  }

}
