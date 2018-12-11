package dzien1;

import java.util.Scanner;

public class StandardoweWejscie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny ci�g znak�w: ");
        String nextLine = scanner.nextLine();
        System.out.println(nextLine);

        System.out.println("Podaj liczb� ca�kowita ");
        int nextInt = scanner.nextInt();
        System.out.println(nextInt);

        System.out.println("Podaj liczb� zmiennoprzecinkowa ");
        double nextDouble = scanner.nextDouble();
        System.out.println(nextDouble);

        scanner.close();
    }
}
