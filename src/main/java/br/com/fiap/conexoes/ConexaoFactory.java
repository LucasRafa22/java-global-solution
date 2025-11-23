package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {

    public static Connection conectar() throws Exception {

        // Carrega o driver PostgreSQL
        Class.forName("org.postgresql.Driver");

        String host = System.getenv("DB_HOST");
        String port = System.getenv("DB_PORT");
        String database = System.getenv("DB_NAME");
        String user = System.getenv("DB_USER");
        String pass = System.getenv("DB_PASS");

        if (host == null || port == null || database == null || user == null || pass == null) {
            throw new RuntimeException("Variáveis de ambiente do banco não configuradas no Railway.");
        }

        String url = "jdbc:postgresql://" + host + ":" + port + "/" + database;

        return DriverManager.getConnection(url, user, pass);
    }
}




