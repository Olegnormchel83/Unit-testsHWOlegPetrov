import FinalHW.CollectionCalc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {
    CollectionCalc cCalc;
    @BeforeEach
    public void initEach() {
        cCalc = new CollectionCalc();
    }

    @Test
    void testGetAverageValue() {
        List<Integer> col = new ArrayList<>(Arrays.asList(7, 7, 7, 7));

        double avg = cCalc.getAverageValue(col);

        assertThat(avg).isEqualTo(7.0);
    }

    @Test
    void testCompareAveragesFirstBigger() {
        String actual = "Первый список имеет большее среднее значение";

        List<Integer> col1 = new ArrayList<>(Arrays.asList(7, 7, 7, 7));
        List<Integer> col2 = new ArrayList<>(Arrays.asList(5, 5, 5, 5));

        assertEquals(cCalc.compareAverageValues(col1, col2), actual);
    }

    @Test
    void testCompareAveragesSecondBigger() {
        String actual = "Второй список имеет большее среднее значение";

        List<Integer> col1 = new ArrayList<>(Arrays.asList(7, 7, 7, 7));
        List<Integer> col2 = new ArrayList<>(Arrays.asList(9, 9, 9, 9));

        assertEquals(cCalc.compareAverageValues(col1, col2), actual);
    }

    @Test
    void testCompareAveragesValuesAreEqual() {
        String actual = "Средние значения равны";

        List<Integer> col1 = new ArrayList<>(Arrays.asList(7, 7, 7, 7));
        List<Integer> col2 = new ArrayList<>(Arrays.asList(7, 7, 7, 7));

        assertEquals(cCalc.compareAverageValues(col1, col2), actual);
    }
}
