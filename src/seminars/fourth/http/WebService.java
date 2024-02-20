package seminars.fourth.http;

public class WebService {
    HttpClient httpClient;

    public WebService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public String request(String body) {
        return httpClient.get(body);
    }
}
