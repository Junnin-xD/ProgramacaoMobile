package model;



public class Models {

    private int pk_cont_id;
    private String cont_nome;
    private String cont_classificacao;
    private Double cont_valor;
    private String cont_data;
    private boolean cont_ganho;
    private boolean cont_gasto;

    public Models(String cont_nome, String cont_classificacao, Double cont_valor, String cont_data, boolean cont_ganho,
            boolean cont_gasto) {
        this.cont_nome = cont_nome;
        this.cont_classificacao = cont_classificacao;
        this.cont_valor = cont_valor;
        this.cont_data = cont_data;
        this.cont_ganho = cont_ganho;
        this.cont_gasto = cont_gasto;
    }

    public Models(int pk_cont_id, String cont_nome, String cont_classificacao, Double cont_valor, String cont_data, boolean cont_ganho,
            boolean cont_gasto) {
        this.pk_cont_id = pk_cont_id;
        this.cont_nome = cont_nome;
        this.cont_classificacao = cont_classificacao;
        this.cont_valor = cont_valor;
        this.cont_data = cont_data;
        this.cont_ganho = cont_ganho;
        this.cont_gasto = cont_gasto;
    }

    public int getPk_cont_id() {
        return pk_cont_id;
    }

    public void setPk_cont_id(int pk_cont_id) {
        this.pk_cont_id = pk_cont_id;
    }

    public String getCont_nome() {
        return cont_nome;
    }

    public void setCont_nome(String cont_nome) {
        this.cont_nome = cont_nome;
    }

    public String getCont_classificacao() {
        return cont_classificacao;
    }

    public void setCont_classificacao(String cont_classificacao) {
        this.cont_classificacao = cont_classificacao;
    }

    public Double getCont_valor() {
        return cont_valor;
    }

    public void setCont_valor(Double cont_valor) {
        this.cont_valor = cont_valor;
    }

    public String getCont_data() {
        return cont_data;
    }

    public void setCont_data(String cont_data) {
        this.cont_data = cont_data;
    }

    public boolean isCont_ganho() {
        return cont_ganho;
    }

    public void setCont_ganho(boolean cont_ganho) {
        this.cont_ganho = cont_ganho;
    }

    public boolean isCont_gasto() {
        return cont_gasto;
    }

    public void setCont_gasto(boolean cont_gasto) {
        this.cont_gasto = cont_gasto;
    }

}
