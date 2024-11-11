/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.MenuDiario;
import Entidades.RenglonDeMenu;
import static java.awt.SystemColor.menu;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import persistencia.ComidaData;
import persistencia.Conexion;
import persistencia.DietaData;
import persistencia.MenuDiarioData;
import persistencia.PacienteData;
import persistencia.RenglonDeMenuData;
import Vistas.Menu;
import java.util.ArrayList;
/**
 *
 * @author El Angel
 */
public class VistaActualizarRenglon1 extends javax.swing.JInternalFrame {
    Conexion conexion = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
    PacienteData pacienteData = new PacienteData(conexion);
    RenglonDeMenuData renglonData = new RenglonDeMenuData(conexion);
    ComidaData comidaData = new ComidaData(conexion);    
    MenuDiarioData menuData = new MenuDiarioData(conexion);
    DietaData dietaData = new DietaData(conexion);
    public static int nroRenglon;
    public static int jr;
    private Menu menu;
    
    public VistaActualizarRenglon1(Menu menu) {
       initComponents();
        this.menu = menu;
        armarTabla();        
        cargarCombo();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jr1 = new javax.swing.JRadioButton();
        jr2 = new javax.swing.JRadioButton();
        jr3 = new javax.swing.JRadioButton();
        jr4 = new javax.swing.JRadioButton();
        jr5 = new javax.swing.JRadioButton();
        jr6 = new javax.swing.JRadioButton();
        jr7 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jcbDieta = new javax.swing.JComboBox<>();
        jbActualizar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setText("Actualizar Renglon");

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de la Dieta:");

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel3.setText("Menu:");

        jr1.setText("1");
        jr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr1ActionPerformed(evt);
            }
        });

        jr2.setText("2");
        jr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr2ActionPerformed(evt);
            }
        });

        jr3.setText("3");
        jr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr3ActionPerformed(evt);
            }
        });

        jr4.setText("4");
        jr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr4ActionPerformed(evt);
            }
        });

        jr5.setText("5");
        jr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr5ActionPerformed(evt);
            }
        });

        jr6.setText("6");
        jr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr6ActionPerformed(evt);
            }
        });

        jr7.setText("7");
        jr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr7ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        jcbDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDietaActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jr1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jr2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jr3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jr4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jr5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jr6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jr7))
                                    .addComponent(jcbDieta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jr1)
                    .addComponent(jr2)
                    .addComponent(jr3)
                    .addComponent(jr4)
                    .addComponent(jr5)
                    .addComponent(jr6)
                    .addComponent(jr7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDietaActionPerformed
       Dieta dieta = (Dieta) jcbDieta.getSelectedItem();       
        if (dieta!=null) {
            borrarFilasTablas();
           jr1.setSelected(false);
           jr2.setSelected(false);
           jr3.setSelected(false);
           jr4.setSelected(false);
           jr5.setSelected(false);
           jr6.setSelected(false);
           jr7.setSelected(false);
            
            int cantidad=renglonData.cantidadDeMenusPorDieta(dieta.getCodDieta());          
            switch (cantidad) {
                case 0:jr1.setEnabled(false);
                jr2.setEnabled(false);
                jr3.setEnabled(false);
                jr4.setEnabled(false);
                jr5.setEnabled(false);
                jr6.setEnabled(false);
                jr7.setEnabled(false);break;
                case 1: jr1.setEnabled(true);
                        jr2.setEnabled(false);jr2.setSelected(false);
                        jr3.setEnabled(false);jr3.setSelected(false);
                        jr4.setEnabled(false);jr4.setSelected(false);
                        jr5.setEnabled(false);jr5.setSelected(false);
                        jr6.setEnabled(false);jr6.setSelected(false);
                        jr7.setEnabled(false);jr7.setSelected(false);break;
                case 2:jr1.setEnabled(true);
                jr2.setEnabled(true);
                jr3.setEnabled(false);jr3.setSelected(false);
                jr4.setEnabled(false);jr4.setSelected(false);
                jr5.setEnabled(false);jr5.setSelected(false);
                jr6.setEnabled(false);jr6.setSelected(false);
                jr7.setEnabled(false);jr7.setSelected(false);break;
                case 3:jr1.setEnabled(true);
                jr2.setEnabled(true);
                jr3.setEnabled(true);
                jr4.setEnabled(false);jr4.setSelected(false);
                jr5.setEnabled(false);jr5.setSelected(false);
                jr6.setEnabled(false);jr6.setSelected(false);
                jr7.setEnabled(false);jr7.setSelected(false);break;
                case 4:jr1.setEnabled(true);
                jr2.setEnabled(true);
                jr3.setEnabled(true);
                jr4.setEnabled(true);
                jr5.setEnabled(false);jr5.setSelected(false);
                jr6.setEnabled(false);jr6.setSelected(false);
                jr7.setEnabled(false);jr7.setSelected(false);break;
                case 5:jr1.setEnabled(true);
                jr2.setEnabled(true);
                jr3.setEnabled(true);
                jr4.setEnabled(true);
                jr5.setEnabled(true);
                jr6.setEnabled(false);jr6.setSelected(false);
                jr7.setEnabled(false);jr7.setSelected(false);break;
                case 6:jr1.setEnabled(true);
                jr2.setEnabled(true);
                jr3.setEnabled(true);
                jr4.setEnabled(true);
                jr5.setEnabled(true);
                jr6.setEnabled(true);
                jr7.setEnabled(false);jr7.setSelected(false);break;
                case 7:jr1.setEnabled(true);
                jr2.setEnabled(true);
                jr3.setEnabled(true);
                jr4.setEnabled(true);
                jr5.setEnabled(true);
                jr6.setEnabled(true);
                jr7.setEnabled(true);break;               
            }
        }
    }//GEN-LAST:event_jcbDietaActionPerformed

    private void jr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr1ActionPerformed
         jr2.setSelected(false);
       jr3.setSelected(false);
       jr4.setSelected(false);
       jr5.setSelected(false);
       jr6.setSelected(false);
       jr7.setSelected(false);      
        cargarTodasFilas(0);
       
    }//GEN-LAST:event_jr1ActionPerformed

    private void jr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr2ActionPerformed
         jr1.setSelected(false);
       jr3.setSelected(false);
       jr4.setSelected(false);
       jr5.setSelected(false);
       jr6.setSelected(false);
       jr7.setSelected(false);             
        cargarTodasFilas(5);
    }//GEN-LAST:event_jr2ActionPerformed

    private void jr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr3ActionPerformed
        jr1.setSelected(false);
       jr2.setSelected(false);
       jr4.setSelected(false);
       jr5.setSelected(false);
       jr6.setSelected(false);
       jr7.setSelected(false);            
        cargarTodasFilas(10);
    }//GEN-LAST:event_jr3ActionPerformed

    private void jr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr4ActionPerformed
       jr1.setSelected(false);
       jr2.setSelected(false);
       jr3.setSelected(false);
       jr5.setSelected(false);
       jr6.setSelected(false);
       jr7.setSelected(false);            
        cargarTodasFilas(15);
    }//GEN-LAST:event_jr4ActionPerformed

    private void jr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr5ActionPerformed
       jr1.setSelected(false);
       jr2.setSelected(false);
       jr3.setSelected(false);
       jr4.setSelected(false);
       jr6.setSelected(false);
       jr7.setSelected(false);           
        cargarTodasFilas(20);
    }//GEN-LAST:event_jr5ActionPerformed

    private void jr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr6ActionPerformed
       jr1.setSelected(false);
       jr2.setSelected(false);
       jr3.setSelected(false);
       jr4.setSelected(false);
       jr5.setSelected(false);
       jr7.setSelected(false);            
        cargarTodasFilas(25);
    }//GEN-LAST:event_jr6ActionPerformed

    private void jr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr7ActionPerformed
       jr1.setSelected(false);
       jr2.setSelected(false);
       jr3.setSelected(false);
       jr4.setSelected(false);
       jr5.setSelected(false);
       jr6.setSelected(false);           
        cargarTodasFilas(30);
    }//GEN-LAST:event_jr7ActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        if (tabla.getSelectedRow()!=-1) {             
             nroRenglon=(int)tabla.getValueAt(tabla.getSelectedRow(), 0);
             
             ArrayList<JRadioButton> lista= new ArrayList();
             lista.add(jr1);
             lista.add(jr2);
             lista.add(jr3);
             lista.add(jr4);
             lista.add(jr5);
             lista.add(jr6);
             lista.add(jr7);
             int contador=0;
             for (JRadioButton jRadioButton : lista) {
                 contador++;
                 if (jRadioButton.isSelected()) {
                     break;
                 }
            }
             jr=contador;             
             VistaActualizarRenglon var = new VistaActualizarRenglon(menu,this);
             
             menu.getEscritorio().add(var);
             var.setVisible(true);
             
             
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un Renglon de la tabla para actualizar");
        }        
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Dieta> jcbDieta;
    private javax.swing.JRadioButton jr1;
    private javax.swing.JRadioButton jr2;
    private javax.swing.JRadioButton jr3;
    private javax.swing.JRadioButton jr4;
    private javax.swing.JRadioButton jr5;
    private javax.swing.JRadioButton jr6;
    private javax.swing.JRadioButton jr7;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    private void armarTabla() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre C.");
        modelo.addColumn("Porciones");
        modelo.addColumn("Calorias");
        modelo.addColumn("Menu Cod.");
        tabla.setModel(modelo);
    }

    public void cargarTodasFilas(int jrSeleccionado) {
        borrarFilasTablas();
       Dieta dieta=(Dieta) jcbDieta.getSelectedItem();
        for (RenglonDeMenu listaRenglon : renglonData.listarRenglonesPorMenuDiario(dieta.getCodDieta(), jrSeleccionado)) {      
            modelo.addRow(new Object[]{
                listaRenglon.getNroRenglon(),
                listaRenglon.getComida().getNombre(),
                listaRenglon.getCantidadPorciones(),
                listaRenglon.getSubtotalCalorias(),
                listaRenglon.getMenu().getCodMenu()
            }
                  );   
        }
    }    
   

    public void borrarFilasTablas() {
        int fila = modelo.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void cargarCombo(){        
        for (Dieta listarTodosMenu : renglonData.listarTodosMenus()) {
            jcbDieta.addItem(listarTodosMenu);
        }
    }
}
