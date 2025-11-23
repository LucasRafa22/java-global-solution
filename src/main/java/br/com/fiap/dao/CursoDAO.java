package br.com.fiap.dao;

import br.com.fiap.beans.Curso;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {

    public Connection minhaConexao;

    public CursoDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();


    }

    // Inserir curso
    public String inserir(Curso curso) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement(
                        "INSERT INTO CURSOS (TITULOS, DESCRICAO, CARGA_HORARIA, CATEGORIA, NIVEL) VALUES (?, ?, ?, ?, ?)"
                );

        stmt.setString(1, curso.getTitulos());
        stmt.setString(2, curso.getDescricao());
        stmt.setInt(3, curso.getCarga_horaria());
        stmt.setString(4, curso.getCategoria());
        stmt.setInt(5, curso.getNivel());

        stmt.execute();
        stmt.close();

        return "Curso cadastrado com sucesso!";
    }

    // Deletar curso pelo id
    public String deletar(int id) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM CURSOS WHERE ID_CURSO = ?");
        stmt.setInt(1, id);

        stmt.execute();
        stmt.close();

        return "Curso deletado com sucesso!";
    }

    // Curso paciente pelo nome
    public String atualizar(Curso curso) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement(
                        "UPDATE CURSOS SET TITULOS = ?, DESCRICAO = ?, CARGA_HORARIA = ?, CATEGORIA = ?, NIVEL = ? WHERE ID_CURSO = ?"
                );
        stmt.setString(1, curso.getTitulos());
        stmt.setString(2, curso.getDescricao());
        stmt.setInt(3, curso.getCarga_horaria());
        stmt.setString(4, curso.getCategoria());
        stmt.setInt(5, curso.getNivel());
        stmt.setInt(6, curso.getId_curso());

        stmt.executeUpdate();
        stmt.close();

        return "Curso atualizado com sucesso!";
    }

    // Selecionar todos pacientes
    public List<Curso> selecionar() throws SQLException {
        ArrayList<Curso> listCurso = new ArrayList<>();

        PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM CURSOS");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Curso objCurso = new Curso();
            objCurso.setId_curso(rs.getInt(1));
            objCurso.setTitulos(rs.getString(2));
            objCurso.setDescricao(rs.getString(3));
            objCurso.setCarga_horaria(rs.getInt(4));
            objCurso.setCategoria(rs.getString(5));
            objCurso.setNivel(rs.getInt(6));
            listCurso.add(objCurso);


        }
        rs.close();
        stmt.close();
        return listCurso;
    }


}

