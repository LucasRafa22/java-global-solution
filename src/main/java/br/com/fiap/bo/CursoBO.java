package br.com.fiap.bo;

import br.com.fiap.beans.Curso;
import br.com.fiap.dao.CursoDAO;

import java.sql.SQLException;
import java.util.List;

public class CursoBO {

    private CursoDAO cursoDAO;

    public CursoBO() throws SQLException, ClassNotFoundException {
        cursoDAO = new CursoDAO();
    }

    public String inserir(Curso curso) throws SQLException {
        return cursoDAO.inserir(curso);
    }

    public String atualizar(Curso curso) throws SQLException {
        return cursoDAO.atualizar(curso);
    }

    public String deletar(int id_curso) throws SQLException {
        return cursoDAO.deletar(id_curso);
    }

    public List<Curso> listar() throws SQLException {
        return cursoDAO.selecionar();
    }
}
