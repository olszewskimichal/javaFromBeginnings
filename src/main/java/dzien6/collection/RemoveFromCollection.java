package dzien6.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveFromCollection {

  public static void main(String[] args) {
    List<String> stringList = new ArrayList<>();
    stringList.add("value1");
    stringList.add("value2");
    stringList.add("value3");
    stringList.add("value4");

    System.out.println(stringList);
    stringList.remove(0); // usuwa element z indeksem = 0
    System.out.println(stringList);

    stringList.remove("value2");    //usuwa wartość value2 z listy
    System.out.println(stringList);

    for (Iterator<String> iterator = stringList.iterator(); iterator.hasNext(); ) {
      String s = iterator.next();
      iterator.remove();  //tak mozna usuwac
    }
    System.out.println(stringList);

    stringList.add("value5");

    for (int i = 0; i < stringList.size(); i++) {
      String s = stringList.get(i);
      stringList.remove(i);
    }
    ;
  }
}
