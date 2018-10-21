package utils;

import domain.Distance;
import domain.Speed;

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

   /* public List<domain.Speed> getSortedSpeedDescending () {

        List<domain.Speed> tempList = new ArrayList<>();
        for (domain.Speed s: speedList) {
            tempList.add(services.Converter.convertToMS(s));
        }


        Collections.sort(tempList, Collections.reverseOrder());
        return tempList;
    }*/

}
