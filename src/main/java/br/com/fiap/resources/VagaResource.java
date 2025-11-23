package br.com.fiap.resources;

import br.com.fiap.beans.Vaga;
import br.com.fiap.services.VagaService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.sql.SQLException;
import java.util.List;

@Path("/vagas")
public class VagaResource {

    private VagaService vagaService;

    public VagaResource() throws SQLException, ClassNotFoundException {
        vagaService = new VagaService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Vaga> listar() throws SQLException {
        return vagaService.listarTodos();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String inserir(Vaga vaga) throws SQLException {
        return vagaService.cadastrar(vaga);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String atualizar(Vaga vaga) throws SQLException {
        return vagaService.atualizar(vaga);
    }

    @DELETE
    @Path("/{id_vaga}")
    public String deletar(@PathParam("id_vaga") int id_vaga) throws SQLException {
        return vagaService.excluir(id_vaga);
    }
}