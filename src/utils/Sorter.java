package utils;

import domain.service_models.Distance;
import domain.service_models.Speed;

import java.util.ArrayList;
import java.util.List;

public class Sorter {
    List<Distance> distanceList;
    List<Speed> speedList;

    public Sorter(List<Distance> distanceList, List<Speed> speedList) {
        this.distanceList = distanceList;
        this.speedList = speedList;
    }


    

    public List<Speed> getSortedSpeedAscending () {
        List<Speed> tempList = new ArrayList<>(speedList);





        return tempList;
    }

   /* public List<domain.service_models.Speed> getSortedSpeedDescending () {

        List<domain.service_models.Speed> tempList = new ArrayList<>();
        for (domain.service_models.Speed s: speedList) {
            tempList.add(services.Converter.convertToMS(s));
        }


        Collections.sort(tempList, Collections.reverseOrder());
        return tempList;
    }*/

}
