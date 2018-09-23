import java.util.Arrays;

public enum TimeUnit {
    HOUR("h"),
    MINUTE("m"),
    SECOND("s");

    private String unit;
    TimeUnit(String unit){
        this.unit = unit;
    }

    public static TimeUnit getExemplar(String s) {
        return Arrays.stream(values())
                     .filter(timeUnit -> timeUnit.unit.equals(s))
                     .findFirst()
                     .orElse(null);
    }

    public static boolean isTimeUnit(String s) {
        return getExemplar(s) != null;
    }
}
