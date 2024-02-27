package FinalHW;

import java.util.List;

public class Main {
    static CollectionCalc cCalc;
    static CollectionCreator cCreator;

    public static void main(String[] args) {
        init();

        List<Integer> col1 = cCreator.integerCollection(5, 0, 10);
        List<Integer> col2 = cCreator.integerCollection(5, 0, 10);
        System.out.println("col1 = " + col1);
        System.out.println("col2 = " + col2);

        double avg1 = cCalc.getAverageValue(col1);
        double avg2 = cCalc.getAverageValue(col2);

        System.out.println("avg1 = " + avg1);
        System.out.println("avg2 = " + avg2);

        cCalc.compareAverageValues(col1, col2);
    }

    private static void init() {
        cCreator = new CollectionCreator();
        cCalc = new CollectionCalc();
    }
}
