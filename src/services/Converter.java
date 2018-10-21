package services;

import domain.Essence;
import domain.Speed;
import domain.Time;
import domain.factory.EssenceFactory;
import utils.exception.Exception;
import utils.identifires.SpeedUnit;

import static utils.constants.Constants.*;

public class Converter {

    public static Speed convertToMS(Essence essence) {
        if (essence instanceof Speed) {
            Speed speed = (Speed) essence;

            String unit = speed.getUnit();
            switch (unit) {
                case KMH:
                    return new Speed(speed.getValue() * 1000 / 3600, MS);
                case MPH:
                    return new Speed(speed.getValue() * 1609 / 3600, MS);
                case KN:
                    return new Speed(speed.getValue() * 1852 / 3600, MS);
                default:
                    return speed;
            }
        }
        throw new Exception("Is not speed");
    }

    public static Speed convertToKMH(Essence essence) {
        if (essence instanceof Speed) {
            Speed speed = (Speed) essence;

            String unit = speed.getUnit();
            switch (unit) {
                case MPH:
                    return new Speed(speed.getValue() * 1.609, KMH);
                case KN:
                    return new Speed(speed.getValue() * 1.852 , KMH);
                case MS:
                    return new Speed(speed.getValue() * 3600 / 1000, KMH);
                default:
                    return speed;
            }
        }
        throw new Exception("Is not speed");
    }

    public static Speed convertToKN(Essence essence) {
        if (essence instanceof Speed) {
            Speed speed = (Speed) essence;

            String unit = speed.getUnit();
            switch (unit) {
                case KMH:
                    return new Speed(speed.getValue() / 1.852 , KN);
                case MPH:
                    return new Speed(speed.getValue() * 0.869, KN);
                case MS:
                    return new Speed(speed.getValue() * 3600 / 1852 , KN);
                default:
                    return speed;
            }
        }
        throw new Exception("Is not speed");
    }

    public static Speed convertToMPH(Essence essence) {
        if (essence instanceof Speed) {
            Speed speed = (Speed) essence;

            String unit = speed.getUnit();
            switch (unit) {
                case KMH:
                    return new Speed(speed.getValue() / 1.609 , MPH);
                case KN:
                    return new Speed(speed.getValue() / 0.869 , MPH);
                case MS:
                    return new Speed(speed.getValue() * 1609 / 3600 , MPH);
                default:
                    return speed;
            }
        }
        throw new Exception("Is not speed");
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

    public static String convert (String input, SpeedUnit unit) {
        Essence essence;
        try {
            essence = EssenceFactory.getEssence(input);
            return unit.getFunction().apply(essence).toString();
        }catch (Exception e) {
            return input + " - " + e.getMessage();
        }
    }

}
