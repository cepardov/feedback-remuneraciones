package GUIRecursosHumanos;
import Login.Login;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu extends javax.swing.JFrame {
    sistema sis=new sistema();
    Login l=new Login();
    String usuario,clave;
    String a=null;
    String rutid=null;
    String nom=null;
    String pat=null;
    String mat=null;
    String dir=null;
    String tel=null;
  
    public Menu() {
        initComponents();
    }
 
   public Menu(int valor, String tipo, String id, String nombre, String paterno, String materno, String direccion, String telefono) {
        initComponents();
        a = "("+tipo+"): ["+id+"] "+nombre+" "+paterno+" "+materno;
        rutid = id;
        nom = nombre;
        pat = paterno;
        mat = materno;
        dir = direccion;
        tel = telefono;
        this.txtapp.setText(sis.getAppName()+" V"+sis.getAppVersion());
        this.btnuser.setText(nombre+" "+paterno);
         if(valor==1){
             this.btnclave.setEnabled(true);
             this.btnagregarusuario.setEnabled(true);
             this.btnlistausuario.setEnabled(true);
             this.btnsucesos.setEnabled(true);
             this.btnaddliquidacion.setEnabled(true);
         }
         else if(valor==2){
             this.btnuser.setText(nombre+" "+paterno);
         }
         else if(valor==3){
             this.btnuser.setText(nombre+" "+paterno);
         }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p = new javax.swing.JDesktopPane();
        txtapp = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnuser = new javax.swing.JMenu();
        btnclave = new javax.swing.JMenuItem();
        btneditdatos = new javax.swing.JMenuItem();
        btnadministrativo = new javax.swing.JMenu();
        btnagregarusuario = new javax.swing.JMenuItem();
        btnlistausuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btncerrarsesion = new javax.swing.JMenuItem();
        btnsalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        btnaddcontrato = new javax.swing.JMenuItem();
        btnaddfiniquito = new javax.swing.JMenuItem();
        btnaddliquidacion = new javax.swing.JMenuItem();
        btnmantenedores = new javax.swing.JMenu();
        btndelcontrato = new javax.swing.JMenuItem();
        btndelfiniquito = new javax.swing.JMenuItem();
        btndelliquidacion = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnverLiquidacion = new javax.swing.JMenuItem();
        btnverContrato = new javax.swing.JMenuItem();
        btnverFiniquito = new javax.swing.JMenuItem();
        btnverEmpleados = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        btngraficos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        actualizarprevision = new javax.swing.JMenuItem();
        actualizasalud = new javax.swing.JMenuItem();
        actualizarparametros = new javax.swing.JMenuItem();
        actualizarasignacion = new javax.swing.JMenuItem();
        btnayuda = new javax.swing.JMenu();
        btnsucesos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnacerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        p.setBackground(new java.awt.Color(161, 161, 161));

        txtapp.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtapp.setForeground(new java.awt.Color(254, 254, 254));
        txtapp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtapp.setText("Aplicación");
        txtapp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtapp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtapp.setBounds(320, 400, 680, 180);
        p.add(txtapp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnuser.setText("Usuario");

        btnclave.setText("Cambiar Clave");
        btnclave.setEnabled(false);
        btnclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclaveActionPerformed(evt);
            }
        });
        btnuser.add(btnclave);

        btneditdatos.setText("Editar datos");
        btneditdatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditdatosActionPerformed(evt);
            }
        });
        btnuser.add(btneditdatos);

        btnadministrativo.setText("Administrativo");

        btnagregarusuario.setText("Agregar Usuario");
        btnagregarusuario.setEnabled(false);
        btnagregarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarusuarioActionPerformed(evt);
            }
        });
        btnadministrativo.add(btnagregarusuario);

        btnlistausuario.setText("Mantenedor de Usuarios");
        btnlistausuario.setEnabled(false);
        btnlistausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistausuarioActionPerformed(evt);
            }
        });
        btnadministrativo.add(btnlistausuario);

        btnuser.add(btnadministrativo);
        btnuser.add(jSeparator2);

        btncerrarsesion.setText("Cerrar Sesión");
        btncerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsesionActionPerformed(evt);
            }
        });
        btnuser.add(btncerrarsesion);

        btnsalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        btnuser.add(btnsalir);

        jMenuBar1.add(btnuser);

        jMenu2.setText("Remuneraciones");

        jMenu5.setText("Nuevo");

        btnaddcontrato.setText("Contrato");
        btnaddcontrato.setEnabled(false);
        jMenu5.add(btnaddcontrato);

        btnaddfiniquito.setText("Finiquito");
        btnaddfiniquito.setEnabled(false);
        jMenu5.add(btnaddfiniquito);

        btnaddliquidacion.setText("Liquidacón");
        btnaddliquidacion.setEnabled(false);
        btnaddliquidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddliquidacionActionPerformed(evt);
            }
        });
        jMenu5.add(btnaddliquidacion);

        jMenu2.add(jMenu5);

        btnmantenedores.setText("Mantenedor");

        btndelcontrato.setText("Contrato");
        btndelcontrato.setEnabled(false);
        btnmantenedores.add(btndelcontrato);

        btndelfiniquito.setText("Finiquito");
        btndelfiniquito.setEnabled(false);
        btnmantenedores.add(btndelfiniquito);

        btndelliquidacion.setText("Liquidación");
        btndelliquidacion.setEnabled(false);
        btnmantenedores.add(btndelliquidacion);

        jMenu2.add(btnmantenedores);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Crear");

        jMenuItem1.setText("Crear Trabajador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Ver Contrato");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Ver");

        btnverLiquidacion.setText("Liquidación");
        btnverLiquidacion.setEnabled(false);
        jMenu3.add(btnverLiquidacion);

        btnverContrato.setText("Contrato");
        btnverContrato.setEnabled(false);
        btnverContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverContratoActionPerformed(evt);
            }
        });
        jMenu3.add(btnverContrato);

        btnverFiniquito.setText("Finiquito");
        btnverFiniquito.setEnabled(false);
        jMenu3.add(btnverFiniquito);

        btnverEmpleados.setText("Lista Empleados");
        btnverEmpleados.setEnabled(false);
        jMenu3.add(btnverEmpleados);

        jMenu6.setText("Otros");

        btngraficos.setText("Graficos");
        btngraficos.setEnabled(false);
        jMenu6.add(btngraficos);

        jMenu3.add(jMenu6);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Actualizar datos");

        actualizarprevision.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        actualizarprevision.setText("Actualizar datos Prevision");
        actualizarprevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarprevisionActionPerformed(evt);
            }
        });
        jMenu1.add(actualizarprevision);

        actualizasalud.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        actualizasalud.setText("Actualizar datos Salud");
        actualizasalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizasaludActionPerformed(evt);
            }
        });
        jMenu1.add(actualizasalud);

        actualizarparametros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        actualizarparametros.setText("Actualizar datos Parametros");
        actualizarparametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarparametrosActionPerformed(evt);
            }
        });
        jMenu1.add(actualizarparametros);

        actualizarasignacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        actualizarasignacion.setText("Actualizar Asignacion");
        actualizarasignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarasignacionActionPerformed(evt);
            }
        });
        jMenu1.add(actualizarasignacion);

        jMenuBar1.add(jMenu1);

        btnayuda.setText("Ayuda");
        btnayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnayudaMouseClicked(evt);
            }
        });
        btnayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnayudaActionPerformed(evt);
            }
        });

        btnsucesos.setText("Ver Log de sistema");
        btnsucesos.setEnabled(false);
        btnsucesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsucesosActionPerformed(evt);
            }
        });
        btnayuda.add(btnsucesos);
        btnayuda.add(jSeparator1);

        btnacerca.setText("Acerca de..");
        btnacerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacercaActionPerformed(evt);
            }
        });
        btnayuda.add(btnacerca);

        jMenuBar1.add(btnayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsesionActionPerformed
        try {
            // TODO add your handling code here:
            l.ad("Cierre de sesión: "+a);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncerrarsesionActionPerformed

    private void btnclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclaveActionPerformed
        // TODO add your handling code here:
        editarclave ec=new editarclave(rutid);
        p.add(ec);
        ec.show();
    }//GEN-LAST:event_btnclaveActionPerformed

    private void btnagregarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarusuarioActionPerformed
        // TODO add your handling code here:
        adduser u=new adduser();
        p.add(u);
        u.show();
    }//GEN-LAST:event_btnagregarusuarioActionPerformed

    private void btnlistausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistausuarioActionPerformed
        // TODO add your handling code here:
        usuariosistema us=new usuariosistema();
        p.add(us);
        us.show();
    }//GEN-LAST:event_btnlistausuarioActionPerformed

    private void btnayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnayudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnayudaActionPerformed

    private void btnayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnayudaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnayudaMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        try {
            // TODO add your handling code here:
            l.ad("Cierre de sesión [Salir]: "+a);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnacercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacercaActionPerformed
        // TODO add your handling code here:
        aboutbox ab=new aboutbox();
        ab.setTitle("Acerca de "+sis.getAppName()+" "+sis.getAppVersion());
        ab.setLocationRelativeTo(null);
        ab.setVisible(true);
    }//GEN-LAST:event_btnacercaActionPerformed

    private void btnsucesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsucesosActionPerformed
        // TODO add your handling code here:
        logsis ls=new logsis();
        ls.setTitle("Log de sistema");
        p.add(ls);
        ls.show();
    }//GEN-LAST:event_btnsucesosActionPerformed


    private void actualizasaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizasaludActionPerformed
        IngresoSalud is=new IngresoSalud();
        p.add(is);
        is.show();
    }//GEN-LAST:event_actualizasaludActionPerformed

    private void actualizarprevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarprevisionActionPerformed
        IngresoPrevision ip=new IngresoPrevision();
        p.add(ip);
        ip.show();
    }//GEN-LAST:event_actualizarprevisionActionPerformed

    private void actualizarparametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarparametrosActionPerformed
        IngresoParametro ipa=new IngresoParametro();
        p.add(ipa);
        ipa.show();
    }//GEN-LAST:event_actualizarparametrosActionPerformed

    private void actualizarasignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarasignacionActionPerformed
        Edicionasignacion ed=new Edicionasignacion();
        p.add(ed);
        ed.show();
    }//GEN-LAST:event_actualizarasignacionActionPerformed


    private void btneditdatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditdatosActionPerformed
        // TODO add your handling code here:
        editardato ed=new editardato(rutid, nom, pat, mat, dir, tel);
        ed.setTitle("Editar Información Personal");
        p.add(ed);
        ed.show();
    }//GEN-LAST:event_btneditdatosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        IngresoTrabajadores it=new IngresoTrabajadores();
        p.add(it);
        it.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnverContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverContratoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btnverContratoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VistaContrato vc=new VistaContrato();
        vc.setTitle("Vista Contratos");
        vc.setLocationRelativeTo(null);
        vc.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnaddliquidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddliquidacionActionPerformed
        Liquidacion li=new Liquidacion();
        p.add(li);
        li.show();
    }//GEN-LAST:event_btnaddliquidacionActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            
            
            
            
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                
             
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarasignacion;
    private javax.swing.JMenuItem actualizarparametros;
    private javax.swing.JMenuItem actualizarprevision;
    private javax.swing.JMenuItem actualizasalud;
    private javax.swing.JMenuItem btnacerca;
    private javax.swing.JMenuItem btnaddcontrato;
    private javax.swing.JMenuItem btnaddfiniquito;
    private javax.swing.JMenuItem btnaddliquidacion;
    private javax.swing.JMenu btnadministrativo;
    private javax.swing.JMenuItem btnagregarusuario;
    private javax.swing.JMenu btnayuda;
    private javax.swing.JMenuItem btncerrarsesion;
    private javax.swing.JMenuItem btnclave;
    private javax.swing.JMenuItem btndelcontrato;
    private javax.swing.JMenuItem btndelfiniquito;
    private javax.swing.JMenuItem btndelliquidacion;
    private javax.swing.JMenuItem btneditdatos;
    private javax.swing.JMenuItem btngraficos;
    private javax.swing.JMenuItem btnlistausuario;
    private javax.swing.JMenu btnmantenedores;
    private javax.swing.JMenuItem btnsalir;
    private javax.swing.JMenuItem btnsucesos;
    private javax.swing.JMenu btnuser;
    private javax.swing.JMenuItem btnverContrato;
    private javax.swing.JMenuItem btnverEmpleados;
    private javax.swing.JMenuItem btnverFiniquito;
    private javax.swing.JMenuItem btnverLiquidacion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JDesktopPane p;
    private javax.swing.JLabel txtapp;
    // End of variables declaration//GEN-END:variables

}