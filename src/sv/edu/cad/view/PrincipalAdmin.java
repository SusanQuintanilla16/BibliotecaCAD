package sv.edu.cad.view;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrincipalAdmin extends javax.swing.JFrame 
{

    public PrincipalAdmin() 
    {
        initComponents();
        setExtendedState(PrincipalAdmin.MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        fileMenu1 = new javax.swing.JMenu();
        jMenuTema = new javax.swing.JMenuItem();
        jMenuAutor = new javax.swing.JMenuItem();
        jMenuClas = new javax.swing.JMenuItem();
        jMenuLibro = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setBackground(new java.awt.Color(102, 153, 255));
        menuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuBar.setForeground(new java.awt.Color(102, 153, 255));
        menuBar.setAutoscrolls(true);

        jMenu1.setText("Principal");

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuBar.add(jMenu1);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Catálogo");

        fileMenu1.setMnemonic('f');
        fileMenu1.setText("Ingreso");

        jMenuTema.setMnemonic('o');
        jMenuTema.setText("Tema");
        jMenuTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTemaActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuTema);

        jMenuAutor.setMnemonic('s');
        jMenuAutor.setText("Autor");
        jMenuAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAutorActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuAutor);

        jMenuClas.setText("Clasificacion");
        jMenuClas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClasActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuClas);

        jMenuLibro.setText("Libro");
        jMenuLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLibroActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuLibro);

        fileMenu.add(fileMenu1);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Consulta");
        fileMenu.add(saveMenuItem);

        jMenuItem4.setText("Listado");
        fileMenu.add(jMenuItem4);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Usuarios");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Ingreso");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Consulta");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Prestamos");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Consulta");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Listado");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTemaActionPerformed
        try{
            if(ingresoTema.bandera==0){
                ingresoTema tema = new ingresoTema();
                desktopPane.add(tema);
                tema.show();
                ingresoTema.bandera=1;
            }
        }catch(Exception ex){
            
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuTemaActionPerformed

    private void jMenuAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAutorActionPerformed
            try{
            if(ingresoAutor.bandera==0){
                ingresoAutor autor = new ingresoAutor();
                desktopPane.add(autor);
                autor.show();
                ingresoAutor.bandera=1;
            }
        }catch(Exception ex){
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuAutorActionPerformed

    private void jMenuClasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClasActionPerformed
         try{
            if(ingresoClasificacion.bandera==0){
                ingresoClasificacion clasificacion = new ingresoClasificacion();
                desktopPane.add(clasificacion);
                clasificacion.show();
                ingresoClasificacion.bandera=1;
            }
        }catch(Exception ex){   
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuClasActionPerformed

    private void jMenuLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLibroActionPerformed
        try{
            if(ingresoLibro.bandera==0){
                ingresoLibro libro = new ingresoLibro();
                desktopPane.add(libro);
                libro.show();
                ingresoLibro.bandera=1;
            }
        }catch(Exception ex){   
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuLibroActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        
         try{
            if(ingresoUsuario.bandera==0){
                ingresoUsuario usuario = new ingresoUsuario();
                desktopPane.add(usuario);
                usuario.show();
                ingresoUsuario.bandera=1;
            }
        }catch(Exception ex){
            
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        
        try{
            if(busquedaUsuario.bandera==0)
            {
                busquedaUsuario usuario = new busquedaUsuario();
                desktopPane.add(usuario);
                usuario.show();
                busquedaUsuario.bandera=1;
            }
        }catch(Exception ex)
        {
            
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_copyMenuItemActionPerformed


    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new PrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu fileMenu1;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuAutor;
    private javax.swing.JMenuItem jMenuClas;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuLibro;
    private javax.swing.JMenuItem jMenuTema;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
