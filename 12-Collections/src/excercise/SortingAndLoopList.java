package excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAndLoopList {

    public static void main(String[] args) {

        TrainList trainList1 = new TrainList(1, "G1", 10);
        TrainList trainList2 = new TrainList(2, "G2", 5);
        TrainList trainList3 = new TrainList(2, "G3", 7);

        List<TrainList> trainLists = new ArrayList<>();

        trainLists.add(trainList1);
        trainLists.add(trainList2);
        trainLists.add(trainList3);

        Collections.sort(trainLists);

        for (TrainList tl : trainLists) {
            System.out.println("id: " + tl.getId() + " carriageName: " + tl.getCarriageName() + " totalPassenger: " + tl.getTotalPassenger());
        }
    }

}
