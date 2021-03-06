/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.material;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import jdbc.Jdbc;
import jdbc.MaterialJdbc;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;
import modelo.MaterialBibliografico;
import vistas.Fondo;

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
                        cargarImagen(jdp4,foto1);
        ocultarBarraTitulo();
        
    }
      public InputStream foto1=this.getClass().getResourceAsStream("/imagenes/bl.jpg");
            public  void cargarImagen(javax.swing.JDesktopPane jDeskp,InputStream fileImagen)
    {   
        try{   
            BufferedImage image = ImageIO.read(fileImagen);        
              jDeskp.setBorder(new Fondo(image)); }
        catch (Exception e){   System.out.println("Imagen no disponible");   }        
    }
    
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
private Dimension dimBarra = null; 
public void ocultarBarraTitulo()
{ 
Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane(); 
dimBarra = Barra.getPreferredSize(); 
Barra.setSize(0,0); 
Barra.setPreferredSize(new Dimension(0,0)); 
repaint(); 
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
        jdp4 = new javax.swing.JDesktopPane();
        btnLeerCodigoMaterial = new javax.swing.JButton();
        btnRegistrarMaterial = new javax.swing.JButton();
        btnCerrarVistaCrearMaterial = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtNumPag = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtEdicion = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtEjemplar = new javax.swing.JTextField();
        txtLetraUb = new javax.swing.JTextField();
        txtCodigoAsig = new javax.swing.JTextField();
        txtDisponible = new javax.swing.JComboBox();
        txtTema = new javax.swing.JTextField();
        txtEstadoF = new javax.swing.JTextField();

        setBorder(null);
        setClosable(true);
        setTitle("Crear Material Bibliografico");
        setMinimumSize(new java.awt.Dimension(866, 462));
        setPreferredSize(new java.awt.Dimension(866, 462));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Codigo: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(47, 52, 120, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tipo: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(51, 90, 110, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Autor:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(47, 128, 110, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Titulo: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(47, 166, 120, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Descripcion:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(47, 204, 150, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Edicion: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(47, 242, 130, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Editorial:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(47, 280, 130, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Numero De Paginas:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(47, 318, 210, 17);

        jdp4.setBackground(new java.awt.Color(255, 255, 255));

        btnLeerCodigoMaterial.setBackground(new java.awt.Color(0, 0, 0));
        btnLeerCodigoMaterial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLeerCodigoMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnLeerCodigoMaterial.setText("Read");
        btnLeerCodigoMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerCodigoMaterialActionPerformed(evt);
            }
        });
        jdp4.add(btnLeerCodigoMaterial);
        btnLeerCodigoMaterial.setBounds(400, 50, 70, 20);

        btnRegistrarMaterial.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarMaterial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegistrarMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarMaterial.setText("REGISTRAR");
        btnRegistrarMaterial.setBorder(null);
        btnRegistrarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMaterialActionPerformed(evt);
            }
        });
        jdp4.add(btnRegistrarMaterial);
        btnRegistrarMaterial.setBounds(190, 400, 160, 30);

        btnCerrarVistaCrearMaterial.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrarVistaCrearMaterial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCerrarVistaCrearMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarVistaCrearMaterial.setText("CERRAR");
        btnCerrarVistaCrearMaterial.setBorder(null);
        btnCerrarVistaCrearMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVistaCrearMaterialActionPerformed(evt);
            }
        });
        jdp4.add(btnCerrarVistaCrearMaterial);
        btnCerrarVistaCrearMaterial.setBounds(600, 400, 140, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("CREAR MATERIAL");
        jdp4.add(jLabel15);
        jLabel15.setBounds(370, 0, 190, 22);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Ejemplar:");
        jdp4.add(jLabel14);
        jLabel14.setBounds(500, 250, 180, 17);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Letra De Ubicacion:");
        jdp4.add(jLabel13);
        jLabel13.setBounds(500, 210, 230, 17);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Codigo De Asignatura:");
        jdp4.add(jLabel12);
        jLabel12.setBounds(500, 170, 240, 17);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Estado Fisico: ");
        jdp4.add(jLabel11);
        jLabel11.setBounds(500, 140, 200, 17);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Disponible: ");
        jdp4.add(jLabel10);
        jLabel10.setBounds(500, 100, 190, 17);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Tema:");
        jdp4.add(jLabel9);
        jLabel9.setBounds(500, 60, 160, 17);
        jdp4.add(txtTitulo);
        txtTitulo.setBounds(180, 160, 270, 20);
        jdp4.add(txtNumPag);
        txtNumPag.setBounds(180, 320, 167, 20);
        jdp4.add(txtEditorial);
        txtEditorial.setBounds(180, 280, 167, 20);
        jdp4.add(txtEdicion);
        txtEdicion.setBounds(180, 240, 167, 20);
        jdp4.add(txtDescripcion);
        txtDescripcion.setBounds(180, 200, 270, 20);
        jdp4.add(txtAutor);
        txtAutor.setBounds(180, 130, 240, 20);
        jdp4.add(txtTipo);
        txtTipo.setBounds(180, 90, 167, 20);

        txtCodigo.setEnabled(false);
        jdp4.add(txtCodigo);
        txtCodigo.setBounds(180, 50, 167, 20);
        jdp4.add(txtEjemplar);
        txtEjemplar.setBounds(640, 260, 165, 20);
        jdp4.add(txtLetraUb);
        txtLetraUb.setBounds(640, 220, 165, 20);
        jdp4.add(txtCodigoAsig);
        txtCodigoAsig.setBounds(640, 180, 165, 20);

        txtDisponible.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Ocupado", " " }));
        jdp4.add(txtDisponible);
        txtDisponible.setBounds(640, 100, 170, 20);
        jdp4.add(txtTema);
        txtTema.setBounds(640, 60, 165, 20);
        jdp4.add(txtEstadoF);
        txtEstadoF.setBounds(640, 140, 200, 20);

        getContentPane().add(jdp4);
        jdp4.setBounds(-10, 0, 890, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMaterialActionPerformed

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


    }//GEN-LAST:event_btnRegistrarMaterialActionPerformed

    private void btnLeerCodigoMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerCodigoMaterialActionPerformed

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
        

    }//GEN-LAST:event_btnLeerCodigoMaterialActionPerformed

    private void btnCerrarVistaCrearMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVistaCrearMaterialActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarVistaCrearMaterialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarVistaCrearMaterial;
    private javax.swing.JButton btnLeerCodigoMaterial;
    private javax.swing.JButton btnRegistrarMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JDesktopPane jdp4;
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
