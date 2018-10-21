package services;

import domain.Essence;
import domain.Speed;
import domain.Time;

public class Converter {
    private Essence essence;

    public Converter(Essence essence) {
        this.essence = essence;
    }


    public static Speed convertToMS(Speed speed) {
        String unit = speed.getUnit();
        switch (unit) {
            case "kmh":
                return new Speed(speed.getValue() * 1000 / 3600, "ms");
            case "mph":
                return new Speed(speed.getValue() * 1609 / 3600, "ms");
            case "kn":
                return new Speed(speed.getValue() * 1852 / 3600, "ms");
            default:
                return speed;
        }
    }

    public static Time converToS(Time time) {
        String unit  = time.getUnit();
        switch (unit){
            case "h":
                return new Time(time.getValue() * 3600, "s");
            case "m":
                return new Time(time.getValue() * 60, "s");
            default:
                return time;
        }
    }
}
