package jdbc;

import modelo.*;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class MultaJdbc extends Jdbc {
    private LinkedList listaMulta;
    Jdbc cone = new Jdbc();

    public void saveMulta(Multa f1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = getCon().prepareStatement("insert into multa values(?,?,?,?,?,?)");

            pstt.setString(1, null);
            pstt.setInt(2, f1.getIdMulta());
            pstt.setString(3, f1.getNombre1());
            pstt.setString(4, f1.getNombre2());
            pstt.setString(5, f1.getApellido1());
            pstt.setString(6, f1.getApellido2());
            
            if ((getMulta(f1.getIdentificacion())).getIdentificacion() == null) {
                if (f1.getIdentificacion() != null) {
                    pstt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El Funcionario fue registrado exitosamente!");
                } else {
                    JOptionPane.showMessageDialog(null, "No deje campos vacios");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Funcionario que desea registar ya extiste!");
            }//fin de if
        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public void updateMulta(Multa f1) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = this.getCon().prepareStatement("UPDATE multa SET ,identificacion = ?,nombre1 = ?,nombre2 = ?,apellido1 = ?,apellido2 = ?,fechaNacimiento = ?,sexo = ?,correo = ?,telefono = ?,password = ?,rol = ? where idPersona = ?");
            
            
            pstn.setString(2, f1.getIdentificacion());
            pstn.setString(3, f1.getNombre1());
            pstn.setString(4, f1.getNombre2());
            pstn.setString(5, f1.getApellido1());
            pstn.setString(6, f1.getApellido2());

            pstn.executeUpdate();
        } finally {
            if (pstn != null) {
                pstn.close();
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

    public LinkedList getMulta() throws SQLException {

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

        rcu.setIdPersona(rs.getInt(1));
        rcu.setIdentificacion(rs.getString(2));
        rcu.setNombre1(rs.getString(3));
        rcu.setNombre2(rs.getString(4));
        rcu.setApellido1(rs.getString(5));
        rcu.setApellido2(rs.getString(6));
        rcu.setFechaNacimiento(rs.getDate(7));
        rcu.setSexo(rs.getString(8));
        rcu.setCorreo(rs.getString(9));
        rcu.setTelefono(rs.getString(10));
        rcu.setPassword(rs.getString(11));
        rcu.setRol(rs.getString(12));

        return rcu;
    }

    public void DeleteMulta(String identificacion) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = this.getCon().prepareStatement("delete from multa where idMulta = ?");
            pstn.setString(1, identificacion);
            pstn.executeUpdate();
        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }
}
