package br.com.fiap.services;

import br.com.fiap.beans.Curso;
import br.com.fiap.bo.CursoBO;

import java.sql.SQLException;
import java.util.List;

public class CursoService {

    private CursoBO cursoBO;

    public CursoService() throws SQLException, ClassNotFoundException {
        cursoBO = new CursoBO();
    }

    public String cadastrar(Curso curso) throws SQLException {
        return cursoBO.inserir(curso);
    }

    public String atualizar(Curso curso) throws SQLException {
        return cursoBO.atualizar(curso);
    }

    public String excluir(int id_curso) throws SQLException {
        return cursoBO.deletar(id_curso);
    }

    public List<Curso> listarTodos() throws SQLException {
        return cursoBO.listar();
    }
}
