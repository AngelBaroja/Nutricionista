package Vistas;

import Entidades.Comida;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistasComida extends javax.swing.JInternalFrame {
    public VistasComida() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TipoComidaInp = new javax.swing.JTextField();
        IngredientesInp = new javax.swing.JTextField();
        Nombreinp = new javax.swing.JTextField();
        Añadir = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Estado = new javax.swing.JCheckBox();
        CaloriasInp = new javax.swing.JTextField();

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Tipo De Comida", "Calorias", "Ingredientes", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel1.setText("Alimentos");

        jLabel2.setText("Nombre");

        jLabel3.setText("Tipo De Comida");

        jLabel4.setText("Calorias");

        jLabel5.setText("Ingredientes");

        IngredientesInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngredientesInpActionPerformed(evt);
            }
        });

        Añadir.setText("Añadir");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Estado.setText("Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(CaloriasInp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(IngredientesInp, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(Estado)
                                .addGap(250, 250, 250))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Nombreinp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(TipoComidaInp, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(Añadir)
                                .addGap(39, 39, 39)
                                .addComponent(Eliminar)
                                .addGap(34, 34, 34)
                                .addComponent(Editar)
                                .addGap(42, 42, 42)
                                .addComponent(Salir)))
                        .addGap(68, 68, 68)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nombreinp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TipoComidaInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(IngredientesInp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaloriasInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Estado)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Añadir)
                    .addComponent(Eliminar)
                    .addComponent(Editar)
                    .addComponent(Salir))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngredientesInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngredientesInpActionPerformed
  
    }//GEN-LAST:event_IngredientesInpActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
       Comida c = new Comida();
       c.setNombre(Nombreinp.getText());
       c.setDetalle(IngredientesInp.getText());
       c.setTipoComida(TipoComidaInp.getText());
       c.setCaloriasPorPorcion(Integer.valueOf(CaloriasInp.getText())); 
       //y aca añadimos c al Data
    }//GEN-LAST:event_AñadirActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
       if (jTable.getSelectedColumn() != -1){
        jTable.remove(jTable.getSelectedColumn()); //toca cambiarlo para que funcione con el sql
                }
    }//GEN-LAST:event_EliminarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        if (jTable.getSelectedColumn() != -1){
        String nombre = (String) jTable.getValueAt(jTable.getSelectedColumn(), 1);
        String tipocomida = (String) jTable.getValueAt(jTable.getSelectedColumn(), 2);
        int caloria = (int) jTable.getValueAt(jTable.getSelectedColumn(), 3);
        String ingrediente = (String) jTable.getValueAt(jTable.getSelectedColumn(), 4);
        String estado = (String) jTable.getValueAt(jTable.getSelectedColumn(), 5);
        boolean activo = estado.equals("Activo"); 
           //aca iria el coso pa actualizar en el sql
         }
    }//GEN-LAST:event_EditarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        String nombre = (String) jTable.getValueAt(jTable.getSelectedColumn(), 1);
        String tipocomida = (String) jTable.getValueAt(jTable.getSelectedColumn(), 2);
        int caloria = (int) jTable.getValueAt(jTable.getSelectedColumn(), 3);
        String ingrediente = (String) jTable.getValueAt(jTable.getSelectedColumn(), 4);
        String estado = (String) jTable.getValueAt(jTable.getSelectedColumn(), 5);
        boolean activo = estado.equals("Activo"); 
  
        Nombreinp.setText(nombre);
        IngredientesInp.setText(ingrediente);
        TipoComidaInp.setText(tipocomida);
        CaloriasInp.setText(String.valueOf(caloria));
        Estado.setSelected(activo);
    }//GEN-LAST:event_jTableMouseClicked

     private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
     
      private boolean validarCampos() { 
        if (Nombreinp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un Nombre");
            return false;
        } 
        if (TipoComidaInp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el Tipo de la Comida");
            return false;
        }
        if (IngredientesInp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese los Detalles e Ingredientes de la Comida");
            return false;
        }
        if (CaloriasInp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una Cantidad de Calorias");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JTextField CaloriasInp;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JCheckBox Estado;
    private javax.swing.JTextField IngredientesInp;
    private javax.swing.JTextField Nombreinp;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField TipoComidaInp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
