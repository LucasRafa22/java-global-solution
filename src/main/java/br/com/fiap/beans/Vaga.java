package br.com.fiap.beans;

public class Vaga {

    private int id_vaga;
    private String titulo_vaga;
    private String descricao;
    private String competencias_requeridas;
    private String nivel_experiencia;
    private int id_empresa;

    public Vaga() {
    }

    public Vaga(int id_vaga, String titulo_vaga, String descricao, String competencias_requeridas, String nivel_experiencia) {
        this.id_vaga = id_vaga;
        this.titulo_vaga = titulo_vaga;
        this.descricao = descricao;
        this.competencias_requeridas = competencias_requeridas;
        this.nivel_experiencia = nivel_experiencia;
    }

    public int getId_vaga() {
        return id_vaga;
    }

    public void setId_vaga(int id_vaga) {
        this.id_vaga = id_vaga;
    }

    public String getTitulo_vaga() {
        return titulo_vaga;
    }

    public void setTitulo_vaga(String titulo_vaga) {
        this.titulo_vaga = titulo_vaga;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCompetencias_requeridas() {
        return competencias_requeridas;
    }

    public void setCompetencias_requeridas(String competencias_requeridas) {
        this.competencias_requeridas = competencias_requeridas;
    }

    public String getNivel_experiencia() {
        return nivel_experiencia;
    }

    public void setNivel_experiencia(String nivel_experiencia) {
        this.nivel_experiencia = nivel_experiencia;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    @Override
    public String toString() {
        return "\nVAGA" +
                "\nid_vaga: " + id_vaga +
                "\ntitulo_vaga: " + titulo_vaga +
                "\ndescricao: " + descricao +
                "\ncompetencias_requeridas: " + competencias_requeridas +
                "\nnivel_experiencia: " + nivel_experiencia +
                "\nid_empresa: " + id_empresa
                ;
    }
}
