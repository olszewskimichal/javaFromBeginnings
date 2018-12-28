package dzien3.zad72;

import java.util.Objects;

public class CargoCar extends Car {

  private Integer capacity;

  public CargoCar(String model, Integer year, String producer, FuelType fuelType, Integer capacity) {
    super(model, year, producer, fuelType);
    this.capacity = capacity;
  }

  public Integer getCapacity() {
    return capacity;
  }

  @Override
  public String toString() {
    return "CargoCar{" +
        "capacity=" + capacity +
        "} " + super.toString();
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CargoCar)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    CargoCar cargoCar = (CargoCar) o;
    return Objects.equals(capacity, cargoCar.capacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), capacity);
  }
}
