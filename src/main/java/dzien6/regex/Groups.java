package dzien6.regex;

import java.util.regex.Pattern;

public class Groups {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a(bcd)*");
        System.out.println(pattern.matcher("a").matches());
        System.out.println(pattern.matcher("abcd").matches());
        System.out.println(pattern.matcher("abcdbcd").matches());
        System.out.println(pattern.matcher("bcdbcd").matches());

        Pattern.compile("[^abc]");
    }
}
