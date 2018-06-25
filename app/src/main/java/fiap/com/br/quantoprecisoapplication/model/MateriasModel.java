package fiap.com.br.quantoprecisoapplication.model;

public class MateriasModel {
    private String nome;
    private double nac;
    private double am;
    private double ps;
    private double md;

    public MateriasModel(String nome, double nac, double am, double ps, double md) {
        this.nome = nome;
        this.nac = nac;
        this.am = am;
        this.ps = ps;
        this.md = md;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNac() {
        return nac;
    }

    public void setNac(double nac) {
        this.nac = nac;
    }

    public double getAm() {
        return am;
    }

    public void setAm(double am) {
        this.am = am;
    }

    public double getPs() {
        return ps;
    }

    public void setPs(double ps) {
        this.ps = ps;
    }

    public double getMd() {
        return md;
    }

    public void setMd(double md) {
        this.md = md;
    }
}
