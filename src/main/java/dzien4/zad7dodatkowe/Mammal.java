package dzien4.zad7dodatkowe;

public class Mammal extends Animal {
    protected Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                "} ";
    }
}
