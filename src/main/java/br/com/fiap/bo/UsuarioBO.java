package br.com.fiap.bo;


import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import java.sql.SQLException;
import java.util.List;

public class UsuarioBO {

    private UsuarioDAO usuarioDAO;

    public UsuarioBO() throws SQLException, ClassNotFoundException {
        usuarioDAO = new UsuarioDAO();
    }

    public String inserir(Usuario usuario) throws SQLException {
        return usuarioDAO.inserir(usuario);
    }

    public String atualizar(Usuario usuario) throws SQLException {
        return usuarioDAO.atualizar(usuario);
    }

    public String deletar(int id_usuario) throws SQLException {
        return usuarioDAO.deletar(id_usuario);
    }

    public List<Usuario> listar() throws SQLException {
        return usuarioDAO.selecionar();
    }
}
