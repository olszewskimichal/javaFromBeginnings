package dzien1;

import java.util.Scanner;

public class Zad22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe z przecinkiem");
        int result = (int) scanner.nextDouble();
        System.out.println(result);
        scanner.close();
    }
}
