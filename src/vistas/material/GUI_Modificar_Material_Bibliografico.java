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
public class GUI_Modificar_Material_Bibliografico extends javax.swing.JInternalFrame {

    private MaterialBibliografico m1 = new MaterialBibliografico();

    /**
     * Creates new form GUI_Modificar_Material_Bibliografico
     */
    public GUI_Modificar_Material_Bibliografico() {
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
        txtDisponible = new javax.swing.JComboBox();
        btnLeerCodigoNuevo = new javax.swing.JButton();
        txtBuscarByCode = new javax.swing.JTextField();
        btnBuscarMaterial = new java.awt.Button();
        label3 = new java.awt.Label();
        jdp4 = new javax.swing.JDesktopPane();
        btnActualizarMaterial = new javax.swing.JButton();
        btnCerrarVistaActualizarMaterial = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setForeground(new java.awt.Color(0, 0, 0));
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Modificar Material Bibliografico");
        setMinimumSize(new java.awt.Dimension(933, 560));
        setPreferredSize(new java.awt.Dimension(933, 560));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Codigo: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 140, 120, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tipo: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 180, 110, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Autor:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 220, 110, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Titulo: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 260, 120, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Descripcion:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 300, 150, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Edicion: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 330, 130, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Editorial:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 370, 130, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Numero De Paginas:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 410, 210, 17);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Tema:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(500, 170, 160, 17);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Disponible: ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(500, 210, 190, 17);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Estado Fisico: ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(500, 250, 200, 17);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Codigo De Asignatura:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(500, 290, 240, 17);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Letra De Ubicacion:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(500, 330, 230, 17);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Ejemplar:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(500, 370, 180, 17);

        txtCodigo.setEnabled(false);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(230, 140, 167, 20);
        getContentPane().add(txtTipo);
        txtTipo.setBounds(230, 180, 167, 20);
        getContentPane().add(txtAutor);
        txtAutor.setBounds(230, 220, 167, 20);
        getContentPane().add(txtTitulo);
        txtTitulo.setBounds(230, 250, 167, 20);
        getContentPane().add(txtDescripcion);
        txtDescripcion.setBounds(230, 290, 167, 20);
        getContentPane().add(txtEdicion);
        txtEdicion.setBounds(230, 330, 167, 20);
        getContentPane().add(txtEditorial);
        txtEditorial.setBounds(230, 370, 167, 20);
        getContentPane().add(txtNumPag);
        txtNumPag.setBounds(230, 410, 167, 20);
        getContentPane().add(txtTema);
        txtTema.setBounds(690, 170, 165, 20);
        getContentPane().add(txtEstadoF);
        txtEstadoF.setBounds(690, 250, 165, 20);
        getContentPane().add(txtCodigoAsig);
        txtCodigoAsig.setBounds(690, 290, 165, 20);
        getContentPane().add(txtLetraUb);
        txtLetraUb.setBounds(690, 330, 165, 20);
        getContentPane().add(txtEjemplar);
        txtEjemplar.setBounds(690, 370, 165, 20);

        txtDisponible.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDisponible.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Ocupado", " " }));
        getContentPane().add(txtDisponible);
        txtDisponible.setBounds(690, 210, 170, 20);

        btnLeerCodigoNuevo.setBackground(new java.awt.Color(0, 0, 0));
        btnLeerCodigoNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLeerCodigoNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnLeerCodigoNuevo.setText("Read");
        btnLeerCodigoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerCodigoNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeerCodigoNuevo);
        btnLeerCodigoNuevo.setBounds(400, 140, 100, 20);

        txtBuscarByCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarByCodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscarByCode);
        txtBuscarByCode.setBounds(590, 120, 180, 20);

        btnBuscarMaterial.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarMaterial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnBuscarMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarMaterial.setLabel("Buscar");
        btnBuscarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarMaterial);
        btnBuscarMaterial.setBounds(780, 114, 70, 30);

        label3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label3.setText("Busqueda por Codigo:");
        getContentPane().add(label3);
        label3.setBounds(590, 90, 190, 21);

        jdp4.setBackground(new java.awt.Color(255, 255, 255));

        btnActualizarMaterial.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarMaterial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnActualizarMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarMaterial.setText("GUARDAR");
        btnActualizarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMaterialActionPerformed(evt);
            }
        });
        jdp4.add(btnActualizarMaterial);
        btnActualizarMaterial.setBounds(370, 490, 160, 30);

        btnCerrarVistaActualizarMaterial.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrarVistaActualizarMaterial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCerrarVistaActualizarMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarVistaActualizarMaterial.setText("CERRAR");
        btnCerrarVistaActualizarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVistaActualizarMaterialActionPerformed(evt);
            }
        });
        jdp4.add(btnCerrarVistaActualizarMaterial);
        btnCerrarVistaActualizarMaterial.setBounds(580, 490, 140, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("ACTUALIZAR DATOS DEL MATERIAL");
        jdp4.add(jLabel15);
        jLabel15.setBounds(350, 70, 350, 22);

        getContentPane().add(jdp4);
        jdp4.setBounds(-21, -30, 970, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarVistaActualizarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVistaActualizarMaterialActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarVistaActualizarMaterialActionPerformed

    private void btnLeerCodigoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerCodigoNuevoActionPerformed

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

    }//GEN-LAST:event_btnLeerCodigoNuevoActionPerformed

    private void btnActualizarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMaterialActionPerformed

        // TODO add your handling code here:
        boolean dispo = false;
        if (txtDisponible.getSelectedItem() == "Disponible") {
            dispo = true;
        } else {
            dispo = false;
        }

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
            fjdbc.updateMaterial(m1);

        } catch (SQLException ex) {
            Logger.getLogger(GUI_Crear_Material_Bibliografico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnActualizarMaterialActionPerformed

    private void txtBuscarByCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarByCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarByCodeActionPerformed

    private void btnBuscarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMaterialActionPerformed
        // TODO add your handling code here:
        Jdbc cx = new Jdbc();
        MaterialJdbc fjdbc = new MaterialJdbc();
        try {
            cx.conectarme();
            fjdbc.setCon(cx.getCon());

            m1 = fjdbc.getMaterial(txtBuscarByCode.getText().trim());
            System.out.println(m1.getIdMaterial());
            String dispo = "";
            if (m1.isDisponible()) {
                dispo = "Disponible";
            } else {
                dispo = "Ocupado";
            }

            txtAutor.setText(m1.getAutor());
            txtCodigoAsig.setText(m1.getCodigoAsignatura());
            txtCodigo.setText(m1.getCodigoMaterial());
            txtDescripcion.setText(m1.getDescripcion());
            txtEdicion.setText(m1.getEdicion());
            txtEditorial.setText(m1.getEditorial());
            txtEjemplar.setText(Integer.toString(m1.getEjemplar()));
            txtEstadoF.setText(m1.getEstadoFisico());
            txtLetraUb.setText(m1.getLetraUbicacion());
            txtNumPag.setText(m1.getNumPaginas());
            txtTema.setText(m1.getTema());
            txtTipo.setText(m1.getTipoMaterial());
            txtTitulo.setText(m1.getTitulo());
            txtDisponible.setSelectedItem(dispo);

        } catch (SQLException ex) {
            Logger.getLogger(GUI_Modificar_Material_Bibliografico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarMaterialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarMaterial;
    private java.awt.Button btnBuscarMaterial;
    private javax.swing.JButton btnCerrarVistaActualizarMaterial;
    private javax.swing.JButton btnLeerCodigoNuevo;
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
    private java.awt.Label label3;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBuscarByCode;
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
