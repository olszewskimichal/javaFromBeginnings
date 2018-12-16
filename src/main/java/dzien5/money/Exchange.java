package dzien5.money;

public class Exchange {
    private double dollarToFranc;
    private double francToDollar;

    public Exchange(double dollarToFranc, double francToDollar) {
        this.dollarToFranc = dollarToFranc;
        this.francToDollar = francToDollar;
    }

    public double dollarToFrancRatio() {
        return dollarToFranc;
    }

    public double francToDollarRatio() {
        return francToDollar;
    }

    public Franc dollarToFranc(Dollar dollar1) {
        return new Franc(dollar1.getAmount() * francToDollarRatio());
    }

    public Dollar francToDollar(Franc obj) {
        return new Dollar(obj.getAmount() * dollarToFrancRatio());
    }
}
