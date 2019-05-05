package jdbc;

import modelo.*;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class MultaJdbc extends Jdbc {
    private List listaMulta;
    Jdbc cone = new Jdbc();

    public void saveMulta(Multa f1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = getCon().prepareStatement("insert into multa values(?,?,?,?,?,?)");

            pstt.setString(1, null);
            pstt.setDate(2, f1.getFechaMulta());
            pstt.setDouble(3, f1.getValorMulta());
            pstt.setDate(4, f1.getFechaPago());
            pstt.setString(5, f1.getMotivoMulta());
            pstt.setBoolean(6, f1.isControlPago());
            
            pstt.executeUpdate();
            
        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public void updateMulta(Multa f1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("UPDATE multa SET ,identificacion = ?,nombre1 = ?,nombre2 = ?,apellido1 = ?,apellido2 = ?,fechaNacimiento = ?,sexo = ?,correo = ?,telefono = ?,password = ?,rol = ? where idPersona = ?");
            
            
            pstt.setDate(2, f1.getFechaMulta());
            pstt.setDouble(3, f1.getValorMulta());
            pstt.setDate(4, f1.getFechaPago());
            pstt.setString(5, f1.getMotivoMulta());
            pstt.setBoolean(6, f1.isControlPago());

            pstt.executeUpdate();
        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public Multa getMulta(String idMulta) throws SQLException {

        Multa f1 = new Multa();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {

            pstt = this.getCon().prepareStatement("select * from multa where idMulta = ?");
            pstt.setString(1, idMulta);
            rs = pstt.executeQuery();
            while (rs.next()) {
                f1 = load(rs);
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }

        return f1;
    }

    public List getMulta() throws SQLException {

        listaMulta = new LinkedList();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {
            pstt = this.getCon().prepareStatement("select * from multa where idMulta = ?");
            rs = pstt.executeQuery();
            while (rs.next()) {
                listaMulta.add(load(rs));
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return listaMulta;
    }

    private Multa load(ResultSet rs) throws SQLException {
        Multa rcu = new Multa();

        rcu.setFechaMulta(rs.getDate(2));
	rcu.setValorMulta(rs.getDouble(3));
	rcu.setFechaPago(rs.getDate(4));
	rcu.setMotivoMulta(rs.getString(5));
	rcu.setControlPago(rs.getBoolean(6));

        return rcu;
    }

    public void DeleteMulta(String identificacion) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = getCon().prepareStatement("delete from multa where idMulta = ?");
            pstn.setString(1, identificacion);
            pstn.executeUpdate();
        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }
}
