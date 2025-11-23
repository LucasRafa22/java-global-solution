package br.com.fiap.services;

import br.com.fiap.beans.Vaga;
import br.com.fiap.bo.VagaBO;

import java.sql.SQLException;
import java.util.List;

public class VagaService {

    private VagaBO vagaBO;

    public VagaService() throws SQLException, ClassNotFoundException {
        vagaBO = new VagaBO();
    }

    public String cadastrar(Vaga vaga) throws SQLException {
        return vagaBO.inserir(vaga);
    }

    public String atualizar(Vaga vaga) throws SQLException {
        return vagaBO.atualizar(vaga);
    }

    public String excluir(int id_vaga) throws SQLException {
        return vagaBO.deletar(id_vaga);
    }

    public List<Vaga> listarTodos() throws SQLException {
        return vagaBO.listar();
    }











}
