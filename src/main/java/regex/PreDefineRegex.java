package regex;

import java.util.regex.Pattern;

public class PreDefineRegex {
    static void regex(Pattern pattern) {
        System.out.println(pattern.pattern());
        System.out.println("1" + " " + pattern.matcher("1").matches());
        System.out.println("a" + " " + pattern.matcher("a").matches());
        System.out.println("_" + " " + pattern.matcher("_").matches());
        System.out.println("!" + " " + pattern.matcher("!").matches());
        System.out.println("space" + " " + pattern.matcher(" ").matches());
        System.out.println();
    }

    public static void main(String[] args) {
        regex(Pattern.compile("\\d"));
        regex(Pattern.compile("\\D"));
        regex(Pattern.compile("\\w"));
        regex(Pattern.compile("\\W"));
        regex(Pattern.compile("\\s"));
        regex(Pattern.compile("\\S"));

        Pattern.compile("\\d{2}-\\d{3}");
    }

}
