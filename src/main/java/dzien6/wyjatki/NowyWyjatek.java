package dzien6.wyjatki;

public class NowyWyjatek extends RuntimeException {
    private String cos;

    public NowyWyjatek(String message) {
        super(message);
    }

    public NowyWyjatek(String message, String cos) {
        super(message);
        this.cos = cos;
    }
}
