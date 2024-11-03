/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import Entidades.RenglonDeMenu;
import persistencia.Conexion;
import Entidades.Comida;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luciano
 */
public class RenglonDeMenuData {
    private Connection conexion = null;
    
    public RenglonDeMenuData(Conexion conexion){
        this.conexion = conexion.buscarConexion();
    }
    
    public void guardarRenglonDeMenu(RenglonDeMenu renglon, Comida comida){
        String query ="INSERT INTO renglondemenu (codComida, cantidadPorciones, subTotalCalorias) VALUES (?, ?, ?)";
        try{
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,comida.getCodComida() );
        ps.setInt(2, renglon.getCantidadPorciones());
        ps.setDouble(3, renglon.getSubtotalCalorias());
        
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                renglon.setNroRenglon(rs.getInt(1));
                System.out.println("Renglon de menu agregado con exito:  " + renglon);
                
            }
    }catch ( SQLException e){
            System.out.println("Error al agregar renglon de menu:  " + e.getMessage());
    }
    }
    
    public void actualizarRenglonMenu(RenglonDeMenu renglon , Comida comida){
        String query = "UPDATE renglondemenu SET codComida = ?, cantidadPorciones = ?, subTotalCalorias = ?  WHERE nroRenglon = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, comida.getCodComida());
            ps.setInt(2, renglon.getCantidadPorciones());
            ps.setDouble(3, renglon.getSubtotalCalorias());
            ps.setInt(4, renglon.getNroRenglon());
            
            ps.executeUpdate();
            System.out.println("Renglon de menu actualizado con exito.  "  +renglon);
        }catch (SQLException e) {
            System.out.println("Error al actualizar el renglon de menu:  " +  e.getMessage());
    } 
}
    public void darBajaRenglonDeMenu(int nroRenglon){
        String query = "UPDATE renglondemenu SET baja true WHERE nroRenglon  = ?  ";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, nroRenglon);
            
            ps.executeUpdate();
            System.out.println("Renglon de menu dado de baja con exito. ID:  " + nroRenglon);
        }catch(SQLException e){
            System.out.println("Error al dar de baja el renglon de menu:  " + e.getMessage());
        }
        
    }
    private Comida obtenerComidaPorId(int codComida){
        ComidaData comidaData = new ComidaData((Conexion) conexion);
        return comidaData.buscarComidaPorId(codComida);
    }
    public RenglonDeMenu buscarRenglonDeMenuPorId(int nroRenglon){
        String query = "SELECT * FROM  renglondemenu WHERE nroRenglon = ? AND baja = false";
        try{
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, nroRenglon);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                Comida comida = obtenerComidaPorId(rs.getInt("codComida"));
                RenglonDeMenu renglon = new RenglonDeMenu(
                rs.getInt("nroRenglon"),
                 comida,
                        rs.getInt("cantidadPorciones")
                
                );
                renglon.setSubtotalCalorias(rs.getDouble("subTotalCalorias"));
                return renglon;
            }else {
                System.out.println("No se encontro el renglon de menu con esa ID:  " + nroRenglon);
                return null;
            }
        }catch(SQLException e){
            System.out.println("Error al buscar renglon de menu:" + e.getMessage());
            return null;
        }
    }
    
    public List<RenglonDeMenu> listarRenglones(){
        List<RenglonDeMenu> renglones = new ArrayList<>();
        String query = "SELECT * FROM renglondemenu WHERE baja = false";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                Comida comida = obtenerComidaPorId(rs.getInt("codComida"));
                RenglonDeMenu renglon = new RenglonDeMenu(
                rs.getInt("nroRenglon"),
                comida,
                  rs.getInt("canridadPorciones")
                
                );
                renglon.setSubtotalCalorias(rs.getDouble("subTotalCalorias"));
                renglones.add(renglon);
                
            }
        }catch (SQLException e){
            System.out.println("Error al listar renglones de menu:  " + e.getMessage());
        }
        return renglones;
    }
    
    public void eliminarRenglonDeMenu(int nroRenglon){
        String query = "DELETE FROM renglondemenu WHERE nroRenglon = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, nroRenglon);
            
            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Renglon de menu eliominado con exito. ID: " + nroRenglon);
                
            }
        }catch (SQLException e){
            System.out.println("Error al aeliminar renglon de menu:  " + e.getMessage());
        }
        
    }
            
    
}
