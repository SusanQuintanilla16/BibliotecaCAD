
package sv.edu.cad.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sv.edu.cad.controller.Catalogo;
import sv.edu.cad.controller.Procesos;
import static sv.edu.cad.view.ingresoLibro.bandera;


public class ingresoRevista extends javax.swing.JInternalFrame 
{ 
    //Declaración de variables
    static int bandera=0;
    Catalogo Revista = new Catalogo();

    
    public ingresoRevista() 
    {
        initComponents();
        Revista.mostrarAutores(tableAutorRevista);
        Revista.mostrarTemas(tableTemasRevista);
        Revista.cargarIdioma(cmbIdiomaRevista);
        Revista.cargarClasificacion(cmbClasificacionRevista);
        Revista.cargarCuota(cmbCuota);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        txtTituloRevista = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        txtEdicionRevista = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        txtAdquisicionRevista = new javax.swing.JFormattedTextField();
        jLabel104 = new javax.swing.JLabel();
        txtISSNRevista = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        txtPublicacionRevista = new javax.swing.JFormattedTextField();
        jLabel107 = new javax.swing.JLabel();
        cmbCuota = new javax.swing.JComboBox();
        cmbIdiomaRevista = new javax.swing.JComboBox();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jScrollPane36 = new javax.swing.JScrollPane();
        tableAutorRevista = new javax.swing.JTable();
        jLabel110 = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        tableTemasRevista = new javax.swing.JTable();
        jScrollPane38 = new javax.swing.JScrollPane();
        txtDescripcionRevista = new javax.swing.JTextArea();
        jLabel111 = new javax.swing.JLabel();
        jScrollPane39 = new javax.swing.JScrollPane();
        txtNotasRevista = new javax.swing.JTextArea();
        jLabel112 = new javax.swing.JLabel();
        jScrollPane40 = new javax.swing.JScrollPane();
        txtResumenRevista = new javax.swing.JTextArea();
        btnCerrarRevista = new javax.swing.JButton();
        btnIngresarRevista = new javax.swing.JButton();
        jLabel106 = new javax.swing.JLabel();
        txtTituloVRevista = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jScrollPane41 = new javax.swing.JScrollPane();
        txtContenidoRevista = new javax.swing.JTextArea();
        jLabel114 = new javax.swing.JLabel();
        jScrollPane42 = new javax.swing.JScrollPane();
        txtEjemplarRevista = new javax.swing.JTextArea();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        txtFrecuenciaRevista = new javax.swing.JTextField();
        cmbClasificacionRevista = new javax.swing.JComboBox();

        setTitle("Ingreso Revista");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Ingreso de Revista");

        jLabel100.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel100.setText("Ingrese el Título");

        jLabel101.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel101.setText("Ingrese la Edición");

        jLabel102.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel102.setText("Ingrese la Descripción");

        jLabel103.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel103.setText("Ingrese Fecha de Adquisición");

        try {
            txtAdquisicionRevista.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel104.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel104.setText("Ingrese el ISSN");

        txtISSNRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISSNRevistaActionPerformed(evt);
            }
        });
        txtISSNRevista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtISSNRevistaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtISSNRevistaKeyTyped(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel105.setText("Ingrese Fecha de Publicación");

        try {
            txtPublicacionRevista.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel107.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel107.setText("Seleccione la Clasificación");

        cmbCuota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbIdiomaRevista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel108.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel108.setText("Seleccione el Idioma");

        jLabel109.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel109.setText("Seleccione el Autor");

        tableAutorRevista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane36.setViewportView(tableAutorRevista);

        jLabel110.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel110.setText("Seleccione el Tema");

        tableTemasRevista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane37.setViewportView(tableTemasRevista);

        txtDescripcionRevista.setColumns(20);
        txtDescripcionRevista.setRows(5);
        jScrollPane38.setViewportView(txtDescripcionRevista);

        jLabel111.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel111.setText("Notas");

        txtNotasRevista.setColumns(20);
        txtNotasRevista.setRows(5);
        jScrollPane39.setViewportView(txtNotasRevista);

        jLabel112.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel112.setText("Resumen");

        txtResumenRevista.setColumns(20);
        txtResumenRevista.setRows(5);
        jScrollPane40.setViewportView(txtResumenRevista);

        btnCerrarRevista.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarRevista.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCerrarRevista.setText("Cancelar");
        btnCerrarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRevistaActionPerformed(evt);
            }
        });

        btnIngresarRevista.setBackground(new java.awt.Color(153, 255, 255));
        btnIngresarRevista.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnIngresarRevista.setText("Ingresar ");
        btnIngresarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarRevistaActionPerformed(evt);
            }
        });

        jLabel106.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel106.setText("Ingrese Variante Título (no obligatorio)");

        jLabel113.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel113.setText("Contenido");

        txtContenidoRevista.setColumns(20);
        txtContenidoRevista.setRows(5);
        jScrollPane41.setViewportView(txtContenidoRevista);

        jLabel114.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel114.setText("Frecuencia");

        txtEjemplarRevista.setColumns(20);
        txtEjemplarRevista.setRows(5);
        jScrollPane42.setViewportView(txtEjemplarRevista);

        jLabel115.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel115.setText("Seleccione la cuota de mora");

        jLabel116.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel116.setText("Ejemplar");

        txtFrecuenciaRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFrecuenciaRevistaActionPerformed(evt);
            }
        });
        txtFrecuenciaRevista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFrecuenciaRevistaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFrecuenciaRevistaKeyTyped(evt);
            }
        });

        cmbClasificacionRevista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(btnIngresarRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jLabel1)))
                .addContainerGap(505, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFrecuenciaRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel106)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTituloVRevista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                                .addComponent(txtTituloRevista, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel100)
                            .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEdicionRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAdquisicionRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel101)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel103))
                            .addComponent(jLabel102)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCerrarRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtISSNRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel104)
                                                .addComponent(jLabel107))
                                            .addGap(35, 35, 35))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(cmbClasificacionRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel108)
                                        .addComponent(jLabel105)
                                        .addComponent(txtPublicacionRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbIdiomaRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel109)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel110)
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel111)
                            .addGap(165, 165, 165)
                            .addComponent(jLabel113))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel112))
                    .addComponent(cmbCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel100)
                    .addComponent(jLabel109, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTituloRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTituloVRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103)
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdicionRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdquisicionRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel104)
                                    .addComponent(jLabel105))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtISSNRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel107)
                                    .addComponent(jLabel108))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbIdiomaRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbClasificacionRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(txtPublicacionRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel114)
                            .addComponent(jLabel116)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel111)
                            .addComponent(jLabel113))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel115)
                            .addComponent(txtFrecuenciaRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarRevista)
                    .addComponent(btnCerrarRevista))
                .addGap(9, 9, 9))
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

    private void btnIngresarRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarRevistaActionPerformed
        if(txtTituloRevista.getText().equals("")||txtEdicionRevista.getText().equals("")||
                txtAdquisicionRevista.getText().equals("")||txtISSNRevista.getText().equals("")||
                txtPublicacionRevista.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Falta información necesaria para el registro");
        }
        else if(!Procesos.VerificaDate(txtAdquisicionRevista.getText())||!Procesos.VerificaDate(txtPublicacionRevista.getText()))
        {
            JOptionPane.showMessageDialog(this, "Fecha incorrectas");
        }
        else if(!Procesos.VerificaChecks(tableAutorRevista))
        {
            JOptionPane.showMessageDialog(this, "Necesita seleccionar al menos un autor");
        }
        else if(!Procesos.VerificaChecks(tableTemasRevista))
        {
            JOptionPane.showMessageDialog(this, "Necesita seleccionar al menos un tema");
        }
        else
        {
            
            int id = Revista.ingresarCatalogo(cmbClasificacionRevista.getSelectedIndex()+1, cmbIdiomaRevista.getSelectedIndex()+1
                    , 3, txtTituloRevista.getText(), txtEdicionRevista.getText(), txtDescripcionRevista.getText(), txtNotasRevista.getText(),
                    Procesos.cambiarOrden(txtAdquisicionRevista.getText()), txtResumenRevista.getText(), 
                    Procesos.cambiarOrden(txtPublicacionRevista.getText()),cmbCuota.getSelectedIndex()+1);
            int[] idAutor = Procesos.getID(tableAutorRevista);
            int[] idTema = Procesos.getID(tableTemasRevista);
            Revista.ingresoMultipleAutor(id, idAutor);
            Revista.ingresoMultipleTema(id, idTema);
            Revista.ingresoRevistas(id, txtTituloVRevista.getText(), txtEjemplarRevista.getText(), txtContenidoRevista.getText(),
                    txtFrecuenciaRevista.getText(),txtISSNRevista.getText());
        }
        
    }//GEN-LAST:event_btnIngresarRevistaActionPerformed

    private void btnCerrarRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRevistaActionPerformed
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
            Logger.getLogger(ingresoRevista.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btnCerrarRevistaActionPerformed

    private void txtISSNRevistaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISSNRevistaKeyTyped

    }//GEN-LAST:event_txtISSNRevistaKeyTyped

    private void txtISSNRevistaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISSNRevistaKeyPressed

    }//GEN-LAST:event_txtISSNRevistaKeyPressed

    private void txtISSNRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISSNRevistaActionPerformed

    }//GEN-LAST:event_txtISSNRevistaActionPerformed

    private void txtFrecuenciaRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFrecuenciaRevistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFrecuenciaRevistaActionPerformed

    private void txtFrecuenciaRevistaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFrecuenciaRevistaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFrecuenciaRevistaKeyPressed

    private void txtFrecuenciaRevistaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFrecuenciaRevistaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFrecuenciaRevistaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarRevista;
    private javax.swing.JButton btnIngresarRevista;
    private javax.swing.JComboBox cmbClasificacionRevista;
    private javax.swing.JComboBox cmbCuota;
    private javax.swing.JComboBox cmbIdiomaRevista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JTable tableAutorRevista;
    private javax.swing.JTable tableTemasRevista;
    private javax.swing.JFormattedTextField txtAdquisicionRevista;
    private javax.swing.JTextArea txtContenidoRevista;
    private javax.swing.JTextArea txtDescripcionRevista;
    private javax.swing.JTextField txtEdicionRevista;
    private javax.swing.JTextArea txtEjemplarRevista;
    private javax.swing.JTextField txtFrecuenciaRevista;
    private javax.swing.JTextField txtISSNRevista;
    private javax.swing.JTextArea txtNotasRevista;
    private javax.swing.JFormattedTextField txtPublicacionRevista;
    private javax.swing.JTextArea txtResumenRevista;
    private javax.swing.JTextField txtTituloRevista;
    private javax.swing.JTextField txtTituloVRevista;
    // End of variables declaration//GEN-END:variables
}
