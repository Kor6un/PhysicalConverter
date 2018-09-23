public class EssenceFactory {
    public static Essence getEssence(String s) {
        String[] fields = s.split(" ");
        return (TimeUnit.isTimeUnit(fields[1])) ? new Time(Double.parseDouble(fields[0]), fields[1]) :
                SpeedUnit.isSpeedUnit(fields[1]) ? new Speed(Double.parseDouble(fields[0]), fields[1])
                                                : new Distance(Double.parseDouble(fields[0]));
    }
}
