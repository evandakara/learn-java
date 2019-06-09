package excercise;

import java.util.*;

public class SortingAndLoopSet {

    public static void main(String[] args) {

        TrainSet trainSet1 = new TrainSet(1, "G1", 10);
        TrainSet trainSet2 = new TrainSet(2, "G2", 5);
        TrainSet trainSet3 = new TrainSet(2, "G3", 7);

        Set<TrainSet> trainSets = new TreeSet<>();

        trainSets.add(trainSet1);
        trainSets.add(trainSet2);
        trainSets.add(trainSet3);

        for (TrainSet ts : trainSets) {
            System.out.println("id: " + ts.getId() + " carriageName: " + ts.getCarriageName() + " totalPassenger: " + ts.getTotalPassenger());
        }
    }

}


