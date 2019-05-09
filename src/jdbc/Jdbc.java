package jdbc;

import java.sql.*;

public class Jdbc {

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3307/sistema_bibliotecario?serverTimezone=UTC";
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public void conectarme() throws SQLException {

        try {
            setCon(DriverManager.getConnection(url, "biblioteca", "vZ7XPPN5qfPT6EIw"));
            Class.forName(driver);
        } catch (ClassNotFoundException cl) {
            System.out.println(cl.getMessage());
        }
        
    }

}
