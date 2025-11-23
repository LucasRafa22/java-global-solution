package br.com.fiap.main;

import br.com.fiap.beans.*;
import br.com.fiap.dao.*;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

public class TesteSelecionar {

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static void selecionarUsuario() throws SQLException, ClassNotFoundException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> lista = usuarioDAO.selecionar();

        if(lista != null && !lista.isEmpty()){
            for(Usuario a : lista){
                System.out.println("\nID: " + a.getId_usuario() + " | Nome: " +
                        a.getNome() + " | email: " +
                        a.getEmail() + " | Tipo usuario: " +
                        a.getTipo_usuario() + " | Data cadastro: " +
                        a.getData_cadastro());
            }
        } else {
            System.out.println("\nNenhum usuario encontrado.");
        }
    }

    static void selecionarCurso() throws SQLException, ClassNotFoundException {
        CursoDAO cursoDAO = new CursoDAO();
        List<Curso> lista = cursoDAO.selecionar();

        if(lista != null && !lista.isEmpty()){
            for(Curso a : lista) {
                System.out.println("\nID: " + a.getId_curso() + " | Titulo: " +
                        a.getTitulos() + " | Descricao: " +
                        a.getDescricao() + " | Carga Horaria: " +
                        a.getCarga_horaria() + " | Categoria: " +
                        a.getCategoria() + " | Nivel: " +
                        a.getNivel());
            }
        } else {
            System.out.println("\nNenhum curso encontrado.");
        }
    }

    static void selecionarEmpresa() throws SQLException, ClassNotFoundException {
        EmpresaDAO empresaDAO = new EmpresaDAO();
        List<Empresa> lista = empresaDAO.selecionar();

        if(lista != null && !lista.isEmpty()){
            for(Empresa a : lista) {
                System.out.println("\nID: " + a.getId_empresa() + " | Nome da Empresa: " +
                        a.getNome_empresa() + " | Cnpj: " +
                        a.getCnpj() + " | Setor: " +
                        a.getSetor() + " | Tamanho: " +
                        a.getTamanho());

            }
        } else {
            System.out.println("\nNenhuma empresa encontrada.");
        }
    }

    static void selecionarInscricao() throws SQLException, ClassNotFoundException {
        InscricaoDAO inscricaoDAO = new InscricaoDAO();
        List<Inscricao> lista = inscricaoDAO.selecionar();

        if(lista != null && !lista.isEmpty()){
            for(Inscricao a : lista) {
                System.out.println("\nID: " + a.getId_inscricao() + " | Descricao: " +
                        a.getDescricao() + " | Data da inscricao: " +
                        a.getData_inscricao() + " | Status: " +
                        a.getStatus());


            }
        } else {
            System.out.println("\nNenhuma inscricao encontrada.");
        }
    }

    static void selecionarVaga() throws SQLException, ClassNotFoundException {
        VagaDAO vagaDAO = new VagaDAO();
        List<Vaga> lista = vagaDAO.selecionar();

        if(lista != null && !lista.isEmpty()){
            for(Vaga a : lista) {
                System.out.println("\nID: " + a.getId_vaga() + " | Titulo da vaga: " +
                        a.getTitulo_vaga() + " | Descricao: " +
                        a.getDescricao() + " | Competencias requeridas: " +
                        a.getCompetencias_requeridas() + " | Nivel de experiencia: " +
                        a.getNivel_experiencia());

            }
        } else {
            System.out.println("\nNenhuma vaga encontrada.");
        }
    }

    static int descisaoSelecionar() throws SQLException, ClassNotFoundException {
        int loop = 0;
        int escolha = 0;

        while (loop == 0) {
            escolha = inteiro("\n\nEscolha uma tabela que deseja vizualizar os dados: ");
            if (escolha == 1) {
                selecionarUsuario();
                loop = 1;
            }
            if (escolha == 2) {
                selecionarCurso();
                loop = 1;
            }
            if (escolha == 3) {
                selecionarEmpresa();
                loop = 1;
            }
            if (escolha == 4) {
                selecionarInscricao();
                loop = 1;
            }
            if (escolha == 5) {
                selecionarVaga();
                loop = 1;
            }
            if ((escolha < 1) || (escolha > 5)) {
                System.out.println("Opção invalida. Tente novamente");
            }
        }
        return escolha;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Chama apenas o que você quer selecionar
        System.out.println("Tabelas" +
                "\n\n1 - Usuario" +
                "\n2 - Curso" +
                "\n3 - Empresa" +
                "\n4 - Inscricao" +
                "\n5 - Vaga");

        descisaoSelecionar();

    }
}







