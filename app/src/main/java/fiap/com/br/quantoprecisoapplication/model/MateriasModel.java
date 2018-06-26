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
    private double nac1;

    @SerializedName("am1")
    @Expose
    private double am1;

    @SerializedName("ps1")
    @Expose
    private double ps1;

    @SerializedName("md1")
    @Expose
    private double md1;
    @SerializedName("nac2")
    @Expose
    private double nac2;

    @SerializedName("am2")
    @Expose
    private double am2;
    @SerializedName("ps2")
    @Expose
    private double ps2;

    @SerializedName("md2")
    @Expose
    private double md2;

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
    private double presenca;

    @SerializedName("mp")
    @Expose
    private double mp;

    @SerializedName("exame")
    @Expose
    private double exame;

    @SerializedName("mf")
    @Expose
    private double mf;

    @SerializedName("situacao")
    @Expose
    private String situacao;

    public MateriasModel() {
    }

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

    public double getNac1() {
        return nac1;
    }

    public void setNac1(double nac1) {
        this.nac1 = nac1;
    }

    public double getAm1() {
        return am1;
    }

    public void setAm1(double am1) {
        this.am1 = am1;
    }

    public double getPs1() {
        return ps1;
    }

    public void setPs1(double ps1) {
        this.ps1 = ps1;
    }

    public double getMd1() {
        return md1;
    }

    public void setMd1(double md1) {
        this.md1 = md1;
    }

    public double getNac2() {
        return nac2;
    }

    public void setNac2(double nac2) {
        this.nac2 = nac2;
    }

    public double getAm2() {
        return am2;
    }

    public void setAm2(double am2) {
        this.am2 = am2;
    }

    public double getPs2() {
        return ps2;
    }

    public void setPs2(double ps2) {
        this.ps2 = ps2;
    }

    public double getMd2() {
        return md2;
    }

    public void setMd2(double md2) {
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

    public double getPresenca() {
        return presenca;
    }

    public void setPresenca(double presenca) {
        this.presenca = presenca;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getExame() {
        return exame;
    }

    public void setExame(double exame) {
        this.exame = exame;
    }

    public double getMf() {
        return mf;
    }

    public void setMf(double mf) {
        this.mf = mf;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
