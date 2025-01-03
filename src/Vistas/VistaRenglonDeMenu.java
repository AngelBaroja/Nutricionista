/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.MenuDiario;
import Entidades.RenglonDeMenu;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.MathContext;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import persistencia.ComidaData;
import persistencia.Conexion;
import persistencia.DietaData;
import persistencia.MenuDiarioData;
import persistencia.PacienteData;
import persistencia.RenglonDeMenuData;

/**
 *
 * @author El Angel
 */
public class VistaRenglonDeMenu extends javax.swing.JInternalFrame {

    Conexion conexion = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
    PacienteData pacienteData = new PacienteData(conexion);
    RenglonDeMenuData renglonData = new RenglonDeMenuData(conexion);
    ComidaData comidaData = new ComidaData(conexion);
    MenuDiarioData menuData = new MenuDiarioData(conexion);
    DietaData dietaData = new DietaData(conexion);
    private static ArrayList<RenglonDeMenu> ListaDeRenglones = new ArrayList();

 public VistaRenglonDeMenu() {
    initComponents();    
    armarTabla();
    cargarFilas();
    cargarCombo();
    cargarComboMenu();
    agregarValidacionNumerica(jtDesdeCalorias);
    agregarValidacionNumerica(jtHastaCalorias);
    configurarSpinner(jsCantidadPorciones);
    revisarComboBoxMenu();
    cantidadDeRenglones();   
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtNombreComida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jtDesdeCalorias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtHastaCalorias = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtDetalleComida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jsCantidadPorciones = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jlCaloriasTotales = new javax.swing.JLabel();
        jbInsertarMenu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jr1 = new javax.swing.JRadioButton();
        jcbMenu = new javax.swing.JComboBox<>();
        jr4 = new javax.swing.JRadioButton();
        jr2 = new javax.swing.JRadioButton();
        jr3 = new javax.swing.JRadioButton();
        jr5 = new javax.swing.JRadioButton();
        jbGenerarRenglon = new javax.swing.JButton();
        jbBorrarRenglon = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Renglon de Menu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de la Comida : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jtNombreComida.setBackground(new java.awt.Color(153, 153, 153));
        jtNombreComida.setForeground(new java.awt.Color(0, 0, 0));
        jtNombreComida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreComidaKeyReleased(evt);
            }
        });
        jPanel1.add(jtNombreComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 240, -1));

        tabla.setBackground(new java.awt.Color(204, 204, 204));
        tabla.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 610, 120));

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calorias desde:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jcbTipo.setBackground(new java.awt.Color(153, 153, 153));
        jcbTipo.setForeground(new java.awt.Color(0, 0, 0));
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 230, -1));

        jtDesdeCalorias.setBackground(new java.awt.Color(153, 153, 153));
        jtDesdeCalorias.setForeground(new java.awt.Color(0, 0, 0));
        jtDesdeCalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDesdeCaloriasKeyReleased(evt);
            }
        });
        jPanel1.add(jtDesdeCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 100, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hasta:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jtHastaCalorias.setBackground(new java.awt.Color(153, 153, 153));
        jtHastaCalorias.setForeground(new java.awt.Color(0, 0, 0));
        jtHastaCalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtHastaCaloriasKeyReleased(evt);
            }
        });
        jPanel1.add(jtHastaCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 100, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Detalle de la Comida : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jtDetalleComida.setBackground(new java.awt.Color(153, 153, 153));
        jtDetalleComida.setForeground(new java.awt.Color(0, 0, 0));
        jtDetalleComida.setToolTipText("");
        jtDetalleComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jtDetalleComidaMouseEntered(evt);
            }
        });
        jtDetalleComida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDetalleComidaKeyReleased(evt);
            }
        });
        jPanel1.add(jtDetalleComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad de Porciones:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 20));

        jsCantidadPorciones.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsCantidadPorcionesStateChanged(evt);
            }
        });
        jPanel1.add(jsCantidadPorciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 80, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Calorias Totales:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jlCaloriasTotales.setBackground(new java.awt.Color(153, 153, 153));
        jlCaloriasTotales.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jlCaloriasTotales.setForeground(new java.awt.Color(255, 255, 255));
        jlCaloriasTotales.setText("                                ");
        jPanel1.add(jlCaloriasTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jbInsertarMenu.setBackground(new java.awt.Color(153, 153, 153));
        jbInsertarMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbInsertarMenu.setForeground(new java.awt.Color(0, 0, 0));
        jbInsertarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add.png"))); // NOI18N
        jbInsertarMenu.setText("Agrergar al Menu");
        jbInsertarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbInsertarMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbInsertarMenuMouseExited(evt);
            }
        });
        jbInsertarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInsertarMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jbInsertarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/exit (2).png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Menu:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jr1.setBackground(new java.awt.Color(0, 0, 0));
        jr1.setText("1");
        jr1.setEnabled(false);
        jPanel1.add(jr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jcbMenu.setBackground(new java.awt.Color(153, 153, 153));
        jcbMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbMenu.setForeground(new java.awt.Color(0, 0, 0));
        jcbMenu.setEnabled(false);
        jPanel1.add(jcbMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 320, -1));

        jr4.setBackground(new java.awt.Color(0, 0, 0));
        jr4.setText("4");
        jr4.setEnabled(false);
        jPanel1.add(jr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jr2.setBackground(new java.awt.Color(0, 0, 0));
        jr2.setText("2");
        jr2.setEnabled(false);
        jPanel1.add(jr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        jr3.setBackground(new java.awt.Color(0, 0, 0));
        jr3.setText("3");
        jr3.setEnabled(false);
        jPanel1.add(jr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        jr5.setBackground(new java.awt.Color(0, 0, 0));
        jr5.setText("5");
        jr5.setEnabled(false);
        jPanel1.add(jr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        jbGenerarRenglon.setBackground(new java.awt.Color(153, 153, 153));
        jbGenerarRenglon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbGenerarRenglon.setForeground(new java.awt.Color(0, 0, 0));
        jbGenerarRenglon.setText("Generar Renglon");
        jbGenerarRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarRenglonActionPerformed(evt);
            }
        });
        jPanel1.add(jbGenerarRenglon, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        jbBorrarRenglon.setBackground(new java.awt.Color(153, 153, 153));
        jbBorrarRenglon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbBorrarRenglon.setForeground(new java.awt.Color(0, 0, 0));
        jbBorrarRenglon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/trash (1).png"))); // NOI18N
        jbBorrarRenglon.setText("Borrar Renglon");
        jbBorrarRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarRenglonActionPerformed(evt);
            }
        });
        jPanel1.add(jbBorrarRenglon, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 150, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pexels-n-voitkevich-5794773 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-420, 0, 1150, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreComidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreComidaKeyReleased
     buscarComida();
    }//GEN-LAST:event_jtNombreComidaKeyReleased

    private void jtDetalleComidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDetalleComidaKeyReleased
     buscarComida();
    }//GEN-LAST:event_jtDetalleComidaKeyReleased

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed
     buscarComida();
    }//GEN-LAST:event_jcbTipoActionPerformed

    private void jtDesdeCaloriasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDesdeCaloriasKeyReleased
       buscarComida();
    }//GEN-LAST:event_jtDesdeCaloriasKeyReleased

    private void jtHastaCaloriasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtHastaCaloriasKeyReleased
       buscarComida();
    }//GEN-LAST:event_jtHastaCaloriasKeyReleased

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int caloriasPorcion=(int) tabla.getValueAt(tabla.getSelectedRow(), 3);
        int spinner =(Integer) jsCantidadPorciones.getValue();
        jlCaloriasTotales.setText(String.valueOf(caloriasPorcion*(Integer) jsCantidadPorciones.getValue()));
    }//GEN-LAST:event_tablaMouseClicked

    private void jsCantidadPorcionesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsCantidadPorcionesStateChanged
        if (tabla.getSelectedRow()!=-1) {
            int caloriasPorcion=(int) tabla.getValueAt(tabla.getSelectedRow(), 3);
            int spinner =(Integer) jsCantidadPorciones.getValue();
            jlCaloriasTotales.setText(String.valueOf(caloriasPorcion*(Integer) jsCantidadPorciones.getValue()));
        }
    }//GEN-LAST:event_jsCantidadPorcionesStateChanged

    private void jbInsertarMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbInsertarMenuMouseEntered
