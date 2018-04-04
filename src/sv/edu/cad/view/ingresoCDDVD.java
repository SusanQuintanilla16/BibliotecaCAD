
package sv.edu.cad.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sv.edu.cad.controller.Catalogo;
import sv.edu.cad.controller.Procesos;


public class ingresoCDDVD extends javax.swing.JInternalFrame
{
    //Declaración de variables
    static int bandera=0;
    Catalogo CDDVD = new Catalogo();
    int id_material = 0;
   
    public ingresoCDDVD() 
    {
        initComponents();
        CDDVD.mostrarAutores(tableAutorCDDVD);
        CDDVD.mostrarTemas(tableTemasCDDVD);
        CDDVD.cargarIdioma(cmbIdiomaCDDVD);
        CDDVD.cargarClasificacion(cmbClasificacionCDDVD);
        CDDVD.cargarCuota(cmbCuota);
        //inicializar el combobox de cd/dvd
        cmbOpcionCDDVD.removeAllItems();
        cmbOpcionCDDVD.addItem("CD");
        cmbOpcionCDDVD.addItem("DVD");
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        txtTituloCDDVD = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        txtEdicionCDDVD = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        txtAdquisicionCDDVD = new javax.swing.JFormattedTextField();
        jLabel105 = new javax.swing.JLabel();
        txtPublicacionCDDVD = new javax.swing.JFormattedTextField();
        jLabel107 = new javax.swing.JLabel();
        cmbOpcionCDDVD = new javax.swing.JComboBox();
        cmbIdiomaCDDVD = new javax.swing.JComboBox();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jScrollPane36 = new javax.swing.JScrollPane();
        tableAutorCDDVD = new javax.swing.JTable();
        jLabel110 = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        tableTemasCDDVD = new javax.swing.JTable();
        jScrollPane38 = new javax.swing.JScrollPane();
        txtDescripcionCDDVD = new javax.swing.JTextArea();
        jLabel111 = new javax.swing.JLabel();
        jScrollPane39 = new javax.swing.JScrollPane();
        txtNotasCDDVD = new javax.swing.JTextArea();
        jLabel112 = new javax.swing.JLabel();
        jScrollPane40 = new javax.swing.JScrollPane();
        txtResumenCDDVD = new javax.swing.JTextArea();
        btnCerrarCDDVD = new javax.swing.JButton();
        btnIngresarCDDVD = new javax.swing.JButton();
        jLabel115 = new javax.swing.JLabel();
        cmbClasificacionCDDVD = new javax.swing.JComboBox();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        txtDuracionCDDVD = new javax.swing.JTextField();
        txtSizeCDDVD = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        cmbCuota = new javax.swing.JComboBox();

        setTitle("Ingreso de CD/DVD");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Ingreso de CD / DVD");

        jLabel100.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel100.setText("Ingrese el Título");

        jLabel101.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel101.setText("Ingrese la Edición");

        jLabel102.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel102.setText("Ingrese la Descripción");

        jLabel103.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel103.setText("Ingrese Fecha de Adquisición");

        try {
            txtAdquisicionCDDVD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel105.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel105.setText("Ingrese Fecha de Publicación");

        try {
            txtPublicacionCDDVD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel107.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel107.setText("Seleccione la Clasificación");

        cmbOpcionCDDVD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbIdiomaCDDVD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel108.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel108.setText("Seleccione el Idioma");

        jLabel109.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel109.setText("Seleccione el Autor");

        tableAutorCDDVD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Seleccionado", "Title 2", "Title 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane36.setViewportView(tableAutorCDDVD);

        jLabel110.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel110.setText("Seleccione el Tema");

        tableTemasCDDVD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Seleccionado", "Title 2", "Title 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane37.setViewportView(tableTemasCDDVD);

        txtDescripcionCDDVD.setColumns(20);
        txtDescripcionCDDVD.setRows(5);
        jScrollPane38.setViewportView(txtDescripcionCDDVD);

        jLabel111.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel111.setText("Notas");

        txtNotasCDDVD.setColumns(20);
        txtNotasCDDVD.setRows(5);
        jScrollPane39.setViewportView(txtNotasCDDVD);

        jLabel112.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel112.setText("Resumen");

        txtResumenCDDVD.setColumns(20);
        txtResumenCDDVD.setRows(5);
        jScrollPane40.setViewportView(txtResumenCDDVD);

        btnCerrarCDDVD.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarCDDVD.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCerrarCDDVD.setText("Cancelar");
        btnCerrarCDDVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCDDVDActionPerformed(evt);
            }
        });

        btnIngresarCDDVD.setBackground(new java.awt.Color(153, 255, 255));
        btnIngresarCDDVD.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnIngresarCDDVD.setText("Ingresar ");
        btnIngresarCDDVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarCDDVDActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel115.setText("Seleccione la cuota de mora");

        cmbClasificacionCDDVD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel113.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel113.setText("Duracion");

        jLabel114.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel114.setText("Size");

