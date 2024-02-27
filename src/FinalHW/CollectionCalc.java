package FinalHW;

import java.util.List;

public class CollectionCalc implements ICollectionCalc {

    private final Logger logger = new Logger();
    @Override
    public Double getAverageValue(List<Integer> collection) {
        int sum = 0;
        for (Integer i : collection) {
            sum += i;
        }
        return (double) sum / collection.size();
    }

    @Override
    public String compareAverageValues(List<Integer> col1, List<Integer> col2) {
        if (getAverageValue(col1) > getAverageValue(col2)) {
            return "Первый список имеет большее среднее значение";
        } else if (getAverageValue(col1) < getAverageValue(col2)) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
