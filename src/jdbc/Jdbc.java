package jdbc;

import java.sql.*;
import modelo.Funcionario;

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

    public void conectarme() throws SQLException {

    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

}
