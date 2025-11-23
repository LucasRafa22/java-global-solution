package br.com.fiap.bo;
import br.com.fiap.beans.Vaga;
import br.com.fiap.dao.VagaDAO;

import java.sql.SQLException;
import java.util.List;

public class VagaBO {

    private VagaDAO vagaDAO;

    public VagaBO() throws SQLException, ClassNotFoundException {
        vagaDAO = new VagaDAO();
    }

    public String inserir(Vaga vaga) throws SQLException {
        return vagaDAO.inserir(vaga);
    }

    public String atualizar(Vaga vaga) throws SQLException {
        return vagaDAO.atualizar(vaga);
    }

    public String deletar(int id_vaga) throws SQLException {
        return vagaDAO.deletar(id_vaga);
    }

    public List<Vaga> listar() throws SQLException {
        return vagaDAO.selecionar();
    }
}
