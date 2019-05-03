
package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import modelo.MaterialBibliografico;

public class MaterialJdbc extends Jdbc{
    private LinkedList listaMaterial;
    Jdbc cone = new Jdbc();

    public void saveMaterial(MaterialBibliografico f1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("insert into Material values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pstt.setString(1, null);
            pstt.setString(2, f1.getCodigoMaterial());
            pstt.setString(3, f1.getTipoMaterial());
            pstt.setString(4, f1.getAutor());
            pstt.setString(5, f1.getTitulo());
            pstt.setString(6, f1.getDescripcion());
            pstt.setString(7, f1.getEditorial());
            pstt.setString(8, f1.getEdicion());
            pstt.setString(9, f1.getNumPaginas());
            pstt.setString(10, f1.getTema());
            pstt.setBoolean(11, f1.isDisponible());
            pstt.setString(12, f1.getEstadoFisico());
            pstt.setString(13, f1.getCodigoAsignatura());
            pstt.setString(14, f1.getLetraUbicacion());
            pstt.setInt(15, f1.getEjemplar());

            pstt.executeUpdate();
            
        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public void updateMaterial(MaterialBibliografico f1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("UPDATE Material SET ,identificacion = ?,nombre1 = ?,nombre2 = ?,apellido1 = ?,apellido2 = ?,fechaNacimiento = ?,sexo = ?,correo = ?,telefono = ?,password = ?,rol = ? where idPersona = ?");

            pstt.setString(2, f1.getTipoMaterial());
            pstt.setString(3, f1.getAutor());
            pstt.setString(4, f1.getTitulo());
            pstt.setString(5, f1.getDescripcion());
            pstt.setString(6, f1.getEditorial());
            pstt.setString(7, f1.getEdicion());
            pstt.setString(8, f1.getNumPaginas());
            pstt.setString(9, f1.getTema());
            pstt.setBoolean(10, f1.isDisponible());
            pstt.setString(11, f1.getEstadoFisico());
            pstt.setString(12, f1.getCodigoAsignatura());
            pstt.setString(13, f1.getLetraUbicacion());
            pstt.setInt(14, f1.getEjemplar());

            pstt.executeUpdate();
        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public MaterialBibliografico getMaterial(String identificacion) throws SQLException {

        MaterialBibliografico f1 = new MaterialBibliografico();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {

            pstt = this.getCon().prepareStatement("select * from Material where idPersona = ?");
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

    public LinkedList getMaterial() throws SQLException {

        listaMaterial = new LinkedList();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {
            pstt = this.getCon().prepareStatement("select * from Material where idPersona = ?");
            rs = pstt.executeQuery();
            while (rs.next()) {
                listaMaterial.add(load(rs));
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return listaMaterial;
    }

    private MaterialBibliografico load(ResultSet rs) throws SQLException {
        MaterialBibliografico rcu = new MaterialBibliografico();

        rcu.setCodigoMaterial(rs.getString(2));
	rcu.setTipoMaterial(rs.getString(3));
	rcu.setAutor(rs.getString(4));
	rcu.setTitulo(rs.getString(5));
	rcu.setDescripcion(rs.getString(6));
	rcu.setEditorial(rs.getString(7));
	rcu.setEdicion(rs.getString(8));
	rcu.setNumPaginas(rs.getString(9));
	rcu.setTema(rs.getString(10));
	rcu.setDisponible(rs.getBoolean(11));
	rcu.setEstadoFisico(rs.getString(12));
	rcu.setCodigoAsignatura(rs.getString(13));
	rcu.setLetraUbicacion(rs.getString(14));
	rcu.setEjemplar(rs.getInt(15));

        return rcu;
    }

    public void DeleteMaterial(String idMaterial) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = this.getCon().prepareStatement("delete from Material where idPersona = ?");
            pstn.setString(1, idMaterial);
            pstn.executeUpdate();
        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }
}
