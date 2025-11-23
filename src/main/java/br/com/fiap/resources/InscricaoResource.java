package br.com.fiap.resources;

import br.com.fiap.beans.Inscricao;
import br.com.fiap.services.InscricaoService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.sql.SQLException;
import java.util.List;

@Path("/inscricoes")
public class InscricaoResource {

    private InscricaoService inscricaoService;

    public InscricaoResource() throws SQLException, ClassNotFoundException {
        inscricaoService = new InscricaoService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Inscricao> listar() throws SQLException {
        return inscricaoService.listarTodos();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String inserir(Inscricao inscricao) throws SQLException {
        return inscricaoService.cadastrar(inscricao);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String atualizar(Inscricao inscricao) throws SQLException {
        return inscricaoService.atualizar(inscricao);
    }

    @DELETE
    @Path("/{id_inscricao}")
    public String deletar(@PathParam("id_inscricao") int id_inscricao) throws SQLException {
        return inscricaoService.excluir(id_inscricao);
    }
}



