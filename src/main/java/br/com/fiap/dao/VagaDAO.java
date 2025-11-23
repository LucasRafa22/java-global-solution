package br.com.fiap.dao;

import br.com.fiap.beans.Vaga;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VagaDAO {

    public Connection minhaConexao;

    public VagaDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // Inserir Usuario
    public String inserir(Vaga vaga) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement(
                        "INSERT INTO VAGAS (TITULO_VAGA, DESCRICAO, COMPETENCIAS_REQUERIDAS, NIVEL_EXPERIENCIA, ID_EMPRESA) VALUES (?, ?, ?, ?, ?)"
                );

        stmt.setString(1, vaga.getTitulo_vaga());
        stmt.setString(2, vaga.getDescricao());
        stmt.setString(3, vaga.getCompetencias_requeridas());
        stmt.setString(4, vaga.getNivel_experiencia());
        stmt.setInt(5, vaga.getId_empresa());

        stmt.execute();
        stmt.close();

        return "Vaga cadastrada com sucesso!";
    }

    // Deletar vaga pelo id
    public String deletar(int id) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM VAGAS WHERE ID_VAGA = ?");
        stmt.setInt(1, id);

        stmt.execute();
        stmt.close();

        return "Vaga deletada com sucesso!";
    }

    // Atualizar paciente pelo nome
    public String atualizar(Vaga vaga) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement(
                        "UPDATE VAGAS SET TITULO_VAGA = ?, DESCRICAO = ?, COMPETENCIAS_REQUERIDAS = ?, NIVEL_EXPERIENCIA = ?, ID_EMPRESA = ?, WHERE ID_VAGA"
                );
        stmt.setString(1, vaga.getTitulo_vaga());
        stmt.setString(2, vaga.getDescricao());
        stmt.setString(3, vaga.getCompetencias_requeridas());
        stmt.setString(4, vaga.getNivel_experiencia());
        stmt.setInt(5, vaga.getId_empresa());
        stmt.setInt(6, vaga.getId_vaga());

        stmt.executeUpdate();
        stmt.close();

        return "Vaga atualizada com sucesso!";
    }

    // Selecionar todas as vagas
    public List<Vaga> selecionar() throws SQLException {
        ArrayList<Vaga> listVaga = new ArrayList<>();

        PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM VAGAS");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Vaga objVaga = new Vaga();
            objVaga.setId_vaga(rs.getInt(1));
            objVaga.setId_empresa(rs.getInt(2));
            objVaga.setTitulo_vaga(rs.getString(3));
            objVaga.setDescricao(rs.getString(4));
            objVaga.setCompetencias_requeridas(rs.getString(5));
            objVaga.setNivel_experiencia(rs.getString(6));
            listVaga.add(objVaga);
        }

        rs.close();
        stmt.close();
        return listVaga;


    }


}
