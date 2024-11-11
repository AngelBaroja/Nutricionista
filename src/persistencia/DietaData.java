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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.PacienteData;

/**
 *
 * @author Matias
 */
public class DietaData {

    private Connection conexion = null;

    public DietaData(Conexion conexion) {
        this.conexion = conexion.buscarConexion();

    }

    public void GuardarDietaConPaciente(Dieta dieta) { 
        String query = "INSERT INTO dieta(nombreD,fechaIni,fechaFin,pesoFinal,pesoInicial,estado,totalCalorias,nroPaciente) "
                + " VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
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
    public void GuardarDietaSinPaciente(Dieta dieta) { 
        String query = "INSERT INTO dieta(nombreD,estado,totalCalorias) "
                + " VALUES (?,?,?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dieta.getNombreD());           
            ps.setBoolean(2, dieta.isEstado());
            ps.setInt(3, dieta.getTotalCalorias());                     

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

    public void actualizarDieta(Dieta dieta) {
        String query = "UPDATE dieta SET nombreD = ?, fechaIni = ?, fechaFin = ?"
                + ",pesoFinal = ?, pesoInicial = ?,estado = ?, totalCalorias = ?, nroPaciente = ? WHERE codDieta = ?";
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
            ps.setInt(8, dieta.getPaciente().getNroPaciente());
            ps.setInt(9, dieta.getCodDieta());

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Dieta actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta");
        }

    }

    public void borradoFisicoDieta(int codDieta) {
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

    public void borradoLogicoDieta(int codDieta) {
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

    public Dieta buscarDieta(int codDieta) {
        String query = "SELECT * FROM dieta WHERE codDieta = ?";
        Dieta dieta = null;
        Conexion conexion2 = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, codDieta);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
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
//                JOptionPane.showMessageDialog(null, "Dieta encontrada");
            } else {
//                JOptionPane.showMessageDialog(null, "Dieta no encontrada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta");
        }
        return dieta;
    }

    public ArrayList<Dieta> listaDietaParaCargarPaciente() {
        ArrayList<Dieta> listaDieta = new ArrayList<>();
        Dieta dieta = null;
        Conexion conexion2 = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
        String query = "SELECT * FROM `dieta` WHERE nroPaciente IS NULL";
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
    
    public ArrayList<Dieta> listaDietaConPacienteCargados() {
        ArrayList<Dieta> listaDieta = new ArrayList<>();
        Dieta dieta = null;
        Conexion conexion2 = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
        String query = "SELECT * FROM `dieta` WHERE nroPaciente IS NOT NULL";
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
    
    public ArrayList<Dieta> listaDietaConPacienteCargadosEstadoFalse() {
        ArrayList<Dieta> listaDieta = new ArrayList<>();
        Dieta dieta = null;
        Conexion conexion2 = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
        String query = "SELECT * FROM `dieta` WHERE nroPaciente IS NOT NULL AND estado=0";
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
    
    public ArrayList<Dieta> listaDietaConPacienteCargadosEstadoActivo() {
        ArrayList<Dieta> listaDieta = new ArrayList<>();
        Dieta dieta = null;
        Conexion conexion2 = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
        String query = "SELECT * FROM `dieta` WHERE nroPaciente IS NOT NULL AND estado=1";
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
    
    

    public ArrayList<Dieta> listaDietaXCantidadDias(int dias) {
        ArrayList<Dieta> listaDieta = new ArrayList<>();
        Dieta dieta = null;
        Conexion conexion2 = new Conexion("jdbc:mysql://localhost/nutricionista", "root", "");
        System.out.println("ATRAS");
        String query = "SELECT D.* \n"
                + "FROM dieta D \n"
                + "JOIN (\n"
                + "    SELECT CodDieta \n"
                + "    FROM menudiario \n"
                + "    GROUP BY CodDieta \n"
                + "    HAVING COUNT(CodMenu) = ? \n"
                + ") AS DietasConDiasMenus ON D.CodDieta = DietasConDiasMenus.CodDieta\n"
                + "WHERE D.nroPaciente IS NULL;";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, dias);
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
            System.out.println("Lista de Dieta x dias");
            ps.close();
        } catch (SQLException ex) {
            System.out.println("SE PRODUJO UN ERROR CON LA BASE DE DATOS FORMANDO LA LISTA DE DIETAS POR DIAS");
            ex.printStackTrace();
        }
        return listaDieta;
    }
    public void alterarDieta(Dieta dieta) {
        String query = "UPDATE dieta SET totalCalorias = ? WHERE codDieta = ?";
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement(query);
            ps.setInt(1, dieta.getTotalCalorias());
            ps.setInt(2, dieta.getCodDieta());

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Dieta actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta");
        }

    }
}
