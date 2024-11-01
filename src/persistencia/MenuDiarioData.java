package persistencia;
import Entidades.*;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class MenuDiarioData {
    private Connection conexion = null;
    
     public MenuDiarioData(Conexion conexion){
        this.conexion = conexion.buscarConexion();
    }
    
     public void AlterarDietaDiaria(MenuDiario menu){
          String query = "UPDATE menuDiario diaNro = ? estado = ? codDieta = ? WHERE codMenu = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, menu.getDia());
            ps.setBoolean(2, menu.isEstado());
           /* Array we = (Array) menu.getComidas();
            ps.setArray(3, we); //no creo que funcione, pero pareceria que si
            ps.setDouble(4, menu.getPesoActual());*/
            ps.setInt(3, menu.getDieta().getCodDieta());
            ps.setInt(4, menu.getCodMenu());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            ps.close();
            
            System.out.println("Menu Alterado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla");
        }
     }
     
      public void AñadirRenglon(MenuDiario menu, RenglonDeMenu reng){ //no se como implementarlos con la base de datos, voy a revisar luego
         String query = "UPDATE menuDiario SET comidas = ? WHERE codMenu = ?";
         try{
             PreparedStatement ps =conexion.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
             menu.addRenglon(reng);
             Array we = (Array) menu.getComidas();
             ps.setArray(1, we);
             ps.setInt(2, menu.getCodMenu());
             ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             ps.close();
             System.out.println("Renglon Añadido");  
             } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a tabla");
        }
      }
      
       public void CambiarRenglon(MenuDiario menu, RenglonDeMenu reng){
         String query = "UPDATE menuDiario SET comidas = ? WHERE codMenu = ?";
         try{
             PreparedStatement ps =conexion.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
             for(RenglonDeMenu r : menu.getComidas()){
                 if(r.getNroRenglon() == reng.getNroRenglon()){
                     r = reng;
                 }else{
                     System.out.println("no existe el renglon a actualizar");
                 }
             }
             Array we = (Array) menu.getComidas();
             ps.setArray(1, we);
             ps.setInt(2, menu.getCodMenu());
             ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             ps.close();
             System.out.println("Renglon Actualizado");  
             } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a tabla");
        }
      }
      
      public void GenerarMenuDiario(MenuDiario menu){
        String query = "INSERT INTO menuDiario(diaNro, estado, codDieta)"
                + " VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, menu.getDia());
            ps.setBoolean(2, menu.isEstado());
            /*Array we = (Array) menu.getComidas();
            ps.setArray(3, we); //no creo que funcione
            ps.setDouble(4, menu.getPesoActual());
            ps.setObject(5, menu.getDieta());*/
            ps.setInt(3, menu.getDieta().getCodDieta());
            ps.executeUpdate();
            
            ps.close();
            System.out.println("Menu generado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla");
        }
    }
      public void borrarMenuDiario(int cod) { //borrara el menuDiario y sus renglones, no se puede eliminar menu sin eliminar renglon
         String query2 = "DELETE FROM renglondemenu WHERE codMenu = ?";
        String query = "DELETE FROM menuDiario WHERE codMenu = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(query2);
            ps.setInt(1, cod);
            ps.executeUpdate();

            ps.close();
            System.out.println("Renglones relacionados Borrados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla");
        }
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, cod);
            ps.executeUpdate();

            ps.close();
            System.out.println("Menu Borrado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla");
        }
    }
      public void CambiarEstadoFalse(int cod) {
            String query = "UPDATE menuDiario SET estado = false WHERE codMenu = ? ";
            try{
             PreparedStatement ps = conexion.prepareStatement(query);
             ps.setInt(1, cod);
             ps.executeUpdate();
             ps.close();
             System.out.println("Estado Cambiado");
         } catch (SQLException ex) {
             System.out.println("Se Produjo un error con la base de datos");;
         }
    }
      public void CambiarEstadoTrue(int cod) {
            String query = "UPDATE menuDiario SET estado = True WHERE codMenu = ? ";
            try{
             PreparedStatement ps = conexion.prepareStatement(query);
             ps.setInt(1, cod);
             ps.executeUpdate();
             ps.close();
             System.out.println("Estado Cambiado");
         } catch (SQLException ex) {
             System.out.println("Se Produjo un error con la base de datos");;
         }
      }
}