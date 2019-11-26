/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.prestamo;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import jdbc.Jdbc;
import jdbc.MaterialJdbc;
import jdbc.PrestamoJdbc;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;
import modelo.MaterialBibliografico;
import modelo.PrestamoBibliografico;
import modelo.Usuario;
import vistas.Fondo;
import vistas.GUI_Principal;

/**
 *
 * @author Usuario
 */
public class GUI_Crear_Prestamo extends javax.swing.JInternalFrame {

    private MaterialBibliografico m1 = new MaterialBibliografico();
    public int idPersona;
    private String codigoPrestamo = Long.toString(new java.util.Date().getTime());

    /**
     * Creates new form GUI_Crear_Prestamo
     */
    public GUI_Crear_Prestamo() {
        initComponents();
        cargarImagen(jdp4, foto1);
        ocultarBarraTitulo();

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

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;

    public void ocultarBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
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

        jLabel6 = new javax.swing.JLabel();
        btnCrearPrestamo = new javax.swing.JButton();
        btnCerrarVistaCrearPrestamo = new javax.swing.JButton();
        txtTipoPrestamo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTema = new javax.swing.JTextField();
        txtEstadoF = new javax.swing.JTextField();
        txtCodigoAsig = new javax.swing.JTextField();
        txtLetraUb = new javax.swing.JTextField();
        txtEjemplar = new javax.swing.JTextField();
        btnEscanearMaterial = new javax.swing.JButton();
        jdp4 = new javax.swing.JDesktopPane();
        jLabel18 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtEdicion = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtNumPag = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDisponible = new javax.swing.JTextField();

        setBorder(null);
        setClosable(true);
        setTitle("Crear Prestamo");
        setMinimumSize(new java.awt.Dimension(906, 543));
        setPreferredSize(new java.awt.Dimension(906, 543));
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Tipo De Prestamo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 500, 150, 14);

