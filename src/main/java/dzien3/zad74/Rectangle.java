package dzien3.zad74;

public class Rectangle extends Shape {

  private final double width, length;

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  @Override
  double getArea() {
    return length * width;
  }

  @Override
  void printInfo() {
    System.out.println("Prostokąt a= " + width + " b= " + length);
  }
}
