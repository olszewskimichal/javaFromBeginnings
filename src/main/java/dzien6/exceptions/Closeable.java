package dzien6.exceptions;

import java.util.Scanner;

public class Closeable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
        }

    }

}
