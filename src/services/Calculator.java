package services;

import domain.service_models.Distance;
import domain.service_models.Speed;
import domain.service_models.Time;
import utils.constants.Constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    private List<Speed> speedList;
    private Time time;
    private List<Distance> distanceList;

    public Calculator(List<Speed> speed, Time time) {
        this.speedList = speed;
        this.time = time;
    }

    public List<Distance> getDistanceList () {
        distanceList = new ArrayList<>();
        for (Speed speed : this.speedList) {
            distanceList.add(new Distance (Converter.convertToMS(speed).getValue()
                    * Converter.converToS(time).getValue(), Constants.KM));
        }
        return distanceList;
    }
    public List<Distance> sortDistancesAscending() {
        List<Distance> tempList = new ArrayList<>(distanceList);
        Collections.sort(tempList);
        return tempList;
    }

    public List<Distance> sortDistancesDescending() {
        List<Distance> tempList = new ArrayList<>(distanceList);
        Collections.sort(tempList, Collections.reverseOrder());
        return tempList;
    }
}
