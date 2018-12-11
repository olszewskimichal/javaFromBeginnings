package dzien4.zad7dodatkowe;

public class Fish extends Animal {
    protected Fish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                "} ";
    }
}
