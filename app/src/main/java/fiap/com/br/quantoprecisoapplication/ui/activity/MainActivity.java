package fiap.com.br.quantoprecisoapplication.ui.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import fiap.com.br.quantoprecisoapplication.R;
import fiap.com.br.quantoprecisoapplication.model.MateriasModel;
import fiap.com.br.quantoprecisoapplication.service.APIService;
import fiap.com.br.quantoprecisoapplication.service.APIUtils;
import fiap.com.br.quantoprecisoapplication.ui.recyclerview.adapter.MateriasAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private MateriasAdapter adapter;
    private APIService apiService;
    private String matricula;
    private String senha;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            matricula = extras.getString("matricula");
            senha = extras.getString("password");
        }
        apiService = APIUtils.getAPIService();
        sendPost(matricula, senha);

    }


    private void sendPost(String matricula, String password) {
        apiService.savePost(matricula, password).enqueue(new Callback<List<MateriasModel>>() {
            @Override
            public void onResponse(Call<List<MateriasModel>> call, Response<List<MateriasModel>> response) {
                recyclerView = findViewById(R.id.main_semester_rcv);

                Toast.makeText(MainActivity.this, response.message().toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<List<MateriasModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Usuario não cadastrado", Toast.LENGTH_LONG).show();

            }


        });
    }
}
