package br.com.fiap.services;

import br.com.fiap.beans.Empresa;
import br.com.fiap.bo.EmpresaBO;

import java.sql.SQLException;
import java.util.List;

public class EmpresaService {

    private EmpresaBO empresaBO;

    public EmpresaService() throws SQLException, ClassNotFoundException {
        empresaBO = new EmpresaBO();
    }

    public String cadastrar(Empresa empresa) throws SQLException {
        return empresaBO.inserir(empresa);
    }

    public String atualizar(Empresa empresa) throws SQLException {
        return empresaBO.atualizar(empresa);
    }

    public String excluir(int id_curso) throws SQLException {
        return empresaBO.deletar(id_curso);
    }

    public List<Empresa> listarTodos() throws SQLException {
        return empresaBO.listar();
    }
}
