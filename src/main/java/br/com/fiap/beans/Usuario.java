package br.com.fiap.beans;

public class Usuario {

    private int id_usuario;
    private String nome;
    private String email;
    private String senha;
    private String tipo_usuario;
    private int data_cadastro;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nome, String email, String senha, String tipo_usuario, int data_cadastro) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo_usuario = tipo_usuario;
        this.data_cadastro = data_cadastro;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public int getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(int data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    @Override
    public String toString() {
        return "USUARIO" +
                "id_usuario: " + id_usuario +
                "\nnome: " + nome +
                "\nemail: " + email +
                "\nsenha:" + senha +
                "\ntipo_usuario: " + tipo_usuario +
                "\ndata_cadastro: " + data_cadastro
                ;
    }
}
