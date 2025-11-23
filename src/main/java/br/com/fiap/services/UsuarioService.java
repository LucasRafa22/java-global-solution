package br.com.fiap.services;

import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.UsuarioBO;

import java.sql.SQLException;
import java.util.List;

public class UsuarioService {

    private UsuarioBO usuarioBO;

    public UsuarioService() throws SQLException, ClassNotFoundException {
        usuarioBO = new UsuarioBO();
    }

    public String cadastrar(Usuario usuario) throws SQLException {
        return usuarioBO.inserir(usuario);
    }

    public String atualizar(Usuario usuario) throws SQLException {
        return usuarioBO.atualizar(usuario);
    }

    public String excluir(int id_usuario) throws SQLException {
        return usuarioBO.deletar(id_usuario);
    }

    public List<Usuario> listarTodos() throws SQLException {
        return usuarioBO.listar();
    }
}











