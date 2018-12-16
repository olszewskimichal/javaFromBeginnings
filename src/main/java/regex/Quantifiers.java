package regex;

import java.util.regex.Pattern;

public class Quantifiers {

    static void regex(Pattern pattern) {
        System.out.println(pattern.matcher("ab").matches());
        System.out.println(pattern.matcher("b").matches());
        System.out.println(pattern.matcher("abb").matches());
        System.out.println(pattern.matcher("aaaab").matches());
        System.out.println(pattern.matcher("aaaabc").matches());
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a*b");
        System.out.println(pattern.matcher("ab").matches());
        regex(pattern);
        System.out.println();
        regex(Pattern.compile("a+b"));
        System.out.println();
        regex(Pattern.compile("a?b"));
        System.out.println();
        regex(Pattern.compile("a{1,4}b"));
        System.out.println();
        regex(Pattern.compile("a{3,}b"));
        System.out.println();
        regex(Pattern.compile("a{3}b"));
    }
}
