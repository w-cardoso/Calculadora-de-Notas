package fiap.com.br.quantoprecisoapplication.ui.activity;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import fiap.com.br.quantoprecisoapplication.R;
import fiap.com.br.quantoprecisoapplication.model.Login;
import fiap.com.br.quantoprecisoapplication.model.MateriasModel;
import fiap.com.br.quantoprecisoapplication.service.APIService;
import fiap.com.br.quantoprecisoapplication.service.APIUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    private EditText rm;
    private EditText senha;
    private Button btnEntrar;
    private APIService apiService;
    private Login login;
    private LinearLayout lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rm = findViewById(R.id.login_edt_rm);
        senha = findViewById(R.id.login_edt_senha);
        btnEntrar = findViewById(R.id.login_btn_entrar);
        lLayout = findViewById(R.id.llayout);

        apiService = APIUtils.getAPIService();
        login = new Login();
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricula = rm.getText().toString();
                String password = senha.getText().toString();
                if (!TextUtils.isEmpty(matricula) && !TextUtils.isEmpty(password)) {
                    sendPost(matricula, password);
                } else {
                    Snackbar.make(lLayout, "Favor Preencher os campos", Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }

    private void sendPost(String matricula, String password) {
        apiService.savePost(matricula, password).enqueue(new Callback<MateriasModel>() {
            @Override
            public void onResponse(Call<MateriasModel> call, Response<MateriasModel> response) {

            }

            @Override
            public void onFailure(Call<MateriasModel> call, Throwable t) {

            }
        });
    }
}