//          jbInsertarMenu.setToolTipText("Permite generar un nuevo Renglon con comida");
//          jbInsertarMenu.setFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 13));
//          setCursor(new Cursor(Cursor.HAND_CURSOR));
//          jbInsertarMenu.setBorder(new LineBorder(Color.RED, 2));
    }//GEN-LAST:event_jbInsertarMenuMouseEntered

    private void jbInsertarMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbInsertarMenuMouseExited
//        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//         jbInsertarMenu.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 13));
//         jbInsertarMenu.setBorder(new LineBorder(Color.GRAY, 1));
    }//GEN-LAST:event_jbInsertarMenuMouseExited

    private void jtDetalleComidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDetalleComidaMouseEntered
       jtDetalleComida.setToolTipText("Porfavor, solo ingresar un Ingrediente.");
    }//GEN-LAST:event_jtDetalleComidaMouseEntered

    private void jbGenerarRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenerarRenglonActionPerformed
        int calorias = 0;
        boolean invalidar = false;
        if (tabla.getSelectedRow()!=-1 && ListaDeRenglones.size() <= 5) {
            Comida comida = comidaData.buscarComidaPorId((Integer) tabla.getValueAt(tabla.getSelectedRow(), 0));
            for (RenglonDeMenu renglones : ListaDeRenglones) {
                if (comida.getTipoComida().equalsIgnoreCase(renglones.getComida().getTipoComida())) {
                    invalidar=true;
                    break;
                }
            }
            if (ListaDeRenglones.size() == 5) {
                JOptionPane.showMessageDialog(this, "Solo se permite generar hasta 5 Renglones de Menu");
            } else if (!invalidar) {
                RenglonDeMenu renglonDeMenu = new RenglonDeMenu();
                renglonDeMenu.setComida(comida);
                renglonDeMenu.setCantidadPorciones((Integer) jsCantidadPorciones.getValue());
                renglonDeMenu.setSubtotalCalorias(Integer.parseInt(jlCaloriasTotales.getText()));
                ListaDeRenglones.add(renglonDeMenu);
                cantidadDeRenglones();
                JOptionPane.showMessageDialog(this, "Renglon de Menu Generado");
                if (ListaDeRenglones.size() == 5) {
                    jcbMenu.setEnabled(true);                    
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ya existe un renglon de comida\ncon el mismo Tipo de comida.");
            }            
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una comida de la Tabla");
        }
    }//GEN-LAST:event_jbGenerarRenglonActionPerformed

    private void jbBorrarRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarRenglonActionPerformed
        if (!ListaDeRenglones.isEmpty()) {
            ListaDeRenglones.remove(ListaDeRenglones.size()-1);
            cantidadDeRenglones();
            JOptionPane.showMessageDialog(this, "Renglon de Menu Borrado");
            jcbMenu.setEnabled(false);
        }
    }//GEN-LAST:event_jbBorrarRenglonActionPerformed

    private void jbInsertarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertarMenuActionPerformed
        if (ListaDeRenglones.size() != 5) {
            JOptionPane.showMessageDialog(this, "Necesitas generar 5 Renglones de Menu");
        } else if (jcbMenu.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "No existe Menu al cual ingresar los Renglones");
        } else {
            {

                for (RenglonDeMenu ListaDeRenglone : ListaDeRenglones) {
                    ListaDeRenglone.setMenu((MenuDiario) jcbMenu.getSelectedItem());
                    renglonData.guardarRenglonDeMenu(ListaDeRenglone);
                }
                JOptionPane.showMessageDialog(this, "Los 5 Renglones fueron insertados en el Menu");
                MenuDiario menuDiario = (MenuDiario) jcbMenu.getSelectedItem();
                int caloriasTotales=renglonData.caloriasTotalesDeUnaDieta(menuDiario.getDieta().getCodDieta());
                Dieta dieta = dietaData.buscarDieta(menuDiario.getDieta().getCodDieta());
                System.out.println(caloriasTotales);
                System.out.println(dieta.toString());
                dieta.setTotalCalorias(caloriasTotales);
                dietaData.actualizarDieta(dieta);  
                 System.out.println(dieta.getTotalCalorias());
                limpiarCombo();
                cargarComboMenu();
                ListaDeRenglones.clear();
                cantidadDeRenglones();
                jcbMenu.setEnabled(false);
                limpiarCampos();
                borrarFilasTablas();
                cargarFilas();
            }
        }
    }//GEN-LAST:event_jbInsertarMenuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrarRenglon;
    private javax.swing.JButton jbGenerarRenglon;
    private javax.swing.JButton jbInsertarMenu;
    private javax.swing.JComboBox<MenuDiario> jcbMenu;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel jlCaloriasTotales;
    private javax.swing.JRadioButton jr1;
    private javax.swing.JRadioButton jr2;
    private javax.swing.JRadioButton jr3;
    private javax.swing.JRadioButton jr4;
    private javax.swing.JRadioButton jr5;
    private javax.swing.JSpinner jsCantidadPorciones;
    private javax.swing.JTextField jtDesdeCalorias;
    private javax.swing.JTextField jtDetalleComida;
    private javax.swing.JTextField jtHastaCalorias;
    private javax.swing.JTextField jtNombreComida;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
   
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    private void armarTabla() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");
        modelo.addColumn("Calorias");
        modelo.addColumn("Detalle");
        tabla.setModel(modelo);
    }

    private void cargarFilas() {
        for (Comida listaComida : comidaData.listarComidasActivas()) {
            modelo.addRow(new Object[]{
                listaComida.getCodComida(),
                listaComida.getNombre(),
                listaComida.getTipoComida(),
                listaComida.getCaloriasPorPorcion(),
                listaComida.getDetalle()
            });
        }
    }

    private void borrarFilasTablas() {
        int fila = modelo.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void cargarCombo() {
        jcbTipo.addItem("                      - - TIPO - -");
        jcbTipo.addItem("desayuno");
        jcbTipo.addItem("merienda");
        jcbTipo.addItem("snack");
        jcbTipo.addItem("almuerzo");
        jcbTipo.addItem("cena");
    }
    
    public void buscarComida(){
         borrarFilasTablas();

        String nombreComida = jtNombreComida.getText().toLowerCase();
        String detalleComida = jtDetalleComida.getText().toLowerCase();
        String desdeCalorias = jtDesdeCalorias.getText();
        String hastaCalorias = jtHastaCalorias.getText();
        int tipoSeleccionado = jcbTipo.getSelectedIndex();

        // Filtrar las comidas activas
        for (Comida comida : comidaData.listarComidasActivas()) {
            // Validar si coincide el nombre o si el campo está vacío
            boolean coincideNombre = comida.getNombre().toLowerCase().contains(nombreComida) || nombreComida.isEmpty();

            // Validar si coincide el detalle o si el campo está vacío
            boolean coincideDetalle = comida.getDetalle().toLowerCase().contains(detalleComida) || detalleComida.isEmpty();

            // Verificar el rango de calorías (si está definido)
            boolean coincideCalorias = true; // Inicializar en verdadero si no se ingresan valores
            if (!desdeCalorias.isEmpty() && !hastaCalorias.isEmpty()) {
                int caloriasDesde = Integer.parseInt(desdeCalorias);
                int caloriasHasta = Integer.parseInt(hastaCalorias);
                coincideCalorias = comida.getCaloriasPorPorcion() >= caloriasDesde && comida.getCaloriasPorPorcion() <= caloriasHasta;
            }

            // Verificar el tipo de comida (tipoSeleccionado = 0 es "todos los tipos")
            boolean coincideTipo = tipoSeleccionado == 0 || comida.getTipoComida().equalsIgnoreCase(jcbTipo.getSelectedItem().toString());

            // Si todas las condiciones se cumplen, agregar la fila
            if (coincideNombre && coincideDetalle && coincideCalorias && coincideTipo) {
                modelo.addRow(new Object[]{
                    comida.getCodComida(),
                    comida.getNombre(),
                    comida.getTipoComida(),
                    comida.getCaloriasPorPorcion(),
                    comida.getDetalle()
                });
            }
        }
        
    }
      public boolean esDoubleValido(String valor) {
        try {
            Double.parseDouble(valor); 
            return true; 
        } catch (NumberFormatException e) {
            return false; 
        }
    }
    private void agregarValidacionNumerica(JTextField textField) {
    textField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            // Si el carácter no es un número y no es tecla de borrar (backspace)
            if (!Character.isDigit(c) && c != '\b') {
                evt.consume(); // Bloquear la tecla
            }
        }
    });
}
    private void configurarSpinner(JSpinner spinner) {
    // Establecer el modelo con un rango de 1 a 9 y un incremento de 1
    SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 9, 1);
    spinner.setModel(model);

    // Deshabilitar la edición manual en el campo de texto del JSpinner
    JComponent editor = spinner.getEditor();
    JFormattedTextField textField = ((JSpinner.DefaultEditor) editor).getTextField();
    textField.setEditable(false); // Desactivar la edición manual
}
    private void cantidadDeRenglones() {
        switch (ListaDeRenglones.size()) {
             case 0:
                jr1.setSelected(false);
                jr2.setSelected(false);
                jr3.setSelected(false);
                jr4.setSelected(false);
                jr5.setSelected(false);
                break;
            case 1:
                jr1.setSelected(true);
                jr2.setSelected(false);
                jr3.setSelected(false);
                jr4.setSelected(false);
                jr5.setSelected(false);
                break;
            case 2:
                jr1.setSelected(true);
                jr2.setSelected(true);
                jr3.setSelected(false);
                jr4.setSelected(false);
                jr5.setSelected(false);
                break;
            case 3:
                jr1.setSelected(true);
                jr2.setSelected(true);
                jr3.setSelected(true);
                jr4.setSelected(false);
                jr5.setSelected(false);
                break;
            case 4:
                jr1.setSelected(true);
                jr2.setSelected(true);
                jr3.setSelected(true);
                jr4.setSelected(true);
                jr5.setSelected(false);
                break;
            case 5:
                jr1.setSelected(true);
                jr2.setSelected(true);
                jr3.setSelected(true);
                jr4.setSelected(true);
                jr5.setSelected(true);
                break;
        }
    }
    public void cargarComboMenu(){
        for (MenuDiario listarMenu : renglonData.listarMenusEnTRUE()) {
            jcbMenu.addItem(listarMenu);
        }
    }
    public void limpiarCombo(){
        jcbMenu.removeAllItems();
    }
    public void limpiarCampos(){
        jtNombreComida.setText("");
        jtDetalleComida.setText("");
        jtDesdeCalorias.setText("");
        jtHastaCalorias.setText("");
        jcbTipo.setSelectedIndex(0);
        jlCaloriasTotales.setText("");
        jsCantidadPorciones.setValue(1);
    }
    public void revisarComboBoxMenu(){
        if (ListaDeRenglones.size()==5) {
            jcbMenu.setEnabled(true);
        }else{
            jcbMenu.setEnabled(false);
        }
    }
}
