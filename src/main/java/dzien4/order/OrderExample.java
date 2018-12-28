package dzien4.order;

public class OrderExample {

  public static void main(String[] args) {
    OrderShop orderShop = new OrderShop();
    orderShop.setId(2L);
    orderShop.setPrice(34);
    orderShop.setShopId(49);
    System.out.println(orderShop.getPrice());

    OrderOnline orderOnline = new OrderOnline();
    orderOnline.setId(1L);
    orderOnline.setPrice(25);

    OrderBase tab[] = {orderShop, orderOnline};
    tab[0].setId(3L);  //tak tez mozemy sie odwołać do metody wspolnej
    for (OrderBase object : tab) {
      object.saySomething();   //mamy dostęp do metody abstrakcyjnej bo jest wspolna dla tych klas
      System.out.println(object.getPrice());
    }

    Discount tab2[] = {orderOnline, orderShop};
    for (Discount object : tab2) {
      object.giveDiscount();        //tu object ma dostęp tylko do metod wspolnych dla interfejsu Discount
      if (object instanceof OrderOnline) {  //mozemy sprawdzic czy ten obiekt nie jest instancja klasy OrderOnline
        OrderOnline online = (OrderOnline) object; //zrzutowalismy na klase OrderOnline
        online.sayHello();
        ((OrderOnline) object).sayHello(); //rzutowanie i wykonanie metody z klasy OrderOnline
      }
    }
  }
}
