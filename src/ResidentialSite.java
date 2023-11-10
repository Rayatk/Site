public class ResidentialSite extends Site {
    public ResidentialSite(double _units, double _rate) {
        super(_units, _rate);
    }

    public double getBaseAmount() {
        return get_units() * get_rate();
    }

    public double getTaxAmount() {
        return getBaseAmount() * TAX_RATE;
    }
}
