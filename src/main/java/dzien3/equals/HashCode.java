package dzien3.equals;

public class HashCode {

  public static void main(String[] args) {
    Product product = new Product("aaa", 10.0);
    Product product2 = new Product("aaa", 10.0);
    System.out.println(product.equals(product2));
    System.out.println(product == product2);
    System.out.println(product.hashCode());
    System.out.println(product2.hashCode());
  }

}
