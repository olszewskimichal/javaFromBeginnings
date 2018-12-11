package dzien3;

public class Zad70 {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(1, 2);
        Punkt punkt2 = new Punkt(1, 2);
        System.out.println(punkt == punkt2);
        System.out.println(punkt.hashCode());
        System.out.println(punkt2.hashCode());
        System.out.println(punkt.equals(punkt2));
    }
}
