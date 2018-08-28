package Br.UniFacisa.SI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoComBanco {
    
    private static Connection connection;
    
    private static String dsn = "jdbc:mysql://localhost:3306/agendaapp";
    private static String username = "jose";
    private static String password = "12345678";
    
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(dsn, username, password);
            } catch (SQLException ex) {
                System.out.println("Houve um erro ao conectar com o Banco de Dados.");
            }
        }
        
        return connection;
    }
    
}