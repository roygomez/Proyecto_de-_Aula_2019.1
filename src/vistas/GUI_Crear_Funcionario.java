/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.SQLException;
import jdbc.FuncionarioJdbc;
import modelo.Funcionario;

/**
 *
 * @author Usuario
 */
public class GUI_Crear_Funcionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUI_Crear_Funcionario
     */
    public GUI_Crear_Funcionario() {
        initComponents();

        groupSexoBtn.add(rBtn1);
        groupSexoBtn.add(rBtn2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupSexoBtn = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        rBtn1 = new javax.swing.JRadioButton();
        rBtn2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRol = new javax.swing.JComboBox<String>();
        txtTelefono = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Crear Funcionario");
        setVisible(true);
        getContentPane().setLayout(null);

        jLabel1.setText("Identificacion: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(19, 34, 120, 14);

        jLabel2.setText("Segundo Apellido: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(19, 191, 140, 14);

        jLabel3.setText("Primier Apellido: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(19, 153, 130, 14);

        jLabel4.setText("Primer Nombre: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(19, 74, 130, 14);

        jLabel5.setText("Segundo Nombre: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(19, 112, 140, 14);

        jLabel6.setText("Fecha De Nacimiento: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(19, 229, 160, 14);

        jLabel7.setText("Correo Electronico: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(396, 77, 160, 14);

        jLabel8.setText("Sexo: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(396, 34, 90, 14);

        txtIdentificacion.setName("txtIdentificacionF"); // NOI18N
        getContentPane().add(txtIdentificacion);
        txtIdentificacion.setBounds(164, 31, 178, 20);

        txtNombre2.setName("txtSegundoNombreF"); // NOI18N
        getContentPane().add(txtNombre2);
        txtNombre2.setBounds(164, 112, 178, 20);

        txtNombre1.setName("txtPrimerNombreF"); // NOI18N
        getContentPane().add(txtNombre1);
        txtNombre1.setBounds(164, 71, 178, 20);

        txtApellido1.setName("txtPrimerApellidoF"); // NOI18N
        getContentPane().add(txtApellido1);
        txtApellido1.setBounds(164, 150, 178, 20);

        txtApellido2.setName("txtSegundoApellidoF"); // NOI18N
        getContentPane().add(txtApellido2);
        txtApellido2.setBounds(164, 188, 178, 20);
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(567, 74, 178, 20);

        rBtn1.setText("Hombre");
        getContentPane().add(rBtn1);
        rBtn1.setBounds(567, 30, 63, 23);

        rBtn2.setText("Mujer");
        getContentPane().add(rBtn2);
        rBtn2.setBounds(648, 30, 53, 23);

        jLabel10.setText("Telefono: ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 120, 110, 14);

        jLabel11.setText("Contraseña");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(400, 210, 120, 14);

        jLabel12.setText("Cargo: ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(400, 170, 100, 14);

        txtRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administardor", "Auxiliar", "Coordinador" }));
        getContentPane().add(txtRol);
        txtRol.setBounds(570, 170, 178, 20);
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(570, 120, 178, 20);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(570, 210, 178, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(187, 315, 120, 40);

        jButton2.setText("Volver");
        getContentPane().add(jButton2);
        jButton2.setBounds(390, 320, 120, 40);

        jButton3.setText("Salir");
        getContentPane().add(jButton3);
        jButton3.setBounds(596, 315, 110, 40);
        getContentPane().add(txtFechaNacimiento);
        txtFechaNacimiento.setBounds(170, 230, 170, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administrativo.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 790, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String sexo = "";
        if (rBtn1.isSelected()) {
            sexo = "Masculino";
        } else if (rBtn2.isSelected()) {
            sexo = "Femenido";
        }

        char[] arrayC = txtPassword.getPassword();
        String pass = new String(arrayC);

        Funcionario f1 = new Funcionario();
        f1.setApellido1(txtApellido1.getText().trim());
        f1.setApellido2(txtApellido2.getText().trim());
        f1.setCorreo(txtCorreo.getText().trim());
        //f1.setFechaNacimiento(txtFechaNacimiento.getDate());
        f1.setIdentificacion(txtIdentificacion.getText().trim());
        f1.setNombre1(txtNombre1.getText().trim());
        f1.setNombre2(txtNombre2.getText().trim());
        f1.setPassword(pass);
        f1.setSexo(sexo);
        f1.setTelefono(txtTelefono.getText().trim());
        f1.setRol(txtRol.getToolTipText());

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup groupSexoBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rBtn1;
    private javax.swing.JRadioButton rBtn2;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCorreo;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JComboBox<String> txtRol;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
