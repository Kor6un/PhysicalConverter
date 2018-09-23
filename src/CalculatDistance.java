import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculatDistance {
    private List<Speed> speedList;
    private Time time;
    private List<Distance> distanceList;

    CalculatDistance (List<Speed> speed, Time time) {
        this.speedList = speed;
        this.time = time;
    }

    public List<Distance> getDistanceList () {
        distanceList = new ArrayList<>();
        for (Speed speed : this.speedList) {
            distanceList.add(new Distance (Converter.convertToMS(speed).getValue()
                    * Converter.converToS(time).getValue()));
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
