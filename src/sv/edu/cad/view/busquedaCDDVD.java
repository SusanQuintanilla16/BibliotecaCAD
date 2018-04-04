
package sv.edu.cad.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sv.edu.cad.controller.Catalogo;
import sv.edu.cad.model.Conexion;
import static sv.edu.cad.view.busquedaTesis.bandera;


public class busquedaCDDVD extends javax.swing.JInternalFrame 
{

    DefaultTableModel modelo1 = null;
    static int bandera = 0; 
    ResultSet resultado = null;
    ResultSet CD1;
    ResultSet CD2;
    ResultSet llenarcombo;
    Conexion conexion = new Conexion(); 
    int id_material = 0;
    
    public busquedaCDDVD() throws SQLException
    {
        initComponents();
        bandera = 1;
        //inicializar el combobox de cd/dvd
        cmbOpcion.removeAllItems();
        cmbOpcion.addItem("CD");
        cmbOpcion.addItem("DVD");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPatronCDDVDM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCDDVDM = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtTituloCDDVDM = new javax.swing.JTextField();
        txtEdicionCDDVDM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResumenCDDVDM = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNotasCDDVDM = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDuracionCDDVDM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionCDDVDM = new javax.swing.JTextArea();
        txtSizeCDDVDM = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnModificarTesisM = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCancelarCDDVDM = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDCDDVDM = new javax.swing.JTextField();
        btnBuscarCDDVDM = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbOpcion = new javax.swing.JComboBox<>();
        btnCargarCDDVDM = new javax.swing.JButton();

        setTitle("Busqueda CD / DVD");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Seleccionar tipo CD o DVD:");

        txtPatronCDDVDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatronCDDVDMActionPerformed(evt);
            }
        });
        txtPatronCDDVDM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatronCDDVDMKeyPressed(evt);
            }
        });

        TablaCDDVDM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaCDDVDM);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setText("Edición:");

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setText("Notas:");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setText("Resumen:");

        txtResumenCDDVDM.setColumns(20);
        txtResumenCDDVDM.setRows(5);
        jScrollPane3.setViewportView(txtResumenCDDVDM);

        txtNotasCDDVDM.setColumns(20);
        txtNotasCDDVDM.setRows(5);
        jScrollPane4.setViewportView(txtNotasCDDVDM);

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17.setText("Titulo:");

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel18.setText("Duracion:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("Descripcion:");

        txtDescripcionCDDVDM.setColumns(20);
        txtDescripcionCDDVDM.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionCDDVDM);

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel19.setText("Size:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtDuracionCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTituloCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(txtEdicionCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSizeCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(157, 157, 157))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTituloCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtEdicionCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDuracionCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSizeCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnModificarTesisM.setBackground(new java.awt.Color(0, 255, 204));
        btnModificarTesisM.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnModificarTesisM.setText("Modificar");
        btnModificarTesisM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTesisMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificarTesisM)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnModificarTesisM)
                .addGap(21, 21, 21))
        );

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("Datos CD/DVD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        btnCancelarCDDVDM.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarCDDVDM.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCancelarCDDVDM.setText("Cancelar");
        btnCancelarCDDVDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCDDVDMActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));

        jLabel11.setBackground(new java.awt.Color(102, 153, 255));
        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("Actualizar Datos CD / DVD");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("ID:");

        btnBuscarCDDVDM.setBackground(new java.awt.Color(51, 255, 204));
        btnBuscarCDDVDM.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnBuscarCDDVDM.setText("Buscar");
        btnBuscarCDDVDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCDDVDMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(txtIDCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnBuscarCDDVDM)
                .addGap(74, 74, 74))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnBuscarCDDVDM))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Ingresar patrón de busqueda de CD/DVD: ");

        cmbOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCargarCDDVDM.setBackground(new java.awt.Color(51, 255, 255));
        btnCargarCDDVDM.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCargarCDDVDM.setText("Cargar");
        btnCargarCDDVDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarCDDVDMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarCDDVDM)))
                .addGap(18, 18, 18)
                .addComponent(btnCancelarCDDVDM)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(txtPatronCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel3)
                    .addContainerGap(821, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarCDDVDM)
                .addGap(9, 9, 9)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarCDDVDM))
                .addGap(18, 18, 18)
                .addComponent(txtPatronCDDVDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jLabel3)
                    .addContainerGap(520, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatronCDDVDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatronCDDVDMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatronCDDVDMActionPerformed

    private void txtPatronCDDVDMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatronCDDVDMKeyPressed

        while(modelo1.getRowCount()!=0)
        {
            modelo1.removeRow(0);
        }
        conexion.setRs("select idCatalogo, Titulo, Edicion, Descripcion from catalogo where concat(Titulo,' ',Edicion) "
            + "like '%" + this.txtPatronCDDVDM.getText() + "%'");

        try
        {
            generarListado();

        }
        catch(SQLException ex)
        {
            Logger.getLogger(busquedaTesis.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_txtPatronCDDVDMKeyPressed

    private void btnModificarTesisMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTesisMActionPerformed

        txtTituloCDDVDM.setEditable(true);
        txtEdicionCDDVDM.setEditable(true);
        txtDescripcionCDDVDM.setEditable(true);
        txtNotasCDDVDM.setEditable(true);
        txtResumenCDDVDM.setEditable(true);
        txtDuracionCDDVDM.setEditable(true);
        txtSizeCDDVDM.setEditable(true);

        String ID = txtIDCDDVDM.getText();
        String titulo = txtTituloCDDVDM.getText();
        String edicion = txtEdicionCDDVDM.getText();
        String descripcion = txtDescripcionCDDVDM.getText();
        String notas = txtNotasCDDVDM.getText();
        String resumen = txtResumenCDDVDM.getText();
        String duracion = txtDuracionCDDVDM.getText();
        String size = txtSizeCDDVDM.getText();

        /* if(!Procesos.VerificaDate(txtAdquisicionLibroM.getText())||!Procesos.VerificaDate(txtPublicacionLibroM.getText()))
        {
            JOptionPane.showMessageDialog(this, "Fecha incorrectas");
        }
        else
        {*/

            //String adquisicion1 = Procesos.cambiarOrden(adquisicion);
            //String publicacion1 = Procesos.cambiarOrden(publicacion);

            try
            {
                if(btnModificarTesisM.getText().equals("Modificar"))
                {
                    btnModificarTesisM.setText("Guardar");
                }
                else
                {
                    Catalogo cd = new Catalogo();
                    cd.EditarInfoCDDVD(ID,titulo,edicion,descripcion,notas,resumen,duracion,size);

                    btnModificarTesisM.setText("Modificar");

                    txtTituloCDDVDM.setEditable(false);
                    txtEdicionCDDVDM.setEditable(false);
                    txtDescripcionCDDVDM.setEditable(false);
                    txtNotasCDDVDM.setEditable(false);
                    txtResumenCDDVDM.setEditable(false);
                    txtDuracionCDDVDM.setEditable(false);
                    txtSizeCDDVDM.setEditable(false);
                    limpiarValores();
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, "Ocurrio error en Modificar");
            }

            //}
    }//GEN-LAST:event_btnModificarTesisMActionPerformed

    private void limpiarValores()
    {
     txtTituloCDDVDM.setText("");
     txtEdicionCDDVDM.setText("");
     txtDescripcionCDDVDM.setText("");
     txtNotasCDDVDM.setText("");
     txtResumenCDDVDM.setText("");
     txtDuracionCDDVDM.setText("");
     txtSizeCDDVDM.setText(""); 
    }
    
    private void btnCancelarCDDVDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCDDVDMActionPerformed

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
            Logger.getLogger(busquedaCDDVD.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btnCancelarCDDVDMActionPerformed

    private void btnBuscarCDDVDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCDDVDMActionPerformed

        txtTituloCDDVDM.setEditable(false);
        txtEdicionCDDVDM.setEditable(false);
        txtDescripcionCDDVDM.setEditable(false);
        txtNotasCDDVDM.setEditable(false);
        txtResumenCDDVDM.setEditable(false);
        txtDuracionCDDVDM.setEditable(false);
        txtSizeCDDVDM.setEditable(false);
        try
        {
            Conexion con = new Conexion(); //creacion del objeto
            int id = Integer.parseInt(txtIDCDDVDM.getText());

            con.setRs("select  Titulo, Edicion, Descripcion, Notas, Resumen  from catalogo where idCatalogo= "+ id );
            CD1=(ResultSet) con.getRs();
            CD1.next();//movemos al primer registro

            Conexion con2 = new Conexion();
            con2.setRs("select Duracion, Size from dvdcd where idCatalogo= "+ id );
            CD2=(ResultSet) con2.getRs();
            CD2.next();//movemos al primer registro

            llenarTxtbox();
            con2.cerrarConexion();
            con.cerrarConexion();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(busquedaCDDVD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarCDDVDMActionPerformed

    private void llenarTxtbox() throws SQLException
    { 
     txtTituloCDDVDM.setText(CD1.getString(1));
     txtEdicionCDDVDM.setText(CD1.getString(2));
     txtDescripcionCDDVDM.setText(CD1.getString(3));     
     txtNotasCDDVDM.setText(CD1.getString(4));
     txtResumenCDDVDM.setText(CD1.getString(5));   
     txtDuracionCDDVDM.setText(CD2.getString(1)); 
     txtSizeCDDVDM.setText(CD2.getString(2));
       
    }
    
    private void btnCargarCDDVDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCDDVDMActionPerformed
        // TODO add your handling code here:
        
        String opcion = (String)cmbOpcion.getSelectedItem();
        
            if(opcion.equals("CD"))           
            {
             
                try 
                {
                    id_material = 4;
                    Opcion(id_material);
                } catch (SQLException ex)
                {
                    Logger.getLogger(busquedaCDDVD.class.getName()).log(Level.SEVERE, null, ex);
                }
             
            }
            else if(opcion.equals("DVD"))
            {
             
                try 
                {
                    id_material = 5;
                    Opcion(id_material);
                } catch (SQLException ex)
                {
                    Logger.getLogger(busquedaCDDVD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
    }//GEN-LAST:event_btnCargarCDDVDMActionPerformed

    private void Opcion(int id_material) throws SQLException
    {
        Object [][] data = null;
        String [] columns = {"ID","Titulo","Edicion","Descripcion"};
        modelo1 = new DefaultTableModel(data,columns);
        this.TablaCDDVDM.setModel(modelo1);
        conexion.setRs("select idCatalogo, Titulo, Edicion, Descripcion from catalogo where idMaterial = " + id_material);
        generarListado();
    }
    
    void generarListado () throws SQLException
    {
     resultado = conexion.getRs();
     while(resultado.next())//agregando una nueva fila a la tabla
     {
         Object []  newRow = {resultado.getInt(1),resultado.getString(2),resultado.getString(3),resultado.getString(4)};
         resultado.getString(4);
         modelo1.addRow(newRow);
     }    
     resultado.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCDDVDM;
    private javax.swing.JButton btnBuscarCDDVDM;
    private javax.swing.JButton btnCancelarCDDVDM;
    private javax.swing.JButton btnCargarCDDVDM;
    private javax.swing.JButton btnModificarTesisM;
    private javax.swing.JComboBox<String> cmbOpcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtDescripcionCDDVDM;
    private javax.swing.JTextField txtDuracionCDDVDM;
    private javax.swing.JTextField txtEdicionCDDVDM;
    private javax.swing.JTextField txtIDCDDVDM;
    private javax.swing.JTextArea txtNotasCDDVDM;
    private javax.swing.JTextField txtPatronCDDVDM;
    private javax.swing.JTextArea txtResumenCDDVDM;
    private javax.swing.JTextField txtSizeCDDVDM;
    private javax.swing.JTextField txtTituloCDDVDM;
    // End of variables declaration//GEN-END:variables
}
