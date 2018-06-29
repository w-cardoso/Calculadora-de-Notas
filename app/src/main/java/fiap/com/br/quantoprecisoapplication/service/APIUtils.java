package fiap.com.br.quantoprecisoapplication.service;

public class APIUtils {

    private APIUtils() {}

    public static final String BASE_URL = "http://b203600f.ngrok.io";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
