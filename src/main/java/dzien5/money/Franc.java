package dzien5.money;

public class Franc extends Money {
    public Franc(double value) {
        super(value);
    }

    public void add(double value) {
        this.value += value;
    }

    public void add(Franc franc) {
        add(franc.getAmount());
    }
}
