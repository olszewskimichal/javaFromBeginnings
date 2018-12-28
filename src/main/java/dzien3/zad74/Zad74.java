package dzien3.zad74;

public class Zad74 {

  public static void main(String[] args) {
    Shape tab[] = new Shape[3];
    tab[0] = new Triangle(4, 6);
    tab[1] = new Circle(6);
    tab[2] = new Rectangle(2, 10);

    for (Shape shape : tab) {
      shape.printInfo();
      System.out.println(shape.getArea());
    }
    ;
  }
}
