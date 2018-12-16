import java.util.regex.Pattern;

public class Zad100 {

    static Pattern pattern = Pattern.compile("[A-Z][a-z]+([ -][A-Z][a-z]+)?");

    public static void main(String[] args) {
        System.out.println(pattern.matcher("Wroclaw").matches());
        System.out.println(pattern.matcher("Zielona Gora").matches());
        System.out.println(pattern.matcher("Bielsko-Biala").matches());
        System.out.println(pattern.matcher("Ptysiow123").matches());
        System.out.println(pattern.matcher("wroclaw").matches());
    }
}