        jLabel104.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel104.setText("Seleccione opcion");

        cmbCuota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101)
                            .addComponent(jLabel102)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAdquisicionCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPublicacionCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel104)
                            .addComponent(cmbOpcionCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEdicionCDDVD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                                .addComponent(txtTituloCDDVD, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel105))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel107)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel108)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane36)
                                    .addComponent(jScrollPane37)
                                    .addComponent(jScrollPane39, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel109)
                                            .addComponent(jLabel110)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel112)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel111)
                                .addGap(0, 454, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbClasificacionCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbIdiomaCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel1))
                            .addComponent(jLabel115)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(249, 249, 249)
                                .addComponent(jLabel113)
                                .addGap(18, 18, 18)
                                .addComponent(txtDuracionCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel114)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSizeCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(btnCerrarCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnIngresarCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(jLabel104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbOpcionCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel100)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel111)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTituloCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdicionCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103)
                            .addComponent(jLabel105))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdquisicionCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPublicacionCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel112)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel113)
                            .addComponent(jLabel114)
                            .addComponent(txtDuracionCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSizeCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel107)
                            .addComponent(jLabel108))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbClasificacionCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbIdiomaCDDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarCDDVD)
                    .addComponent(btnIngresarCDDVD))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarCDDVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCDDVDActionPerformed
        try
        {
            int resp = JOptionPane.showConfirmDialog(this, "¿Está seguro?");
            if(resp == JOptionPane.YES_OPTION)
            {
                bandera=0;
                this.dispose();
            }
        }
        catch(Exception e)
        {
            Logger.getLogger(ingresoCDDVD.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btnCerrarCDDVDActionPerformed

    private void btnIngresarCDDVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarCDDVDActionPerformed

        if(txtTituloCDDVD.getText().equals("")||txtEdicionCDDVD.getText().equals("")||
            txtAdquisicionCDDVD.getText().equals("")||txtPublicacionCDDVD.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Falta información necesaria para el registro");
        }
        else if(!Procesos.VerificaDate(txtAdquisicionCDDVD.getText())||!Procesos.VerificaDate(txtPublicacionCDDVD.getText()))
        {
            JOptionPane.showMessageDialog(this, "Fecha incorrectas");
        }
        else if(!Procesos.VerificaChecks(tableAutorCDDVD))
        {
            JOptionPane.showMessageDialog(this, "Necesita seleccionar al menos un autor");
        }
        else if(!Procesos.VerificaChecks(tableTemasCDDVD))
        {
            JOptionPane.showMessageDialog(this, "Necesita seleccionar al menos un tema");
        }
        else
        {
            String opcion = (String)cmbOpcionCDDVD.getSelectedItem();
            if(opcion.equals("CD"))
            {
             id_material = 4;
            }
            else if(opcion.equals("DVD"))
            {
             id_material = 5;
            }              

            int id = CDDVD.ingresarCatalogo(cmbClasificacionCDDVD.getSelectedIndex()+1, cmbIdiomaCDDVD.getSelectedIndex()+1
                , id_material, txtTituloCDDVD.getText(), txtEdicionCDDVD.getText(), txtDescripcionCDDVD.getText(), txtNotasCDDVD.getText(),
                Procesos.cambiarOrden(txtAdquisicionCDDVD.getText()), txtResumenCDDVD.getText(),
                Procesos.cambiarOrden(txtPublicacionCDDVD.getText()),cmbCuota.getSelectedIndex()+1);
            
            int[] idAutor = Procesos.getID(tableAutorCDDVD);
            int[] idTema = Procesos.getID(tableTemasCDDVD);
            CDDVD.ingresoMultipleAutor(id, idAutor);
            CDDVD.ingresoMultipleTema(id, idTema);
            CDDVD.ingresoCDDVDs(id, txtDuracionCDDVD.getText(), txtSizeCDDVD.getText());
        }
    }//GEN-LAST:event_btnIngresarCDDVDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarCDDVD;
    private javax.swing.JButton btnIngresarCDDVD;
    private javax.swing.JComboBox cmbClasificacionCDDVD;
    private javax.swing.JComboBox cmbCuota;
    private javax.swing.JComboBox cmbIdiomaCDDVD;
    private javax.swing.JComboBox cmbOpcionCDDVD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JTable tableAutorCDDVD;
    private javax.swing.JTable tableTemasCDDVD;
    private javax.swing.JFormattedTextField txtAdquisicionCDDVD;
    private javax.swing.JTextArea txtDescripcionCDDVD;
    private javax.swing.JTextField txtDuracionCDDVD;
    private javax.swing.JTextField txtEdicionCDDVD;
    private javax.swing.JTextArea txtNotasCDDVD;
    private javax.swing.JFormattedTextField txtPublicacionCDDVD;
    private javax.swing.JTextArea txtResumenCDDVD;
    private javax.swing.JTextField txtSizeCDDVD;
    private javax.swing.JTextField txtTituloCDDVD;
    // End of variables declaration//GEN-END:variables
}
