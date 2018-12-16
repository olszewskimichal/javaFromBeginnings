package dzien6;

import java.util.regex.Pattern;

public class Zad99 {
    static Pattern pattern = Pattern.compile("\\d+[A-Z]?");

    static boolean isCorrectHouseNumber(String value) {
        return pattern.matcher(value).matches();
    }

    public static void main(String[] args) {
        System.out.println(isCorrectHouseNumber("2A"));
        System.out.println(isCorrectHouseNumber("3"));
        System.out.println(isCorrectHouseNumber("\5a"));
        System.out.println(isCorrectHouseNumber("ab4"));
        System.out.println(isCorrectHouseNumber("bc"));
    }
}
