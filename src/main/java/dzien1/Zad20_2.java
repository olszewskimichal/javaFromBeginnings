package dzien1;

import java.util.Scanner;

public class Zad20_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        int val = scanner.nextInt();
        boolean podzielna2 = val % 2 == 0;
        boolean podzielna5 = val % 5 == 0;

        boolean podzielna25 = podzielna2 && podzielna5;
        System.out.println("Liczba jest podzielna przez 2 i 5 = " + podzielna25);

        boolean podzielna3 = val % 3 == 0;
        boolean podzielna2lub3 = podzielna2 || podzielna3;
        System.out.println("podzielna2lub3 = " + podzielna2lub3);

        boolean rowne = podzielna25 == podzielna2lub3;
        System.out.println("rowne = " + rowne);
    }
}
