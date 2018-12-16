package dzien1;

import java.util.Scanner;

public class CzyParzysta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        if (nextInt % 2 == 0) {
            System.out.println("Liczba parzysta");
        } else System.out.println("Liczba nieparzysta");


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a jest wieksze od b");
        } else System.out.println("b jest wieksza lub rowne a");
    }
}
