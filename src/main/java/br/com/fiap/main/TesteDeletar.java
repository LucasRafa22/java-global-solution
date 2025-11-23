package br.com.fiap.main;

import br.com.fiap.beans.*;
import br.com.fiap.dao.*;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletar {

    static String texto (String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }


    static void deletarUsuario() throws SQLException, ClassNotFoundException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario objUsuario = new Usuario();

        String tabela = "USUARIOS";
        String id = "ID_USUARIO";
        int idUsuario = inteiro("Digite o " + id + ":");
        objUsuario.setId_usuario(idUsuario);
        System.out.println(usuarioDAO.deletar(objUsuario.getId_usuario()));
    }

    static void deletarCurso() throws SQLException, ClassNotFoundException {
        CursoDAO cursoDAO = new CursoDAO();
        Curso objCurso = new Curso();

        String tabela = "CURSOS";
        String id = "ID_CURSO";
        int idCurso = inteiro("Digite o " + id + ":");
        objCurso.setId_curso(idCurso);
        System.out.println(cursoDAO.deletar(objCurso.getId_curso()));
    }

    static void deletarEmpresa() throws SQLException, ClassNotFoundException {
        EmpresaDAO empresaDAO = new EmpresaDAO();
        Empresa objEmpresa = new Empresa();

        String tabela = "EMPRESAS";
        String id = "ID_EMPRESA";
        int idEmpresa = inteiro("Digite o " + id + ":");
        objEmpresa.setId_empresa(idEmpresa);
        System.out.println(empresaDAO.deletar(objEmpresa.getId_empresa()));
    }

    static void deletarInscricao() throws SQLException, ClassNotFoundException {
        InscricaoDAO inscricaoDAO = new InscricaoDAO();
        Inscricao objInscricao = new Inscricao();

        String tabela = "INSCRICOES";
        String id = "ID_INSCRICAO";
        int idInscricao = inteiro("Digite o " + id + ":");
        objInscricao.setId_inscricao(idInscricao);
        System.out.println(inscricaoDAO.deletar(objInscricao.getId_inscricao()));
    }

    static void deletarVaga() throws SQLException, ClassNotFoundException {
        VagaDAO vagaDAO = new VagaDAO();
        Vaga objVaga = new Vaga();

        String tabela = "VAGAS";
        String id = "ID_VAGA";
        int idVaga = inteiro("Digite o " + id + ":");
        objVaga.setId_vaga(idVaga);
        System.out.println(vagaDAO.deletar(objVaga.getId_vaga()));
    }


    static int descisaoDeletar() throws SQLException, ClassNotFoundException {
        int loop = 0;
        int escolha = 0;

        while (loop == 0) {
            escolha = inteiro("\n\nEscolha uma tabela que deseja Deletar os dados: ");
            if (escolha == 1) {
                deletarUsuario();
                loop = 1;
            }
            if (escolha == 2) {
                deletarCurso();
                loop = 1;
            }
            if (escolha == 3) {
                deletarEmpresa();
                loop = 1;
            }
            if (escolha == 4) {
                deletarInscricao();
                loop = 1;
            }
            if (escolha == 5) {
                deletarVaga();
                loop = 1;
            }
            if ((escolha < 1) || (escolha > 5)) {
                System.out.println("Opção invalida. Tente novamente");
            }
        }
        return escolha;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Chama apenas o que você quer deletar
        System.out.println("Tabelas" +
                "\n\n1 - Usuarios" +
                "\n2 - Cursos" +
                "\n3 - Empresas" +
                "\n4 - Inscriçoes" +
                "\n5 - vaga");

        descisaoDeletar();
    }
}

