
package sv.edu.cad.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sv.edu.cad.controller.Catalogo;
import sv.edu.cad.controller.Procesos;
import static sv.edu.cad.view.ingresoRevista.bandera;


public class ingresoTesis extends javax.swing.JInternalFrame 
{
    //Declaración de variables
    static int bandera=0;
    Catalogo Tesis = new Catalogo();
    
    public ingresoTesis()
    {
        initComponents();
        Tesis.mostrarAutores(tableAutorTesis);
        Tesis.mostrarTemas(tableTemasTesis);
        Tesis.cargarIdioma(cmbIdiomaTesis);
        Tesis.cargarClasificacion(cmbClasificacionTesis);
        Tesis.cargarCuota(cmbCuota);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        txtTituloTesis = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        txtEdicionTesis = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        txtAdquisicionTesis = new javax.swing.JFormattedTextField();
        jLabel105 = new javax.swing.JLabel();
        txtPublicacionTesis = new javax.swing.JFormattedTextField();
        jLabel107 = new javax.swing.JLabel();
        cmbCuota = new javax.swing.JComboBox();
        cmbIdiomaTesis = new javax.swing.JComboBox();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jScrollPane36 = new javax.swing.JScrollPane();
        tableAutorTesis = new javax.swing.JTable();
        jLabel110 = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        tableTemasTesis = new javax.swing.JTable();
        jScrollPane38 = new javax.swing.JScrollPane();
        txtDescripcionTesis = new javax.swing.JTextArea();
        jLabel111 = new javax.swing.JLabel();
        jScrollPane39 = new javax.swing.JScrollPane();
        txtNotasTesis = new javax.swing.JTextArea();
        jLabel112 = new javax.swing.JLabel();
        jScrollPane40 = new javax.swing.JScrollPane();
        txtResumenTesis = new javax.swing.JTextArea();
        btnCerrarTesis = new javax.swing.JButton();
        btnIngresarTesis = new javax.swing.JButton();
        jLabel106 = new javax.swing.JLabel();
        txtTituloVTesis = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        cmbClasificacionTesis = new javax.swing.JComboBox();
        jLabel114 = new javax.swing.JLabel();
        jScrollPane42 = new javax.swing.JScrollPane();
        txtRecursoDigitalTesis = new javax.swing.JTextArea();

        setResizable(true);
        setTitle("Ingreso Tesis");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Ingreso de Tesis");

        jLabel100.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel100.setText("Ingrese el Título");

        jLabel101.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel101.setText("Ingrese la Edición");

        jLabel102.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel102.setText("Ingrese la Descripción");

        jLabel103.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel103.setText("Ingrese Fecha de Adquisición");

        try {
            txtAdquisicionTesis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel105.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel105.setText("Ingrese Fecha de Publicación");

        try {
            txtPublicacionTesis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel107.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel107.setText("Seleccione la Clasificación");

        cmbCuota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbIdiomaTesis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel108.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel108.setText("Seleccione el Idioma");

        jLabel109.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel109.setText("Seleccione el Autor");

        tableAutorTesis.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane36.setViewportView(tableAutorTesis);

        jLabel110.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel110.setText("Seleccione el Tema");

        tableTemasTesis.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane37.setViewportView(tableTemasTesis);

        txtDescripcionTesis.setColumns(20);
        txtDescripcionTesis.setRows(5);
        jScrollPane38.setViewportView(txtDescripcionTesis);

        jLabel111.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel111.setText("Notas");

        txtNotasTesis.setColumns(20);
        txtNotasTesis.setRows(5);
        jScrollPane39.setViewportView(txtNotasTesis);

        jLabel112.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel112.setText("Resumen");

        txtResumenTesis.setColumns(20);
        txtResumenTesis.setRows(5);
        jScrollPane40.setViewportView(txtResumenTesis);

        btnCerrarTesis.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarTesis.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCerrarTesis.setText("Cancelar");
        btnCerrarTesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarTesisActionPerformed(evt);
            }
        });

