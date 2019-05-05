/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.usuario;

import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.Jdbc;
import jdbc.UsuarioJdbc;
import modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class GUI_Modificar_Usuario extends javax.swing.JInternalFrame {
    private Usuario u1 = new Usuario();
    /**
     * Creates new form GUI_Modificar_Usuario
     */
    public GUI_Modificar_Usuario() {
        initComponents();
        
        groupBtnSexo.add(rBtn1);
        groupBtnSexo.add(rBtn2);
        
        groupBtnInscrito.add(rBtnInscrito1);
        groupBtnInscrito.add(rBtnInscrito2);
        
        groupControl.add(rBtncontrol1);
        groupControl.add(rBtncontrol2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupBtnSexo = new javax.swing.ButtonGroup();
        groupBtnInscrito = new javax.swing.ButtonGroup();
        groupControl = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtBuscarById = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        label3 = new java.awt.Label();
        txtTipoUsu = new javax.swing.JComboBox<String>();
        jLabel14 = new javax.swing.JLabel();
        rBtnInscrito1 = new javax.swing.JRadioButton();
        rBtnInscrito2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCodigoInst = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPagoAnual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        rBtn1 = new javax.swing.JRadioButton();
        rBtn2 = new javax.swing.JRadioButton();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        rBtncontrol1 = new javax.swing.JRadioButton();
        rBtncontrol2 = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Modificar Usuario");
        setMinimumSize(new java.awt.Dimension(918, 669));
        setPreferredSize(new java.awt.Dimension(918, 669));
        getContentPane().setLayout(null);

        jButton1.setText("Guardar Cambios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 570, 170, 40);

        jButton2.setText("Volver");
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 570, 140, 40);

        jButton3.setText("Salir");
        getContentPane().add(jButton3);
        jButton3.setBounds(630, 570, 140, 40);

        txtBuscarById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarByIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscarById);
        txtBuscarById.setBounds(590, 130, 180, 20);

        button1.setLabel("Buscar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(780, 130, 70, 24);

        label3.setText("Busqueda por Identificacion:");
        getContentPane().add(label3);
        label3.setBounds(590, 100, 190, 20);

        txtTipoUsu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estudiante Colombo", "Estudiante Exterior", "Estudiante Unicolombo", "Profesor", " " }));
        getContentPane().add(txtTipoUsu);
        txtTipoUsu.setBounds(220, 440, 178, 20);

        jLabel14.setText("Inscrito: ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(70, 480, 100, 14);

        rBtnInscrito1.setText("Si");
        rBtnInscrito1.setName("rbtnSi"); // NOI18N
        getContentPane().add(rBtnInscrito1);
        rBtnInscrito1.setBounds(220, 480, 80, 23);

        rBtnInscrito2.setText("No");
        rBtnInscrito2.setName("rbtnNo"); // NOI18N
        getContentPane().add(rBtnInscrito2);
        rBtnInscrito2.setBounds(330, 480, 80, 23);

        jLabel1.setText("Identificacion: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 170, 130, 14);

        jLabel10.setBackground(new java.awt.Color(0, 204, 204));
        jLabel10.setText("Telefono: ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(510, 360, 80, 14);

        jLabel16.setBackground(new java.awt.Color(0, 204, 204));
        jLabel16.setText("Codigo Institucional: ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(510, 200, 140, 14);

        jLabel17.setBackground(new java.awt.Color(0, 204, 204));
        jLabel17.setText("Pagó:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(510, 250, 140, 20);

        jLabel18.setBackground(new java.awt.Color(0, 204, 204));
        jLabel18.setText("Pago Anual:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(510, 280, 130, 14);
        getContentPane().add(txtCodigoInst);
        txtCodigoInst.setBounds(660, 200, 178, 20);

        jLabel6.setText("Fecha De Nacimiento: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 360, 170, 14);

        jLabel2.setText("Segundo Apellido: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 320, 150, 14);

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Correo Electronico: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 320, 130, 14);

        jLabel11.setBackground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Contraseña:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(510, 410, 130, 14);

        jLabel8.setText("Sexo: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 400, 90, 14);
        getContentPane().add(txtPagoAnual);
        txtPagoAnual.setBounds(660, 280, 178, 20);

        jLabel3.setText("Primier Apellido: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 290, 140, 14);

        jLabel4.setText("Primer Nombre: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 210, 140, 14);

        jLabel5.setText("Segundo Nombre: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 250, 150, 14);

        jLabel13.setText("Tipo De Usuario: ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 440, 140, 14);

        txtIdentificacion.setName("txtIdentificacionF"); // NOI18N
        getContentPane().add(txtIdentificacion);
        txtIdentificacion.setBounds(220, 170, 178, 20);

        txtNombre1.setName("txtPrimerNombreF"); // NOI18N
        getContentPane().add(txtNombre1);
        txtNombre1.setBounds(220, 210, 178, 20);

        txtNombre2.setName("txtSegundoNombreF"); // NOI18N
        getContentPane().add(txtNombre2);
        txtNombre2.setBounds(220, 250, 178, 20);

        txtApellido1.setName("txtPrimerApellidoF"); // NOI18N
        getContentPane().add(txtApellido1);
        txtApellido1.setBounds(220, 280, 178, 20);

        txtApellido2.setName("txtSegundoApellidoF"); // NOI18N
        getContentPane().add(txtApellido2);
        txtApellido2.setBounds(220, 320, 178, 20);
        getContentPane().add(txtFechaNacimiento);
        txtFechaNacimiento.setBounds(220, 360, 180, 20);

        rBtn1.setText("Hombre");
        getContentPane().add(rBtn1);
        rBtn1.setBounds(220, 400, 63, 23);

        rBtn2.setText("Mujer");
        getContentPane().add(rBtn2);
        rBtn2.setBounds(300, 400, 53, 23);
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(660, 320, 178, 20);
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(660, 360, 178, 20);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(660, 410, 178, 20);

        rBtncontrol1.setText("Si");
        rBtncontrol1.setName("rbtnSi"); // NOI18N
        getContentPane().add(rBtncontrol1);
        rBtncontrol1.setBounds(660, 240, 80, 23);

        rBtncontrol2.setText("No");
        rBtncontrol2.setName("rbtnNo"); // NOI18N
        getContentPane().add(rBtncontrol2);
        rBtncontrol2.setBounds(770, 240, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sexo = "";
        boolean inscrito = false;
        boolean controlPago = false;
        
        if (rBtn1.isSelected()) {
            sexo = "Masculino";
        } else if (rBtn2.isSelected()) {
            sexo = "Femenido";
        }
        
        if (rBtnInscrito1.isSelected()) {
            inscrito = true;
        } else if (rBtnInscrito2.isSelected()) {
            inscrito = false;
        }
        
        if (rBtncontrol1.isSelected()) {
            controlPago = true;
        } else if (rBtncontrol2.isSelected()) {
            controlPago = false;
        }

        char[] arrayC = txtPassword.getPassword();
        String pass = new String(arrayC);
        
        u1.setApellido1(txtApellido1.getText().trim());
        u1.setApellido2(txtApellido2.getText().trim());
        u1.setCorreo(txtCorreo.getText().trim());
        u1.setFechaNacimiento(txtFechaNacimiento.getDate());
        u1.setIdentificacion(txtIdentificacion.getText().trim());
        u1.setNombre1(txtNombre1.getText().trim());
        u1.setNombre2(txtNombre2.getText().trim());
        u1.setPassword(pass);
        u1.setSexo(sexo);
        u1.setTelefono(txtTelefono.getText().trim());        
        u1.setCodigoInstitucional(txtCodigoInst.getText().trim());
        u1.setControlPago(controlPago);
        u1.setInscrito(inscrito);
        u1.setPagoAnual(Double.parseDouble(txtPagoAnual.getText().trim()));
        u1.setTipoUsuario(pass);
        
        Jdbc cx = new Jdbc();
        UsuarioJdbc fjdbc = new UsuarioJdbc();
        try {
            cx.conectarme();
            fjdbc.setCon(cx.getCon());
            fjdbc.updateUsuario(u1);

        } catch (SQLException ex) {
            Logger.getLogger(GUI_Modificar_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBuscarByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarByIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarByIdActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        Jdbc cx = new Jdbc();
        UsuarioJdbc fjdbc = new UsuarioJdbc();
        try {
            cx.conectarme();
            fjdbc.setCon(cx.getCon());
            u1 = fjdbc.getUsuario(txtBuscarById.getText().trim());
            
            txtApellido1.setText(u1.getApellido1());
            txtApellido2.setText(u1.getApellido2());
            txtCorreo.setText(u1.getCorreo());
            txtFechaNacimiento.setDate(new Date(u1.getFechaNacimiento().getTime()));
            txtIdentificacion.setText(u1.getIdentificacion());
            txtNombre1.setText(u1.getNombre1());
            txtNombre2.setText(u1.getNombre2());
            txtTelefono.setText(u1.getTelefono());
            txtPassword.setText(u1.getPassword());
            txtCodigoInst.setText(u1.getCodigoInstitucional());
            txtPagoAnual.setText(Double.toString(u1.getPagoAnual()));

            if ("Masculino".equals(u1.getSexo())) {
                rBtn1.setSelected(true);
            }else {
                rBtn2.setSelected(true);
            }
            
            if (u1.isInscrito()) {
                rBtnInscrito1.setSelected(true);
            }else {
                rBtnInscrito2.setSelected(true);
            }
            
            if (u1.isControlPago()) {
                rBtncontrol1.setSelected(true);
            }else {
                rBtncontrol2.setSelected(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GUI_Modificar_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.ButtonGroup groupBtnInscrito;
    private javax.swing.ButtonGroup groupBtnSexo;
    private javax.swing.ButtonGroup groupControl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private java.awt.Label label3;
    private javax.swing.JRadioButton rBtn1;
    private javax.swing.JRadioButton rBtn2;
    private javax.swing.JRadioButton rBtnInscrito1;
    private javax.swing.JRadioButton rBtnInscrito2;
    private javax.swing.JRadioButton rBtncontrol1;
    private javax.swing.JRadioButton rBtncontrol2;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtBuscarById;
    private javax.swing.JTextField txtCodigoInst;
    private javax.swing.JTextField txtCorreo;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtPagoAnual;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JComboBox<String> txtTipoUsu;
    // End of variables declaration//GEN-END:variables
}
