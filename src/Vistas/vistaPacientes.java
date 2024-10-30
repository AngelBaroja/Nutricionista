/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Paciente;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.Conexion;
import persistencia.PacienteData;

/**
 *
 * @author Nicolas
 */
public class vistaPacientes extends javax.swing.JInternalFrame {
   private Conexion conexion = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
    private PacienteData pacienteData = new PacienteData(conexion);
    public vistaPacientes() {
        initComponents();
        DecimalFormat df = new DecimalFormat("#.00");
                 
        ArrayList<Paciente> pacientes = pacienteData.listaPaciente();
        for (Paciente p : pacientes) {
            if (p.getPesoActual() == p.getPesoBuscado()) {
            }
    }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Altura = new javax.swing.JTextField();
        PesoActual = new javax.swing.JTextField();
        PesoBuscado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Edad = new javax.swing.JSpinner();

        jButton1.setText("jButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Guardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Pacientes");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nombre paciente:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Edad:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Altura:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Peso actual:");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Peso deseado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PesoActual)
                    .addComponent(Edad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(Altura))
                            .addComponent(Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(343, 343, 343))))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(Guardar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(PesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(Guardar)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

    try {
        String nombre = Nombre.getText().trim();
        int edad = (int) Edad.getValue();

        String alturaText = Altura.getText().trim();
        String pesoActualText = PesoActual.getText().trim();
        String pesoBuscadoText = PesoBuscado.getText().trim();

        // Validar que no tenga más de dos decimales
        if (!isValidDecimal(alturaText) || !isValidDecimal(pesoActualText) || !isValidDecimal(pesoBuscadoText)) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un número válido con hasta dos decimales.");
            return;
        }

        double altura = Math.round(Double.parseDouble(alturaText) * 100.0) / 100.0;
        double pesoActual = Math.round(Double.parseDouble(pesoActualText) * 100.0) / 100.0;
        double pesoBuscado = Math.round(Double.parseDouble(pesoBuscadoText) * 100.0) / 100.0;

        // Validación de campos vacíos
        if (nombre.isEmpty() || altura <= 0 || pesoActual <= 0 || pesoBuscado <= 0) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos correctamente.");
            return;
        }

        Paciente paciente = new Paciente(nombre, edad, altura, pesoActual, pesoBuscado);
        pacienteData.guardarPaciente(paciente);

        JOptionPane.showMessageDialog(this, "Paciente guardado exitosamente.");
        limpiarCampos();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores válidos en todos los campos.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar el paciente: " + e.getMessage());
    }
}

// Método para validar que el número tiene hasta dos decimales
private boolean isValidDecimal(String text) {
    if (text.isEmpty()) return false; // Si el campo está vacío
    String regex = "^\\d+(\\.\\d{1,2})?$"; // Expresión regular para hasta dos decimales
    return text.matches(regex);


    }//GEN-LAST:event_GuardarActionPerformed
  private void limpiarCampos() {
        Nombre.setText(""); 
        Edad.setValue(0);   
        Altura.setText(""); 
        PesoActual.setText(""); 
        PesoBuscado.setText(""); 
    }

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        
    }//GEN-LAST:event_NombreActionPerformed

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altura;
    private javax.swing.JSpinner Edad;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField PesoActual;
    private javax.swing.JTextField PesoBuscado;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
