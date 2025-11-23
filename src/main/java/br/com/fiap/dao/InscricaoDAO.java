package br.com.fiap.dao;

import br.com.fiap.beans.Inscricao;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InscricaoDAO {

    public Connection minhaConexao;

    public InscricaoDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // Inserir Inscricao
    public String inserir(Inscricao inscricao) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement(
                        "INSERT INTO INSCRICOES (DESCRICAO, DATA_INSCRICAO, STATUS, ID_USUARIO, ID_CURSO) VALUES (?, ?, ?, ?, ?)"
                );

        stmt.setString(1, inscricao.getDescricao());
        stmt.setInt(2, inscricao.getData_inscricao());
        stmt.setString(3, inscricao.getStatus());
        stmt.setInt(4, inscricao.getId_usuario());
        stmt.setInt(5, inscricao.getId_curso());


        stmt.execute();
        stmt.close();

        return "Inscricao cadastrada com sucesso!";
    }

    // Deletar inscricao pelo id
    public String deletar(int id) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM INSCRICOES WHERE ID_INSCRICAO = ?");
        stmt.setInt(1, id);

        stmt.execute();
        stmt.close();

        return "Incricao deletado com sucesso!";
    }

    // Atualizar inscricao pelo nome
    public String atualizar(Inscricao inscricao) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement(
                        "UPDATE INSCRICOES SET DESCRICAO = ?, DATA_INSCRICAO = ?, STATUS = ?, ID_USUARIO = ?, ID_CURSO = ? WHERE ID_INSCRICAO = ?"
                );
        stmt.setString(1, inscricao.getDescricao());
        stmt.setInt(2, inscricao.getData_inscricao());
        stmt.setString(3, inscricao.getStatus());
        stmt.setInt(4, inscricao.getId_usuario());
        stmt.setInt(5, inscricao.getId_curso());
        stmt.setInt(6, inscricao.getId_inscricao());

        stmt.executeUpdate();
        stmt.close();

        return "Inscricao atualizado com sucesso!";
    }

    // Selecionar todos pacientes
    public List<Inscricao> selecionar() throws SQLException {
        ArrayList<Inscricao> listInscricao = new ArrayList<>();

        PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM INSCRICOES");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Inscricao objInscricao = new Inscricao();
            objInscricao.setId_inscricao(rs.getInt(1));
            objInscricao.setId_usuario(rs.getInt(2));
            objInscricao.setId_curso(rs.getInt(3));
            objInscricao.setDescricao(rs.getString(4));
            objInscricao.setData_inscricao(rs.getInt(5));
            objInscricao.setStatus(rs.getString(6));
            listInscricao.add(objInscricao);
        }

        rs.close();
        stmt.close();
        return listInscricao;


    }



}
