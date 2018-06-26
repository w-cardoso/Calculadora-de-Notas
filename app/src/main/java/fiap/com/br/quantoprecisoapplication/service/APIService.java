package fiap.com.br.quantoprecisoapplication.service;

import java.util.List;

import fiap.com.br.quantoprecisoapplication.model.MateriasModel;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @POST("/notas")
    @FormUrlEncoded
    Call<List<MateriasModel>> savePost(@Field("rm") String rm,
                                      @Field("senha") String senha);

}
