package dzien2;

public class Enum {

  public static void main(String[] args) {
    TshirtSize l = TshirtSize.L;
    TshirtSize xl = TshirtSize.XL;
    System.out.println(l + " " + xl);

    for (TshirtSize tshirtSize : TshirtSize.values()) {
      System.out.println(tshirtSize.ordinal() + " " + tshirtSize.name() + " " + tshirtSize.toString());
    }

    switch (l) {
      case S:
        System.out.println("Kupiles koszulke w rozmiarze small");
        break;
      case M:
        System.out.println("Kupiles koszulke w rozmiarze medium");
        break;
      case L:
        System.out.println("Kupiles koszulke w rozmiarze large");
        break;
      case XL:
        System.out.println("Kupiles koszulke w rozmiarze extra large");
        break;
      default:
        break;
    }

    System.out.println(TshirtSize2.valueOf("D"));
  }

  enum TshirtSize {
    S, M, L, XL;
  }

  public enum TshirtSize2 {
    S(48, 71, 36), M(52, 74, 38), L(56, 76, 41), XL(61, 79, 41);
    private int chestWidth;
    private int shirtLength;
    private int sleeveLength;

    private TshirtSize2(int chestWidth, int shirtLength, int sleeveLength) {
      this.chestWidth = chestWidth;
      this.shirtLength = shirtLength;
      this.sleeveLength = sleeveLength;
    }

    public int getChestWidth() {
      return chestWidth;
    }

    public int getShirtLength() {
      return shirtLength;
    }

    public int getSleeveLength() {
      return sleeveLength;
    }

    @Override
    public String toString() {
      return "TshirtSize2{" +
          "chestWidth=" + chestWidth +
          ", shirtLength=" + shirtLength +
          ", sleeveLength=" + sleeveLength +
          "} " + super.toString();
    }
  }

}
