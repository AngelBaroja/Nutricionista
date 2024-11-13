/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author El Angel
 */
public class PacienteData {
    private Connection conexion = null;
    
    public PacienteData(Conexion conexion) {
        this.conexion = conexion.buscarConexion();
    }
    
    public void guardarPaciente(Paciente paciente) {
        String query = "INSERT INTO `paciente`(`nombre`, `edad`, `altura`, `pesoActual`, `pesoBuscado`) VALUES (?,?,?,?,?)";
        try {
            
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getEdad());
            ps.setDouble(3, paciente.getAltura());
            ps.setDouble(4, paciente.getPesoActual());
            ps.setDouble(5, paciente.getPesoBuscado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paciente.setNroPaciente(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el Numero del Paciente");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("SE PRODUJO UN ERROR CON LA BASE DE DATOS GUARDANDO");
        }

    }
    
    
        public void actualizarPaciente(Paciente paciente) {
        String query = "UPDATE `paciente` SET `nombre`=?,`edad`=?,`altura`=?,`pesoActual`=?,`pesoBuscado`=? WHERE `nroPaciente`=?";
        try {
            
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getEdad());
            ps.setDouble(3, paciente.getAltura());
            ps.setDouble(4, paciente.getPesoActual());
            ps.setDouble(5, paciente.getPesoBuscado());
            ps.setInt(6, paciente.getNroPaciente());
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            System.out.println("SE PRODUJO UN ERROR CON LA BASE DE DATOS ACTUALIZANDO");
        }

    }
    
    
    public Paciente buscarPaciente(int nroPaciente){
        Paciente paciente=null;
         String query = "SELECT * FROM `paciente` WHERE nroPaciente = ? ";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, nroPaciente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setNroPaciente(rs.getInt("nroPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setAltura(rs.getFloat("altura"));
                paciente.setPesoActual(rs.getFloat("pesoActual"));
                paciente.setPesoBuscado(rs.getFloat("pesoBuscado"));
            } else{
                System.out.println("No existe ese Paciente");
            }
            ps.close();            
        } catch (SQLException ex) {
            System.out.println("SE PRODUJO UN ERROR CON LA BASE DE DATOS BUSCANDOLO");
        }
        return paciente;
    }
    
    public ArrayList<Paciente> listaPaciente(){
        ArrayList<Paciente> listaPaciente=new ArrayList<>();
        Paciente paciente=null;
         String query = "SELECT * FROM `paciente`";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                paciente = new Paciente();
                paciente.setNroPaciente(rs.getInt("nroPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setAltura(rs.getFloat("altura"));
                paciente.setPesoActual(rs.getFloat("pesoActual"));
                paciente.setPesoBuscado(rs.getFloat("pesoBuscado"));
                listaPaciente.add(paciente);
            }
            ps.close();            
        } catch (SQLException ex) {
            System.out.println("SE PRODUJO UN ERROR CON LA BASE DE DATOS FORMANDO LA LISTA DE PACIENTES");
        }
        return listaPaciente;
    }
    
    public ArrayList<Paciente> listaPacienteSinDieta() {
        ArrayList<Paciente> listaPaciente = new ArrayList<>();
        Paciente paciente = null;
        String query = "SELECT P.*\n"
                + "FROM paciente P\n"
                + "LEFT JOIN dieta D ON P.nroPaciente = D.nroPaciente\n"
                + "WHERE D.nroPaciente IS NULL;";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                paciente = new Paciente();
                paciente.setNroPaciente(rs.getInt("nroPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setAltura(rs.getDouble("altura"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoBuscado(rs.getDouble("pesoBuscado"));
                listaPaciente.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("SE PRODUJO UN ERROR CON LA BASE DE DATOS FORMANDO LA LISTA DE PACIENTES");
        }
        return listaPaciente;
    }
    
    public void borradoFisicoPaciente(int nroPaciente) {
        String queryGetDieta = "SELECT codDieta FROM dieta WHERE nroPaciente = ?";
        String queryGetMenus = "SELECT codMenu FROM menuDiario WHERE codDieta = ?";
        String queryDeleteRenglones = "DELETE FROM renglondemenu WHERE codMenu = ?";
        String queryDeleteMenus = "DELETE FROM menuDiario WHERE codDieta = ?";
        String queryDeleteDieta = "DELETE FROM dieta WHERE codDieta = ?";
        String queryDeletePaciente = "DELETE FROM paciente WHERE nroPaciente = ?";

        try {
            PreparedStatement psGetDieta = conexion.prepareStatement(queryGetDieta);
            psGetDieta.setInt(1, nroPaciente);
            ResultSet rsDieta = psGetDieta.executeQuery();

            if (rsDieta.next()) {
                int codDieta = rsDieta.getInt("codDieta");
                psGetDieta.close();

                PreparedStatement psGetMenus = conexion.prepareStatement(queryGetMenus);
                psGetMenus.setInt(1, codDieta);
                ResultSet rsMenus = psGetMenus.executeQuery();
                List<Integer> codMenus = new ArrayList<>();

                while (rsMenus.next()) {
                    codMenus.add(rsMenus.getInt("codMenu"));
                }
                psGetMenus.close();

                PreparedStatement psDeleteRenglones = conexion.prepareStatement(queryDeleteRenglones);
                for (int codMenu : codMenus) {
                    psDeleteRenglones.setInt(1, codMenu);
                    psDeleteRenglones.executeUpdate();
                }
                psDeleteRenglones.close();

                PreparedStatement psDeleteMenus = conexion.prepareStatement(queryDeleteMenus);
                psDeleteMenus.setInt(1, codDieta);
                psDeleteMenus.executeUpdate();
                psDeleteMenus.close();
                PreparedStatement psDeleteDieta = conexion.prepareStatement(queryDeleteDieta);
                psDeleteDieta.setInt(1, codDieta);
                psDeleteDieta.executeUpdate();
                psDeleteDieta.close();
            }

            PreparedStatement psDeletePaciente = conexion.prepareStatement(queryDeletePaciente);
            psDeletePaciente.setInt(1, nroPaciente);
            psDeletePaciente.executeUpdate();
            psDeletePaciente.close();


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el paciente y sus datos relacionados: " + ex.getMessage());
        }
    }

    
    public ArrayList<Paciente> listaPacientesQueNoLlegaron(){
        ArrayList<Paciente> lista = new ArrayList<>();
        Paciente paciente = null;
        String query = "SELECT p.* FROM paciente p JOIN dieta d"
                + " ON p.nroPaciente = d.nroPaciente WHERE p.pesoActual > p.PesoBuscado;";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                paciente = new Paciente();
                paciente.setNroPaciente(rs.getInt("nroPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setAltura(rs.getFloat("altura"));
                paciente.setPesoActual(rs.getFloat("pesoActual"));
                paciente.setPesoBuscado(rs.getFloat("pesoBuscado"));
                lista.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo ingresar a la tabla Pacientes");
        }

        return lista;
    }
}
