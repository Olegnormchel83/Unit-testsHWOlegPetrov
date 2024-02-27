package FinalHW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionCreator implements ICollectionCreator {
    @Override
    public List<Integer> integerCollection(int size, int min, int max) {
        List<Integer> res = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            res.add(random.nextInt(min, max));
        }

        return res;
    }
}
