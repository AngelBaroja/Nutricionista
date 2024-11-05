/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author Matias
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmGenerarDieta = new javax.swing.JMenuItem();
        jmIniciarDieta = new javax.swing.JMenuItem();
        jmPacientesEnDieta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jmiRenglonDeMenu = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        jMenu1.setText("Paciente");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Lista Paciente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Paciente");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Dieta");

        jmGenerarDieta.setText("Generar Dieta");
        jmGenerarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGenerarDietaActionPerformed(evt);
            }
        });
        jMenu2.add(jmGenerarDieta);

        jmIniciarDieta.setText("Iniciar Dieta");
        jmIniciarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmIniciarDietaActionPerformed(evt);
            }
        });
        jMenu2.add(jmIniciarDieta);

        jmPacientesEnDieta.setText("Pacientes con Dieta");
        jmPacientesEnDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPacientesEnDietaActionPerformed(evt);
            }
        });
        jMenu2.add(jmPacientesEnDieta);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Menu");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Renglones");

        jmiRenglonDeMenu.setText("Generar Renglon");
        jmiRenglonDeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRenglonDeMenuActionPerformed(evt);
            }
        });
        jMenu4.add(jmiRenglonDeMenu);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Comidas");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
  
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
              Escritorio.removeAll();
        Escritorio.repaint();
        vistaListadePacientes vL= new vistaListadePacientes();
        vL.setVisible(true);
        Escritorio.add(vL);
        Escritorio.moveToFront(vL);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
      Escritorio.removeAll();
        Escritorio.repaint();
        vistaPacientes vP= new vistaPacientes();
        vP.setVisible(true);
        Escritorio.add(vP);
        Escritorio.moveToFront(vP);
                                
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      Escritorio.removeAll();
        Escritorio.repaint();
        vistaPacientes vP= new vistaPacientes();
        vP.setVisible(true);
        Escritorio.add(vP);
        Escritorio.moveToFront(vP);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmGenerarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGenerarDietaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaGenerarDieta vP= new VistaGenerarDieta();
        vP.setVisible(true);
        Escritorio.add(vP);
        Escritorio.moveToFront(vP);
    }//GEN-LAST:event_jmGenerarDietaActionPerformed

    private void jmIniciarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmIniciarDietaActionPerformed
          Escritorio.removeAll();
        Escritorio.repaint();
        VistaIniciarDieta vP= new VistaIniciarDieta();
        vP.setVisible(true);
        Escritorio.add(vP);
        Escritorio.moveToFront(vP);
    }//GEN-LAST:event_jmIniciarDietaActionPerformed

    private void jmPacientesEnDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPacientesEnDietaActionPerformed
         Escritorio.removeAll();
        Escritorio.repaint();
        VistaPacientesEnDieta vP= new VistaPacientesEnDieta();
        vP.setVisible(true);
        Escritorio.add(vP);
        Escritorio.moveToFront(vP);
    }//GEN-LAST:event_jmPacientesEnDietaActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        VistasComida vc= new VistasComida();
        vc.setVisible(true);
        Escritorio.add(vc);
        Escritorio.moveToFront(vc);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jmiRenglonDeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRenglonDeMenuActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaRenglonDeMenu vc= new VistaRenglonDeMenu();
        vc.setVisible(true);
        Escritorio.add(vc);
        Escritorio.moveToFront(vc);
    }//GEN-LAST:event_jmiRenglonDeMenuActionPerformed

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
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jmGenerarDieta;
    private javax.swing.JMenuItem jmIniciarDieta;
    private javax.swing.JMenuItem jmPacientesEnDieta;
    private javax.swing.JMenuItem jmiRenglonDeMenu;
    // End of variables declaration//GEN-END:variables
}
