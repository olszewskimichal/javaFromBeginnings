package dzien3.zad74;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    void printInfo() {
        System.out.println("Kolo r= " + radius);
    }
}
