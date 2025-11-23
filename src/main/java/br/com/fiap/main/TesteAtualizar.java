package br.com.fiap.main;

import br.com.fiap.beans.*;
import br.com.fiap.dao.*;

import javax.swing.*;
import java.sql.SQLException;

public class TesteAtualizar {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }


    static void atualizarUsuario() throws SQLException, ClassNotFoundException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario objUsuario = new Usuario();


        String tabela = "USUARIOS";
        String id = "ID_USUARIO";

        int idUsuario = inteiro("Digite o " + id + " que deseja atualizar:");
        objUsuario.setId_usuario(idUsuario);

        objUsuario.setNome(texto("Nome do usuario"));
        objUsuario.setEmail(texto("Email do usuario"));
        objUsuario.setSenha(texto("Senha do usuario"));
        objUsuario.setTipo_usuario(texto("Tipo do usuario"));
        objUsuario.setData_cadastro(inteiro("Data do Cadastro"));

        System.out.println(usuarioDAO.atualizar(objUsuario));
    }

    static void atualizarCurso() throws SQLException, ClassNotFoundException {
        CursoDAO cursoDAO = new CursoDAO();
        Curso objCurso = new Curso();


        String tabela = "CURSOS";
        String id = "ID_CURSO";

        int idCurso = inteiro("Digite o " + id + " que deseja atualizar:");
        objCurso.setId_curso(idCurso);

        objCurso.setTitulos(texto("Titulo do curso"));
        objCurso.setDescricao(texto("Descricao do curso"));
        objCurso.setCarga_horaria(inteiro("Carga horaria do curso"));
        objCurso.setCategoria(texto("Categoria do curso"));
        objCurso.setNivel(inteiro("Nivel do curso"));

        System.out.println(cursoDAO.atualizar(objCurso));
    }

    static void atualizarEmpresa() throws SQLException, ClassNotFoundException {
        EmpresaDAO empresaDAO = new EmpresaDAO();
        Empresa objEmpresa = new Empresa();


        String tabela = "EMPRESAS";
        String id = "ID_EMPRESA";

        int idEmpresa = inteiro("Digite o " + id + " que deseja atualizar:");
        objEmpresa.setId_empresa(idEmpresa);

        objEmpresa.setNome_empresa(texto("Nome da empresa"));
        objEmpresa.setCnpj(inteiro("Cnpj da empresa"));
        objEmpresa.setSetor(texto("Setor da empresa"));
        objEmpresa.setTamanho(texto("Tamanho da empresa"));

        System.out.println(empresaDAO.atualizar(objEmpresa));
    }

    static void atualizarInscricao() throws SQLException, ClassNotFoundException {
        InscricaoDAO inscricaoDAO = new InscricaoDAO();
        Inscricao objInscricao = new Inscricao();


        String tabela = "INSCRICOES";
        String id = "ID_INSCRICAO";

        int idInscricao = inteiro("Digite o " + id + " que deseja atualizar:");
        objInscricao.setId_inscricao(idInscricao);

        objInscricao.setDescricao(texto("Descricao da inscricao"));
        objInscricao.setData_inscricao(inteiro("Data da inscricao"));
        objInscricao.setStatus(texto("Status da inscricao"));
        objInscricao.setId_usuario(inteiro("Id do usuario"));
        objInscricao.setId_curso(inteiro("Id do curso"));

        System.out.println(inscricaoDAO.atualizar(objInscricao));
    }

    static void atualizarVaga() throws SQLException, ClassNotFoundException {
        VagaDAO vagaDAO = new VagaDAO();
        Vaga objVaga = new Vaga();


        String tabela = "VAGAS";
        String id = "ID_VAGA";

        int idVaga = inteiro("Digite o " + id + " que deseja atualizar:");
        objVaga.setId_vaga(idVaga);

        objVaga.setTitulo_vaga(texto("Titulo da vaga"));
        objVaga.setDescricao(texto("Descricao da vaga"));
        objVaga.setCompetencias_requeridas(texto("Competencias requeridas para vaga"));
        objVaga.setNivel_experiencia(texto("Nivel de experiencia para vaga"));
        objVaga.setId_empresa(inteiro("Id da empresa"));

        System.out.println(vagaDAO.atualizar(objVaga));
    }

    static int descisaoAtualizar() throws SQLException, ClassNotFoundException {
        int loop = 0;
        int escolha = 0;

        while (loop == 0) {
            escolha = inteiro("\n\nEscolha uma tabela que deseja atualizar os dados: ");
            if (escolha == 1) {
                atualizarUsuario();
                loop = 1;
            }
            if (escolha == 2) {
                atualizarCurso();
                loop = 1;
            }
            if (escolha == 3) {
                atualizarEmpresa();
                loop = 1;
            }
            if (escolha == 4) {
                atualizarInscricao();
                loop = 1;
            }
            if (escolha == 5) {
                atualizarVaga();
                loop = 1;
            }
            if ((escolha < 1) || (escolha > 5)) {
                System.out.println("Opção invalida. Tente novamente");
            }
        }
        return escolha;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Chama apenas o que você quer Atualizar
        System.out.println("Tabelas " +
                "\n\n1 - Usuarios" +
                "\n2 - Cursos" +
                "\n3 - Empresas" +
                "\n4 - Inscricoes" +
                "\n5 - Vagas");

        descisaoAtualizar();
    }
}
