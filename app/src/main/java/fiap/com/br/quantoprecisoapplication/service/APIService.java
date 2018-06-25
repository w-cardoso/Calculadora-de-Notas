package fiap.com.br.quantoprecisoapplication.service;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @POST("/posts")
    @FormUrlEncoded
    Call<POST> savePost(@Field("rm") String rm,
                        @Field("senha") String senha);

}
