package dzien7.optionals;

import java.util.Optional;

public class OptionalExample {

  public static void main(String[] args) {
    WrapperObject object = new WrapperObject();
    try {
      String name = object.getObject().getName();
      System.out.println(name);
    } catch (NullPointerException e) {
      System.out.println("Polecia� wyj�tek a tego by�my nie chcieli");
    }
    String name = Optional.ofNullable(object.getObject())
            .map(v -> v.getName())
            .orElse("Empty name");
    System.out.println(name);

    WrapperObject object2 = new WrapperObject();
    object2.setObject(new NullObject("name"));

    name = Optional.ofNullable(object2.getObject()).map(v -> v.getName()).orElse("Empty name");
    System.out.println(name);
  }

}
