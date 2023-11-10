public class ResidentialSite {
    private double _units;
    private double _rate;

    public ResidentialSite(double _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }

    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
