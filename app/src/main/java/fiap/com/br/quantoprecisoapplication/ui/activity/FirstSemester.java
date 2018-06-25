package fiap.com.br.quantoprecisoapplication.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import fiap.com.br.quantoprecisoapplication.R;
import fiap.com.br.quantoprecisoapplication.model.MateriasModel;
import fiap.com.br.quantoprecisoapplication.ui.recyclerview.adapter.MateriasAdapter;


public class FirstSemester extends Fragment {
    private MateriasAdapter adapter;
    private Button btnCadastrar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_first_semester, container, false);
        List<MateriasModel> todasNotas = getAllMaterias();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        configuraAdapter(view, getAllMaterias());
        btnCadastrar = view.findViewById(R.id.first_semester_btn_register);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void configuraAdapter(View view, List<MateriasModel> allMaterias) {
        RecyclerView listCategorys = view.findViewById(R.id.fragment_firs_semester_rcv);
        adapter = new MateriasAdapter(view.getContext(), allMaterias);
        listCategorys.setHasFixedSize(true);
        listCategorys.setAdapter(adapter);

    }


    public List<MateriasModel> getAllMaterias() {
        List<MateriasModel> materias = new ArrayList<>();
        materias.add(new MateriasModel("Gestão", 2.0, 2, 2.0, 2.0));
        return materias;
    }
}
