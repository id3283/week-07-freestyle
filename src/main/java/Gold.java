public class Gold implements Asset{
    private int ounces;

    public Gold(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces() {
        return ounces;
    }

    @Override
    public double getValue() {
        return this.ounces * 3500;
    }
}
