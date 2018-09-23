import java.util.ArrayList;
import java.util.Collections;
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

   /* public List<Speed> getSortedSpeedDescending () {

        List<Speed> tempList = new ArrayList<>();
        for (Speed s: speedList) {
            tempList.add(Converter.convertToMS(s));
        }


        Collections.sort(tempList, Collections.reverseOrder());
        return tempList;
    }*/

}
