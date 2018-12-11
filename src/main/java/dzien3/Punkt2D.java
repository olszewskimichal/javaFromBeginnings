package dzien3;

public class Punkt2D {
    private double x;
    private double y;

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "dzien3.Punkt2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
