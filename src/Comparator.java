public class Comparator implements java.util.Comparator<Speed> {
    @Override
    public int compare(Speed o1, Speed o2) {
        return Integer.compare(SpeedUnit.getExemplar(o1.getUnit()).ordinal(),
                SpeedUnit.getExemplar(o2.getUnit()).ordinal());
    }
}
