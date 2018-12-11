package dzien4.zad7dodatkowe;

public class Goldfish extends Fish {
    protected Goldfish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Goldfish{" +
                "name='" + name + '\'' +
                "} ";
    }
}
