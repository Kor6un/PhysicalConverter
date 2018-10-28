package xernja;

import domain.service_models.Distance;
import domain.service_models.Speed;
import domain.service_models.Time;

import java.util.List;

public class DataStorage {
    private List<Speed> speeds;
    private List<Distance> distances;
    private Time time;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setSpeeds(List<Speed> speeds) {
        this.speeds = speeds;
    }

    public void setDistances(List<Distance> distances) {
        this.distances = distances;
    }

    public List<Speed> getSpeeds() {
        return speeds;
    }

    public List<Distance> getDistances() {
        return distances;
    }
}
