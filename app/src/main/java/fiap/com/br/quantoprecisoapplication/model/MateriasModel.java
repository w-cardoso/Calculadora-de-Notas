package fiap.com.br.quantoprecisoapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MateriasModel {
    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("disciplina")
    @Expose
    private String disciplina;

    @SerializedName("nac1")
    @Expose
    private Double nac1;

    @SerializedName("am1")
    @Expose
    private Double am1;

    @SerializedName("ps1")
    @Expose
    private Double ps1;

    @SerializedName("md1")
    @Expose
    private Double md1;
    @SerializedName("nac2")
    @Expose
    private Double nac2;

    @SerializedName("am2")
    @Expose
    private Double am2;
    @SerializedName("ps2")
    @Expose
    private Double ps2;

    @SerializedName("md2")
    @Expose
    private Double md2;

    @SerializedName("aulas")
    @Expose
    private Integer aulas;

    @SerializedName("faltas1")
    @Expose
    private Integer faltas1;

    @SerializedName("faltas2")
    @Expose
    private Integer faltas2;

    @SerializedName("presenca")
    @Expose
    private Integer presenca;

    @SerializedName("mp")
    @Expose
    private Double mp;

    @SerializedName("exame")
    @Expose
    private Double exame;

    @SerializedName("mf")
    @Expose
    private Double mf;

    @SerializedName("situacao")
    @Expose
    private String situacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getNac1() {
        return nac1;
    }

    public void setNac1(Double nac1) {
        this.nac1 = nac1;
    }

    public Double getAm1() {
        return am1;
    }

    public void setAm1(Double am1) {
        this.am1 = am1;
    }

    public Double getPs1() {
        return ps1;
    }

    public void setPs1(Double ps1) {
        this.ps1 = ps1;
    }

    public Double getMd1() {
        return md1;
    }

    public void setMd1(Double md1) {
        this.md1 = md1;
    }

    public Double getNac2() {
        return nac2;
    }

    public void setNac2(Double nac2) {
        this.nac2 = nac2;
    }

    public Double getAm2() {
        return am2;
    }

    public void setAm2(Double am2) {
        this.am2 = am2;
    }

    public Double getPs2() {
        return ps2;
    }

    public void setPs2(Double ps2) {
        this.ps2 = ps2;
    }

    public Double getMd2() {
        return md2;
    }

    public void setMd2(Double md2) {
        this.md2 = md2;
    }

    public Integer getAulas() {
        return aulas;
    }

    public void setAulas(Integer aulas) {
        this.aulas = aulas;
    }

    public Integer getFaltas1() {
        return faltas1;
    }

    public void setFaltas1(Integer faltas1) {
        this.faltas1 = faltas1;
    }

    public Integer getFaltas2() {
        return faltas2;
    }

    public void setFaltas2(Integer faltas2) {
        this.faltas2 = faltas2;
    }

    public Integer getPresenca() {
        return presenca;
    }

    public void setPresenca(Integer presenca) {
        this.presenca = presenca;
    }

    public Double getMp() {
        return mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }

    public Double getExame() {
        return exame;
    }

    public void setExame(Double exame) {
        this.exame = exame;
    }

    public Double getMf() {
        return mf;
    }

    public void setMf(Double mf) {
        this.mf = mf;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
