package br.com.fiap.resources;

import br.com.fiap.beans.Empresa;
import br.com.fiap.services.EmpresaService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.sql.SQLException;
import java.util.List;

@Path("/empresas")
public class EmpresaResource {



    private EmpresaService empresaService;

    public EmpresaResource() throws SQLException, ClassNotFoundException {
        empresaService = new EmpresaService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Empresa> listar() throws SQLException {
        return empresaService.listarTodos();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String inserir(Empresa empresa) throws SQLException {
        return empresaService.cadastrar(empresa);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String atualizar(Empresa empresa) throws SQLException {
        return empresaService.atualizar(empresa);
    }

    @DELETE
    @Path("/{id_empresa}")
    public String deletar(@PathParam("id_empresa") int id_empresa) throws SQLException {
        return empresaService.excluir(id_empresa);
    }
}
