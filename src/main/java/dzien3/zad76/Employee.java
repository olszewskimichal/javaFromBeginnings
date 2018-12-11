package dzien3.zad76;

public class Employee implements Measurable {
    private final double earnings;

    public Employee(double earnings) {
        this.earnings = earnings;
    }

    @Override
    public double getMeasure() {
        return earnings;
    }
}
