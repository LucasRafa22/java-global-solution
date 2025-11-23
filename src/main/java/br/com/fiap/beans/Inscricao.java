package br.com.fiap.beans;

public class Inscricao {

    private int id_inscricao;
    private String descricao;
    private int data_inscricao;
    private String status;
    private int id_usuario;
    private int id_curso;

    public Inscricao() {
    }

    public Inscricao(int id_inscricao, String descricao, int data_inscricacao, String status) {
        this.id_inscricao = id_inscricao;
        this.descricao = descricao;
        this.data_inscricao = data_inscricacao;
        this.status = status;
    }

    public int getId_inscricao() {
        return id_inscricao;
    }

    public void setId_inscricao(int id_inscricao) {
        this.id_inscricao = id_inscricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getData_inscricao() {
        return data_inscricao;
    }

    public void setData_inscricao(int data_inscricao) {
        this.data_inscricao = data_inscricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    @Override
    public String toString() {
        return "\nINSCRICAO" +
                "\nid_inscricao: " + id_inscricao +
                "\ndescricao: " + descricao +
                "\ndata_inscricacao: " + data_inscricao +
                "\nstatus: " + status +
                "\nid_usuario: " + id_usuario +
                "\nid_curso: " + id_curso
                ;
    }

}
