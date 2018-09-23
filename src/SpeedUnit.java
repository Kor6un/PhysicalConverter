import java.util.Arrays;

public enum SpeedUnit {
    KMH("kmh"),
    MPH("mph"),
    KN("kn"),
    MS("ms");

    private String unit;
    SpeedUnit(String unit) {
        this.unit = unit;
    }

    public static SpeedUnit getExemplar (String s) {
        return Arrays.stream(values())
                .filter(SpeedUnit -> SpeedUnit.unit.equals(s))
                .findFirst()
                .orElse(null);
    }

    public static boolean isSpeedUnit(String s ) {
        return getExemplar(s) != null;
    }
}
