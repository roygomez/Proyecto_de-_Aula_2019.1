package jdbc;

import modelo.*;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioJdbc extends Jdbc {

    private List listaFuncionario;
    Jdbc cone = new Jdbc();

    public void saveFuncionario(Funcionario f1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = getCon().prepareStatement("insert into funcionario values(?,?,?,?,?,?,?,?,?,?,?,?)");

            pstt.setString(1, null);
            pstt.setString(2, f1.getIdentificacion());
            pstt.setString(3, f1.getNombre1());
            pstt.setString(4, f1.getNombre2());
            pstt.setString(5, f1.getApellido1());
            pstt.setString(6, f1.getApellido2());
            pstt.setDate(7, new Date(f1.getFechaNacimiento().getTime()));
            pstt.setString(8, f1.getSexo());
            pstt.setString(9, f1.getCorreo());
            pstt.setString(10, f1.getTelefono());
            pstt.setString(11, f1.getPassword());
            pstt.setString(12, f1.getRol());

            if ((getFuncionario(f1.getIdentificacion())).getIdentificacion() == null) {
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

    public void updateFuncionario(Funcionario f1) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = getCon().prepareStatement("UPDATE funcionario SET identificacion = ?,nombre1 = ?,nombre2 = ?,apellido1 = ?,apellido2 = ?,fechaNacimiento = ?,sexo = ?,correo = ?,telefono = ?,password = ?,rol = ? where idPersona = ?");

            pstn.setString(1, f1.getIdentificacion());
            pstn.setString(2, f1.getNombre1());
            pstn.setString(3, f1.getNombre2());
            pstn.setString(4, f1.getApellido1());
            pstn.setString(5, f1.getApellido2());
            pstn.setDate(6, new Date(f1.getFechaNacimiento().getTime()));
            pstn.setString(7, f1.getSexo());
            pstn.setString(8, f1.getCorreo());
            pstn.setString(9, f1.getTelefono());
            pstn.setString(10, f1.getPassword());
            pstn.setString(11, f1.getRol());
            pstn.setInt(12, f1.getIdPersona());

            pstn.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Funcionario fue actualizado exitosamente!");

        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }

    public Funcionario getFuncionario(String identificacion) throws SQLException {

        Funcionario f1 = new Funcionario();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {

            pstt = getCon().prepareStatement("select * from funcionario where identificacion = ?");
            pstt.setString(1, identificacion);
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

    public List getFuncionario() throws SQLException {

        listaFuncionario = new LinkedList();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {
            pstt = getCon().prepareStatement("select * from funcionario");
            rs = pstt.executeQuery();
            while (rs.next()) {
                listaFuncionario.add(load(rs));
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return listaFuncionario;
    }

    private Funcionario load(ResultSet rs) throws SQLException {
        Funcionario f1 = new Funcionario();

        f1.setIdPersona(rs.getInt(1));
        f1.setIdentificacion(rs.getString(2));
        f1.setNombre1(rs.getString(3));
        f1.setNombre2(rs.getString(4));
        f1.setApellido1(rs.getString(5));
        f1.setApellido2(rs.getString(6));
        f1.setFechaNacimiento(rs.getDate(7));
        f1.setSexo(rs.getString(8));
        f1.setCorreo(rs.getString(9));
        f1.setTelefono(rs.getString(10));
        f1.setPassword(rs.getString(11));
        f1.setRol(rs.getString(12));

        return f1;
    }

    public void DeleteFuncionario(String identificacion) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = getCon().prepareStatement("DELETE FROM funcionario WHERE identificacion = ?");
            pstn.setString(1, identificacion);
            
            if(pstn.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "El Funcionario fue eliminado exitosamente!");
            }else{
                JOptionPane.showMessageDialog(null, "El Funcionario que desea registar no extiste!");
            }
        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }
    
    public Funcionario Login(String user, String pass) throws SQLException {

        Funcionario f1 = new Funcionario();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {
            
            pstt = getCon().prepareStatement("select * from funcionario where identificacion = ? AND password = ?");
            pstt.setString(1, user);
            pstt.setString(2, pass);
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
}
