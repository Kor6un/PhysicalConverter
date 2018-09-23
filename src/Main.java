
public class Main {
    public static void main(String[] args) throws Exception {

        DataReader dr = new DataReader(args[0]);

        Viewer viewer = new Viewer(dr);
        viewer.showSpeeds();
        viewer.showDistances();
        viewer.isDistanceConformity();

        viewer.showSoredSpeedsAscending();
    }
}
