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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuEjemplar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        jingresarP = new javax.swing.JMenuItem();
        jRenovar = new javax.swing.JMenuItem();
        jlistarP = new javax.swing.JMenuItem();
        helpMenu1 = new javax.swing.JMenu();
        jdevolver = new javax.swing.JMenuItem();
        jlistarP1 = new javax.swing.JMenuItem();

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
        fileMenu1.setText("Ingreso ");

        jMenuTema.setMnemonic('o');
        jMenuTema.setText("Ingreso Tema");
        jMenuTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTemaActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuTema);

        jMenuAutor.setMnemonic('s');
        jMenuAutor.setText("Ingreso Autor");
        jMenuAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAutorActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuAutor);

        jMenuClas.setText("Ingreso Clasificacion");
        jMenuClas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClasActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuClas);

        jMenuLibro.setText("Ingreso  Libro");
        jMenuLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLibroActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuLibro);

        jMenuItem1.setText("Ingreso Revista");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuItem1);

        jMenuItem3.setText("Ingreso  Tesis");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuItem3);

        jMenuItem5.setText("Ingreso  CD / DVD");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuItem5);

        jMenuEjemplar.setText("Ingreso Ejemplares");
        jMenuEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEjemplarActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuEjemplar);

        fileMenu.add(fileMenu1);

        jMenu2.setText("Consulta");

        jMenuItem6.setText("Libro");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Revista");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Tesis");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("CD /DVD");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        fileMenu.add(jMenu2);

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

        jingresarP.setMnemonic('c');
        jingresarP.setText("Ingresar");
        jingresarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jingresarPActionPerformed(evt);
            }
        });
        helpMenu.add(jingresarP);

        jRenovar.setMnemonic('c');
        jRenovar.setText("Renovar");
        jRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRenovarActionPerformed(evt);
            }
        });
        helpMenu.add(jRenovar);

        jlistarP.setMnemonic('a');
        jlistarP.setText("Listado");
        jlistarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlistarPActionPerformed(evt);
            }
        });
        helpMenu.add(jlistarP);

        menuBar.add(helpMenu);

        helpMenu1.setMnemonic('h');
        helpMenu1.setText("Devolución");

        jdevolver.setMnemonic('c');
        jdevolver.setText("Devolver");
        jdevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdevolverActionPerformed(evt);
            }
        });
        helpMenu1.add(jdevolver);

        jlistarP1.setMnemonic('a');
        jlistarP1.setText("Listado");
        jlistarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlistarP1ActionPerformed(evt);
            }
        });
        helpMenu1.add(jlistarP1);

        menuBar.add(helpMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
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

    private void jMenuEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEjemplarActionPerformed
        try{
            if(ingresoEjemplar.bandera==0)
            {
                ingresoEjemplar ejemplar = new ingresoEjemplar();
                desktopPane.add(ejemplar);
                ejemplar.show();
                ingresoEjemplar.bandera=1;
            }
        }catch(Exception ex)
        {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuEjemplarActionPerformed

    private void jingresarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jingresarPActionPerformed
        // TODO add your handling code here:
        try{
            if(ingresoPrestamo.bandera==0)
            {
                ingresoPrestamo prestamo = new ingresoPrestamo();
                desktopPane.add(prestamo);
                prestamo.show();
                ingresoPrestamo.bandera=1;
            }
        }catch(Exception ex)
        {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jingresarPActionPerformed

    private void jlistarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlistarPActionPerformed
        try{
            if(listadoPrestamo.bandera==0)
            {
                listadoPrestamo listado = new listadoPrestamo();
                desktopPane.add(listado);
                listado.show();
                listadoPrestamo.bandera=1;
            }
        }catch(Exception ex)
        {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jlistarPActionPerformed

    private void jdevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdevolverActionPerformed
        // TODO add your handling code here:
        try{
            if(ingresoDevolucion.bandera==0)
            {
                ingresoDevolucion devolucion = new ingresoDevolucion();
                desktopPane.add(devolucion);
                devolucion.show();
                ingresoDevolucion.bandera=1;
            }
        }catch(Exception ex)
        {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jdevolverActionPerformed

    private void jlistarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlistarP1ActionPerformed
        // TODO add your handling code here:
        try{
            if(listadoDevolucion.bandera==0)
            {
                listadoDevolucion listado = new listadoDevolucion();
                desktopPane.add(listado);
                listado.show();
                listadoDevolucion.bandera=1;
            }
        }catch(Exception ex)
        {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jlistarP1ActionPerformed

    private void jRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRenovarActionPerformed
        // TODO add your handling code here:
        try{
            if(ingresarRenovacion.bandera==0)
            {
                ingresarRenovacion listado = new ingresarRenovacion();
                desktopPane.add(listado);
                listado.show();
                ingresarRenovacion.bandera=1;
            }
        }catch(Exception ex)
        {
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jRenovarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try{
            if(ingresoRevista.bandera==0){
                ingresoRevista libro = new ingresoRevista();
                desktopPane.add(libro);
                libro.show();
                ingresoRevista.bandera=1;
            }
        }catch(Exception ex){   
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         try{
            if(ingresoTesis.bandera==0){
                ingresoTesis libro = new ingresoTesis();
                desktopPane.add(libro);
                libro.show();
                ingresoTesis.bandera=1;
            }
        }catch(Exception ex){   
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         try{
            if(ingresoCDDVD.bandera==0){
                ingresoCDDVD libro = new ingresoCDDVD();
                desktopPane.add(libro);
                libro.show();
                ingresoCDDVD.bandera=1;
            }
        }catch(Exception ex){   
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        try{
            if(busquedaLibro.bandera==0){
                busquedaLibro libro = new busquedaLibro();
                desktopPane.add(libro);
                libro.show();
                busquedaLibro.bandera=1;
            }
        }catch(Exception ex){   
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        try{
            if(busquedaRevista.bandera==0){
                busquedaRevista libro = new busquedaRevista();
                desktopPane.add(libro);
                libro.show();
                busquedaRevista.bandera=1;
            }
        }catch(Exception ex){   
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        try{
            if(busquedaTesis.bandera==0){
                busquedaTesis libro = new busquedaTesis();
                desktopPane.add(libro);
                libro.show();
                busquedaTesis.bandera=1;
            }
        }catch(Exception ex){   
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        try{
            if(busquedaCDDVD.bandera==0){
                busquedaCDDVD libro = new busquedaCDDVD();
                desktopPane.add(libro);
                libro.show();
                busquedaCDDVD.bandera=1;
            }
        }catch(Exception ex){   
            Logger.getLogger(PrincipalAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed


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
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu fileMenu1;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu helpMenu1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAutor;
    private javax.swing.JMenuItem jMenuClas;
    private javax.swing.JMenuItem jMenuEjemplar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuLibro;
    private javax.swing.JMenuItem jMenuTema;
    private javax.swing.JMenuItem jRenovar;
    private javax.swing.JMenuItem jdevolver;
    private javax.swing.JMenuItem jingresarP;
    private javax.swing.JMenuItem jlistarP;
    private javax.swing.JMenuItem jlistarP1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
