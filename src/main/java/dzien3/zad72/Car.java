package dzien3.zad72;

import java.util.Objects;

public class Car {
    private String model;
    private Integer year;
    private String producer;
    private FuelType fuelType;

    public Car(String model, Integer year, String producer, FuelType fuelType) {
        this.model = model;
        this.year = year;
        this.producer = producer;
        this.fuelType = fuelType;
    }

    public final String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getProducer() {
        return producer;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", producer='" + producer + '\'' +
                ", fuelType=" + fuelType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) &&
                Objects.equals(year, car.year) &&
                Objects.equals(producer, car.producer) &&
                fuelType == car.fuelType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, producer, fuelType);
    }
}

enum FuelType {
    DIESEL,
    LPG,
    PETROL
}