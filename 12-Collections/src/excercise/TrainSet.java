package excercise;

public class TrainSet extends Train implements Comparable<TrainSet> {
    public TrainSet(int id, String carriageName, int totalPassenger) {
        super(id, carriageName, totalPassenger);
    }

    @Override
    public int compareTo(TrainSet o) {
        return Integer.compare(getId(), o.getId());
    }
}
