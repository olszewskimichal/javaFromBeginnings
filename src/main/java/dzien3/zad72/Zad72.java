package dzien3.zad72;

public class Zad72 {
    public static void main(String[] args) {
        Car car = new Car("model", 1993, "producer", FuelType.LPG);
        Car car2 = new Car("model", 1995, "producer", FuelType.DIESEL);
        CargoCar cargoCar = new CargoCar("model", 1995, "producer", FuelType.DIESEL, 13);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(cargoCar);
    }
}
