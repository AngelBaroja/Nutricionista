/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import Entidades.RenglonDeMenu;
import persistencia.Conexion;
import Entidades.Comida;
import Entidades.Dieta;
import Entidades.MenuDiario;
import static java.awt.SystemColor.menu;
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
    
    public void guardarRenglonDeMenu(RenglonDeMenu renglon){
        String query ="INSERT INTO renglondemenu (codComida, cantidadPorciones, subTotalCalorias,codMenu) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,renglon.getComida().getCodComida() );
        ps.setInt(2, renglon.getCantidadPorciones());
        ps.setDouble(3, renglon.getSubtotalCalorias());
        ps.setInt(4, renglon.getMenu().getCodMenu());
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
    
    public void actualizarRenglonMenu(RenglonDeMenu renglon){
        String query = "UPDATE renglondemenu SET codComida = ?, cantidadPorciones = ?, subTotalCalorias = ?  WHERE nroRenglon = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, renglon.getComida().getCodComida());
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
        String query = "UPDATE renglondemenu SET baja=true WHERE nroRenglon  = ?  ";
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
        ComidaData comidaData = new ComidaData(new Conexion ("jdbc:mysql://localhost/nutricionista", "root", ""));
        return comidaData.buscarComidaPorId(codComida);
    }
    
    public RenglonDeMenu buscarRenglonDeMenuPorId(int nroRenglon){
        MenuDiarioData menuData=new MenuDiarioData(new Conexion ("jdbc:mysql://localhost/nutricionista", "root", ""));       
        RenglonDeMenu renglon = new RenglonDeMenu();
        String query = "SELECT * FROM  renglondemenu WHERE nroRenglon = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, nroRenglon);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                Comida comida = obtenerComidaPorId(rs.getInt("codComida"));
                
                renglon.setNroRenglon(rs.getInt("nroRenglon"));
                renglon.setComida(comida);
                renglon.setCantidadPorciones( rs.getInt("cantidadPorciones"));
                renglon.setSubtotalCalorias(rs.getDouble("subTotalCalorias"));
                renglon.setMenu(menuData.BuscarMenu(rs.getInt("codMenu")));                             
            }else {
                System.out.println("No se encontro el renglon de menu con esa ID:  " + nroRenglon);
            }
        }catch(SQLException e){
            System.out.println("Error al buscar renglon de menu:" + e.getMessage());
            return null;
        }
        return renglon;
    }
    
     public int cantidadDeMenusPorDieta(int codDieta){
         int valor=0;
        
        String query = "SELECT COUNT(md.codMenu) AS cantidadMenus\n" +
                        "FROM Dieta d\n" +
                        "JOIN MenuDiario md ON d.codDieta = md.codDieta\n" +
                        "WHERE d.codDieta=?\n" +
                        "GROUP BY d.codDieta;";
        try{
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, codDieta);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                valor = rs.getInt("cantidadMenus");
            }else {
                System.out.println("No se encontro el renglon de menu con esa ID:  " + codDieta);
            }
        }catch(SQLException e){
            System.out.println("Error al buscar renglon de menu:" + e.getMessage());            
        }
       return valor;
    }
    
    public List<RenglonDeMenu> listarRenglones(){
        MenuDiarioData menuData=new MenuDiarioData(new Conexion ("jdbc:mysql://localhost/nutricionista", "root", ""));  
        List<RenglonDeMenu> renglones = new ArrayList<>();
         RenglonDeMenu renglon = new RenglonDeMenu();
        String query = "SELECT * FROM renglondemenu WHERE baja = false";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                 Comida comida = obtenerComidaPorId(rs.getInt("codComida"));
                
                renglon.setNroRenglon(rs.getInt("nroRenglon"));
                renglon.setComida(comida);
                renglon.setCantidadPorciones( rs.getInt("cantidadPorciones"));
                renglon.setSubtotalCalorias(rs.getDouble("subTotalCalorias"));
                renglon.setMenu(menuData.BuscarMenu(rs.getInt("codMenu"))); 
                renglones.add(renglon);                
            }
        }catch (SQLException e){
            System.out.println("Error al listar renglones de menu:  " + e.getMessage());
        }
        return renglones;
    }
    
    public List<RenglonDeMenu> listarRenglonesPorMenuDiario(int codDieta,int parte){
        MenuDiarioData menuData=new MenuDiarioData(new Conexion ("jdbc:mysql://localhost/nutricionista", "root", ""));  
        List<RenglonDeMenu> renglones = new ArrayList<>();        
        String query = "SELECT rm.* \n" +
                        "FROM Dieta d \n" +
                        "JOIN MenuDiario md ON d.codDieta = md.codDieta \n" +
                        "JOIN RenglondeMenu rm ON md.codMenu = rm.codMenu \n" +
                        "WHERE d.codDieta = ? \n" +
                        "LIMIT 5 OFFSET ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, codDieta);
            ps.setInt(2, parte); 
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                RenglonDeMenu renglon = new RenglonDeMenu();
                renglon.setNroRenglon(rs.getInt("nroRenglon"));
                Comida comida = obtenerComidaPorId(rs.getInt("codComida"));
                renglon.setComida(comida);
                renglon.setCantidadPorciones( rs.getInt("cantidadPorciones"));
                renglon.setSubtotalCalorias(rs.getDouble("subTotalCalorias"));
                renglon.setMenu(menuData.BuscarMenu(rs.getInt("codMenu"))); 
                renglones.add(renglon);                
            }
        }catch (SQLException e){
            System.out.println("Error al listar renglones de menu:  " + e.getMessage());
        }
        return renglones;
    }
    
    public List<MenuDiario> listarMenus(){            
        DietaData dietaData = new DietaData(new Conexion ("jdbc:mysql://localhost/nutricionista", "root", ""));
        List<MenuDiario> menusDiarios = new ArrayList<>();
        String query = "SELECT md.*\n" +
                        "FROM MenuDiario md\n" +
                        "LEFT JOIN renglondemenu rm ON md.codMenu = rm.codMenu\n" +
                        "WHERE rm.codMenu IS NULL";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                MenuDiario menu = new MenuDiario();
                menu.setCodMenu(rs.getInt("codMenu"));
                menu.setDia(rs.getInt("diaNro"));
                menu.setEstado(rs.getBoolean("estado"));
                menu.setDieta(dietaData.buscarDieta(rs.getInt("codDieta")));
                menusDiarios.add(menu);                
            }
        }catch (SQLException e){
            System.out.println("Error al listar Menus sin Renglon:  " + e.getMessage());
        }
        return menusDiarios;
    }
        
     public List<Dieta> listarTodosMenus(){            
        PacienteData paciente = new PacienteData(new Conexion ("jdbc:mysql://localhost/nutricionista", "root", ""));
        List<Dieta> dietas = new ArrayList<>();
        String query = "SELECT DISTINCT d.*\n" +
                        "FROM Dieta d\n" +
                        "JOIN MenuDiario md ON d.codDieta = md.codDieta\n" +
                        "JOIN RenglondeMenu rm ON md.codMenu = rm.codMenu;";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                Dieta dieta= new Dieta();
                dieta.setCodDieta(rs.getInt("codDieta"));
                dieta.setNombreD(rs.getString("nombreD"));               
                dieta.setPaciente(paciente.buscarPaciente(rs.getInt("nroPaciente")));
                dietas.add(dieta);
            }
        }catch (SQLException e){
            System.out.println("Error al listar  de Menus:  " + e.getMessage());
        }
        return dietas;
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
    
    public void eliminarRenglonesDeMenu(int codMenu){
        String query = "DELETE FROM renglondemenu WHERE codMenu = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, codMenu);
            
            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Renglon de menu eliominado con exito. ID: " + codMenu);
                
            }
        }catch (SQLException e){
            System.out.println("Error al eliminar renglon de menu:  " + e.getMessage());
        }
        
    }
            
    
}
