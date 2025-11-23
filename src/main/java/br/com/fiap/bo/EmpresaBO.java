package br.com.fiap.bo;

import br.com.fiap.beans.Empresa;
import br.com.fiap.dao.EmpresaDAO;

import java.sql.SQLException;
import java.util.List;

public class EmpresaBO {

    private EmpresaDAO empresaDAO;

    public EmpresaBO() throws SQLException, ClassNotFoundException {
        empresaDAO = new EmpresaDAO();
    }

    public String inserir(Empresa empresa) throws SQLException {
        return empresaDAO.inserir(empresa);
    }

    public String atualizar(Empresa empresa) throws SQLException {
        return empresaDAO.atualizar(empresa);
    }

    public String deletar(int id_empresa) throws SQLException {
        return empresaDAO.deletar(id_empresa);
    }

    public List<Empresa> listar() throws SQLException {
        return empresaDAO.selecionar();
    }
}
