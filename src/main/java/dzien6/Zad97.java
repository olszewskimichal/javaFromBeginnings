package dzien6;

import java.util.regex.Pattern;

public class Zad97 {

    private static Pattern pattern = Pattern.compile("-?\\d+(,\\d+)?");

    static boolean isCorrectNumber(String value) {
        return pattern.matcher(value).matches();
    }

    public static void main(String[] args) {
        System.out.println(isCorrectNumber("-10"));
        System.out.println(isCorrectNumber("10,121"));
        System.out.println(isCorrectNumber("10,21,21"));
        System.out.println(isCorrectNumber("18-12"));
        System.out.println(isCorrectNumber("123,"));
    }
}
