package domain.service_models;

public abstract class Essence {
    private Double value;

    Essence (Double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
