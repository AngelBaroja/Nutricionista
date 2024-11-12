package Vistas;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.RenglonDeMenu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.*;
import entidades.*;
import java.sql.Connection;

public class VistasComida extends javax.swing.JInternalFrame {

    private final Conexion conexion = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
    private ComidaData comiData = new ComidaData(conexion);
    DietaData dietaData = new DietaData(conexion);
    RenglonDeMenuData renglonData = new RenglonDeMenuData(conexion);
    
    

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
        jButton1 = new javax.swing.JButton();

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
        jLabel1.setText("Comidas");

        jLabel2.setText("Nombre");

        jLabel3.setText("Tipo De Comida");

        jLabel4.setText("Calorias");

        jLabel5.setText("Ingredientes");

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

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(Añadir)
                        .addGap(39, 39, 39)
                        .addComponent(Eliminar)
                        .addGap(34, 34, 34)
                        .addComponent(Editar)
                        .addGap(36, 319, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CaloriasInp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Estado)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(TipoComidaInp, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Salir)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(Nombreinp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(IngredientesInp, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(176, 176, 176)
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(IDanch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDanch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nombreinp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TipoComidaInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CaloriasInp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estado))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngredientesInp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
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

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        if (validarCampos()) {
        String nom = Nombreinp.getText();
        String det = IngredientesInp.getText();
        String tip = TipoComidaInp.getText();
        int cal = Integer.valueOf(CaloriasInp.getText());
        boolean bu = Estado.isSelected();        
        Comida c = new Comida(nom, tip, cal, det, bu);
        comiData.guardarComida(c);
        borrarFilasTablas();
        cargarComidas();
        limpiarCampos();
        JOptionPane.showMessageDialog(this, "Comida Guardada con Exito");
        }
      
    }//GEN-LAST:event_AñadirActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int row = jTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una Comida de la tabla");
        } else {
            int id = (int) jTable.getValueAt(row, 0);
            System.out.println("ID SELECCIONADO: "+id);
            for (RenglonDeMenu renglon : renglonData.listarRenglones()) {
                System.out.println(renglon.getComida().getCodComida());
               if (renglon.getComida().getCodComida()==id) {
                   System.out.println(renglon.toString());
                 for (Dieta dieta : dietaData.listaDietaPorCodComida(renglon.getComida().getCodComida())) {
                    renglonData.eliminarRenglonDeMenu(renglon.getNroRenglon()); 
                     System.out.println(dieta.getCodDieta());
                    int caloriaTotales= renglonData.caloriasTotalesDeUnaDieta(dieta.getCodDieta());
                    dieta.setTotalCalorias(caloriaTotales);
                    dietaData.actualizarDieta(dieta);
                 }
               } 
            } 
            
            
            comiData.EliminarComida(id);
            borrarFilasTablas();
            cargarComidas();
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Comida Eliminada");
            
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        if (validarCampos()) {
            String nom = Nombreinp.getText();
            String tip = TipoComidaInp.getText();
            int cal = Integer.parseInt(CaloriasInp.getText());
            String det = IngredientesInp.getText();
            boolean estado = Estado.isSelected();
            int ide = (int) jTable.getValueAt(jTable.getSelectedRow(), 0);
            Comida c = new Comida(ide, nom, tip, cal, det, estado);
            comiData.actualizarComida(c);
            borrarFilasTablas();
            cargarComidas();
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Actualizacion realizada con exito");
            
                for (Dieta dieta : dietaData.listaDietaPorCodComida(ide)) {
                    int caloriaTotales= renglonData.caloriasTotalesDeUnaDieta(dieta.getCodDieta());
                    dieta.setTotalCalorias(caloriaTotales);
                    dietaData.actualizarDieta(dieta);
                }
           
            
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int row = jTable.getSelectedRow();
        int id = (int) jTable.getValueAt(row, 0);
        String nombre = (String) jTable.getValueAt(row, 1);
        String tipocomida = (String) jTable.getValueAt(row, 2);
        int caloria = (int) jTable.getValueAt(row, 3);
        String ingrediente = (String) jTable.getValueAt(row, 4);
        boolean estado = (boolean) jTable.getValueAt(row, 5);

        IDanch.setText(String.valueOf(id));
        Nombreinp.setText(nombre);
        IngredientesInp.setText(ingrediente);
        TipoComidaInp.setText(tipocomida);
        CaloriasInp.setText(String.valueOf(caloria));
        Estado.setSelected(estado);
    }//GEN-LAST:event_jTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed


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
    private javax.swing.JButton jButton1;
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
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    private boolean validarCampos() {
        if (Nombreinp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un Nombre");
            return false;
        } else if (TipoComidaInp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el Tipo de la Comida");
            return false;
        } else if (!TipoComidaInp.getText().toLowerCase().equals("desayuno")
                && !TipoComidaInp.getText().toLowerCase().equals("merienda")
                && !TipoComidaInp.getText().toLowerCase().equals("snack")
                && !TipoComidaInp.getText().toLowerCase().equals("almuerzo")
                && !TipoComidaInp.getText().toLowerCase().equals("cena")) {
            JOptionPane.showMessageDialog(this, "Ingrese un Tipo de Comida valido:\ndesayuno-merienda-snack-almuerzo-cena");
            return false;
        } else if (IngredientesInp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese los Detalles e Ingredientes de la Comida");
            return false;
        } else if (CaloriasInp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una Cantidad de Calorias");
            return false;
        } else if (!esDoubleValido(CaloriasInp.getText())) {
            JOptionPane.showMessageDialog(this, "El campo de las Calorias solo contiene numeros,\nen caso de ser decimal agregar un punto");
            return false;
        }
        return true;
    }

    private void armarTabla() {
        modelo.addColumn("ID Comida");
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo de Comida");
        modelo.addColumn("Calorias");
        modelo.addColumn("Ingredientes");
        modelo.addColumn("Estado");
    }

    private void cargarComidas() {
        for (Comida p : comiData.listarComidas()) {
            int id = p.getCodComida();
            String nombre = p.getNombre();
            String tipo = p.getTipoComida();
            int calorias = p.getCaloriasPorPorcion();
            String detalle = p.getDetalle();
            String estado = p.isBaja() ? "Activa" : "No Activa";

            modelo.addRow(new Object[]{id, nombre, tipo, calorias, detalle, estado});

        }
        jTable.setModel(modelo);
    }

    private void borrarFilasTablas() {
        int fila = modelo.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public boolean esDoubleValido(String valor) {
        try {
            Double.parseDouble(valor); // Intenta convertir el String a Double
            return true; // Si no hay excepción, el String es un Double válido
        } catch (NumberFormatException e) {
            return false; // Si ocurre una excepción, no es un Double válido
        }
    }
    public void limpiarCampos(){
        IDanch.setText("");
        Nombreinp.setText("");
        TipoComidaInp.setText("");
        CaloriasInp.setText("");
        IngredientesInp.setText("");
        Estado.setSelected(false);
    }
}
