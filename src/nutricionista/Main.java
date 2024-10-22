/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nutricionista;

import Entidades.Paciente;
import persistencia.Conexion;
import persistencia.PacienteData;

/**
 *
 * @author El Angel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conexion = new Conexion ("jdbc:mysql://localhost/nutricionista", "root", "");
        PacienteData pacienteData= new PacienteData(conexion);
//        System.out.println(pacienteData.buscarPaciente(1).toString());
//        for (Paciente paciente : pacienteData.listaPaciente()) {
//            System.out.println(paciente.toString());
//        }
//          Paciente paciente =pacienteData.buscarPaciente(1);
//          paciente.setEdad(105);
//          pacienteData.actualizarPaciente(paciente);
//            Paciente paciente2 = new Paciente("Jorge", 28, 1.7f, 68, 72);
//            pacienteData.guardarPaciente(paciente2);
//            pacienteData.borradoFisico(4);
            
        
                
    }
    
}
