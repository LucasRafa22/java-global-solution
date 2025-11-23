package br.com.fiap.bo;

import br.com.fiap.beans.Inscricao;
import br.com.fiap.dao.InscricaoDAO;

import java.sql.SQLException;
import java.util.List;

public class InscricaoBO {

    private InscricaoDAO inscricaoDAO;

    public InscricaoBO() throws SQLException, ClassNotFoundException {
        inscricaoDAO = new InscricaoDAO();
    }

    public String inserir(Inscricao inscricao) throws SQLException {
        return inscricaoDAO.inserir(inscricao);
    }

    public String atualizar(Inscricao inscricao) throws SQLException {
        return inscricaoDAO.atualizar(inscricao);
    }

    public String deletar(int id_inscricao) throws SQLException {
        return inscricaoDAO.deletar(id_inscricao);
    }

    public List<Inscricao> listar() throws SQLException {
        return inscricaoDAO.selecionar();
    }
}