package fiap.com.br.quantoprecisoapplication.ui.recyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

import fiap.com.br.quantoprecisoapplication.R;
import fiap.com.br.quantoprecisoapplication.model.MateriasModel;

public class MateriasAdapter extends RecyclerView.Adapter<MateriasAdapter.MateriasViewHolder> {

    private Context context;
    private List<MateriasModel> listaMaterias;

    public MateriasAdapter(Context context, List<MateriasModel> listaMaterias) {
        this.context = context;
        this.listaMaterias = listaMaterias;
    }

    @NonNull
    @Override
    public MateriasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View createView = LayoutInflater.from(context).inflate(R.layout.item_fragments, parent, false);
        return new MateriasViewHolder(createView);
    }

    @Override
    public void onBindViewHolder(@NonNull MateriasViewHolder holder, int position) {
        MateriasModel materia = listaMaterias.get(position);
        holder.configuraInformacoes(materia);


    }

    @Override
    public int getItemCount() {
        return listaMaterias.size();
    }

    public class MateriasViewHolder extends RecyclerView.ViewHolder {
        private MateriasModel listaMaterias;
        private Button btnCalcularSemestre, btnCalcularExame;
        private final TextView nome;
        private final EditText nac;
        private final EditText am;
        private final EditText ps;
        private final EditText media;

        private final EditText nac2;
        private final EditText am2;
        private final EditText ps2;
        private final EditText media2;

        private final EditText pr;
        private final EditText mp;
        private final EditText exa;
        private final EditText mf;
        private final TextView txtMessage;

        private final LinearLayout layoutSituacao;
        private LinearLayout layoutButton;
        private double calculoMedia2, mediaParcial;

        public MateriasViewHolder(View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.item_edt_materia);
            nac = itemView.findViewById(R.id.item_edt_nac);
            am = itemView.findViewById(R.id.item_edt_am);
            ps = itemView.findViewById(R.id.item_edt_ps);
            media = itemView.findViewById(R.id.item_edt_md);

            nac2 = itemView.findViewById(R.id.item_edt_nac2);
            am2 = itemView.findViewById(R.id.item_edt_am2);
            ps2 = itemView.findViewById(R.id.item_edt_ps2);
            media2 = itemView.findViewById(R.id.item_edt_md2);

            pr = itemView.findViewById(R.id.item_edt_pr);
            mp = itemView.findViewById(R.id.item_edt_mp);
            exa = itemView.findViewById(R.id.item_edt_exa);
            mf = itemView.findViewById(R.id.item_edt_mf);

            txtMessage = itemView.findViewById(R.id.item_txt_msg);

            layoutSituacao = itemView.findViewById(R.id.item_llayout_situacao);
            layoutButton = itemView.findViewById(R.id.item_llayout_buttons);

            btnCalcularSemestre = itemView.findViewById(R.id.item_btn_calcular);
            btnCalcularExame = itemView.findViewById(R.id.item_btn_calcular_final);


        }


        public void configuraInformacoes(MateriasModel listaMaterias) {
            this.listaMaterias = listaMaterias;
            preencherCampos(listaMaterias);


        }

        private void preencherCampos(MateriasModel listaMaterias) {
            nome.setText(listaMaterias.getDisciplina());
            nac.setText(String.valueOf(listaMaterias.getNac1()));
            am.setText(String.valueOf(listaMaterias.getAm1()));
            ps.setText(String.valueOf(listaMaterias.getPs1()));
            media.setText(String.valueOf(listaMaterias.getMd1()));


            btnCalcularSemestre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String edtNac2 = nac2.getText().toString();
                    final String edtAm2 = am2.getText().toString();
                    final String edtPs2 = ps2.getText().toString();
                    final double valorNac, valorAm, valorPs;
                    valorNac = Double.parseDouble(edtNac2);
                    valorAm = Double.parseDouble(edtAm2);
                    valorPs = Double.parseDouble(edtPs2);

                    calculoMedia2 = (valorNac * 0.2)
                            + (valorAm * 0.3)
                            + (valorPs * 0.5);

                    media2.setText(String.valueOf(calculoMedia2));

                    layoutSituacao.setVisibility(View.VISIBLE);
                    String edtMedia1 = media.getText().toString();
                    double value1 = Double.parseDouble(edtMedia1);
                    mediaParcial = (value1 + calculoMedia2) / 2;
                    mediaParcial = Double.valueOf(String.format(Locale.US, "%.1f", mediaParcial));
                    mp.setText(String.valueOf(mediaParcial));

                    if (mediaParcial < 6) {
                        mp.setTextColor(context.getResources().getColor(R.color.colorRed));
                        layoutButton.setWeightSum(2);
                        btnCalcularExame.setVisibility(View.VISIBLE);
                        exa.setFocusable(true);

                    } else {
                        mp.setTextColor(context.getResources().getColor(R.color.colorBlue));
                        btnCalcularSemestre.setVisibility(View.GONE);
                        txtMessage.setVisibility(View.VISIBLE);
                    }


                }
            });

            btnCalcularExame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double exame = (6 - mediaParcial) + 6;
                    exa.setEnabled(true);
                    exa.setText(String.valueOf(exame));

                }
            });


        }
    }
}

