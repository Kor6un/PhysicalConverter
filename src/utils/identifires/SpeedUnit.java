package utils.identifires;

import domain.Essence;
import domain.Speed;
import services.Converter;
import utils.constants.Constants;

import java.util.Arrays;
import java.util.function.Function;

public enum SpeedUnit {
    KMH(Constants.KMH, Converter::convertToKMH),
    MPH(Constants.MPH, Converter::convertToMPH),
    KN(Constants.KN, Converter::convertToKN),
    MS(Constants.MS, Converter::convertToMS);

    private String unit;
    Function<Essence, Speed> function;
    SpeedUnit(String unit, Function<Essence, Speed> function) {
        this.unit = unit;
        this.function = function;
    }

    public static SpeedUnit getExemplar (String s) {
        return Arrays.stream(values())
                .filter(SpeedUnit -> SpeedUnit.unit.equals(s))
                .findFirst()
                .orElse(null);
    }

    public Function<Essence, Speed> getFunction() {
        return function;
    }

    public static boolean isSpeedUnit(String s ) {
        return getExemplar(s) != null;
    }
}
