package dzien3.zad74;

public class Triangle extends Shape {
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    double getArea() {
        return 0.5 * a * h;
    }

    @Override
    void printInfo() {
        System.out.println("Trojkąt a= " + a + " h= " + h);
    }
}
