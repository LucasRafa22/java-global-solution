package br.com.fiap.resources;

import br.com.fiap.beans.Curso;
import br.com.fiap.services.CursoService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.sql.SQLException;
import java.util.List;

@Path("/cursos")
public class CursoResource {



        private CursoService cursoService;

        public CursoResource() throws SQLException, ClassNotFoundException {
            cursoService = new CursoService();
        }

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public List<Curso> listar() throws SQLException {
            return cursoService.listarTodos();
        }

        @POST
        @Consumes(MediaType.APPLICATION_JSON)
        public String inserir(Curso curso) throws SQLException {
            return cursoService.cadastrar(curso);
        }

        @PUT
        @Consumes(MediaType.APPLICATION_JSON)
        public String atualizar(Curso curso) throws SQLException {
            return cursoService.atualizar(curso);
        }

        @DELETE
        @Path("/{id_curso}")
        public String deletar(@PathParam("id_curso") int id_curso) throws SQLException {
            return cursoService.excluir(id_curso);
        }
    }





