/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.cad.profesor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sv.edu.cad.controller.Catalogo;
import sv.edu.cad.model.Conexion;
import sv.edu.cad.view.busquedaUsuario;

/**
 *
 * @author Wilber
 */
public class Consultar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consultar
     */
    public Consultar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ctitulo = new javax.swing.JCheckBox();
        cautor = new javax.swing.JCheckBox();
        ctema = new javax.swing.JCheckBox();
        cmaterial = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ttitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tautor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ttema = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tmaterial = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setTitle("Busqueda de Libro");

        ctitulo.setText("Titulo");

        cautor.setText("Autor(es)");

        ctema.setText("Tema(s)");

        cmaterial.setText("Material");

        jLabel1.setText("Buscar por:");

        jLabel2.setText("Titulo:");

        jLabel3.setText("Autor(es):");

        jLabel4.setText("Tema(s):");

        jLabel5.setText("Material:");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Tema", "Nombre Autor", "Apellido Autor", "Material", "Disponibilidad"
            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(ctitulo)
                                .addGap(18, 18, 18)
                                .addComponent(cautor)
                                .addGap(18, 18, 18)
                                .addComponent(ctema)
                                .addGap(18, 18, 18)
                                .addComponent(cmaterial))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ttitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(tautor)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ttema, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctitulo)
                    .addComponent(cautor)
                    .addComponent(ctema)
                    .addComponent(cmaterial)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ttema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            int resp = JOptionPane.showConfirmDialog(this, "¿Está seguro?");
            if(resp == JOptionPane.YES_OPTION)
            {
                this.dispose();
            }
        }
        catch(Exception e)
        {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(ctitulo.isSelected() == true && cautor.isSelected() == false && cmaterial.isSelected() == false && ctema.isSelected() ==false)
         {
             if(ttitulo.getText()!= null && (!ttitulo.getText().equals("")))
             {
                 llenar_tabladedatos("titulo = '" + ttitulo.getText() + "'");
             }
             
             else 
             {
                 JOptionPane.showMessageDialog(null,"El campo de busqueda Titulo, no debe estar vacio. ");
             }
         }
         
         else if(ctitulo.isSelected() == false && cautor.isSelected() == true && cmaterial.isSelected() == false && ctema.isSelected() ==false)
         {
             if(tautor.getText()!= null && (!tautor.getText().equals("")))
             {
                 llenar_tabladedatos("autor.Nombre = '" + tautor.getText() + "'");
             }
             
             else 
             {
                 JOptionPane.showMessageDialog(null,"El campo de busqueda Autor, no debe estar vacio. ");
             }
         }
         
         else if(ctitulo.isSelected() == false && cautor.isSelected() == false && cmaterial.isSelected() == true && ctema.isSelected() ==false)
         {
             if(tmaterial.getText()!= null && (!tmaterial.getText().equals(" ")))
             {
                 llenar_tabladedatos("material.NombreMaterial = '" + tmaterial.getText() + "'");
             }
             
             else 
             {
                 JOptionPane.showMessageDialog(null,"El campo de busqueda Material, no debe estar vacio. ");
             }
         }
         
         else if(ctitulo.isSelected() == false && cautor.isSelected() == false && cmaterial.isSelected() == false && ctema.isSelected() ==true)
         {
             if(ttema.getText()!= null && (!ttema.getText().equals(" ")))
             {
                 llenar_tabladedatos("tema.Tema = '" + ttema.getText() + "'");
             }
             
             else 
             {
                 JOptionPane.showMessageDialog(null,"El campo de busqueda Tema, no debe estar vacio. ");
             }
         }
         
         else
         {
             JOptionPane.showMessageDialog(null,"Debes seleccionar al menos una opcion de busqueda.");
         }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    public void llenar_tabladedatos(String condicioncita)
    {
          try{
           Conexion conexion = new Conexion();
            String sql = "Select catalogo.Titulo, tema.Tema, autor.Nombre, autor.Apellido, material.NombreMaterial, estado.Estado " +
                            "From catalogo, tema, material, estado, autor where " + condicioncita;
            tabladatos.removeAll();
            String columna[] = {"Titulo", "Tema", "Nombre Autor", "Apellido Autor", "Material", "Estado"};
            DefaultTableModel tabladatosmod = new DefaultTableModel(null,columna);
            conexion.setRs(sql);
            ResultSet resultadito = conexion.getRs();
            Object datos[] = new Object[6];
            while(resultadito.next()){
               for(int i = 0; i < 6; i++)
               {
                   datos[i] = resultadito.getObject(i + 1);
               }
               tabladatosmod.addRow(datos);
            }
            resultadito.close();
            conexion.cerrarConexion();
            tabladatos.setModel(tabladatosmod);
            
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cautor;
    private javax.swing.JCheckBox cmaterial;
    private javax.swing.JCheckBox ctema;
    private javax.swing.JCheckBox ctitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField tautor;
    private javax.swing.JTextField tmaterial;
    private javax.swing.JTextField ttema;
    private javax.swing.JTextField ttitulo;
    // End of variables declaration//GEN-END:variables
}