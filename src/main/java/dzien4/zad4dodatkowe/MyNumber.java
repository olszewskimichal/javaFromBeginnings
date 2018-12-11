package dzien4.zad4dodatkowe;

public class MyNumber {
    private final double value;

    public MyNumber(double value) {
        this.value = value;
    }

    boolean isOdd() {
        return value % 2 == 1;
    }

    boolean isEven() {
        return value % 2 == 0;
    }

    double sqrt() {
        return Math.sqrt(value);
    }

    double pow(MyNumber x) {
        return Math.pow(value, x.value);
    }

    double add(MyNumber x) {
        return value + x.value;
    }

    double substract(MyNumber x) {
        return value - x.value;
    }

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(16);
        System.out.println(myNumber.isOdd());
        System.out.println(myNumber.isEven());
        System.out.println(myNumber.sqrt());
        System.out.println(myNumber.pow(new MyNumber(2)));
        System.out.println(myNumber.add(new MyNumber(2)));
        System.out.println(myNumber.substract(new MyNumber(2)));
    }
}
