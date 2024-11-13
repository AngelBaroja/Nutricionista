/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Entidades.Comida;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Luciano
 */
public class ComidaData {
    private Connection conexion = null;

    public ComidaData(Conexion conexion) {
        this.conexion = conexion.buscarConexion();
    }
    
    public void guardarComida(Comida comida) {
        String query = "INSERT INTO comida (nombre, tipoComida, caloriasPorPorcion, detalle, baja) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(query,Statement.RETURN_GENERATED_KEYS );
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getTipoComida());
            ps.setInt(3, comida.getCaloriasPorPorcion());
            ps.setString(4, comida.getDetalle());
           ps.setBoolean(5, comida.isBaja());
           
           ps.executeUpdate();
                ResultSet rs   = ps.getGeneratedKeys();
                
                if (rs.next()) {
                    comida.setCodComida(rs.getInt(1));
                
            }
                    
        } catch (SQLException e){
            System.out.println("Error al agregar comida:  " + e.getMessage());
            
        }
    }
        public void actualizarComida(Comida comida){
            String query = "UPDATE comida SET nombre = ? , tipoComida = ?, caloriasPorPorcion = ?, detalle = ?, baja = ? WHERE codComida=?";
            try{
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setString(1, comida.getNombre());
                ps.setString(2, comida.getTipoComida());
                ps.setInt(3, comida.getCaloriasPorPorcion());
                ps.setString(4, comida.getDetalle());
                ps.setBoolean(5, comida.isBaja());
                ps.setInt(6, comida.getCodComida());
                
                ps.executeUpdate();
                
            }catch (SQLException e){
                            System.out.println("Error al actualizar  comida:  " +e.getMessage());
            }
        }
    
        public void darBajaComida(int codComida){
            String query = "UPDATE comida SET baja = true WHERE codComida = ? ";
            try{
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setInt(1, codComida);
                
                ps.executeUpdate();
            }catch (SQLException e){
                System.out.println("Error al dar de baja comida: "  +e.getMessage());
                
            }
        }

        public Comida buscarComidaPorId(int codComida){
            String query = "SELECT * FROM comida WHERE codComida = ? AND baja = false";
            try{
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setInt(1, codComida);
                
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    Comida comida = new Comida(
                    rs.getInt("codComida"),
                    rs.getString("nombre"),
                    rs.getString("tipoComida"),
                    rs.getInt("caloriasPorPorcion"),
                    rs.getString("detalle"),
                    rs.getBoolean("baja")
                    
                    );
                    return comida;
                }
            }catch(SQLException e){
                    System.out.println("Error al buscar comida:  " + e.getMessage());
                    }
               return null;
        }
        
        public List<Comida> listarComidasBaja(){
            List <Comida> comidas = new ArrayList<>();
            String query = "SELECT * FROM comida WHERE baja = false";
           try{
               Statement stmt = conexion.createStatement();
               ResultSet rs = stmt.executeQuery(query);
               
               while    (rs.next()){
                   Comida comida = new Comida(
                    rs.getInt("codComida"),
                    rs.getString("nombre"),
                    rs.getString("tipoComida"),
                    rs.getInt("caloriasPorPorcion"),
                    rs.getString("detalle"),
                    rs.getBoolean("baja")
                    
                    );
                   comidas.add(comida);
               }
           }catch (SQLException e){
               System.out.println("Error al listar comidas: " + e.getMessage() );
           }
               return comidas;
              
            
        }
        public List<Comida> listarComidas(){
            List <Comida> comidas = new ArrayList<>();
            String query = "SELECT * FROM comida";
           try{
               Statement stmt = conexion.createStatement();
               ResultSet rs = stmt.executeQuery(query);
               
               while    (rs.next()){
                   Comida comida = new Comida(
                    rs.getInt("codComida"),
                    rs.getString("nombre"),
                    rs.getString("tipoComida"),
                    rs.getInt("caloriasPorPorcion"),
                    rs.getString("detalle"),
                    rs.getBoolean("baja")
                    
                    );
                   comidas.add(comida);
               }
           }catch (SQLException e){
               System.out.println("Error al listar comidas: " + e.getMessage() );
           }
               return comidas; 
        }
          public List<Comida> listarComidasActivas(){
            List <Comida> comidas = new ArrayList<>();
            String query = "SELECT * FROM comida WHERE baja=false";
           try{
               Statement stmt = conexion.createStatement();
               ResultSet rs = stmt.executeQuery(query);
               
               while    (rs.next()){
                   Comida comida = new Comida(
                    rs.getInt("codComida"),
                    rs.getString("nombre"),
                    rs.getString("tipoComida"),
                    rs.getInt("caloriasPorPorcion"),
                    rs.getString("detalle"),
                    rs.getBoolean("baja")
                    
                    );
                   comidas.add(comida);
               }
           }catch (SQLException e){
               System.out.println("Error al listar comidas: " + e.getMessage() );
           }
               return comidas; 
        }
        
        public void EliminarComida(int codComida){
             String query = "DELETE FROM comida WHERE codComida = ?";
            try{
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setInt(1, codComida);
               
                int filas = ps.executeUpdate();
                if (filas > 1) {
                }
                ps.close();
                }catch (SQLException e){
                System.out.println("Error al eliminar comida: " +e.getMessage());
                }
            }
        
}
    


