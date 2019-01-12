package dzien7.generyki;

public class BoxOnSteroids<T extends Fruit> {
    public T fruit;

    public BoxOnSteroids(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }

    public static void main(String[] args) {
        BoxOnSteroids<Apple> appleBox = new BoxOnSteroids<>(new Apple());
        BoxOnSteroids<Orange> orangeBox = new BoxOnSteroids<>(new Orange());
        Apple apple = appleBox.getFruit();
        Orange orange = orangeBox.getFruit();
/*        BoxOnSteroids<String> stringBox = new BoxOnSteroids<>("ABC");
        BoxOnSteroids<Integer> integerBox = new BoxOnSteroids<>(123);*/
    }
}

class Fruit {
}

class Orange extends Fruit {

}

class Apple extends Fruit {

}
