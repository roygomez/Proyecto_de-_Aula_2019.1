package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.PrestamoBibliografico;

public class PrestamoJdbc extends Jdbc {

    private List listaPrestamo;
    Jdbc cone = new Jdbc();

    public void savePrestamo(PrestamoBibliografico p1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = getCon().prepareStatement("insert into prestamo values(?,?,?,?,?,?)");

            pstt.setString(1, null);
            pstt.setDate(2, p1.getFechaPrestamo());
            pstt.setDate(3, p1.getFechaLimite());
            pstt.setString(5, p1.getTipoPrestamo());
            pstt.setInt(5, p1.getIdPersona());
            pstt.setInt(5, p1.getIdMaterial());

            pstt.executeUpdate();

        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public void updatePrestamo(PrestamoBibliografico p1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("UPDATE Prestamo SET ,identificacion = ?,nombre1 = ?,nombre2 = ?,apellido1 = ?,apellido2 = ?,fechaNacimiento = ?,sexo = ?,correo = ?,telefono = ?,password = ?,rol = ? where idPersona = ?");

            pstt.setDate(2, p1.getFechaPrestamo());
            pstt.setDate(3, p1.getFechaLimite());
            pstt.setDate(4, p1.getFechaDevolucion());
            pstt.setString(5, p1.getTipoPrestamo());

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
            pstt = this.getCon().prepareStatement("select * from Prestamo where idPrestamo = ?");
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

        pb.setFechaPrestamo(rs.getDate(2));
        pb.setFechaLimite(rs.getDate(3));
        pb.setFechaDevolucion(rs.getDate(4));
        pb.setTipoPrestamo(rs.getString(5));

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
