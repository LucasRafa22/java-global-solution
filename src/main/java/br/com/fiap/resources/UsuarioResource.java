package br.com.fiap.resources;

import br.com.fiap.beans.Usuario;
import br.com.fiap.services.UsuarioService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.sql.SQLException;
import java.util.List;

@Path("/usuarios")
public class UsuarioResource {


    private UsuarioService usuarioService;

    public UsuarioResource() throws SQLException, ClassNotFoundException {
        usuarioService = new UsuarioService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listar() throws SQLException {
        return usuarioService.listarTodos();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String inserir(Usuario usuario) throws SQLException {
        return usuarioService.cadastrar(usuario);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String atualizar(Usuario usuario) throws SQLException {
        return usuarioService.atualizar(usuario);
    }

    @DELETE
    @Path("/{id_usuario}")
    public String deletar(@PathParam("id_usuario") int id_usuario) throws SQLException {
        return usuarioService.excluir(id_usuario);
    }
}
