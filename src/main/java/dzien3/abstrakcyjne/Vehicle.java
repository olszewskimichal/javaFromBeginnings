package dzien3.abstrakcyjne;

public abstract class Vehicle {
    private int numberOfWheels;
    private Engine engine;

    public Vehicle(Engine engine, int numberOfWheels) {
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;

    }

}
