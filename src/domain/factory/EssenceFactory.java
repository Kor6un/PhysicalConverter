package domain.factory;

import domain.Distance;
import domain.Essence;
import domain.Speed;
import domain.Time;
import utils.exception.Exception;
import utils.identifires.DistanceUnit;
import utils.identifires.SpeedUnit;
import utils.identifires.TimeUnit;

import static utils.constants.Constants.SPACE;

public class EssenceFactory {
    public static Essence getEssence(String s) {

        String[] fields = s.split("[\\s]+");

        if (TimeUnit.isTimeUnit(fields[1])) {
            return new Time(Double.parseDouble(fields[0]), fields[1]);
        } else if (SpeedUnit.isSpeedUnit(fields[1])) {
            return new Speed(Double.parseDouble(fields[0]), fields[1]);
        } else if (DistanceUnit.isDistanceUnit(fields[1])) {
            return new Distance(Double.parseDouble(fields[0]), fields[1]);
        }

        throw new Exception("Unknown unit");



        /*
        return (TimeUnit.isTimeUnit(fields[1])) ? new Time(Double.parseDouble(fields[0]), fields[1]) :
                SpeedUnit.isSpeedUnit(fields[1]) ? new Speed(Double.parseDouble(fields[0]), fields[1])
                                                : new Distance(Double.parseDouble(fields[0]), fields[1]);*/
    }
}
