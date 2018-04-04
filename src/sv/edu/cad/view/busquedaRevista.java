
package sv.edu.cad.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sv.edu.cad.controller.Catalogo;
import sv.edu.cad.model.Conexion;
import static sv.edu.cad.view.busquedaLibro.bandera;


public class busquedaRevista extends javax.swing.JInternalFrame 
{
    DefaultTableModel modelo1 = null;
    static int bandera = 0; 
    ResultSet resultado = null;
    ResultSet revista1;
    ResultSet revista2;
    ResultSet llenarcombo;
    Conexion conexion = new Conexion();

   
    public busquedaRevista()  throws SQLException
    {
        initComponents();
        bandera = 1;
        Object [][] data = null;
        String [] columns = {"ID","Titulo","Edicion","Descripcion"};
        modelo1 = new DefaultTableModel(data,columns);
        this.TablaRevistaM.setModel(modelo1);
        conexion.setRs("select idCatalogo, Titulo, Edicion, Descripcion from catalogo where idMaterial = 3 ");
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
        txtPatronRevistaM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRevistaM = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtTituloRevistaM = new javax.swing.JTextField();
        txtEdicionRevistaM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResumenRevistaM = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNotasRevistaM = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtISSNRevistaM = new javax.swing.JTextField();
        txtEjemplarRevistaM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTituloVRevistaM = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtContenidoRevistaM = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionRevistaM = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        txtFrecuenciaRevistaM = new javax.swing.JTextField();
        btnModificarRevistaM = new javax.swing.JButton();
        btnCancelarRevistaM = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDRevistaM = new javax.swing.JTextField();
        btnBuscarRevistaM = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Busqueda Revista");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Ingresar patrón de busqueda de revista: ");

        txtPatronRevistaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatronRevistaMActionPerformed(evt);
            }
        });
        txtPatronRevistaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatronRevistaMKeyPressed(evt);
            }
        });

        TablaRevistaM.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaRevistaM);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setText("Edición:");

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setText("Notas:");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setText("Resumen:");

        txtResumenRevistaM.setColumns(20);
        txtResumenRevistaM.setRows(5);
        jScrollPane3.setViewportView(txtResumenRevistaM);

        txtNotasRevistaM.setColumns(20);
        txtNotasRevistaM.setRows(5);
        jScrollPane4.setViewportView(txtNotasRevistaM);

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17.setText("Titulo:");

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel18.setText("ISSN:");

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel19.setText("Ejemplar:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("Descripcion:");

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel20.setText("Variante titulo:");

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel21.setText("Contenido:");

        txtContenidoRevistaM.setColumns(20);
        txtContenidoRevistaM.setRows(5);
        jScrollPane5.setViewportView(txtContenidoRevistaM);

        txtDescripcionRevistaM.setColumns(20);
        txtDescripcionRevistaM.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionRevistaM);

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel22.setText("Frecuencia:");

        btnModificarRevistaM.setBackground(new java.awt.Color(0, 255, 204));
        btnModificarRevistaM.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnModificarRevistaM.setText("Modificar");
        btnModificarRevistaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRevistaMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnModificarRevistaM)
                .addGap(21, 21, 21))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTituloRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTituloVRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEjemplarRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtISSNRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel22)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFrecuenciaRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(186, 186, 186)
                                .addComponent(txtEdicionRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTituloRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel20)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTituloVRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEdicionRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtISSNRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(txtFrecuenciaRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtEjemplarRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnModificarRevistaM)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCancelarRevistaM.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarRevistaM.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCancelarRevistaM.setText("Cancelar");
        btnCancelarRevistaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRevistaMActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));

        jLabel11.setBackground(new java.awt.Color(102, 153, 255));
        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("Actualizar Datos Revista");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("ID:");

        btnBuscarRevistaM.setBackground(new java.awt.Color(51, 255, 204));
        btnBuscarRevistaM.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnBuscarRevistaM.setText("Buscar");
        btnBuscarRevistaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRevistaMActionPerformed(evt);
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
                .addComponent(txtIDRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnBuscarRevistaM)
                .addGap(74, 74, 74))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnBuscarRevistaM))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("Datos Revista");

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
                        .addComponent(txtPatronRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelarRevistaM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPatronRevistaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarRevistaM, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtPatronRevistaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatronRevistaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatronRevistaMActionPerformed

    private void txtPatronRevistaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatronRevistaMKeyPressed

        while(modelo1.getRowCount()!=0)
        {
            modelo1.removeRow(0);
        }
        conexion.setRs("select idCatalogo, Titulo, Edicion, Descripcion from catalogo where concat(Titulo,' ',Edicion) "
            + "like '%" + this.txtPatronRevistaM.getText() + "%'");

        try
        {
            generarListado();

        }
        catch(SQLException ex)
        {
            Logger.getLogger(busquedaRevista.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_txtPatronRevistaMKeyPressed

    private void btnModificarRevistaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRevistaMActionPerformed

        
        txtTituloRevistaM.setEditable(true);
        txtTituloVRevistaM.setEditable(true);
        txtEdicionRevistaM.setEditable(true);        
        // txtAdquisicionLibroM.setEditable(true);
        // txtPublicacionLibroM.setEditable(true);
        txtNotasRevistaM.setEditable(true);
        txtResumenRevistaM.setEditable(true);
        txtISSNRevistaM.setEditable(true);
        txtFrecuenciaRevistaM.setEditable(true);
        txtEjemplarRevistaM.setEditable(true);
        txtContenidoRevistaM.setEditable(true);
        txtDescripcionRevistaM.setEditable(true);

        String ID = txtIDRevistaM.getText();        
        String titulo = txtTituloRevistaM.getText();
        String v_titulo = txtTituloVRevistaM.getText();
        String edicion = txtEdicionRevistaM.getText();        
        // String adquisicion = txtAdquisicionLibroM.getText();
        // String publicacion = txtPublicacionLibroM.getText();
        String notas = txtNotasRevistaM.getText();
        String resumen = txtResumenRevistaM.getText();
        String ISSN = txtISSNRevistaM.getText();
        String frecuencia = txtFrecuenciaRevistaM.getText();
        String ejemplar = txtEjemplarRevistaM.getText();
        String contenido = txtContenidoRevistaM.getText();
        String descripcion = txtDescripcionRevistaM.getText();

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
                if(btnModificarRevistaM.getText().equals("Modificar"))
                {
                    btnModificarRevistaM.setText("Guardar");
                }
                else
                {
                    Catalogo revistam = new Catalogo();
                    revistam.EditarInfoRevista(ID,titulo, v_titulo,edicion, notas,resumen,ISSN,frecuencia,ejemplar,contenido,descripcion);

                    btnModificarRevistaM.setText("Modificar");

                    txtTituloRevistaM.setEditable(false);
                    txtTituloVRevistaM.setEditable(false);
                    txtEdicionRevistaM.setEditable(false);        
                    txtNotasRevistaM.setEditable(false);
                    txtResumenRevistaM.setEditable(false);
                    txtISSNRevistaM.setEditable(false);
                    txtFrecuenciaRevistaM.setEditable(false);
                    txtEjemplarRevistaM.setEditable(false);
                    txtContenidoRevistaM.setEditable(false);
                    txtDescripcionRevistaM.setEditable(false);
                    limpiarValores();
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, "Ocurrio error en Modificar");
            }

            //}
    }//GEN-LAST:event_btnModificarRevistaMActionPerformed

     private void limpiarValores()
    {
     txtTituloRevistaM.setText("");
     txtTituloVRevistaM.setText("");
     txtEdicionRevistaM.setText("");
     txtNotasRevistaM.setText("");
     txtResumenRevistaM.setText("");
     txtISSNRevistaM.setText("");
     txtFrecuenciaRevistaM.setText("");
     txtEjemplarRevistaM.setText("");
     txtContenidoRevistaM.setText("");
     txtDescripcionRevistaM.setText("");
     
    }
    
    private void btnCancelarRevistaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRevistaMActionPerformed

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
    }//GEN-LAST:event_btnCancelarRevistaMActionPerformed

    private void btnBuscarRevistaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRevistaMActionPerformed

                    txtTituloRevistaM.setEditable(false);
                    txtTituloVRevistaM.setEditable(false);
                    txtEdicionRevistaM.setEditable(false);        
                    txtNotasRevistaM.setEditable(false);
                    txtResumenRevistaM.setEditable(false);
                    txtISSNRevistaM.setEditable(false);
                    txtFrecuenciaRevistaM.setEditable(false);
                    txtEjemplarRevistaM.setEditable(false);
                    txtContenidoRevistaM.setEditable(false);
                    txtDescripcionRevistaM.setEditable(false);
        try
        {
            Conexion con = new Conexion(); //creacion del objeto
            int id = Integer.parseInt(txtIDRevistaM.getText());

            con.setRs("select Titulo, Edicion, Descripcion,  Notas, Resumen  from catalogo where idCatalogo= "+ id );
            revista1=(ResultSet) con.getRs();
            revista1.next();//movemos al primer registro

            Conexion con2 = new Conexion();
            con2.setRs("select VarianteTitulo, Ejemplar, Contenido, Frecuencia, ISSN from revista where idCatalogo= "+ id );
            revista2=(ResultSet) con2.getRs();
            revista2.next();//movemos al primer registro

            llenarTxtbox();
            con2.cerrarConexion();
            con.cerrarConexion();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(busquedaRevista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarRevistaMActionPerformed

     private void llenarTxtbox() throws SQLException
    { 
     txtTituloRevistaM.setText(revista1.getString(1));
     txtEdicionRevistaM.setText(revista1.getString(2));
     txtDescripcionRevistaM.setText(revista1.getString(3));     
     txtNotasRevistaM.setText(revista1.getString(4));
     txtResumenRevistaM.setText(revista1.getString(5));   
     txtTituloVRevistaM.setText(revista2.getString(1)); 
     txtEjemplarRevistaM.setText(revista2.getString(2));
     txtContenidoRevistaM.setText(revista2.getString(3));
     txtFrecuenciaRevistaM.setText(revista2.getString(4));
     txtISSNRevistaM.setText(revista2.getString(5));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaRevistaM;
    private javax.swing.JButton btnBuscarRevistaM;
    private javax.swing.JButton btnCancelarRevistaM;
    private javax.swing.JButton btnModificarRevistaM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txtContenidoRevistaM;
    private javax.swing.JTextArea txtDescripcionRevistaM;
    private javax.swing.JTextField txtEdicionRevistaM;
    private javax.swing.JTextField txtEjemplarRevistaM;
    private javax.swing.JTextField txtFrecuenciaRevistaM;
    private javax.swing.JTextField txtIDRevistaM;
    private javax.swing.JTextField txtISSNRevistaM;
    private javax.swing.JTextArea txtNotasRevistaM;
    private javax.swing.JTextField txtPatronRevistaM;
    private javax.swing.JTextArea txtResumenRevistaM;
    private javax.swing.JTextField txtTituloRevistaM;
    private javax.swing.JTextField txtTituloVRevistaM;
    // End of variables declaration//GEN-END:variables
}
