package dzien3.klasy;

public class PrzykladowaKlasa {

  public String pole4;
  protected String pole3;
  String pole2;
  private String pole1 = "domyslnaWartosc";

  public PrzykladowaKlasa(String pole1, String pole2, String pole3, String pole4) {
    this.pole1 = pole1;
    this.pole2 = pole2;
    this.pole3 = pole3;
    this.pole4 = pole4;
  }

  public PrzykladowaKlasa() {
  }

  public String getPole1() {
    return pole1;
  }

  public void setPole1(String pole1) {
    this.pole1 = pole1;
  }

  public String getPole2() {
    return pole2;
  }

  public void setPole2(String pole2) {
    this.pole2 = pole2;
  }

  public String getPole3() {
    return pole3;
  }

  public void setPole3(String pole3) {
    this.pole3 = pole3;
  }

  public String getPole4() {
    return pole4;
  }

  public void setPole4(String pole4) {
    this.pole4 = pole4;
  }

  @Override
  public String toString() {
    return "PrzykladowaKlasa [pole1=" + pole1 + ", pole2=" + pole2 + ", pole3=" + pole3 + ", pole4=" + pole4 + "]";
  }

}
