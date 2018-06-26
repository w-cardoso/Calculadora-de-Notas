package fiap.com.br.quantoprecisoapplication.ui.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import fiap.com.br.quantoprecisoapplication.R;
import fiap.com.br.quantoprecisoapplication.model.MateriasModel;
import fiap.com.br.quantoprecisoapplication.ui.recyclerview.adapter.MateriasAdapter;

public class MainActivity extends AppCompatActivity {

    private MateriasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configuraAdapter(getAllMaterias());

    }

    private void configuraAdapter(List<MateriasModel> allMaterias) {
        RecyclerView listCategorys = findViewById(R.id.main_semester_rcv);
        adapter = new MateriasAdapter(this, allMaterias);
        listCategorys.setHasFixedSize(true);
        listCategorys.setAdapter(adapter);

    }


    public List<MateriasModel> getAllMaterias() {
        List<MateriasModel> materias = new ArrayList<>();

        return materias;
    }
}
