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
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        PesoActual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Edad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        Altura = new javax.swing.JTextField();
        PesoBuscado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Altura:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        Nombre.setBackground(new java.awt.Color(153, 153, 153));
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 170, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Peso actual:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/exit (2).png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, 30));

        PesoActual.setBackground(new java.awt.Color(153, 153, 153));
        PesoActual.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(PesoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre paciente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        Guardar.setBackground(new java.awt.Color(153, 153, 153));
        Guardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Guardar.setForeground(new java.awt.Color(0, 0, 0));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/file-upload.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, 30));
        jPanel1.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 172, 80, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Edad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        Altura.setBackground(new java.awt.Color(153, 153, 153));
        Altura.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 90, 30));

        PesoBuscado.setBackground(new java.awt.Color(153, 153, 153));
        PesoBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(PesoBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Peso deseado:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pacientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d53461c1acc264746ea5bc688eac96b3.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 740, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    // Validación de campos vacíos o valores no válidos
    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.");
        return;
    }
      if (edad < 0) {
        JOptionPane.showMessageDialog(this, "La edad no puede ser un número negativo.");
        return;
    }
    if (alturaText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Altura no puede estar vacía.");
        return;
    }
    if (pesoActualText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Peso actual no puede estar vacío.");
        return;
    }
    if (pesoBuscadoText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Peso buscado no puede estar vacío.");
        return;
    }

    if (!isValidDecimal(alturaText)) {
        JOptionPane.showMessageDialog(this, "Altura debe ser un número válido con hasta dos decimales y punto.");
        return;
    }
    if (!isValidDecimal(pesoActualText)) {
        JOptionPane.showMessageDialog(this, "Peso actual debe ser un número válido con hasta dos decimales y punto.");
        return;
    }
    if (!isValidDecimal(pesoBuscadoText)) {
        JOptionPane.showMessageDialog(this, "Peso buscado debe ser un número válido con hasta dos decimales y punto.");
        return;
    }

    double altura = Math.round(Double.parseDouble(alturaText) * 100.0) / 100.0;
    double pesoActual = Math.round(Double.parseDouble(pesoActualText) * 100.0) / 100.0;
    double pesoBuscado = Math.round(Double.parseDouble(pesoBuscadoText) * 100.0) / 100.0;

    if (altura <= 0) {
        JOptionPane.showMessageDialog(this, "Altura debe ser mayor que 0.");
        return;
    }
    if (pesoActual <= 0) {
        JOptionPane.showMessageDialog(this, "Peso actual debe ser mayor que 0.");
        return;
    }
    if (pesoBuscado <= 0) {
        JOptionPane.showMessageDialog(this, "Peso buscado debe ser mayor que 0.");
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


    }//GEN-LAST:event_GuardarActionPerformed
  private boolean isValidDecimal(String text) {
    if (text.isEmpty()) return false; 
    String regex = "^\\d+(\\.\\d{1,2})?$"; 
    return text.matches(regex);
  }
  
private void limpiarCampos() {
        Nombre.setText(""); 
        Edad.setValue(0);   
        Altura.setText(""); 
        PesoActual.setText(""); 
        PesoBuscado.setText(""); 
    }

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        
    }//GEN-LAST:event_NombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();      
    }//GEN-LAST:event_jButton2ActionPerformed

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altura;
    private javax.swing.JSpinner Edad;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField PesoActual;
    private javax.swing.JTextField PesoBuscado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
