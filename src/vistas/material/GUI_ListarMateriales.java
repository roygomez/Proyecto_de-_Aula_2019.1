/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.material;

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
import jdbc.MaterialJdbc;
import modelo.MaterialBibliografico;
import vistas.Fondo;

/**
 *
 * @author EstiRasta
 */
public class GUI_ListarMateriales extends javax.swing.JInternalFrame {

    public void listarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) tblMateriales.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        Jdbc cx = new Jdbc();
        MaterialJdbc fjdbc = new MaterialJdbc();

        try {
            cx.conectarme();
            fjdbc.setCon(cx.getCon());

            List<MaterialBibliografico> materiales = fjdbc.getMaterial();

            for (MaterialBibliografico m : materiales) {
                modelo.addRow(new Object[]{
                    m.getCodigoMaterial(), m.getTipoMaterial(), m.getAutor(), m.getTitulo(), m.getDescripcion(), m.getEditorial(),
                    m.getEdicion(), m.getNumPaginas(), m.getTema(), m.isDisponible(), m.getEstadoFisico(),
                    m.getCodigoAsignatura(), m.getLetraUbicacion(), m.getEjemplar()
                });
            }

        } catch (SQLException ex) {
            Logger.getLogger(GUI_ListarMateriales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public GUI_ListarMateriales() {
        initComponents();

        listarDatos();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMateriales = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCerrarVistaListarMaterial = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jdp4 = new javax.swing.JDesktopPane();

        setBorder(null);
        setClosable(true);
        setTitle("Lista de mateiales");

        tblMateriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "TIPO", "AUTOR", "TITULO", "DESCRIPCION", "EDITORIAL", "EDICION", "NUM PAGINAS", "TEMA", "DISPONIBLE", "ESTADO FISICO", "LETRA UBI", "EJEMPLAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMateriales.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblMateriales.setAutoscrolls(false);
        jScrollPane1.setViewportView(tblMateriales);

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Material");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Codigo del Material:");

        btnCerrarVistaListarMaterial.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrarVistaListarMaterial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCerrarVistaListarMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarVistaListarMaterial.setText("CERRAR");
        btnCerrarVistaListarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVistaListarMaterialActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("MATERIALES REGISTRADOS");

        jdp4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jdp4Layout = new javax.swing.GroupLayout(jdp4);
        jdp4.setLayout(jdp4Layout);
        jdp4Layout.setHorizontalGroup(
            jdp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        jdp4Layout.setVerticalGroup(
            jdp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1161, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addGap(79, 79, 79)
                .addComponent(btnCerrarVistaListarMaterial)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(510, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(430, 430, 430))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jdp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCerrarVistaListarMaterial))
                    .addComponent(jLabel1))
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jdp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Jdbc cx = new Jdbc();
        MaterialJdbc mjdbc = new MaterialJdbc();

        try {
            cx.conectarme();
            mjdbc.setCon(cx.getCon());

            mjdbc.DeleteMaterial(txtCodigo.getText().trim());
            listarDatos();

        } catch (SQLException ex) {
            Logger.getLogger(GUI_ListarMateriales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarVistaListarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVistaListarMaterialActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarVistaListarMaterialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarVistaListarMaterial;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane jdp4;
    private javax.swing.JTable tblMateriales;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
