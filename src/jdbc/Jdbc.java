package jdbc;

import java.sql.*;

public class Jdbc {

    private String driver;
    private String url;
    private Connection con;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void conectarme() throws SQLException {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
        }
        
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_blibliotecario?useTimezone=true&serverTimezone=UTC", "biblioteca", "KjjIbLxkqs9vaxsK");
    }
   
}
