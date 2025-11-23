package br.com.fiap.dao;

import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public Connection minhaConexao;

    public UsuarioDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }


    // Inserir Usuario
    public String inserir(Usuario usuario) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement(
                        "INSERT INTO USUARIOS (NOME, EMAIL, SENHA, TIPO_USUARIO, DATA_CADASTRO) VALUES (?, ?, ?, ?, ?)"
                );

        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getEmail());
        stmt.setString(3, usuario.getSenha());
        stmt.setString(4, usuario.getTipo_usuario());
        stmt.setInt(5, usuario.getData_cadastro());

        stmt.execute();
        stmt.close();

        return "Usuario cadastrado com sucesso!";
    }

    // Deletar usuario pelo id
    public String deletar(int id) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM USUARIOS WHERE ID_USUARIO = ?");
        stmt.setInt(1, id);

        stmt.execute();
        stmt.close();

        return "Usuario deletado com sucesso!";
    }

    // Atualizar paciente pelo nome
    public String atualizar(Usuario usuario) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement(
                        "UPDATE USUARIOS SET NOME = ?, EMAIL = ?, SENHA = ? , TIPO_USUARIO = ?, DATA_CADASTRO = ? WHERE ID_USUARIO = ?"
                );
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getEmail());
        stmt.setString(3, usuario.getSenha());
        stmt.setString(4, usuario.getTipo_usuario());
        stmt.setInt(5, usuario.getData_cadastro());
        stmt.setInt(6, usuario.getId_usuario());

        stmt.executeUpdate();
        stmt.close();

        return "Paciente atualizado com sucesso!";
    }

    // Selecionar todos pacientes
    public List<Usuario> selecionar() throws SQLException {
        ArrayList<Usuario> listUsuario = new ArrayList<>();

        PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM USUARIOS");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Usuario objUsuario = new Usuario();
            objUsuario.setId_usuario(rs.getInt(1));
            objUsuario.setNome(rs.getString(2));
            objUsuario.setEmail(rs.getString(3));
            objUsuario.setSenha(rs.getString(4));
            objUsuario.setTipo_usuario(rs.getString(5));
            objUsuario.setData_cadastro(rs.getInt(6));
            listUsuario.add(objUsuario);
        }

        rs.close();
        stmt.close();
        return listUsuario;


    }
}