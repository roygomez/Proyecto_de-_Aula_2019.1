/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.material;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.Jdbc;
import jdbc.MaterialJdbc;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;
import modelo.MaterialBibliografico;

/**
 *
 * @author Usuario
 */
public class GUI_Crear_Material_Bibliografico extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUI_Crear_Material_Bibliografico
     */
    public GUI_Crear_Material_Bibliografico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtEdicion = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtNumPag = new javax.swing.JTextField();
        txtTema = new javax.swing.JTextField();
        txtEstadoF = new javax.swing.JTextField();
        txtCodigoAsig = new javax.swing.JTextField();
        txtLetraUb = new javax.swing.JTextField();
        txtEjemplar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtDisponible = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Crear Material Bibliografico");
        setMinimumSize(new java.awt.Dimension(866, 462));
        setPreferredSize(new java.awt.Dimension(866, 462));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(47, 52, 120, 19);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(51, 90, 110, 19);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Autor:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(47, 128, 110, 19);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Titulo: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(47, 166, 120, 19);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripcion:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(47, 204, 150, 19);

        jLabel6.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edicion: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(47, 242, 130, 19);

        jLabel7.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Editorial:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(47, 280, 130, 19);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero De Paginas:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(47, 318, 210, 19);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel9.setText("Tema:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(470, 70, 160, 19);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel10.setText("Disponible: ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(470, 110, 190, 19);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel11.setText("Estado Fisico: ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(470, 150, 200, 19);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel12.setText("Codigo De Asignatura:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(470, 180, 240, 19);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel13.setText("Letra De Ubicacion:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(470, 220, 230, 19);

        jLabel14.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel14.setText("Ejemplar:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(470, 260, 180, 19);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(210, 50, 167, 20);
        getContentPane().add(txtTipo);
        txtTipo.setBounds(210, 90, 167, 20);
        getContentPane().add(txtAutor);
        txtAutor.setBounds(210, 130, 167, 20);
        getContentPane().add(txtTitulo);
        txtTitulo.setBounds(210, 160, 167, 20);
        getContentPane().add(txtDescripcion);
        txtDescripcion.setBounds(210, 200, 167, 20);
        getContentPane().add(txtEdicion);
        txtEdicion.setBounds(210, 240, 167, 20);
        getContentPane().add(txtEditorial);
        txtEditorial.setBounds(210, 280, 167, 20);
        getContentPane().add(txtNumPag);
        txtNumPag.setBounds(210, 320, 167, 20);
        getContentPane().add(txtTema);
        txtTema.setBounds(660, 60, 165, 20);
        getContentPane().add(txtEstadoF);
        txtEstadoF.setBounds(660, 140, 165, 20);
        getContentPane().add(txtCodigoAsig);
        txtCodigoAsig.setBounds(660, 180, 165, 20);
        getContentPane().add(txtLetraUb);
        txtLetraUb.setBounds(660, 220, 165, 20);
        getContentPane().add(txtEjemplar);
        txtEjemplar.setBounds(660, 260, 165, 20);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 370, 160, 40);

        jButton2.setText("Volver");
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 370, 150, 40);

        jButton3.setText("Salir");
        getContentPane().add(jButton3);
        jButton3.setBounds(560, 370, 140, 40);

        txtDisponible.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Ocupado", " " }));
        getContentPane().add(txtDisponible);
        txtDisponible.setBounds(660, 100, 170, 20);

        jButton4.setText("Read");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(390, 50, 57, 23);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Material Bibliografico.jpeg"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 1180, 581);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        boolean dispo = false;
        if (txtDisponible.getSelectedItem() == "Disponible") {
            dispo = true;
        } else {
            dispo = false;
        }
        MaterialBibliografico m1 = new MaterialBibliografico();
        m1.setAutor(txtAutor.getText().trim());
        m1.setCodigoAsignatura(txtCodigoAsig.getText().trim());
        m1.setCodigoMaterial(txtCodigo.getText().trim());
        m1.setDescripcion(txtDescripcion.getText().trim());
        m1.setDisponible(dispo);
        m1.setEdicion(txtEdicion.getText().trim());
        m1.setEditorial(txtEditorial.getText().trim());
        m1.setEjemplar(Integer.parseInt(txtEjemplar.getText().trim()));
        m1.setEstadoFisico(txtEstadoF.getText().trim());
        m1.setLetraUbicacion(txtLetraUb.getText().trim());
        m1.setNumPaginas(txtNumPag.getText().trim());
        m1.setTema(txtTema.getText().trim());
        m1.setTipoMaterial(txtTipo.getText().trim());
        m1.setTitulo(txtTitulo.getText().trim());

        Jdbc cx = new Jdbc();
        MaterialJdbc fjdbc = new MaterialJdbc();
        try {
            cx.conectarme();
            fjdbc.setCon(cx.getCon());
            fjdbc.saveMaterial(m1);

        } catch (SQLException ex) {
            Logger.getLogger(GUI_Crear_Material_Bibliografico.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        PanamaHitek_Arduino ino = new PanamaHitek_Arduino();
        SerialPortEventListener listener;
        listener = (SerialPortEvent serialPortEvent) -> {
            
            try {
                if (ino.isMessageAvailable()) {
                    txtCodigo.setText(ino.printMessage());
                    ino.sendData("v");
                    ino.killArduinoConnection();
                }
            } catch (SerialPortException | ArduinoException ex) {
                Logger.getLogger(GUI_Crear_Material_Bibliografico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }; //Si se recibe algun dato en el puerto serie, se ejecuta el siguiente metodo
        try {
            ino.arduinoRXTX("COM5", 9600, listener);
        } catch (ArduinoException ex) {
            Logger.getLogger(GUI_Crear_Material_Bibliografico.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoAsig;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JComboBox txtDisponible;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEjemplar;
    private javax.swing.JTextField txtEstadoF;
    private javax.swing.JTextField txtLetraUb;
    private javax.swing.JTextField txtNumPag;
    private javax.swing.JTextField txtTema;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}