package dzien6.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

    public static void main(String[] args) {
        Pattern compiledPattern = Pattern.compile("Nazywam");
        Matcher matcher = compiledPattern.matcher("Nazywam sie Michał");

        System.out.println(matcher.find());     //jezeli się zawiera ale nie musi się pokrywać w całości
        System.out.println(matcher.matches());  //true w całości się pokrywa
    }

}