        btnCrearPrestamo.setBackground(new java.awt.Color(0, 0, 0));
        btnCrearPrestamo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCrearPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearPrestamo.setText("INICIAR PRESTAMO");
        btnCrearPrestamo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnCrearPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPrestamoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearPrestamo);
        btnCrearPrestamo.setBounds(440, 490, 170, 30);

        btnCerrarVistaCrearPrestamo.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrarVistaCrearPrestamo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCerrarVistaCrearPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarVistaCrearPrestamo.setText("CERRAR");
        btnCerrarVistaCrearPrestamo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnCerrarVistaCrearPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVistaCrearPrestamoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarVistaCrearPrestamo);
        btnCerrarVistaCrearPrestamo.setBounds(670, 490, 120, 30);

        txtTipoPrestamo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTipoPrestamo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Interno", "Externo" }));
        getContentPane().add(txtTipoPrestamo);
        txtTipoPrestamo.setBounds(230, 500, 170, 20);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Codigo: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 150, 120, 19);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tipo: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 190, 110, 19);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Autor:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 220, 110, 19);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Titulo: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 260, 120, 19);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Descripcion:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 300, 150, 19);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Edicion: ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 340, 130, 19);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Editorial:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 380, 130, 19);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Numero De Paginas:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 410, 210, 19);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Codigo De Asignatura:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(490, 280, 240, 19);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Letra De Ubicacion:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(490, 320, 230, 19);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Ejemplar:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(490, 360, 180, 19);

        txtTema.setEditable(false);
        txtTema.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTema.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(txtTema);
        txtTema.setBounds(620, 160, 250, 30);

        txtEstadoF.setEditable(false);
        txtEstadoF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEstadoF.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(txtEstadoF);
        txtEstadoF.setBounds(620, 240, 280, 30);

        txtCodigoAsig.setEditable(false);
        txtCodigoAsig.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCodigoAsig.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(txtCodigoAsig);
        txtCodigoAsig.setBounds(620, 280, 130, 30);

        txtLetraUb.setEditable(false);
        txtLetraUb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLetraUb.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(txtLetraUb);
        txtLetraUb.setBounds(620, 320, 120, 30);

        txtEjemplar.setEditable(false);
        txtEjemplar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEjemplar.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(txtEjemplar);
        txtEjemplar.setBounds(620, 360, 120, 30);

        btnEscanearMaterial.setBackground(new java.awt.Color(0, 0, 0));
        btnEscanearMaterial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEscanearMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnEscanearMaterial.setText("Escanear Libro");
        btnEscanearMaterial.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnEscanearMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscanearMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(btnEscanearMaterial);
        btnEscanearMaterial.setBounds(690, 90, 170, 40);

        jdp4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("CREAR PRESTAMO");
        jdp4.add(jLabel18);
        jLabel18.setBounds(400, 50, 200, 40);

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCodigo.setPreferredSize(new java.awt.Dimension(0, 40));
        jdp4.add(txtCodigo);
        txtCodigo.setBounds(210, 170, 167, 30);

        txtTipo.setEditable(false);
        txtTipo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTipo.setPreferredSize(new java.awt.Dimension(0, 40));
        jdp4.add(txtTipo);
        txtTipo.setBounds(210, 210, 167, 30);

        txtAutor.setEditable(false);
        txtAutor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAutor.setPreferredSize(new java.awt.Dimension(0, 40));
        jdp4.add(txtAutor);
        txtAutor.setBounds(210, 250, 230, 30);

        txtTitulo.setEditable(false);
        txtTitulo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTitulo.setPreferredSize(new java.awt.Dimension(0, 40));
        jdp4.add(txtTitulo);
        txtTitulo.setBounds(210, 290, 290, 30);

        txtDescripcion.setEditable(false);
        txtDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDescripcion.setPreferredSize(new java.awt.Dimension(0, 40));
        jdp4.add(txtDescripcion);
        txtDescripcion.setBounds(210, 330, 290, 30);

        txtEdicion.setEditable(false);
        txtEdicion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEdicion.setPreferredSize(new java.awt.Dimension(0, 40));
        jdp4.add(txtEdicion);
        txtEdicion.setBounds(210, 370, 167, 30);

        txtEditorial.setEditable(false);
        txtEditorial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEditorial.setPreferredSize(new java.awt.Dimension(0, 40));
        jdp4.add(txtEditorial);
        txtEditorial.setBounds(210, 410, 167, 30);

        txtNumPag.setEditable(false);
        txtNumPag.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNumPag.setPreferredSize(new java.awt.Dimension(0, 40));
        jdp4.add(txtNumPag);
        txtNumPag.setBounds(210, 450, 167, 30);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Estado Fisico: ");
        jdp4.add(jLabel14);
        jLabel14.setBounds(520, 290, 200, 19);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Estado de Prestamo: ");
        jdp4.add(jLabel13);
        jLabel13.setBounds(520, 240, 120, 19);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Tema:");
        jdp4.add(jLabel12);
        jLabel12.setBounds(520, 200, 160, 19);

        txtDisponible.setEditable(false);
        txtDisponible.setPreferredSize(new java.awt.Dimension(0, 40));
        jdp4.add(txtDisponible);
        txtDisponible.setBounds(650, 240, 170, 30);

        getContentPane().add(jdp4);
        jdp4.setBounds(-30, -40, 950, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCrearPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPrestamoActionPerformed
        Jdbc cx = new Jdbc();
        PrestamoJdbc fjdbc = new PrestamoJdbc();
        MaterialJdbc mjdbc = new MaterialJdbc();
        if (txtCodigo.getText().equals("") || txtCodigo.getText().equals(null)) {
            JOptionPane.showMessageDialog(null, "Por favor escanee un libro");
            return;
        }
        if ("Ocupado".equals(txtDisponible.getText())) {
            JOptionPane.showMessageDialog(null, "El material que desea prestar se encuentra ocupado!");
            return;
        }

        try {
            cx.conectarme();
            fjdbc.setCon(cx.getCon());
            mjdbc.setCon(cx.getCon());
            mjdbc.updateDisponible(m1.getCodigoMaterial(), false);

            Date now = new Date();

            PrestamoBibliografico p1 = new PrestamoBibliografico();
            p1.setFechaLimite(new Timestamp(p1.getFechaDev(txtTipoPrestamo.getSelectedItem().toString()).getTime()));
            p1.setFechaPrestamo(new Timestamp(now.getTime()));
            p1.setIdMaterial(m1.getIdMaterial());
            p1.setIdUsuario(idPersona);
            p1.setTipoPrestamo(txtTipoPrestamo.getSelectedItem().toString());
            p1.setCodigoPrestamo(codigoPrestamo);
            fjdbc.savePrestamo(p1);

            GUI_Principal.t.push(txtTitulo.getText().trim());
            
            if(txtTipoPrestamo.getSelectedItem().toString().equals("Externo")) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String fechaForm = sdf.format(p1.getFechaDev(txtTipoPrestamo.getSelectedItem().toString()).getTime());
                JOptionPane.showMessageDialog(null, "Su prestamo ha sido registrado exitosamente, debe devolverlo hoy a las: " + fechaForm);
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy");
                String fechaForm = sdf.format(p1.getFechaDev(txtTipoPrestamo.getSelectedItem().toString()).getTime());
                JOptionPane.showMessageDialog(null, "Su prestamo ha sido registrado exitosamente, la fecha limite de entrega debe ser: " + fechaForm);
            }
            

            txtAutor.setText("");
            txtCodigo.setText("");
            txtCodigoAsig.setText("");
            txtDescripcion.setText("");
            txtEdicion.setText("");
            txtEditorial.setText("");
            txtEjemplar.setText("");
            txtEstadoF.setText("");
            txtLetraUb.setText("");
            txtNumPag.setText("");
            txtTema.setText("");
            txtTipo.setText("");
            txtTitulo.setText("");
            txtDisponible.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(GUI_Crear_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnCrearPrestamoActionPerformed

    private void btnCerrarVistaCrearPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVistaCrearPrestamoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarVistaCrearPrestamoActionPerformed
    public String codigo = null;
    private void btnEscanearMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscanearMaterialActionPerformed
        // TODO add your handling code here:        
        PanamaHitek_Arduino ino = new PanamaHitek_Arduino();
        SerialPortEventListener listener;
        listener = (SerialPortEvent serialPortEvent) -> {

            try {
                if (ino.isMessageAvailable()) {
                    codigo = ino.printMessage();
                    ino.sendData("v");
                    ino.killArduinoConnection();
                    if (codigo != null) {
                        try {
                            Jdbc cx = new Jdbc();
                            MaterialJdbc fjdbc = new MaterialJdbc();
                            cx.conectarme();
                            fjdbc.setCon(cx.getCon());
                            m1 = fjdbc.getMaterial(codigo.trim());

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
                            txtDisponible.setText(dispo);

                        } catch (SQLException ex) {
                            Logger.getLogger(GUI_Crear_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            } catch (SerialPortException | ArduinoException ex) {
                Logger.getLogger(GUI_Crear_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }; //Si se recibe algun dato en el puerto serie, se ejecuta el siguiente metodo
        try {
            ino.arduinoRXTX("COM5", 9600, listener);

        } catch (ArduinoException ex) {
            Logger.getLogger(GUI_Crear_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnEscanearMaterialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarVistaCrearPrestamo;
    private javax.swing.JButton btnCrearPrestamo;
    private javax.swing.JButton btnEscanearMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField txtDisponible;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEjemplar;
    private javax.swing.JTextField txtEstadoF;
    private javax.swing.JTextField txtLetraUb;
    private javax.swing.JTextField txtNumPag;
    private javax.swing.JTextField txtTema;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JComboBox txtTipoPrestamo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
