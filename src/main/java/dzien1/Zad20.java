package dzien1;

import java.util.Scanner;

public class Zad20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean value1 = value % 2 == 0 && value % 5 == 0;
        boolean value2 = value % 2 == 0 || value % 3 == 0;

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value1 && value2);
        scanner.close();
    }
}
