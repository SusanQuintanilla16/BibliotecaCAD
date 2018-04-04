
package sv.edu.cad.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sv.edu.cad.controller.Catalogo;
import sv.edu.cad.controller.Procesos;
import sv.edu.cad.model.Conexion;
import static sv.edu.cad.view.busquedaUsuario.bandera;

public class busquedaLibro extends javax.swing.JInternalFrame 
{
    DefaultTableModel modelo1 = null;
    static int bandera = 0; 
    ResultSet resultado = null;
    ResultSet libro1;
    ResultSet libro2;
    ResultSet llenarcombo;
    Conexion conexion = new Conexion();
    
    public busquedaLibro() throws SQLException
    {
        initComponents();
        bandera = 1;
        Object [][] data = null;
        String [] columns = {"ID","Titulo","Edicion","Descripcion"};
        modelo1 = new DefaultTableModel(data,columns);
        this.TablaLibrosM.setModel(modelo1);
        conexion.setRs("select idCatalogo, Titulo, Edicion, Descripcion from catalogo where idMaterial = 1 ");
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPatronLibroM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLibrosM = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtTituloLibroM = new javax.swing.JTextField();
        txtEdicionLibroM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResumenLibroM = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNotasLibroM = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtISBNLibroM = new javax.swing.JTextField();
        txtEditorialLibroM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionLibroM = new javax.swing.JTextArea();
        btnModificarLibroM = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCancelarLibroM = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDLibroM = new javax.swing.JTextField();
        btnBuscarLibroM = new javax.swing.JButton();

        setTitle("Consulta Libro");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Ingresar patrón de busqueda de libro: ");

        txtPatronLibroM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatronLibroMActionPerformed(evt);
            }
        });
        txtPatronLibroM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatronLibroMKeyPressed(evt);
            }
        });

        TablaLibrosM.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaLibrosM);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setText("Edición:");

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setText("Notas:");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setText("Resumen:");

        txtResumenLibroM.setColumns(20);
        txtResumenLibroM.setRows(5);
        jScrollPane3.setViewportView(txtResumenLibroM);

        txtNotasLibroM.setColumns(20);
        txtNotasLibroM.setRows(5);
        jScrollPane4.setViewportView(txtNotasLibroM);

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17.setText("Titulo:");

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel18.setText("ISBN:");

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel19.setText("Editorial:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("Descripcion:");

        txtDescripcionLibroM.setColumns(20);
        txtDescripcionLibroM.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionLibroM);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(96, 96, 96)
                            .addComponent(txtTituloLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(83, 83, 83)
                            .addComponent(txtEdicionLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEditorialLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtISBNLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTituloLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtEdicionLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtISBNLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtEditorialLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnModificarLibroM.setBackground(new java.awt.Color(0, 255, 204));
        btnModificarLibroM.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnModificarLibroM.setText("Modificar");
        btnModificarLibroM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLibroMActionPerformed(evt);
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
                .addComponent(btnModificarLibroM)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnModificarLibroM)
                .addGap(21, 21, 21))
        );

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("Datos Libro");

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
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnCancelarLibroM.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarLibroM.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCancelarLibroM.setText("Cancelar");
        btnCancelarLibroM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarLibroMActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));

        jLabel11.setBackground(new java.awt.Color(102, 153, 255));
        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("Actualizar Datos Libro");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("ID:");

        btnBuscarLibroM.setBackground(new java.awt.Color(51, 255, 204));
        btnBuscarLibroM.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnBuscarLibroM.setText("Buscar");
        btnBuscarLibroM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroMActionPerformed(evt);
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
                .addComponent(txtIDLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnBuscarLibroM)
                .addGap(74, 74, 74))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnBuscarLibroM))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatronLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelarLibroM))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPatronLibroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCancelarLibroM)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatronLibroMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatronLibroMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatronLibroMActionPerformed

    private void txtPatronLibroMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatronLibroMKeyPressed

        while(modelo1.getRowCount()!=0)
        {
            modelo1.removeRow(0);
        }
        conexion.setRs("select idCatalogo, Titulo, Edicion, Descripcion from catalogo where concat(Titulo,' ',Edicion) "
            + "like '%" + this.txtPatronLibroM.getText() + "%'");

        try
        {
            generarListado();

        }
        catch(SQLException ex)
        {
            Logger.getLogger(busquedaLibro.class.getName()).log(Level.SEVERE,null,ex);
        }

    }//GEN-LAST:event_txtPatronLibroMKeyPressed

    private void btnModificarLibroMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLibroMActionPerformed
        
       
        txtDescripcionLibroM.setEditable(true);
        txtTituloLibroM.setEditable(true);
        txtEdicionLibroM.setEditable(true);
       // txtAdquisicionLibroM.setEditable(true);
       // txtPublicacionLibroM.setEditable(true);
        txtNotasLibroM.setEditable(true);
        txtResumenLibroM.setEditable(true);
        txtISBNLibroM.setEditable(true);
        txtEditorialLibroM.setEditable(true);
        

        String ID = txtIDLibroM.getText();
        String descripcion = txtDescripcionLibroM.getText();
        String titulo = txtTituloLibroM.getText();
        String edicion = txtEdicionLibroM.getText();
       // String adquisicion = txtAdquisicionLibroM.getText();
       // String publicacion = txtPublicacionLibroM.getText();
        String notas = txtNotasLibroM.getText();
        String resumen = txtResumenLibroM.getText();
        String ISBN = txtISBNLibroM.getText();
        String editorial = txtEditorialLibroM.getText();   
        
        

        
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
                    if(btnModificarLibroM.getText().equals("Modificar"))
                    {
                        btnModificarLibroM.setText("Guardar");
                    }
                    else
                    {
                        Catalogo librom = new Catalogo();
                        librom.EditarInfoLibro(ID,descripcion,titulo,edicion,notas,resumen,ISBN,editorial);

                        btnModificarLibroM.setText("Modificar");
                        
                        txtDescripcionLibroM.setEditable(false);
                        txtTituloLibroM.setEditable(false);
                        txtEdicionLibroM.setEditable(false);
                        //txtAdquisicionLibroM.setEditable(false);
                        //txtPublicacionLibroM.setEditable(false);
                        txtNotasLibroM.setEditable(false);
                        txtResumenLibroM.setEditable(false);
                        txtISBNLibroM.setEditable(false);
                        txtEditorialLibroM.setEditable(false);
                        limpiarValores();
                    }
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(this, "Ocurrio error en Modificar");
                }

            
        //}
    }//GEN-LAST:event_btnModificarLibroMActionPerformed

    private void limpiarValores()
    {
     txtIDLibroM.setText("");
     txtDescripcionLibroM.setText("");
     txtTituloLibroM.setText("");
     txtEdicionLibroM.setText("");
    // txtAdquisicionLibroM.setText("");
     //txtPublicacionLibroM.setText("");
     txtNotasLibroM.setText("");
     txtResumenLibroM.setText("");
     txtISBNLibroM.setText("");
     txtEditorialLibroM.setText("");
     
    }
    
    private void btnBuscarLibroMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroMActionPerformed

                        txtDescripcionLibroM.setEditable(false);
                        txtTituloLibroM.setEditable(false);
                        txtEdicionLibroM.setEditable(false);
                        
                        txtNotasLibroM.setEditable(false);
                        txtResumenLibroM.setEditable(false);
                        txtISBNLibroM.setEditable(false);
                        txtEditorialLibroM.setEditable(false);
        try
        {
            Conexion con = new Conexion(); //creacion del objeto
            int id = Integer.parseInt(txtIDLibroM.getText());

            con.setRs("select Descripcion, Titulo, Edicion,  Notas, Resumen  from catalogo where idCatalogo= "+ id );
            libro1=(ResultSet) con.getRs();
            libro1.next();//movemos al primer registro

            Conexion con2 = new Conexion();
            con2.setRs("select ISBN, Publisher from libro where idCatalogo= "+ id );
            libro2=(ResultSet) con2.getRs();
            libro2.next();//movemos al primer registro
            
            llenarTxtbox();
            con2.cerrarConexion();
            con.cerrarConexion();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(busquedaLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarLibroMActionPerformed

    private void llenarTxtbox() throws SQLException
    { 
     txtDescripcionLibroM.setText(libro1.getString(1));
     txtTituloLibroM.setText(libro1.getString(2));
     txtEdicionLibroM.setText(libro1.getString(3));     
     txtNotasLibroM.setText(libro1.getString(4));
     txtResumenLibroM.setText(libro1.getString(5));   
     txtISBNLibroM.setText(libro2.getString(1)); 
     txtEditorialLibroM.setText(libro2.getString(2));
       
    }
    
    private void btnCancelarLibroMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarLibroMActionPerformed

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
            Logger.getLogger(busquedaLibro.class.getName()).log(Level.SEVERE,null,e);
        }

    }//GEN-LAST:event_btnCancelarLibroMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaLibrosM;
    private javax.swing.JButton btnBuscarLibroM;
    private javax.swing.JButton btnCancelarLibroM;
    private javax.swing.JButton btnModificarLibroM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextArea txtDescripcionLibroM;
    private javax.swing.JTextField txtEdicionLibroM;
    private javax.swing.JTextField txtEditorialLibroM;
    private javax.swing.JTextField txtIDLibroM;
    private javax.swing.JTextField txtISBNLibroM;
    private javax.swing.JTextArea txtNotasLibroM;
    private javax.swing.JTextField txtPatronLibroM;
    private javax.swing.JTextArea txtResumenLibroM;
    private javax.swing.JTextField txtTituloLibroM;
    // End of variables declaration//GEN-END:variables
}
