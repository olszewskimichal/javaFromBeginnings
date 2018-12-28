package dzien6.wyjatki;

public class WyjatekThrow {

  public static void main(String[] args) {
    throw new NowyWyjatek("powód", "coś");
  }

  static class NowyWyjatek extends RuntimeException {

    private String cos;

    public NowyWyjatek(String message, String cos) {
      super(message);
      this.cos = cos;
    }

    public NowyWyjatek(String cos) {
      super("domyslny komentarz");
      this.cos = cos;
    }
  }
}

