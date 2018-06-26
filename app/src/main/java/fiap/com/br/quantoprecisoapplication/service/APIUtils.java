package fiap.com.br.quantoprecisoapplication.service;

public class APIUtils {

    private APIUtils() {}

    public static final String BASE_URL = "http://a52fd6fa.ngrok.io/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
