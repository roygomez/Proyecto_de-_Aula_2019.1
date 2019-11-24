/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.usuario;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;
import jdbc.Jdbc;
import jdbc.UsuarioJdbc;
import modelo.Usuario;
import vistas.Fondo;

/**
 *
 * @author EstiRasta
 */
public class GUI_ListarUsuarios extends javax.swing.JInternalFrame {

    public void listarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) tblUsuarios.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        
        Jdbc cx = new Jdbc();
        UsuarioJdbc fjdbc = new UsuarioJdbc();

        try {
            cx.conectarme();
            fjdbc.setCon(cx.getCon());

            List<Usuario> usuarios = fjdbc.getUsuario();

            for (Usuario u : usuarios) {
                modelo.addRow(new Object[]{
                    u.getIdentificacion(), u.getNombre1(), u.getNombre2(), u.getApellido1(), u.getApellido2(),
                    u.getFechaNacimiento(), u.getSexo(), u.getCorreo(), u.getTelefono(), u.getTipoUsuario(),
                    u.isInscrito(), u.getCodigoInstitucional(), u.getPagoAnual(), u.isControlPago()
                });
            }

        } catch (SQLException ex) {
            Logger.getLogger(GUI_ListarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public GUI_ListarUsuarios() {
        initComponents();

        listarDatos();
        cargarImagen(jdp4, foto1);
        ocultarBarraTitulo();

    }

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;

    public void ocultarBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }
    public InputStream foto1 = this.getClass().getResourceAsStream("/imagenes/bl.jpg");

    public void cargarImagen(javax.swing.JDesktopPane jDeskp, InputStream fileImagen) {
        try {
            BufferedImage image = ImageIO.read(fileImagen);
            jDeskp.setBorder(new Fondo(image));
        } catch (Exception e) {
            System.out.println("Imagen no disponible");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jdp4 = new javax.swing.JDesktopPane();
        jButton2 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Listar Usuarios");
        setMinimumSize(new java.awt.Dimension(1116, 572));
        setPreferredSize(new java.awt.Dimension(1116, 572));
        getContentPane().setLayout(null);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICACION", "NOMBRE 1", "NOMBRE 2", "APELLIDO 1", "APELLIDO2", "FECHA NACIMIENTO", "SEXO", "CORREO", "TELEFONO", "TIPO USUARIO", "INSCRITO", "CODIGO INST", "PAGO ANUAL", "PAGÓ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 96, 1080, 397);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Eliminar por Identificacion:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 500, 170, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("USUARIOS REGISTRADOS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 40, 230, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ELIMINAR");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jdp4.add(jButton2);
        jButton2.setBounds(530, 540, 150, 30);

        txtId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jdp4.add(txtId);
        txtId.setBounds(340, 540, 180, 23);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VOLVER");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jdp4.add(jButton1);
        jButton1.setBounds(730, 540, 110, 30);

        getContentPane().add(jdp4);
        jdp4.setBounds(-40, -20, 1200, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Jdbc cx = new Jdbc();
        UsuarioJdbc mjdbc = new UsuarioJdbc();

        try {
            cx.conectarme();
            mjdbc.setCon(cx.getCon());

            mjdbc.DeleteUsuario(txtId.getText().trim());
            listarDatos();

        } catch (SQLException ex) {
            Logger.getLogger(GUI_ListarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        ;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDesktopPane jdp4;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
