package jdbc;

import java.sql.*;

public class Jdbc {

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/sistema_bibliotecario?serverTimezone=UTC";
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public void conectarme() throws SQLException {

        try {
            setCon(DriverManager.getConnection(url, "root", ""));
            Class.forName(driver);
        } catch (ClassNotFoundException cl) {
            System.out.println(cl.getMessage());
        }
        
    }

}
