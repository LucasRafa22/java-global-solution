package br.com.fiap.main;

import br.com.fiap.beans.*;
import br.com.fiap.dao.*;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserir {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static void inserirUsuario() throws SQLException, ClassNotFoundException {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario objUsuario = new Usuario();

        objUsuario.setNome(texto("Nome do usuario"));
        objUsuario.setEmail(texto("Email do usuario"));
        objUsuario.setSenha(texto("Senha do usuario"));
        objUsuario.setTipo_usuario(texto("Tipo do usuario"));
        objUsuario.setData_cadastro(inteiro("Data do Cadastro"));

        String resultado = usuarioDAO.inserir(objUsuario);
        System.out.println(resultado);

    }

    static void inserirCurso() throws SQLException, ClassNotFoundException {

        CursoDAO cursoDAO = new CursoDAO();

        Curso objCurso = new Curso();

        objCurso.setTitulos(texto("Titulo do curso"));
        objCurso.setDescricao(texto("Descricao do curso"));
        objCurso.setCarga_horaria(inteiro("Carga horaria do curso"));
        objCurso.setCategoria(texto("Categoria do curso"));
        objCurso.setNivel(inteiro("Nivel do curso"));


        String resultado = cursoDAO.inserir(objCurso);
        System.out.println(resultado);

    }

    static void inserirEmpresa() throws SQLException, ClassNotFoundException {

        EmpresaDAO empresaDAO = new EmpresaDAO();

        Empresa objEmpresa = new Empresa();

        objEmpresa.setNome_empresa(texto("Nome da empresa"));
        objEmpresa.setCnpj(inteiro("Cnpj da empresa"));
        objEmpresa.setSetor(texto("Setor da empresa"));
        objEmpresa.setTamanho(texto("Tamanho da empresa"));


        String resultado = empresaDAO.inserir(objEmpresa);
        System.out.println(resultado);

    }

    static void inserirInscricao() throws SQLException, ClassNotFoundException {

        InscricaoDAO inscricaoDAO = new InscricaoDAO();

        Inscricao objInscricao = new Inscricao();

        objInscricao.setDescricao(texto("Descricao da inscricao"));
        objInscricao.setData_inscricao(inteiro("Data da inscricao"));
        objInscricao.setStatus(texto("Status da inscricao"));
        objInscricao.setId_usuario(inteiro("Id do usuario"));
        objInscricao.setId_curso(inteiro("Id do curso"));


        String resultado = inscricaoDAO.inserir(objInscricao);
        System.out.println(resultado);

    }

    static void inserirVaga() throws SQLException, ClassNotFoundException {

        VagaDAO vagaDAO = new VagaDAO();

        Vaga objVaga = new Vaga();

        objVaga.setTitulo_vaga(texto("Titulo da vaga"));
        objVaga.setDescricao(texto("Descricao da vaga"));
        objVaga.setCompetencias_requeridas(texto("Competencias requeridas para vaga"));
        objVaga.setNivel_experiencia(texto("Nivel de experiencia para vaga"));
        objVaga.setId_empresa(inteiro("Id da empresa"));


        String resultado = vagaDAO.inserir(objVaga);
        System.out.println(resultado);

    }

    static int descisaoInserir() throws SQLException, ClassNotFoundException {
        int loop = 0;
        int escolha = 0;

        while (loop == 0) {
            escolha = inteiro("\n\nEscolha uma tabela que deseja inserir os dados: ");
            if (escolha == 1) {
                inserirUsuario();
                loop = 1;
            }
            if (escolha == 2) {
                inserirCurso();
                loop = 1;
            }
            if (escolha == 3) {
                inserirEmpresa();
                loop = 1;
            }
            if (escolha == 4) {
                inserirInscricao();
                loop = 1;
            }
            if (escolha == 5) {
                inserirVaga();
                loop = 1;
            }
            if ((escolha < 1) || (escolha > 5)) {
                System.out.println("Opção invalida. Tente novamente");
            }
        }
        return escolha;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Chama apenas o que você quer inserir
        System.out.println("Tabelas" +
                "\n\n1 - Usuarios" +
                "\n2 - Cursos" +
                "\n3 - Empresas" +
                "\n4 - Inscrições" +
                "\n5 - Vagas");

        descisaoInserir();
    }

}

