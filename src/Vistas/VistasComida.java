package Vistas;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.RenglonDeMenu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.*;

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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IDanch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TipoComidaInp = new javax.swing.JTextField();
        IngredientesInp = new javax.swing.JTextField();
        Nombreinp = new javax.swing.JTextField();
        Añadir = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Estado = new javax.swing.JCheckBox();
        CaloriasInp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 630, 120));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comidas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo De Comida:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        IDanch.setEditable(false);
        IDanch.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(IDanch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 60, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calorias:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingredientes:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));
        jPanel1.add(TipoComidaInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 110, -1));
        jPanel1.add(IngredientesInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 230, 20));
        jPanel1.add(Nombreinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 20));

        Añadir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add.png"))); // NOI18N
        Añadir.setText("Añadir");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        jPanel1.add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 110, 30));

        Eliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/trash (1).png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        Salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/exit (2).png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        Editar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pencil.png"))); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPanel1.add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Estado.setBackground(new java.awt.Color(0, 0, 0));
        Estado.setForeground(new java.awt.Color(255, 255, 255));
        Estado.setText("Dar de BAJA");
        jPanel1.add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));
        jPanel1.add(CaloriasInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/clean.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comida pexels-content-prod-co-5701886.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -930, 740, 1410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        if (validarCampos()) {
        boolean validar = true;
        String nom = Nombreinp.getText();
            for (Comida listarComida : comiData.listarComidas()) {
                if (nom.equalsIgnoreCase(listarComida.getNombre())) {
                    validar=false;
                }
            }
            if (validar) {
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
            } else {
                JOptionPane.showMessageDialog(this, "Ya existe una comida con ese Nombre");
            }

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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
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
        modelo.addColumn("Baja");
    }

    private void cargarComidas() {
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
