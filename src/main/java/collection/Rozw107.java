package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rozw107 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //System.out.println("Podaj liczbe od 1 do 12");
        int x = 0;

        Map<Integer, String> map = new HashMap();
        map.put(1, "Styczeń");
        map.put(2, "Luty");
        map.put(3, "Marzec");
        map.put(4, "Kwiecień");
        map.put(5, "Maj");
        map.put(6, "Czerwiec");
        map.put(7, "Lipiec");
        map.put(8, "Soerpień");
        map.put(9, "Wresień");
        map.put(10, "Październik");
        map.put(11, "Listopad");
        map.put(12, "Grudzień");

        boolean z = false;

        while (z != true) {
            System.out.println("Podaj liczbe od 1 do 12");
            x = sc.nextInt();
            if (x < 1 || x > 12) {
                System.out.println("Niewłaściwa liczba");

            } else {
                System.out.println(map.get(x));
                z = true;
            }

        }
    }
}
