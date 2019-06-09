package excercise;

public class TrainList extends Train implements Comparable<TrainList> {
    public TrainList(int id, String carriageName, int totalPassenger) {
        super(id, carriageName, totalPassenger);
    }

    @Override
    public int compareTo(TrainList o) {
        return Integer.compare(getTotalPassenger(), o.getTotalPassenger());
    }
}
