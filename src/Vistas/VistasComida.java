package Vistas;

import Entidades.Comida;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.*;
import entidades.*;
import java.sql.Connection;
public class VistasComida extends javax.swing.JInternalFrame {

    private final Conexion conexion = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
    private ComidaData comiData = new ComidaData(conexion);
    public VistasComida() {
        initComponents();
        armarTabla();
        cargarComidas();
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
        IDanch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

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

        IDanch.setEditable(false);

        jLabel6.setText("ID:");

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
                                .addGap(250, 250, 250))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Nombreinp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(TipoComidaInp, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(Añadir)
                        .addGap(39, 39, 39)
                        .addComponent(Eliminar)
                        .addGap(34, 34, 34)
                        .addComponent(Editar)
                        .addGap(42, 42, 42)
                        .addComponent(Salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(IDanch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDanch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nombreinp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TipoComidaInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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
      
       String nom = Nombreinp.getText();
       String det = IngredientesInp.getText();
       String tip = TipoComidaInp.getText();
       int cal = Integer.valueOf(CaloriasInp.getText()); 
       boolean bu = false;
       if (Estado.isSelected()){
           bu = true;
       }
       Comida c = new Comida(nom, tip, cal, det, bu);
       comiData.guardarComida(c);
       borrarFilasTablas();
        cargarComidas();
    }//GEN-LAST:event_AñadirActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    int row = jTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una Comida de la tabla");
        } else {
            int id = (int) jTable.getValueAt(row, 0);
            comiData.EliminarComida(id);
            borrarFilasTablas();
            cargarComidas();
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        if (jTable.getSelectedColumn() != -1){
        String nom = Nombreinp.getText();
        String tip = TipoComidaInp.getText();
        int cal = Integer.parseInt(CaloriasInp.getText());
        String det = IngredientesInp.getText();
        boolean estado =  Estado.isSelected();
        int ide = (int) jTable.getValueAt(jTable.getSelectedColumn(), 0);
        Comida c = new Comida(ide, nom, tip, cal, det, estado);
        comiData.actualizarComida(c);
        borrarFilasTablas();
        cargarComidas();
         }
    }//GEN-LAST:event_EditarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int row = jTable.getSelectedRow();
        int id =  (int) jTable.getValueAt(row, 0);
        String nombre = (String) jTable.getValueAt(row, 1);
        String tipocomida = (String) jTable.getValueAt(row, 2);
        int caloria = (int) jTable.getValueAt(row, 3);
        String ingrediente = (String) jTable.getValueAt(row, 4);
        boolean estado =  (boolean) jTable.getValueAt(row, 5);

        IDanch.setText(String.valueOf(id));
        Nombreinp.setText(nombre);
        IngredientesInp.setText(ingrediente);
        TipoComidaInp.setText(tipocomida);
        CaloriasInp.setText(String.valueOf(caloria));
        Estado.setSelected(estado);
    }//GEN-LAST:event_jTableMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JTextField CaloriasInp;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JCheckBox Estado;
    private javax.swing.JTextField IDanch;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
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
    private void armarTabla(){
        modelo.addColumn("ID Comida");
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo de Comida");
        modelo.addColumn("Calorias");
        modelo.addColumn("Ingredientes");
        modelo.addColumn("Estado");
    }
    private void cargarComidas(){
            for (Comida p : comiData.listarComidas()) {
            int id = p.getCodComida();
            String nombre = p.getNombre();
            String tipo = p.getTipoComida();
            int calorias = p.getCaloriasPorPorcion();
            String detalle = p.getDetalle();
            boolean estado = p.isBaja();

            modelo.addRow(new Object[]{id, nombre, tipo, calorias, detalle, estado});
            
        }
            jTable.setModel(modelo);
    }
    private void borrarFilasTablas(){
        int fila= modelo.getRowCount()-1;
        for (int i = fila ; i >= 0 ; i--) {
            modelo.removeRow(i);
        }
    }
}
