package dzien6.collection;

import dzien3.equals.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrinter {

  static void printForEach(List<String> list) {
    for (String string : list) {
      System.out.println(string);
    }
    list.remove(0);
  }

  static void printIterator(List<String> list) {
    for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
      String string = iterator.next();
      System.out.println(string);
    }
  }

  static void printFor(List<String> list) {
    for (int i = 0; i < list.size(); i++) {
      String string = list.get(i);
      System.out.println(string);
    }
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>() {
      {
        add("A");
        add("B");
        add("C");
      }
    };

    printForEach(list);
    System.out.println();
    list.add("4");
    printIterator(list);
    System.out.println();
    printFor(list);

    Product product1 = new Product("name1", 1.0);
    Product product2 = new Product("name2", 2.0);
    Product product3 = new Product("name3", 3.0);
    List<Product> products = new ArrayList<>();
    products.add(product1);
    products.add(product2);
    products.add(product3);

    System.out.println(products);

    product2.setPrice(11.0);

    System.out.println(products);


  }

}
