package seminars.fourth.database;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class DataProcessorTest {
    @Test
    void testDataProcessor() {
        Database mockedDatabase = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(mockedDatabase);
        when(mockedDatabase.query(anyString())).thenReturn(Arrays.asList("123", "234", "345"));

        List<String> res = dataProcessor.processData("SELECT * FROM TABLE1");

        assertThat(res).isNotNull().isNotEmpty().hasSize(3);
    }
}