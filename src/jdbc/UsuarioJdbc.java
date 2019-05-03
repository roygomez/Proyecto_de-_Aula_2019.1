package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class UsuarioJdbc extends Jdbc {

    private LinkedList listaFuncionario;
    Jdbc cone = new Jdbc();

    public void saveUsuario(Usuario f1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("insert into usuario values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pstt.setString(1, null);
            pstt.setString(2, f1.getIdentificacion());
            pstt.setString(3, f1.getNombre1());
            pstt.setString(4, f1.getNombre2());
            pstt.setString(5, f1.getApellido1());
            pstt.setString(6, f1.getApellido2());
            pstt.setDate(7, f1.getFechaNacimiento());
            pstt.setString(8, f1.getSexo());
            pstt.setString(9, f1.getCorreo());
            pstt.setString(10, f1.getTelefono());
            pstt.setString(11, f1.getPassword());
            pstt.setString(12, f1.getTipoUsuario());
            pstt.setBoolean(13, f1.isInscrito());
            pstt.setString(14, f1.getCodigoInstitucional());
            pstt.setDouble(15, f1.getPagoAnual());
            pstt.setBoolean(16, f1.isControlPago());

            if ((getUsuario(f1.getIdentificacion())).getIdentificacion() == null) {
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

    public void updateUsuario(Usuario f1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("UPDATE usuario SET ,identificacion = ?,nombre1 = ?,nombre2 = ?,apellido1 = ?,apellido2 = ?,fechaNacimiento = ?,sexo = ?,correo = ?,telefono = ?,password = ?,rol = ? where idPersona = ?");

            pstt.setString(2, f1.getIdentificacion());
            pstt.setString(3, f1.getNombre1());
            pstt.setString(4, f1.getNombre2());
            pstt.setString(5, f1.getApellido1());
            pstt.setString(6, f1.getApellido2());
            pstt.setDate(7, f1.getFechaNacimiento());
            pstt.setString(8, f1.getSexo());
            pstt.setString(9, f1.getCorreo());
            pstt.setString(10, f1.getTelefono());
            pstt.setString(11, f1.getPassword());
            pstt.setString(12, f1.getTipoUsuario());
            pstt.setBoolean(13, f1.isInscrito());
            pstt.setString(14, f1.getCodigoInstitucional());
            pstt.setDouble(15, f1.getPagoAnual());
            pstt.setBoolean(16, f1.isControlPago());

            pstt.executeUpdate();
        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public Usuario getUsuario(String identificacion) throws SQLException {

        Usuario f1 = new Usuario();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {

            pstt = this.getCon().prepareStatement("select * from usuario where idPersona = ?");
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

    public LinkedList getUsuario() throws SQLException {

        listaFuncionario = new LinkedList();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {
            pstt = this.getCon().prepareStatement("select * from usuario where idPersona = ?");
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

    private Usuario load(ResultSet rs) throws SQLException {
        Usuario rcu = new Usuario();

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
        rcu.setTipoUsuario(rs.getString(12));
        rcu.setInscrito(rs.getBoolean(13));
        rcu.setCodigoInstitucional(rs.getString(14));
        rcu.setPagoAnual(rs.getDouble(15));
        rcu.setControlPago(rs.getBoolean(16));

        return rcu;
    }

    public void DeleteUsuario(String identificacion) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = this.getCon().prepareStatement("delete from usuario where idPersona = ?");
            pstn.setString(1, identificacion);
            pstn.executeUpdate();
        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }

}
