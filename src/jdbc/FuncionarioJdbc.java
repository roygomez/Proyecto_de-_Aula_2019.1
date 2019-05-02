/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.awt.List;
import modelo.*;
import java.sql.*;
import java.util.LinkedList;
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

        listaFuncionario  = new LinkedList();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {
            pstt = this.getCon().prepareStatement("select * from recurso where Serial=?");
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
        Funcionario rcu = new Funcionario();

        rcu.setIdPersona(rs.getInt(1));
        rcu.setNombre1(rs.getString(2));
        rcu.setApellido1(rs.getString(3));
        rcu.setApellido2(rs.getString(4));
        rcu.setCorreo(rs.getString(5));
        rcu.setFechaNacimiento(rs.getDate(6));
        rcu.setIdentificacion(rs.getString(7));
        rcu.setNombre2(rs.getString(8));
        rcu.setPassword(rs.getString(9));
        rcu.setRol(rs.getString(10));
        rcu.setSexo(rs.getString(11));
        rcu.setTelefono(rs.getString(12));

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
