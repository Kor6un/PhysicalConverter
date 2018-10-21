package utils.file_managers;

import domain.Speed;
import domain.Time;
import utils.identifires.TimeUnit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    private List<Speed> ListOfSpeeds = new ArrayList<>();
    private Time time;

    public DataReader(String path) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String strLine;
            Boolean flag = true;
            while ((strLine = br.readLine()) != null) {
                if (flag == true) {
                    String[] timeArray = strLine.split("\\s");
                    if (TimeUnit.isTimeUnit(timeArray[1])) {
                        time = new Time(Double.parseDouble(timeArray[0]), timeArray[1]);
                        flag = false;
                    } else {
                        throw new Exception("read the task");
                    }
                }
                else {
                    String[] speed = strLine.split("\\s");
                    ListOfSpeeds.add(new Speed(Double.parseDouble(speed[0]), speed[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public List<Speed> getListOfSpeeds() {
        return ListOfSpeeds;
    }

    public Time getTime() {
        return time;
    }
}
