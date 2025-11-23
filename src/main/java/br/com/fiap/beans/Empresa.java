package br.com.fiap.beans;

public class Empresa {

    private int id_empresa;
    private String nome_empresa;
    private int cnpj;
    private String setor;
    private String tamanho;

    public Empresa() {
    }

    public Empresa(int id_empresa, String nome_empresa, int cnpj, String setor, String tamanho) {
        this.id_empresa = id_empresa;
        this.nome_empresa = nome_empresa;
        this.cnpj = cnpj;
        this.setor = setor;
        this.tamanho = tamanho;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "\nEMPRESA" +
                "\nid_empresa:" + id_empresa +
                "\nnome_empresa: " + nome_empresa +
                "\ncnpj: " + cnpj +
                "\nsetor: " + setor +
                "\ntamanho: " + tamanho
                ;
    }
}
