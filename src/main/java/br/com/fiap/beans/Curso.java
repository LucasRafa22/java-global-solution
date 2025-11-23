package br.com.fiap.beans;

public class Curso {

    private int id_curso;
    private String titulos;
    private String descricao;
    private int carga_horaria;
    private String categoria;
    private int nivel;

    public Curso() {
    }

    public Curso(int id_curso, String titulo, String descricao, int carga_horaria, String categoria, int nivel) {
        this.id_curso = id_curso;
        this.titulos = titulo;
        this.descricao = descricao;
        this.carga_horaria = carga_horaria;
        this.categoria = categoria;
        this.nivel = nivel;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "\nCURSO" +
                "\nid_curso: " + id_curso +
                "\ntitulo: " + titulos +
                "\ndescricao: " + descricao +
                "\ncarga_horaria: " + carga_horaria +
                "\ncategoria: " + categoria +
                "\nnivel: " + nivel
                ;
    }
}
