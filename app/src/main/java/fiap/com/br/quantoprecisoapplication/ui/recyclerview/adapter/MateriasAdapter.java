package fiap.com.br.quantoprecisoapplication.ui.recyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import fiap.com.br.quantoprecisoapplication.R;
import fiap.com.br.quantoprecisoapplication.model.MateriasModel;

public class MateriasAdapter extends RecyclerView.Adapter<MateriasAdapter.MateriasViewHolder> {
    private Context context;
    private List<MateriasModel> materias;

    public MateriasAdapter(Context context, List<MateriasModel> materias) {
        this.context = context;
        this.materias = materias;
    }

    @NonNull
    @Override
    public MateriasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View createView = LayoutInflater.from(context).inflate(R.layout.item_fragments, parent, false);
        return new MateriasViewHolder(createView);
    }

    @Override
    public void onBindViewHolder(@NonNull MateriasViewHolder holder, int position) {

        holder.nome.setText(materias.get(position).getDisciplina());
        holder.nac.setText(String.valueOf(materias.get(position).getNac1()));
        holder.am.setText(String.valueOf(materias.get(position).getAm1()));
        holder.ps.setText(String.valueOf(materias.get(position).getPs1()));
        holder.media.setText(String.valueOf(materias.get(position).getMd1()));
    }

    @Override
    public int getItemCount() {
        return materias.size();
    }

    public class MateriasViewHolder extends RecyclerView.ViewHolder {

        private final TextView nome;
        private final EditText nac;
        private final EditText am;
        private final EditText ps;
        private final EditText media;

        public MateriasViewHolder(View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.item_edt_materia);
            nac = itemView.findViewById(R.id.item_edt_nac);
            am = itemView.findViewById(R.id.item_edt_am);
            ps = itemView.findViewById(R.id.item_edt_ps);
            media = itemView.findViewById(R.id.item_edt_ps);
        }


    }
}

