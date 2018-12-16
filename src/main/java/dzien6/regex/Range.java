package dzien6.regex;

import java.util.regex.Pattern;

public class Range {
    static void regex(Pattern pattern) {
        System.out.println(pattern.matcher("a").matches());
        System.out.println(pattern.matcher("1").matches());
        System.out.println(pattern.matcher("d").matches());
        System.out.println(pattern.matcher("5").matches());
        System.out.println(pattern.matcher("10").matches());
        System.out.println(pattern.matcher("[").matches());

    }

    public static void main(String[] args) {
        regex(Pattern.compile("[abcde]"));
        System.out.println();
        regex(Pattern.compile("[a-zA-Z]"));
        System.out.println();
        regex(Pattern.compile("[a-c3-5]"));
        System.out.println();
        regex(Pattern.compile("[a-c14-7]"));
        System.out.println();
        regex(Pattern.compile("[abc\\[\\]]"));
        System.out.println();
        regex(Pattern.compile("[.]"));
    }
}
