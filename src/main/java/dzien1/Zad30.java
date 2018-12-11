package dzien1;

public class Zad30 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println("Wcisnij 1 by doda�");
        System.out.println("Wcisnij 2 by odj��");
        System.out.println("Wcisnij 3 by pomno�y�");
        System.out.println("Wcisnij 4 by podzieli�");
        System.out.println("Wcisnij 0 by wyj��");

        int operation = 4; // Zamieni� na Scanner .nextInt
        switch (operation) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println("wynik =\t" + (double) a / b);
                break;

            default:
                break;
        }
    }
}
