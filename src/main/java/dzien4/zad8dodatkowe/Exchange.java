package dzien4.zad8dodatkowe;

public class Exchange {
    private final double dollarToFrancRatio;
    private final double francToDollarRatio;

    public Exchange(double dollarToFrancRatio, double francToDollarRatio) {
        this.dollarToFrancRatio = dollarToFrancRatio;
        this.francToDollarRatio = francToDollarRatio;
    }

    public double dollarToFrancRatio() {
        return dollarToFrancRatio;
    }

    public double francToDollarRatio() {
        return francToDollarRatio;
    }

    public Franc dollarToFranc(Dollar dollar1) {
        return new Franc(dollar1.getAmount() * francToDollarRatio);
    }

    public Dollar francToDollar(Franc franc) {
        return new Dollar(franc.getAmount() * dollarToFrancRatio);
    }
}
