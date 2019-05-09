package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.MaterialBibliografico;
import modelo.PrestamoBibliografico;
import modelo.Usuario;

public class PrestamoJdbc extends Jdbc {

    private List listaPrestamo;
    Jdbc cone = new Jdbc();
//
    public void savePrestamo(PrestamoBibliografico p1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = getCon().prepareStatement("insert into prestamo values(?,?,?,?,?,?,?,?)");

            pstt.setString(1, null);            
            pstt.setString(2, p1.getCodigoPrestamo());
            pstt.setTimestamp(3, p1.getFechaPrestamo());
            pstt.setTimestamp(4, p1.getFechaLimite());
            pstt.setTimestamp(5, null);
            pstt.setString(6, p1.getTipoPrestamo());
            pstt.setInt(7, p1.getIdMaterial());
            pstt.setInt(8, p1.getIdUsuario());

            pstt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Prestamo fue registrado exitosamente!");

        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public void updatePrestamo(PrestamoBibliografico p1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("UPDATE Prestamo SET fechaPrestamo=?,fechaLimite=?,tipoPersona=?idPersona=?,idMaterrial=? where idPrestamo = ?");

            pstt.setTimestamp(1, p1.getFechaPrestamo());
            pstt.setTimestamp(2, p1.getFechaLimite());
            pstt.setString(3, p1.getTipoPrestamo());
            pstt.setInt(4, p1.getIdMaterial());
            pstt.setInt(5, p1.getIdUsuario());
            pstt.setInt(6, p1.getIdPrestamo());
            pstt.setString(7, p1.getCodigoPrestamo());

            pstt.executeUpdate();
        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public PrestamoBibliografico getPrestamo(String idPrestamo) throws SQLException {

        PrestamoBibliografico p1 = new PrestamoBibliografico();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {

            pstt = this.getCon().prepareStatement("select * from Prestamo where idPrestamo = ?");
            pstt.setString(1, idPrestamo);
            rs = pstt.executeQuery();
            while (rs.next()) {
                p1 = load(rs);
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }

        return p1;
    }

    public List getPrestamo() throws SQLException {

        listaPrestamo = new LinkedList();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {
            pstt = this.getCon().prepareStatement("SELECT prestamo.codigoPrestamo,prestamo.fechaPrestamo,prestamo.fechaLimite,prestamo.fechaDevolucion,prestamo.tipoPrestamo, usuario.identificacion , usuario.nombre1,usuario.apellido1, usuario.telefono,material.tipoMaterial, material.titulo, material.disponible FROM prestamo, usuario, material WHERE prestamo.idMaterial = material.idMaterial");
            rs = pstt.executeQuery();
            while (rs.next()) {
                listaPrestamo.add(load(rs));
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return listaPrestamo;
    }

    private PrestamoBibliografico load(ResultSet rs) throws SQLException {
        PrestamoBibliografico pb = new PrestamoBibliografico();
        
        pb.setCodigoPrestamo(rs.getString(1));
        pb.setFechaPrestamo(rs.getTimestamp(2));
        pb.setFechaLimite(rs.getTimestamp(3));
        pb.setFechaDevolucion(rs.getTimestamp(4));
        pb.setTipoPrestamo(rs.getString(5));
        
        Usuario u = new Usuario();
        u.setIdentificacion(rs.getString(6));
        u.setNombre1(rs.getString(7));
        u.setApellido1(rs.getString(8));
        u.setTelefono(rs.getString(9));
        
        MaterialBibliografico m = new MaterialBibliografico();
        m.setTipoMaterial(rs.getString(10));
        m.setTitulo(rs.getString(11));
        m.setDisponible(rs.getBoolean(12));
        
        pb.setUsuario(u);
        pb.setMaterial(m);
        

        return pb;
    }

    public void DeletePrestamo(String identificacion) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = getCon().prepareStatement("delete from Prestamo where idPrestamo = ?");
            pstn.setString(1, identificacion);
            pstn.executeUpdate();
        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }
}
