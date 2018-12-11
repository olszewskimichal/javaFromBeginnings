package dzien4;

import java.util.Arrays;

public class StringExamples {
    public static void main(String[] args) {
        String value = "Ala ma kota \n";
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());

        String replace = value.replace("Ala", "Grazyna");
        System.out.println(replace);

        System.out.println(value.length());
        System.out.println(value.trim());

        char c = value.charAt(0);
        System.out.println(c);

        char[] chars = value.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println("abc".compareTo("abc"));
        System.out.println("abc".compareTo("abcde"));
        System.out.println("abc".equals("abc"));
        System.out.println("abc".equals("Abc"));
        System.out.println("abc".equalsIgnoreCase("ABC"));
        System.out.println(value.startsWith("Ala"));
        System.out.println(value.endsWith("Ala"));

        char a = Character.toUpperCase('a');
        char b = Character.toLowerCase('B');

        String s = new String(value.toCharArray());
        System.out.println(a + " " + b);

        boolean empty = value.isEmpty();
        boolean contains = value.contains("kota");
        System.out.println(contains);
    }
}
