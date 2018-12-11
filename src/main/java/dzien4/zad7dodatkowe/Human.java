package dzien4.zad7dodatkowe;

public class Human extends Mammal {
    protected Human(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                "} ";
    }
}
