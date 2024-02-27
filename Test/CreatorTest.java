import FinalHW.CollectionCreator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CreatorTest {

    @ParameterizedTest(name = "Array length is {0}")
    @ValueSource(ints = {100, 500, 100_000, 500_000})
    void testCreator2(int size) {
        CollectionCreator collectionCreator = new CollectionCreator();

        List<Integer> res = collectionCreator.integerCollection(size, 0, 2);

        assertThat(res).
                isNotEmpty().
                hasSize(size).
                contains(0).
                contains(1);
    }
}
