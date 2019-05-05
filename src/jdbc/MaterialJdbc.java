
package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.MaterialBibliografico;

public class MaterialJdbc extends Jdbc{
    private List listaMaterial;
    Jdbc cone = new Jdbc();

    public void saveMaterial(MaterialBibliografico m1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = getCon().prepareStatement("insert into material values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pstt.setString(1, null);
            pstt.setString(2, m1.getCodigoMaterial());
            pstt.setString(3, m1.getTipoMaterial());
            pstt.setString(4, m1.getAutor());
            pstt.setString(5, m1.getTitulo());
            pstt.setString(6, m1.getDescripcion());
            pstt.setString(7, m1.getEditorial());
            pstt.setString(8, m1.getEdicion());
            pstt.setString(9, m1.getNumPaginas());
            pstt.setString(10, m1.getTema());
            pstt.setBoolean(11, m1.isDisponible());
            pstt.setString(12, m1.getEstadoFisico());
            pstt.setString(13, m1.getCodigoAsignatura());
            pstt.setString(14, m1.getLetraUbicacion());
            pstt.setInt(15, m1.getEjemplar());

            pstt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Material fue registrado exitosamente!");
            
        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public void updateMaterial(MaterialBibliografico m1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("UPDATE material SET codigoMaterial=?,tipoMaterial=?,autor=?,titulo=?,descripcion=?,editorial=?,edicion=?,numPaginas=?,tema=?,disponible=?,estadoFisico=?,codigoAsignatura=?,letraUbicacion=?,Ejemplar=? WHERE idMaterial=?");
            
            pstt.setString(1, m1.getCodigoMaterial());
            pstt.setString(2, m1.getTipoMaterial());
            pstt.setString(3, m1.getAutor());
            pstt.setString(4, m1.getTitulo());
            pstt.setString(5, m1.getDescripcion());
            pstt.setString(6, m1.getEditorial());
            pstt.setString(7, m1.getEdicion());
            pstt.setString(8, m1.getNumPaginas());
            pstt.setString(9, m1.getTema());
            pstt.setBoolean(10, m1.isDisponible());
            pstt.setString(11, m1.getEstadoFisico());
            pstt.setString(12, m1.getCodigoAsignatura());
            pstt.setString(13, m1.getLetraUbicacion());
            pstt.setInt(14, m1.getEjemplar());
            pstt.setInt(15, m1.getIdMaterial());

            pstt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Material fue actualizado exitosamente!");
        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public MaterialBibliografico getMaterial(String codigo) throws SQLException {

        MaterialBibliografico m1 = new MaterialBibliografico();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {

            pstt = this.getCon().prepareStatement("select * from material where codigoMaterial = ?");
            pstt.setString(1, codigo);
            rs = pstt.executeQuery();
            while (rs.next()) {
                m1 = load(rs);
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        System.out.println(m1.getIdMaterial() +""+ m1.getCodigoMaterial());

        return m1;
    }

    public List getMaterial() throws SQLException {

        listaMaterial = new LinkedList();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {
            pstt = this.getCon().prepareStatement("select * from material");
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
        
        rcu.setIdMaterial(rs.getInt(1));
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
