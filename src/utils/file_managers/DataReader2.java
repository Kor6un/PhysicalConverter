package utils.file_managers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataReader2 {
    private String path;

    public DataReader2(String path) {
        this.path = path;
    }

    public List<String> read() throws IOException{
        return Files.readAllLines(Paths.get(path));
    }
}
