/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.awt.List;
import modelo.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class FuncionarioJdbc extends Jdbc {

    private List listaFuncionario;
    Jdbc cone = new Jdbc();

    public void saveRecurso(Funcionario f1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("insert into recurso values(?,?,?,?,?,?)");

            pstt.setString(1, null);
            pstt.setString(2, f1.getApellido1());
            pstt.setString(3, f1.getApellido2());
            pstt.setString(4, f1.getCorreo());
            pstt.setString(5, f1.getIdentificacion());
            pstt.setString(6, f1.getNombre1());
            pstt.setString(7, f1.getNombre2());
            pstt.setString(8, f1.getPassword());
            pstt.setString(9, f1.getRol());
            pstt.setString(10, f1.getSexo());
            pstt.setString(11, f1.getTelefono());
            

            if ((getRecurso(f1.getIdentificacion())).getIdentificacion() == null) {
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

    public void updateRecurso(Funcionario f1) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = this.getCon().prepareStatement("update recurso setbNombre =  ? ,Tipo =  ? ,Observaciones =  ? where  Serial =  ? ");
            pstn.setString(2, f1.getApellido1());
            pstn.setString(3, f1.getApellido2());
            pstn.setString(4, f1.getCorreo());
            pstn.setString(5, f1.getIdentificacion());
            pstn.setString(6, f1.getNombre1());
            pstn.setString(7, f1.getNombre2());
            pstn.setString(8, f1.getPassword());
            pstn.setString(9, f1.getRol());
            pstn.setString(10, f1.getSexo());
            pstn.setString(11, f1.getTelefono());

            pstn.executeUpdate();
        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }

    public Funcionario getRecurso(String identificacion) throws SQLException {

        Funcionario f1 = new Funcionario();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {

            pstt = this.getCon().prepareStatement("select * from recurso where Serial=?");
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

    public List getRecurso() throws SQLException {

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
        rcu.setObservaciones(rs.getString(6));

        return rcu;
    }

    public void DeleteRecurso(String identificacion) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = this.getCon().prepareStatement("delete from recurso where Serial=?");
            pstn.setString(1, identificacion);
            pstn.executeUpdate();
        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }
}
