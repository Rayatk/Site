public abstract class Site {
    public static double TAX_RATE = 0.05;

    private double _units;
    private double _rate;

    public abstract double getBaseAmount();
    public abstract double getTaxAmount();

    public Site(double _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }

    public double get_units() {
        return _units;
    }

    public double get_rate() {
        return _rate;
    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
}
