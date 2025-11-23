package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    // metodo de conexão com o banco de dados
    public Connection conexao() throws ClassNotFoundException, SQLException {

        // driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // ler do environment (recomendado)
        String dbUrl  = System.getenv("DB_URL");    // ex: jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl
        String dbUser = System.getenv("DB_USER");
        String dbPass = System.getenv("DB_PASS");

        // fallback — só para desenvolvimento local; REMOVA antes do commit final se for sensível
        if (dbUrl == null || dbUser == null || dbPass == null) {
            dbUrl  = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
            dbUser = "RM565194";
            dbPass = "220507";
        }

        return DriverManager.getConnection(dbUrl, dbUser, dbPass);
    }

}



