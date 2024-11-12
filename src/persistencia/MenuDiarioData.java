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
     
    
     public void AlterarDietaDiaria(MenuDiario menu, Dieta diet){
          String query = "UPDATE menuDiario SET codDieta = ? WHERE codMenu = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, diet.getCodDieta());
            ps.setInt(2, menu.getCodMenu());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            ps.close();
            
            System.out.println("Menu Alterado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla");
        }
     }
  
      public void AñadirRenglon(MenuDiario menu, RenglonDeMenu reng){ //creo que esto iria en RenglonDeMenuData, ya que estan conectados desde la primary key del menu y no creo que se pueda desde este lado sin añadir mas valores a la base de datos
         String query = "UPDATE renglondemenu SET codMenu = ? WHERE nroRenglon = ?";
         try{
             PreparedStatement ps =conexion.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
             menu.addRenglon(reng);
             ps.setInt(1, menu.getCodMenu());
             ps.setInt(2, reng.getNroRenglon());
             ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             ps.close();
             System.out.println("Renglon Añadido");  
             } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a tabla");
        }
      }
      
       public void CambiarRenglon(MenuDiario menu, RenglonDeMenu reng){
         String query = "UPDATE renglondemenu SET codMenu = ? WHERE nroRenglon = ?";
         try{
             PreparedStatement ps =conexion.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
             /*for(RenglonDeMenu r : menu.getComidas()){
                 if(r.getNroRenglon() == reng.getNroRenglon()){
                     r = reng;
                 }else{
                     System.out.println("no existe el renglon a actualizar");
                 }
             }*/
             menu.addRenglon(reng);
             ps.setInt(1, menu.getCodMenu());
             ps.setInt(2, reng.getNroRenglon());
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
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla"+ex.getMessage());
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
      
      public MenuDiario BuscarMenu(int cod){
          DietaData dietaData = new DietaData(new Conexion ("jdbc:mysql://localhost/nutricionista", "root", ""));
          String query = "SELECT * FROM menudiario WHERE codMenu = ?";
          MenuDiario me = new MenuDiario();
          try{
             PreparedStatement ps = conexion.prepareStatement(query);
             ps.setInt(1, cod);
             
            
             System.out.println("Menu Encontrado");
              ResultSet rs = ps.executeQuery();
               if (rs.next()) {                
                me.setCodMenu(rs.getInt("codMenu"));
                me.setDia(rs.getInt("diaNro"));
                me.setEstado(rs.getBoolean("estado"));
                me.setDieta(dietaData.buscarDieta(rs.getInt("codDieta")));
                  
               }
               ps.close();
         } catch (SQLException ex) {
             System.out.println("Se Produjo un error con la base de datos");
         }
          return me;
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
      
      public ArrayList<MenuDiario> listaMenuDiario(){
          ArrayList<MenuDiario> menus = new ArrayList<>();
          MenuDiario menu = null;
          Conexion conexion2 = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
          String query = "SELECT * FROM MenuDiario";
          PreparedStatement ps;
        try {
            ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                menu = new MenuDiario();
                menu.setCodMenu(rs.getInt("codMenu"));
                menu.setDia((rs.getInt("diaNro")));
                menu.setEstado(rs.getBoolean("estado"));
                if (rs.getObject("codDieta") != null) {
                    menu.setDieta(new DietaData(conexion2).buscarDieta(rs.getInt("codDieta")));
                } else {
                    menu.setDieta(null);
                }
                menus.add(menu);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla MenuDiario");
        }
          
          return menus;
      }
      
    public void GenerarMenuDiarioAuto(MenuDiario menu) {
        String query = "INSERT INTO menuDiario(diaNro, estado, codDieta) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, menu.getDia());
            ps.setBoolean(2, menu.isEstado());
            ps.setInt(3, menu.getDieta().getCodDieta());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int codMenuGenerado = rs.getInt(1);  // Recupera el valor de la clave generada
                menu.setCodMenu(codMenuGenerado);    // Asigna el valor al objeto MenuDiario
                System.out.println("Menu generado con éxito, codMenu: " + codMenuGenerado);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla: " + ex.getMessage());
        }
    }
    public List<MenuDiario> listaMenuDiarioConEstadoRenglones() {
        Conexion conexion2 = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
        List<MenuDiario> menus = new ArrayList<>();
        String query = "SELECT md.codMenu, md.diaNro, md.estado,md.codDieta , COUNT(rd.codMenu) AS tieneRenglones "
                     + "FROM MenuDiario md "
                     + "LEFT JOIN RenglonDeMenu rd ON md.codMenu = rd.codMenu "
                     + "GROUP BY md.codMenu";

        try (PreparedStatement ps = conexion.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                MenuDiario menu = new MenuDiario();
                menu.setCodMenu(rs.getInt("codMenu"));
                menu.setDia(rs.getInt("diaNro"));
                menu.setEstado(rs.getBoolean("estado"));
                if (rs.getObject("codDieta") != null) {
                    menu.setDieta(new DietaData(conexion2).buscarDieta(rs.getInt("codDieta")));
                } else {
                    menu.setDieta(null);
                }

                boolean tieneRenglones = rs.getInt("tieneRenglones") > 0;
                menu.setRenglones(tieneRenglones);

                menus.add(menu);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla MenuDiario: " + ex.getMessage());
        }

        return menus;
    }
    public ArrayList<Dieta> listaDietaSinMenu() {
        ArrayList<Dieta> listaDieta = new ArrayList<>();
        Dieta dieta = null;
        Conexion conexion2 = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
        String query = "SELECT d.* FROM Dieta d LEFT JOIN MenuDiario m"
                + " ON d.codDieta = m.codDieta WHERE m.codDieta IS NULL";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dieta = new Dieta();
                dieta.setCodDieta(rs.getInt("codDieta"));
                dieta.setNombreD(rs.getString("nombreD"));
                if (rs.getDate("fechaIni") != null) {
                    dieta.setFechaIni(rs.getDate("fechaIni").toLocalDate());
                }
                if (rs.getDate("fechaFin") != null) {
                    dieta.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                }
                if (rs.getObject("pesoInicial") != null) {
                    dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                }
                if (rs.getObject("pesoFinal") != null) { // getObject permite detectar NULL
                    dieta.setPesoFinal(rs.getDouble("pesoFinal"));
                }

                dieta.setEstado(rs.getBoolean("estado"));
                dieta.setTotalCalorias(rs.getInt("totalCalorias"));
                // Verificar y asignar nroPaciente (int)
                if (rs.getObject("nroPaciente") != null) {
                    dieta.setPaciente(new PacienteData(conexion2).buscarPaciente(rs.getInt("nroPaciente")));
                } else {
                    dieta.setPaciente(null); // Manejo en caso de que nroPaciente sea NULL
                }
                listaDieta.add(dieta);
            }
            System.out.println("Lista de Dieta");
            ps.close();
        } catch (SQLException ex) {
            System.out.println("SE PRODUJO UN ERROR CON LA BASE DE DATOS FORMANDO LA LISTA DE DIETAS");
        }
        return listaDieta;
    }
}