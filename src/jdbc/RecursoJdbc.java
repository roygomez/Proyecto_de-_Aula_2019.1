/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.awt.List;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo.Recurso;

/**
 *
 * @author Usuario
 */
public class RecursoJdbc extends Jdbc {

    private LinkedList listaRecurso;
    Jdbc cone = new Jdbc();

    public void saveRecurso(Recurso rc) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("insert into recurso values(?,?,?,?,?)");

            pstt.setString(1, null);
            pstt.setString(2, rc.getNombre());
            pstt.setString(3, rc.getTipo());
            pstt.setString(4, rc.getEstado());
            pstt.setString(5, rc.getSerial());

            if ((getRecurso(rc.getSerial())).getSerial() == null) {
                if (rc.getSerial() != null) {
                    pstt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El Recurso fue registrado exitosamente!");
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
 

    

    public Recurso getRecurso(String serial) throws SQLException {

        Recurso rc = new Recurso();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {

            pstt = this.getCon().prepareStatement("select * from recurso where Serial=?");
            pstt.setString(1, serial);
            rs = pstt.executeQuery();
            while (rs.next()) {
                rc = load(rs);
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }

        return rc;
    }

    public LinkedList getRecurso() throws SQLException {

        listaRecurso = new LinkedList();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {
            pstt = this.getCon().prepareStatement("select * from recurso where Serial=?");
            rs = pstt.executeQuery();
            while (rs.next()) {
                listaRecurso.add(load(rs));
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return listaRecurso;
    }

    private Recurso load(ResultSet rs) throws SQLException {
        Recurso rcu = new Recurso();

        rcu.setId(rs.getString(1));
        rcu.setNombre(rs.getString(2));
        rcu.setTipo(rs.getString(3));
        rcu.setEstado(rs.getString(4));
        rcu.setSerial(rs.getString(5));

        return rcu;
    }

    public void DeleteRecurso(String serial) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = this.getCon().prepareStatement("delete from recurso where Serial=?");
            pstn.setString(1, serial);
            pstn.executeUpdate();
        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }

}
