package seminars.fourth.http;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class WebServiceTest {
    @Test
    void testWebService() {
        HttpClient mockedHttpClient = mock(HttpClient.class);
        WebService webService = new WebService(mockedHttpClient);
        when(mockedHttpClient.get(anyString())).thenReturn("Ok");

        String ans = webService.request("body");

        assertThat(ans).isEqualTo("Ok");
    }
}
