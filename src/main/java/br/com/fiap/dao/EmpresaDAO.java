package br.com.fiap.dao;

import br.com.fiap.beans.Empresa;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpresaDAO {

    public Connection minhaConexao;

    public EmpresaDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    public String inserir(Empresa empresa) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement(
                        "INSERT INTO EMPRESAS (NOME_EMPRESA, CNPJ, SETOR, TAMANHO) VALUES (?, ?, ?, ?)"
                );

        stmt.setString(1, empresa.getNome_empresa());
        stmt.setInt(2, empresa.getCnpj());
        stmt.setString(3, empresa.getSetor());
        stmt.setString(4, empresa.getTamanho());

        stmt.execute();
        stmt.close();

        return "Empresa cadastrada com sucesso!";
    }

    // Deletar Empresa pelo id
    public String deletar(int id) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM EMPRESAS WHERE ID_EMPRESA = ?");
        stmt.setInt(1, id);

        stmt.execute();
        stmt.close();

        return "Empresa deletado com sucesso!";
    }

    // Atualizar Empresa pelo nome
    public String atualizar(Empresa empresa) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement(
                        "UPDATE EMPRESAS SET NOME_EMPRESA = ?, CNPJ = ?, SETOR = ?, TAMANHO = ? WHERE ID_EMPRESA = ?"
                );
        stmt.setString(1, empresa.getNome_empresa());
        stmt.setInt(2, empresa.getCnpj());
        stmt.setString(3, empresa.getSetor());
        stmt.setString(4, empresa.getTamanho());
        stmt.setInt(5, empresa.getId_empresa());

        stmt.executeUpdate();
        stmt.close();

        return "Empresa atualizado com sucesso!";
    }

    // Selecionar todas empresas
    public List<Empresa> selecionar() throws SQLException {
        ArrayList<Empresa> listEmpresa = new ArrayList<>();

        PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM EMPRESAS");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Empresa objEmpresa = new Empresa();
            objEmpresa.setId_empresa(rs.getInt(1));
            objEmpresa.setNome_empresa(rs.getString(2));
            objEmpresa.setCnpj(rs.getInt(3));
            objEmpresa.setSetor(rs.getString(4));
            objEmpresa.setTamanho(rs.getString(5));
            listEmpresa.add(objEmpresa);
        }

        rs.close();
        stmt.close();
        return listEmpresa;


    }





}
