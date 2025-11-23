package br.com.fiap.services;

import br.com.fiap.beans.Inscricao;
import br.com.fiap.bo.InscricaoBO;

import java.sql.SQLException;
import java.util.List;

public class InscricaoService {

    private InscricaoBO inscricaoBO;

    public InscricaoService() throws SQLException, ClassNotFoundException {
        inscricaoBO = new InscricaoBO();
    }

    public String cadastrar(Inscricao inscricao) throws SQLException {
        return inscricaoBO.inserir(inscricao);
    }

    public String atualizar(Inscricao inscricao) throws SQLException {
        return inscricaoBO.atualizar(inscricao);
    }

    public String excluir(int id_inscricao) throws SQLException {
        return inscricaoBO.deletar(id_inscricao);
    }

    public List<Inscricao> listarTodos() throws SQLException {
        return inscricaoBO.listar();
    }
}
