package database;


import java.sql.*;

/**
 * Created by Gürkan on 25.4.2015.
 */
public class DatabaseConnectionManager {
    static final String JDBC_DRIVER = "sqlite-jdbc-3.8.7.jar";
    static final String DB_URL = "jdbc:sqlite:C:/Users/Gürkan/IdeaProjects/Hospital Employee Management/dab";
    Connection conn = null;
    Statement stmt = null;
    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    public DatabaseConnectionManager() {

    }

    public static DatabaseConnectionManager getConnectionInstance() {
        return connectionInstance;
    }

    public void connect() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        System.out.println("Connecting to Database ... ");
        conn = DriverManager.getConnection(DB_URL);

    }

    public void disconnect() throws SQLException {
        System.out.println("Disconnecting...");
        conn.close();
    }
    public Connection getConnectionObject(){
        return conn;

    }


}







