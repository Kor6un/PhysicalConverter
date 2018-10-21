package domain;

import domain.Essence;

public class Time extends Essence {

    private String unit;
    public Time(double value, String unit) {
        super(value);
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return getValue() + "_in_" + unit;
    }
}
