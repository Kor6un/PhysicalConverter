package domain;

public class Speed extends Essence implements Comparable <Speed> {
    private String unit;
    public Speed (double value, String unit) {
        super(value);
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return getValue() + " " + unit;
    }

    @Override
    public int compareTo(Speed o) {
        return Double.compare(this.getValue(), o.getValue());
    }
}
