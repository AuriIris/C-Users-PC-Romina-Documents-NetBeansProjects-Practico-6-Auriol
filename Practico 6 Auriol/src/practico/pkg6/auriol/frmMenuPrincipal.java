/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg6.auriol;

/**
 *
 * @author PC-Romina
 */

   
import java.util.HashMap;
import java.util.Map;

import java.util.Map;

public class frmMenuPrincipal extends javax.swing.JFrame {


    // Acá ponemos lo estatico
    private static Map <Long,Cliente> directorios= new HashMap();

    public static Map<Long, Cliente> getDirectorios() {
        return directorios;
    }
    /**
     * Creates new form frmagregarCliente
     */
    public frmMenuPrincipal() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        pnlAgregarCliente = new javax.swing.JMenu();
        miAgregar = new javax.swing.JMenuItem();
        mIBuscarCPorTel = new javax.swing.JMenuItem();
        mIEliminarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escritorioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        pnlAgregarCliente.setText("Cliente");
        pnlAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnlAgregarClienteActionPerformed(evt);
            }
        });

        miAgregar.setText("Agregar Cliente");
        miAgregar.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                miAgregarMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        miAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgregarActionPerformed(evt);
            }
        });
        pnlAgregarCliente.add(miAgregar);

        mIBuscarCPorTel.setText("Buscar Cliente");
        mIBuscarCPorTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIBuscarCPorTelActionPerformed(evt);
            }
        });
        pnlAgregarCliente.add(mIBuscarCPorTel);

        mIEliminarCliente.setText("Eliminar Cliente");
        mIEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIEliminarClienteActionPerformed(evt);
            }
        });
        pnlAgregarCliente.add(mIEliminarCliente);

        jMenuBar1.add(pnlAgregarCliente);

        jMenu2.setText("Atras");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgregarActionPerformed
        escritorio.removeAll();
       escritorio.repaint();
       frmiAgregarCliente aC=new frmiAgregarCliente();
       aC.setVisible(true);
       escritorio.add(aC);
       escritorio.moveToFront(aC);
    }//GEN-LAST:event_miAgregarActionPerformed

    private void mIBuscarCPorTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIBuscarCPorTelActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       frmiBuscar aC=new frmiBuscar();
       aC.setVisible(true);
       escritorio.add(aC);
       escritorio.moveToFront(aC);
    }//GEN-LAST:event_mIBuscarCPorTelActionPerformed

    private void miAgregarMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_miAgregarMenuKeyPressed
      pnlAgregarCliente.show();
    }//GEN-LAST:event_miAgregarMenuKeyPressed

    private void pnlAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnlAgregarClienteActionPerformed
     
    }//GEN-LAST:event_pnlAgregarClienteActionPerformed

    private void escritorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escritorioMouseClicked
       Cliente cl=new Cliente(37638853,"Romina","Auriol","Abelardo 638","San Luis");
      Cliente cl1=new Cliente(26356356,"Brenda","Gaitan","Francia 638","San Juan");
      Directorio directorio=new Directorio();
      directorio.agregarCliente(Long.parseLong("2664389548"),cl);
      directorio.agregarCliente(Long.parseLong("2664123123"),cl1);
    }//GEN-LAST:event_escritorioMouseClicked

    private void mIEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIEliminarClienteActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       frmiEliminar aC=new frmiEliminar();
       aC.setVisible(true);
       escritorio.add(aC);
       escritorio.moveToFront(aC);
    }//GEN-LAST:event_mIEliminarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mIBuscarCPorTel;
    private javax.swing.JMenuItem mIEliminarCliente;
    private javax.swing.JMenuItem miAgregar;
    private javax.swing.JMenu pnlAgregarCliente;
    // End of variables declaration//GEN-END:variables
}
