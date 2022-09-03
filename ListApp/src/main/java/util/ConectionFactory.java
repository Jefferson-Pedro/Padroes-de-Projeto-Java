package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConectionFactory {

    //public static final String driver = "com.mysql.jdbc.Driver";
	public static final String driver = "com.mysql.cj.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/todoapp";
    public static final String user = "root";
    public static final String password = "";

    public static Connection getConnection() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    }

    public static void closeConnection(Connection connection) {

        try {
            if (connection != null) {
                connection.close();
            }
            
        } catch (Exception ex) {
          throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
    }
    
     public static void closeConnection(Connection connection, PreparedStatement statement) {

        try {
            if (connection != null) {
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
            
        } catch (Exception ex) {
          throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
    }
     
       public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultado) {

        try {
            if (connection != null) {
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
            if(resultado != null){
                resultado.close();
            }
            
        } catch (Exception ex) {
          throw new RuntimeException("Erro ao fechar a conex�o com o banco de dados", ex);
        }
    }
}

