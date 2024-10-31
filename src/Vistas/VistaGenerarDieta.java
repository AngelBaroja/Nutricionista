/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Dieta;
import Entidades.Paciente;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
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
public class VistaGenerarDieta extends javax.swing.JInternalFrame {

    Conexion conexion = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
    PacienteData pacienteData = new PacienteData(conexion);
    DietaData dietaData = new DietaData(conexion);

    /**
     * Creates new form VistaGenerarDieta
     */
    public VistaGenerarDieta() {
        initComponents();
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
        jtDietaSinPaciente = new javax.swing.JTextField();
        jbGuardarSinPaciente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtDietaConPaciente = new javax.swing.JTextField();
        jcbPaciente = new javax.swing.JComboBox<>();
        jdcFechaInicial = new com.toedter.calendar.JDateChooser();
        jlFechaInicial = new javax.swing.JLabel();
        jdcFechaFinal = new com.toedter.calendar.JDateChooser();
        jlFechaFinal = new javax.swing.JLabel();
        jlPesoInicial = new javax.swing.JLabel();
        jbGuardarConPaciente = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel1.setText("Generar Dieta");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Dieta sin Paciente:");

        jtDietaSinPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jbGuardarSinPaciente.setText("Guardar");
        jbGuardarSinPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarSinPacienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel3.setText("Generar Dieta para un Paciente");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Nombre de la Dieta:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Paciente:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de Inicio:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de Final:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("Peso Inicial:");

        jtDietaConPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jcbPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPacienteActionPerformed(evt);
            }
        });

        jdcFechaInicial.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaInicialPropertyChange(evt);
            }
        });

        jlFechaInicial.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlFechaInicial.setText("                            ");

        jdcFechaFinal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaFinalPropertyChange(evt);
            }
        });

        jlFechaFinal.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlFechaFinal.setText("                            ");

        jlPesoInicial.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlPesoInicial.setText("                         ");

        jbGuardarConPaciente.setText("Guardar");
        jbGuardarConPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarConPacienteActionPerformed(evt);
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
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jdcFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlFechaInicial))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtDietaConPaciente))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jcbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jdcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlFechaFinal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jlPesoInicial))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtDietaSinPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(50, 50, 50)
                                            .addComponent(jbGuardarSinPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jbGuardarConPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtDietaSinPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbGuardarSinPaciente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtDietaConPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jcbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jlFechaInicial, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jdcFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8))
                    .addComponent(jlFechaFinal)
                    .addComponent(jdcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jlPesoInicial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarConPaciente)
                    .addComponent(jbSalir))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdcFechaInicialPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaInicialPropertyChange
        if (jdcFechaFinal.getDate() != null) {
            LocalDate fechaInicial = jdcFechaInicial.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFinal = jdcFechaFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int diasDiferencia = (int) ChronoUnit.DAYS.between(fechaInicial, fechaFinal);

            if (diasDiferencia < 3 || diasDiferencia > 7) {
                JOptionPane.showMessageDialog(this,
                        "La fecha Inicial debe estar entre 3 y 7 días antes de la fecha Final.",
                        "Error en las fechas",
                        JOptionPane.ERROR_MESSAGE);

            }

        }

        Date fechaSeleccionada = jdcFechaInicial.getDate();
        if (fechaSeleccionada != null) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaFormateada = formato.format(fechaSeleccionada);
            jlFechaInicial.setText(fechaFormateada);
        }
    }//GEN-LAST:event_jdcFechaInicialPropertyChange

    private void jdcFechaFinalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaFinalPropertyChange

        if (jdcFechaInicial.getDate() != null) {
            LocalDate fechaInicial = jdcFechaInicial.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFinal = jdcFechaFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int diasDiferencia = (int) ChronoUnit.DAYS.between(fechaInicial, fechaFinal);

            if (diasDiferencia < 3 || diasDiferencia > 7) {
                JOptionPane.showMessageDialog(this,
                        "La fecha final debe situarse entre 3 y 7 días a partir de la fecha inicial.",
                        "Error en las fechas",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
        Date fechaSeleccionada = jdcFechaFinal.getDate();
        if (fechaSeleccionada != null) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaFormateada = formato.format(fechaSeleccionada);
            jlFechaFinal.setText(fechaFormateada);
        }

    }//GEN-LAST:event_jdcFechaFinalPropertyChange

    private void jcbPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPacienteActionPerformed
        if (jcbPaciente.getSelectedItem() != null) {
            if (!jcbPaciente.getSelectedItem().equals("- - PACIENTES - -")) {
                int indiceSeleccionado = jcbPaciente.getSelectedIndex();
                int contador = 0;
                for (Paciente a : pacienteData.listaPacienteSinDieta()) {
                    contador++;
                    if (contador == indiceSeleccionado) {
                        jlPesoInicial.setText(String.valueOf(a.getPesoActual()));
                        break;
                    }
                }

            } else {
                jlPesoInicial.setText("");
            }
        }


    }//GEN-LAST:event_jcbPacienteActionPerformed

    private void jbGuardarConPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarConPacienteActionPerformed
        boolean invalidado = false;
        if (jtDietaConPaciente.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Complete el campo del nombre de la Dieta",
                    "Error en los Campos",
                    JOptionPane.ERROR_MESSAGE);
            invalidado = true;
        } else if (jcbPaciente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione un Paciente",
                    "Error en los Campos",
                    JOptionPane.ERROR_MESSAGE);
            invalidado = true;
        } else if (jdcFechaInicial.getDate() == null || jdcFechaFinal.getDate() == null) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione una Fecha de inicio y de fin",
                    "Error en las fechas",
                    JOptionPane.ERROR_MESSAGE);
            invalidado = true;
        } else if (jdcFechaInicial.getDate() != null && jdcFechaFinal.getDate() != null) {
            LocalDate fechaInicial = jdcFechaInicial.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFinal = jdcFechaFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int diasDiferencia = (int) ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
            if (diasDiferencia < 3 || diasDiferencia > 7) {
                JOptionPane.showMessageDialog(this,
                        "Verifique que las fechas tengan \n entre 3 a 7 dias de diferencia",
                        "Error en las fechas",
                        JOptionPane.ERROR_MESSAGE);
                invalidado = true;
            }

        }
        if (!invalidado) {
            Dieta dieta = new Dieta();
            dieta.setNombreD(jtDietaConPaciente.getText());
            int indiceSeleccionado = jcbPaciente.getSelectedIndex();
            int contador = 0;
            for (Paciente a : pacienteData.listaPacienteSinDieta()) {
                contador++;
                if (contador == indiceSeleccionado) {
                    dieta.setPaciente(a);
                    break;
                }
            }
            dieta.setFechaIni(jdcFechaInicial.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            dieta.setFechaFin(jdcFechaFinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            dieta.setPesoInicial(Double.parseDouble(jlPesoInicial.getText()));
            dieta.setEstado(true);
            dietaData.GuardarDietaConPaciente(dieta);
            JOptionPane.showMessageDialog(this, "Dieta Guardada");
            limpiarCampos();
            limpiarCombo();
            cargarCombo();
        }
    }//GEN-LAST:event_jbGuardarConPacienteActionPerformed

    private void jbGuardarSinPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarSinPacienteActionPerformed

        if (jtDietaSinPaciente.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Complete el campo del nombre de la Dieta",
                    "Error en los Campos",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            Dieta dieta = new Dieta();
            dieta.setNombreD(jtDietaSinPaciente.getText());
            dieta.setEstado(true);
            dietaData.GuardarDietaSinPaciente(dieta);
            jtDietaSinPaciente.setText("");
            JOptionPane.showMessageDialog(this, "Dieta Guardada");
        }

    }//GEN-LAST:event_jbGuardarSinPacienteActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbGuardarConPaciente;
    private javax.swing.JButton jbGuardarSinPaciente;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbPaciente;
    private com.toedter.calendar.JDateChooser jdcFechaFinal;
    private com.toedter.calendar.JDateChooser jdcFechaInicial;
    private javax.swing.JLabel jlFechaFinal;
    private javax.swing.JLabel jlFechaInicial;
    private javax.swing.JLabel jlPesoInicial;
    private javax.swing.JTextField jtDietaConPaciente;
    private javax.swing.JTextField jtDietaSinPaciente;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        jcbPaciente.addItem("- - PACIENTES - -");
        for (Paciente a : pacienteData.listaPacienteSinDieta()) {
            jcbPaciente.addItem(a.toString());
        }
    }

    private void limpiarCampos() {
        jtDietaConPaciente.setText("");
        jlFechaInicial.setText("");
        jlFechaFinal.setText("");
        jlPesoInicial.setText("");
    }

    public void limpiarCombo() {
        jcbPaciente.removeAllItems();
    }
}