        btnIngresarTesis.setBackground(new java.awt.Color(153, 255, 255));
        btnIngresarTesis.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnIngresarTesis.setText("Ingresar ");
        btnIngresarTesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarTesisActionPerformed(evt);
            }
        });

        jLabel106.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel106.setText("Ingrese Variante Título (no obligatorio)");

        jLabel115.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel115.setText("Seleccione la cuota de mora");

        cmbClasificacionTesis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel114.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel114.setText("Recurso Digital");

        txtRecursoDigitalTesis.setColumns(20);
        txtRecursoDigitalTesis.setRows(5);
        jScrollPane42.setViewportView(txtRecursoDigitalTesis);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(btnCerrarTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnIngresarTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jLabel1)))
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel106)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTituloVTesis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                        .addComponent(txtTituloTesis, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel100)
                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdicionTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101)
                    .addComponent(jLabel102)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel107)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAdquisicionTesis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(txtPublicacionTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel108)
                    .addComponent(jLabel115)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbClasificacionTesis, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbIdiomaTesis, javax.swing.GroupLayout.Alignment.LEADING, 0, 194, Short.MAX_VALUE))
                    .addComponent(cmbCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel109)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                        .addComponent(jLabel110)
                        .addComponent(jLabel111)
                        .addComponent(jScrollPane39)
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                    .addComponent(jLabel114)
                    .addComponent(jLabel112)
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(txtTituloTesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTituloVTesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel111)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtEdicionTesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel102)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel105)
                                            .addComponent(jLabel103))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAdquisicionTesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel107))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(txtPublicacionTesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmbClasificacionTesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbIdiomaTesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel115)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel114)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCerrarTesis)
                                    .addComponent(btnIngresarTesis))
                                .addGap(23, 23, 23))))))
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

    private void btnCerrarTesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarTesisActionPerformed
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
            Logger.getLogger(ingresoTesis.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btnCerrarTesisActionPerformed

    private void btnIngresarTesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarTesisActionPerformed
        
        if(txtTituloTesis.getText().equals("")||txtEdicionTesis.getText().equals("")||
            txtAdquisicionTesis.getText().equals("")||txtPublicacionTesis.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Falta información necesaria para el registro");
        }
        else if(!Procesos.VerificaDate(txtAdquisicionTesis.getText())||!Procesos.VerificaDate(txtPublicacionTesis.getText()))
        {
            JOptionPane.showMessageDialog(this, "Fecha incorrectas");
        }
        else if(!Procesos.VerificaChecks(tableAutorTesis))
        {
            JOptionPane.showMessageDialog(this, "Necesita seleccionar al menos un autor");
        }
        else if(!Procesos.VerificaChecks(tableTemasTesis))
        {
            JOptionPane.showMessageDialog(this, "Necesita seleccionar al menos un tema");
        }
        else
        {

            int id = Tesis.ingresarCatalogo(cmbClasificacionTesis.getSelectedIndex()+1, cmbIdiomaTesis.getSelectedIndex()+1
                , 2, txtTituloTesis.getText(), txtEdicionTesis.getText(), txtDescripcionTesis.getText(), txtNotasTesis.getText(),
                Procesos.cambiarOrden(txtAdquisicionTesis.getText()), txtResumenTesis.getText(),
                Procesos.cambiarOrden(txtPublicacionTesis.getText()),cmbCuota.getSelectedIndex()+1);
            int[] idAutor = Procesos.getID(tableAutorTesis);
            int[] idTema = Procesos.getID(tableTemasTesis);
            Tesis.ingresoMultipleAutor(id, idAutor);
            Tesis.ingresoMultipleTema(id, idTema);
            Tesis.ingresoTesis(id, txtTituloVTesis.getText(), txtRecursoDigitalTesis.getText());
        }

    }//GEN-LAST:event_btnIngresarTesisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarTesis;
    private javax.swing.JButton btnIngresarTesis;
    private javax.swing.JComboBox cmbClasificacionTesis;
    private javax.swing.JComboBox cmbCuota;
    private javax.swing.JComboBox cmbIdiomaTesis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JTable tableAutorTesis;
    private javax.swing.JTable tableTemasTesis;
    private javax.swing.JFormattedTextField txtAdquisicionTesis;
    private javax.swing.JTextArea txtDescripcionTesis;
    private javax.swing.JTextField txtEdicionTesis;
    private javax.swing.JTextArea txtNotasTesis;
    private javax.swing.JFormattedTextField txtPublicacionTesis;
    private javax.swing.JTextArea txtRecursoDigitalTesis;
    private javax.swing.JTextArea txtResumenTesis;
    private javax.swing.JTextField txtTituloTesis;
    private javax.swing.JTextField txtTituloVTesis;
    // End of variables declaration//GEN-END:variables
}
