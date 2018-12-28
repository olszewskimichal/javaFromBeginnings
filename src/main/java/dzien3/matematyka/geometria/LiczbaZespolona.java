package dzien3.matematyka.geometria;

public class LiczbaZespolona {

  private double re;
  private double im;

  LiczbaZespolona(double re, double im) {
    this.re = re;
    this.im = im;
  }

  static LiczbaZespolona add(LiczbaZespolona a, LiczbaZespolona b) {
    return new LiczbaZespolona(a.re + b.re, a.getIm() + b.getIm());
  }

  public double getRe() {
    return re;
  }

  public void setRe(double re) {
    this.re = re;
  }

  public double getIm() {
    return im;
  }

  public void setIm(double im) {
    this.im = im;
  }

  void add(LiczbaZespolona zespolona) {
    this.re = this.re + zespolona.getRe();
    this.im = this.im + zespolona.getIm();
  }

  void substract(LiczbaZespolona zespolona) {
    this.re = this.re - zespolona.getRe();
    this.im = this.im - zespolona.getIm();
  }

  void printZespolona() {
    System.out.println("[" + re + "," + im + "]");
  }

  @Override
  public String toString() {
    return "LiczbaZespolona [re=" + re + ", im=" + im + "]";
  }

}
