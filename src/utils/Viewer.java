package utils;

import domain.service_models.Distance;
import domain.service_models.Speed;
import services.Calculator;
import services.Converter;
import utils.comparators.Comparator;
import utils.file_managers.DataReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Viewer {

    private DataReader dataReader;
    private Calculator calculatDistance;

   public Viewer(DataReader dataReader) {
        this.dataReader = dataReader;
        calculatDistance = new Calculator(dataReader.getListOfSpeeds(), dataReader.getTime());

    }

    public void showSpeeds() {
        for (Speed speed: dataReader.getListOfSpeeds()) {
            Speed convertedSpeed = Converter.convertToMS(speed);
            System.out.println(new StringBuilder().append(speed)
                    .append(" = ")
                    .append(convertedSpeed.getValue())
                    .append(" ")
                    .append(convertedSpeed.getUnit()));
        }
    }

    public void showDistances(){
        System.out.println(calculatDistance.getDistanceList());
        System.out.println(calculatDistance.sortDistancesAscending());
        System.out.println(calculatDistance.sortDistancesDescending());
    }

    public void isDistanceConformity() {
        List<Distance> list = calculatDistance.sortDistancesAscending();
        boolean flag = false;
        for (Distance distance: list) {
            if (distance.getValue() >= 500 && distance.getValue() <= 501) {
                flag = true;
            }

        }
        System.out.println(flag ? "YES" : "NO");
    }

    public void showSoredSpeedsAscending() {
        List<Speed> list = new ArrayList<>(dataReader.getListOfSpeeds());
        Collections.sort(list);

        Collections.sort(list, new Comparator());
        System.out.println(list);
    }

}
