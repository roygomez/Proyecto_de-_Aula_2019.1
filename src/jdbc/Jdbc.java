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
        con = DriverManager.setConnection(url, "Biblioteca", "3UghTcMJP80k0dny");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException cl) {
            System.out.println(cl.getMessage();
        }
        
        
    }
   
}
