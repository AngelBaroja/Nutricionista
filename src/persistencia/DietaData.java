/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Entidades.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class DietaData {
    private Connection conexion = null;
    
    public DietaData(Conexion conexion){
        this.conexion = conexion.buscarConexion();
    }
    
    public void GuardarDieta(Dieta dieta){
        String query = "INSERT INTO dieta(nombreD,fechaIni,fechaFin,pesoFinal,pesoInicial,estado,totalCalorias,nroPaciente)"
                + " VALUES (?,?,?,0,?,?,?,?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dieta.getNombreD());
            ps.setDate(2, Date.valueOf(dieta.getFechaIni()));
            ps.setDate(3, Date.valueOf(dieta.getFechaFin()));
            ps.setDouble(4, dieta.getPesoFinal());
            ps.setDouble(5, dieta.getPesoInicial());
            ps.setBoolean(6, dieta.isEstado());
            ps.setInt(7, dieta.getTotalCalorias());
            ps.setInt(8, dieta.getPaciente().getNroPaciente());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                dieta.setCodDieta(rs.getInt(1));
                /*int codDieta = rs.getInt(1);
                
                for (MenuDiario menu : dieta.getMenus()) {
                    guardarMenuDiario(codDieta, menu);
                }*/
            } else {
                System.out.println("No se pudo obtener el Numero de la dieta");
            }
            ps.close();
            System.out.println("Dieta Guardada");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta");
        }
    }
    
    public void actualizarDieta(Dieta dieta){
        String query="UPDATE dieta SET nombreD = ?, fechaIni = ?, fechaFin = ?"
                + ",pesoFinal = ?, pesoInicial = ?,estado = ?, totalCalorias = ? WHERE codDieta = ?";
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement(query);
            ps.setString(1, dieta.getNombreD());
            ps.setDate(2, Date.valueOf(dieta.getFechaIni()));
            ps.setDate(3, Date.valueOf(dieta.getFechaFin()));
            ps.setDouble(4, dieta.getPesoFinal());
            ps.setDouble(5, dieta.getPesoInicial());
            ps.setBoolean(6, dieta.isEstado());
            ps.setInt(7, dieta.getTotalCalorias());
            ps.setInt(8, dieta.getCodDieta());
            
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Dieta actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta");
        }
        
    }
    
    public void borradoFisicoDieta(int codDieta){
        String query = "DELETE FROM dieta WHERE codDieta = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, codDieta);
            
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Dieta eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta");
        }
    }
    
    public void borradoLogicoDieta(int codDieta){
        String query = "UPDATE dieta SET estado = false WHERE codDieta = ?";
        
        try {
            PreparedStatement ps = conexion.prepareCall(query);
            ps.setInt(1, codDieta);
            
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Dieta dada de baja");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta");
        }  
    }
    
    public Dieta buscarDieta(int codDieta){
        String query = "SELECT * FROM dieta WHERE codDieta = ?";
        Dieta dieta = null;
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, codDieta);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                dieta = new Dieta();
                dieta.setCodDieta(rs.getInt("codDieta"));
                dieta.setNombreD(rs.getString("nombreD"));
                dieta.setFechaIni(rs.getDate("fechaIni").toLocalDate());
                dieta.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));
                dieta.setEstado(rs.getBoolean("estado"));
                dieta.setTotalCalorias(rs.getInt("totalCalorias"));
                JOptionPane.showMessageDialog(null, "Dieta encontrada");
            } else{
                JOptionPane.showMessageDialog(null, "Dieta no encontrada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta");
        }
        return dieta;
    }
    
    
}
