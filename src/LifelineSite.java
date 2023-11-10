public class LifelineSite extends Site {
    public LifelineSite(double _units, double _rate) {
        super(_units, _rate);
    }

    public double getBaseAmount() {
        return get_units() * get_rate() * 0.5;
    }

    public double getTaxAmount() {
        return getBaseAmount() * TAX_RATE * 0.2;
    }
}
