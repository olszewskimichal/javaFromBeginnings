package dzien3.klasy;

public class Zad67 {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(0, 0);
        System.out.println(punkt);
    }
}

class Punkt {
    private int x;
    private int y;

    public Punkt() {
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt [x=" + x + ", y=" + y + "]";
    }

}
