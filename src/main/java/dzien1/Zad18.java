package dzien1;

import java.util.Scanner;

public class Zad18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczb�");
        int number = scanner.nextInt();
        System.out.println(number / 3);
        System.out.println(number % 3);
        scanner.close();
    }

}
