package fiap.com.br.quantoprecisoapplication.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import fiap.com.br.quantoprecisoapplication.R;
import fiap.com.br.quantoprecisoapplication.model.Login;
import fiap.com.br.quantoprecisoapplication.service.APIService;
import fiap.com.br.quantoprecisoapplication.service.APIUtils;

public class LoginActivity extends AppCompatActivity {
    private EditText rm;
    private EditText senha;
    private Button btnEntrar;
    private APIService apiService;
    private Login login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rm = findViewById(R.id.login_edt_rm);
        senha = findViewById(R.id.login_edt_senha);
        btnEntrar = findViewById(R.id.login_btn_entrar);

        apiService = APIUtils.getAPIService();
        login = new Login();
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login.setRm(rm.getText().toString());
                login.setPassword(senha.getText().toString());
            }
        });
    }
}
