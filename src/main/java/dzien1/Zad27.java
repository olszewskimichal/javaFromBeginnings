package dzien1;

import java.util.Scanner;

public class Zad27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        int value = c;
        if (value >= 65 && value <= 90)
            System.out.println("Wielka litera");
        else if (value >= 97 && value <= 122)
            System.out.println("ma�a litera");
        else if (value >= 48 && value <= 57)
            System.out.println("cyfra");
        else
            System.out.println("inny znak");
        scanner.close();
    }
}
