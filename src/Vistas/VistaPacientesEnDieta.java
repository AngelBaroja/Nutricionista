package Vistas;

import Entidades.Dieta;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.Conexion;
import persistencia.DietaData;
import persistencia.PacienteData;

/**
 *
 * @author El Angel
 */
public class VistaPacientesEnDieta extends javax.swing.JInternalFrame {

    Conexion conexion = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
    PacienteData pacienteData = new PacienteData(conexion);
    DietaData dietaData = new DietaData(conexion);

    public VistaPacientesEnDieta() {
        initComponents();
        armarTabla2();
        cargarFilas2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jtBuscarDieta1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jrActivos = new javax.swing.JRadioButton();
        jlNombrePaciente = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jdcFechaInicial = new com.toedter.calendar.JDateChooser();
        jdcFechaFinal = new com.toedter.calendar.JDateChooser();
        jlFechaFinal = new javax.swing.JLabel();
        jlFechaInicial = new javax.swing.JLabel();
        jtPesoInicial = new javax.swing.JTextField();
        jtPesoFinal = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JCheckBox();
        jlCalorias = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel5.setText("Pacientes con Dieta");

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla2);

        jtBuscarDieta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarDieta1KeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Buscar por nombre de Paciente:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("Codigo:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setText("Paciente;");

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setText("Fecha Inicial:");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setText("Fecha Final:");

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setText("Peso Inicial:");

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel14.setText("Peso Final:");

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel15.setText("Calorias:");

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel16.setText("Estado:");

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel17.setText("Terminada:");

        jrActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrActivosActionPerformed(evt);
            }
        });

        jlNombrePaciente.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlNombrePaciente.setText("            ");

        jlCodigo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlCodigo.setText("            ");

        jdcFechaInicial.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaInicialPropertyChange(evt);
            }
        });

        jdcFechaFinal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaFinalPropertyChange(evt);
            }
        });

        jlFechaFinal.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlFechaFinal.setText("                    ");

        jlFechaInicial.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlFechaInicial.setText("                    ");

        jtPesoInicial.setText(" ");

        jcbEstado.setText("jCheckBox1");

        jlCalorias.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlCalorias.setText("               ");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(173, 173, 173))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jdcFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlFechaInicial))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlCalorias))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(34, 34, 34)
                                        .addComponent(jlCodigo))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jtPesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(31, 31, 31)
                                .addComponent(jlNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jdcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jlFechaFinal))))
                        .addGap(50, 50, 50)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jrActivos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtBuscarDieta1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(530, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtBuscarDieta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jrActivos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jlNombrePaciente)
                            .addComponent(jlCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jlFechaInicial))
                            .addComponent(jdcFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlFechaFinal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jtPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jcbEstado)
                    .addComponent(jlCalorias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(435, Short.MAX_VALUE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtBuscarDieta1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarDieta1KeyReleased
        borrarFilasTablas();
        if (jrActivos.isSelected()) {
            for (Dieta listaDietaConPacienteCargado : dietaData.listaDietaConPacienteCargadosEstadoFalse()) {
                if (listaDietaConPacienteCargado.getPaciente().getNombre().toLowerCase().contains(jtBuscarDieta1.getText())) {
                    modelo2.addRow(new Object[]{
                        listaDietaConPacienteCargado.getCodDieta(),
                        listaDietaConPacienteCargado.getNombreD(),
                        listaDietaConPacienteCargado.getPaciente().getNombre(),
                        listaDietaConPacienteCargado.getFechaIni(),
                        listaDietaConPacienteCargado.getFechaFin(),
                        listaDietaConPacienteCargado.getPesoInicial(),
                        listaDietaConPacienteCargado.getPesoFinal(),
                        listaDietaConPacienteCargado.getTotalCalorias(),
                        listaDietaConPacienteCargado.isEstado() ? "Activa" : "No Activa"
                    });
                }
            }
        } else {
            for (Dieta listaDietaConPacienteCargado : dietaData.listaDietaConPacienteCargadosEstadoActivo()) {
                if (listaDietaConPacienteCargado.getPaciente().getNombre().toLowerCase().contains(jtBuscarDieta1.getText())) {
                    modelo2.addRow(new Object[]{
                        listaDietaConPacienteCargado.getCodDieta(),
                        listaDietaConPacienteCargado.getNombreD(),
                        listaDietaConPacienteCargado.getPaciente().getNombre(),
                        listaDietaConPacienteCargado.getFechaIni(),
                        listaDietaConPacienteCargado.getFechaFin(),
                        listaDietaConPacienteCargado.getPesoInicial(),
                        listaDietaConPacienteCargado.getPesoFinal(),
                        listaDietaConPacienteCargado.getTotalCalorias(),
                        listaDietaConPacienteCargado.isEstado() ? "Activa" : "No Activa"
                    });
                }
            }
        }
    }//GEN-LAST:event_jtBuscarDieta1KeyReleased

    private void jrActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrActivosActionPerformed
        borrarFilasTablas();
        cargarFilas();
    }//GEN-LAST:event_jrActivosActionPerformed

    private void tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla2MouseClicked
        int fila = tabla2.getSelectedRow();
        int codDieta = (int) tabla2.getValueAt(fila, 0);
        Dieta dieta = dietaData.buscarDieta(codDieta);
        jlCodigo.setText(Integer.toString(dieta.getCodDieta()));
        jlNombrePaciente.setText(dieta.getPaciente().getNombre());
        // Convierte LocalDate a Date
        Date fechaInicial = Date.from(dieta.getFechaIni().atStartOfDay(ZoneId.systemDefault()).toInstant());
        // Asigna la fecha al JDateChooser
        jdcFechaInicial.setDate(fechaInicial);
        Date fechaFin = Date.from(dieta.getFechaFin().atStartOfDay(ZoneId.systemDefault()).toInstant());
        jdcFechaFinal.setDate(fechaFin);

        jtPesoInicial.setText(Double.toString(dieta.getPesoInicial()));
        jtPesoFinal.setText(Double.toString(dieta.getPesoFinal()));
        jlCalorias.setText(Integer.toString(dieta.getTotalCalorias()));
        jcbEstado.setSelected(dieta.isEstado());

    }//GEN-LAST:event_tabla2MouseClicked
  
    private void jdcFechaInicialPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaInicialPropertyChange
      
            Date fechaSeleccionada = jdcFechaInicial.getDate();
            if (fechaSeleccionada!=null) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaFormateada = formato.format(fechaSeleccionada);
            jlFechaInicial.setText(fechaFormateada);
            }
           
     

    }//GEN-LAST:event_jdcFechaInicialPropertyChange
 
    private void jdcFechaFinalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaFinalPropertyChange
       
            Date fechaSeleccionada = jdcFechaFinal.getDate();
            if (fechaSeleccionada!=null) {
                 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaFormateada = formato.format(fechaSeleccionada);
            jlFechaFinal.setText(fechaFormateada);
            }
           
        
    }//GEN-LAST:event_jdcFechaFinalPropertyChange

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        if (tabla2.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Porfavor, seleccione un elemento de la lista");
        } else if (!esDoubleValido(jtPesoInicial.getText()) || !esDoubleValido(jtPesoFinal.getText())) {
            JOptionPane.showMessageDialog(this, "El Peso Inicial o Final solo acepta numeros");
        } else {
            Dieta dieta = dietaData.buscarDieta(Integer.parseInt(jlCodigo.getText()));
            dieta.setFechaIni(jdcFechaInicial.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            dieta.setFechaFin(jdcFechaFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            dieta.setPesoInicial(Double.parseDouble(jtPesoInicial.getText()));
            dieta.setPesoFinal(Double.parseDouble(jtPesoFinal.getText()));
            dieta.setEstado(jcbEstado.isSelected());
            
            dietaData.actualizarDieta(dieta);
            JOptionPane.showMessageDialog(this, "Dieta Actualizada con exito");
            borrarFilasTablas();
            limpiarCampos();
            cargarFilas();
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        if (tabla2.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(this, "Porfavor, seleccione un elemento de la lista");
        }else{
            Dieta dieta = dietaData.buscarDieta(Integer.parseInt(jlCodigo.getText()));
            dietaData.borradoFisicoDieta(dieta.getCodDieta());
            JOptionPane.showMessageDialog(this, "Dieta Eliminada con exito");
            limpiarCampos();
            borrarFilasTablas();
            cargarFilas();
        }
    }//GEN-LAST:event_jbBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcbEstado;
    private com.toedter.calendar.JDateChooser jdcFechaFinal;
    private com.toedter.calendar.JDateChooser jdcFechaInicial;
    private javax.swing.JLabel jlCalorias;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlFechaFinal;
    private javax.swing.JLabel jlFechaInicial;
    private javax.swing.JLabel jlNombrePaciente;
    private javax.swing.JRadioButton jrActivos;
    private javax.swing.JTextField jtBuscarDieta1;
    private javax.swing.JTextField jtPesoFinal;
    private javax.swing.JTextField jtPesoInicial;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
private DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    private void armarTabla2() {
        modelo2.addColumn("Codigo");
        modelo2.addColumn("Dieta");
        modelo2.addColumn("Paciente");
        modelo2.addColumn("Fecha Ini.");
        modelo2.addColumn("Fecha Final");
        modelo2.addColumn("Peso Ini.");
        modelo2.addColumn("Peso Final");
        modelo2.addColumn("Calorias");
        modelo2.addColumn("Estado");

        tabla2.setModel(modelo2);
    }
    private void cargarFilas(){
                    if (jrActivos.isSelected()) {
                for (Dieta listaDieta : dietaData.listaDietaConPacienteCargadosEstadoFalse()) {
                    modelo2.addRow(new Object[]{
                        listaDieta.getCodDieta(),
                        listaDieta.getNombreD(),
                        listaDieta.getPaciente().getNombre(),
                        listaDieta.getFechaIni(),
                        listaDieta.getFechaFin(),
                        listaDieta.getPesoInicial(),
                        listaDieta.getPesoFinal(),
                        listaDieta.getTotalCalorias(),
                        listaDieta.isEstado() ? "Activa" : "No Activa"

                    });
                }
            } else {
                for (Dieta listaDieta : dietaData.listaDietaConPacienteCargadosEstadoActivo()) {
                    modelo2.addRow(new Object[]{
                        listaDieta.getCodDieta(),
                        listaDieta.getNombreD(),
                        listaDieta.getPaciente().getNombre(),
                        listaDieta.getFechaIni(),
                        listaDieta.getFechaFin(),
                        listaDieta.getPesoInicial(),
                        listaDieta.getPesoFinal(),
                        listaDieta.getTotalCalorias(),
                        listaDieta.isEstado() ? "Activa" : "No Activa"

                    });
                }
                
            }
    }
    private void cargarFilas2() {
        for (Dieta listaDieta : dietaData.listaDietaConPacienteCargadosEstadoActivo()) {
            modelo2.addRow(new Object[]{
                listaDieta.getCodDieta(),
                listaDieta.getNombreD(),
                listaDieta.getPaciente().getNombre(),
                listaDieta.getFechaIni(),
                listaDieta.getFechaFin(),
                listaDieta.getPesoInicial(),
                listaDieta.getPesoFinal(),
                listaDieta.getTotalCalorias(),
                listaDieta.isEstado() ? "Activa" : "No Activa"

            });
        }
    }

    private void borrarFilasTablas() {
        int fila = modelo2.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {
            modelo2.removeRow(i);
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
        jlCalorias.setText("");
        jlCodigo.setText("");
        jlNombrePaciente.setText("");
        jdcFechaInicial.setDate(null);
        jdcFechaFinal.setDate(null);
        jlFechaInicial.setText("");
        jlFechaFinal.setText("");
        jtPesoInicial.setText("");
        jtPesoFinal.setText("");
        jcbEstado.setSelected(false);
    }
}
