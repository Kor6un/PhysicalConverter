package utils.identifires;

import utils.constants.Constants;

import java.util.Arrays;

public enum DistanceUnit {
    KM(Constants.KM),
    MP(Constants.MP),
    KT(Constants.KT),
    M(Constants.M);

    private String unit;
    DistanceUnit(String unit) {
        this.unit = unit;
    }

    public static DistanceUnit getExemplar (String s) {
        return Arrays.stream(values())
                .filter(DistanceUnit -> DistanceUnit.unit.equals(s))
                .findFirst()
                .orElse(null);
    }

    public static boolean isDistanceUnit(String s ) {
        return getExemplar(s) != null;
    }
}
